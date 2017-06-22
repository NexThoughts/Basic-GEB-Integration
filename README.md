## Description
A basic example of using geb functional testing from a brand new grails project using [bonigarcia's](https://github.com/bonigarcia) [Web Driver Manager](https://github.com/bonigarcia/webdrivermanager) to setup chrome, phantom and ie browsers.

run `grails -Dgeb.env=chrome test-app` to see it in action. see below for other browser options.
## Steps taken
Follow below step to do configuration
###1. Create a grails 3 application
###2. Add below dependency to your application
testCompile "org.grails:grails-plugin-testing"
testCompile "org.grails.plugins:geb"
// Note: It is recommended to update to a more robust driver (Chrome, Firefox etc.)
testRuntime 'org.seleniumhq.selenium:selenium-htmlunit-driver:2.44.0'

//GEB
testCompile "org.seleniumhq.selenium:selenium-java:3.4.0"
testCompile("com.codeborne:phantomjsdriver:1.4.3") {
     transitive = false
}
testCompile "io.github.bonigarcia:webdrivermanager:1.4.9"

###3. Add GebConfig file in *src/integration-test/groovy/GebConfig.groovy*
###4. Create Test File
grails create-functional-test geb.FaceBook
###5. Run test-cases
grails test-app --integration
###6. Add below lines in your build.gradle file to execute test-cases in different browser
integrationTest {
    systemProperties System.properties
}
###7. Command to execute different browser
Environments setup for
* phantom - `-Dgeb.env=phantom test-app`
* chrome - `-Dgeb.env=chrome test-app`
