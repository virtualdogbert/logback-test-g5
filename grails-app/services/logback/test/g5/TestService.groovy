package logback.test.g5

import grails.gorm.transactions.Transactional

@Transactional
class TestService {

    def serviceMethod() {
        log.debug("***************************************** works?")
        log.info("***************************************** works?")
    }
}
