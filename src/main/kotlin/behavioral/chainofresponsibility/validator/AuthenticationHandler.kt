package behavioral.chainofresponsibility.validator

class AuthenticationHandler(private val next: Handler): Handler {
    override fun handle(request: Request): Response {
        if(!request.isKnownEmail()) {
            throw IllegalArgumentException()
        }
        return next.handle(request)
    }
}
