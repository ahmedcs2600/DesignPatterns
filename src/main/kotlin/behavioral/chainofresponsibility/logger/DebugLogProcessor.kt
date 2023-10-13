package behavioral.chainofresponsibility.logger

class DebugLogProcessor(nextLogProcessor: LogProcessor?) : LogProcessor(nextLogProcessor) {
    override fun log(logLevel: Int, message: String) {
        if(logLevel == DEBUG) {
            println("DEBUG: $message")
        } else {
            super.log(logLevel, message)
        }
    }
}
