package behavioral.chainofresponsibility.logger

abstract class LogProcessor(protected val nextLogProcessor: LogProcessor?) {
    companion object {
        val INFO = 1
        val DEBUG = 2
        val ERROR = 3
    }

    open fun log(logLevel: Int, message: String) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message)
        }
    }
}