package behavioral.chainofresponsibility.logger

class ErrorLogProcessor(private val logProcessor: LogProcessor?): LogProcessor(logProcessor) {
    override fun log(logLevel: Int, message: String) {
        if(logLevel == ERROR) {
            println("ERROR: $message")
        } else {
            super.log(logLevel, message)
        }
    }
}