package behavioral.chainofresponsibility.logger

class InfoLogProcessor(private val logProcessor: LogProcessor?): LogProcessor(logProcessor) {
    override fun log(logLevel: Int, message: String) {
        if(logLevel == INFO) {
            println("INFO: $message")
        } else {
            super.log(logLevel, message)
        }
    }
}