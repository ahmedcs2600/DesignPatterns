package behavioral.chainofresponsibility.logger

fun main() {
    val logger = InfoLogProcessor(DebugLogProcessor(ErrorLogProcessor(null)))
    logger.log(LogProcessor.ERROR, "exception happens")
    logger.log(LogProcessor.DEBUG, "need to debug this")
    logger.log(LogProcessor.INFO, "Just for info")
}