package logback.test.g5

class BootStrap {

    TestService testService
    def init = { servletContext ->



// If I initialize with this code it works but with the configurator service it doesn't. Not sure what the difference is.
//        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory()
//        LogbackDSLInitializer.init(context, getClass().getClassLoader().getResourceAsStream("logback-config.groovy"))


        log.debug("***************************************** works?")
        log.info("***************************************** works?")
        testService.serviceMethod()

    }
    def destroy = {
    }
}
