package myapp

import org.grails.transaction.ChainedTransactionManager
import org.springframework.transaction.PlatformTransactionManager

class BootStrap {

    PlatformTransactionManager transactionManager

    def init = { servletContext ->
        assert transactionManager in ChainedTransactionManager
    }
    def destroy = {
    }
}
