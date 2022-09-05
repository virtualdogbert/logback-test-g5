package logback.test.g5

class BootStrap {

    def init = { servletContext ->


//        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("logback-config.groovy")
//
//        if (inputStream) {
//            LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory()
//
//
//            GafferConfigurator configurator = new GafferConfigurator(context)
//            String dslText = inputStream.text
//            configurator.run dslText
//        }

        //LogbackDSLInitializer.init((LoggerContext) LoggerFactory.getILoggerFactory(), getClass().getClassLoader().getResourceAsStream("logback-config.groovy"))


        log.debug("works?")

    }
    def destroy = {
    }
}
