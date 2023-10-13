package behavioral.chainofresponsibility.validator

class BasicValidationHandler(private val next: Handler): Handler {
    override fun handle(request: Request): Response {
        if(request.email.isEmpty() || request.question.isEmpty()) {
            throw IllegalArgumentException()
        }
        return next.handle(request)
    }
}
