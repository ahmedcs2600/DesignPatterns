package behavioral.chainofresponsibility.validator

interface Handler {
    fun handle(request: Request): Response
}
