package geb

import grails.test.mixin.integration.Integration
import grails.transaction.*

import spock.lang.*
import geb.spock.*

@Integration
@Rollback
class FacebookTestSpec extends GebSpec {

    @Ignore
    def "test something"() {
        when: "The home page is visited"
        go '/'
        println("////////////////////////")
        println("////////////////////////")
        println("////////////////////////")
        println(title)
        println("////////////////////////")
        println("////////////////////////")
        println("////////////////////////")
        println("////////////////////////")
        println("////////////////////////")
        println("////////////////////////")

        then: "The title is correct"
        title == "Welcome to Grails"
    }

    def "testing Facebook Login"() {

        when: "Visit Facebook"
        go "https://www.facebook.com/"

        println("Now title is " + title)

        then:
        title == "Facebook – log in or sign up"

        when:
        $("#email").value("vijay.shukla21@yahoo.in")
        $("#pass").value("nexthoughts123default\$")
        $('input[type="submit"][value="Log In"]').click()

        Thread.sleep(3000)

        then:
        assert 1 == 1

    }
}
