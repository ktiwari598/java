public class SpringBootQNA {
    /**
     * 1. Can we override or replace the embedded tomcat server in spring boot?
     * => Yes, we can easily replace tomcat server with any other server in pom.xml/build.gradle file, eg. jetty server

     * 2. Auto-Configuration - Automatically configures things based on what is there in the class path
     *
     * 3. @SpringBootApplication vs @EnableAutoConfiguration
     * => @EnableAutoConfiguration => enables auto configuration
     * => @SpringBootApplication => @Configuration + @EnableAutoConfiguration + @ComponentScan
     *
     * 4. How to disable auto configuration of a specific class?
     * => @EnableAutoConfiguration(exclude={className}), className is basically those classes which are annotated with
     *    @Configuration || @EnableAutoConfiguration, not @Component, @Service, etc
     *
     * 5. @Controller vs @RestController
     * => @Controller -> returns the view of the response object
     * => @RestController -> @Controller + @ResponseBody -> Also converts the view to JSON/XML format, depending on the
     *    Accept header in HTTP request. If Accept header is application/json, then converts to JSON. Default is JSON.
     *
     * 6. @RequestMapping vs @GetMapping
     * => @RequestMapping can be used with different request methods like GET, POST, PUT, etc
     * => @GetMapping = @RequestMapping(method = RequestMethod.GET)
     *
     * 7. JAR vs WAR
     * => JAR -> Java Archive, we can run directly from cmd with java -jar filename.jar
     * => WAR -> Web Application Archive, need to deploy the war file on a web server like tomcat, jetty, etc. to run it.
     *
     * 8. Profiles
     * => Profiles help to keep separate configurations(like db, redis, kafka, etc.) for different environments
     *
     * 9. Spring Actuator
     * => Provides built-in endpoints that we can use to monitor and manage our application.
     * => /heath => shows application health information
     * => /Beans => get the list of all the beans in your application
     *
     * 10. Why SpringBoot over Spring framework?
     * => Minimum manual configurations due to Auto-Configuration
     * => Embedded Server Support
     * => Dependency Management
     * => Actuator Endpoints
     * Spring Boot simplifies the development, deployment, and management of Spring applications by providing
     * opinionated defaults, reducing boilerplate code, and offering production-ready features out-of-the-box.
     */
}
