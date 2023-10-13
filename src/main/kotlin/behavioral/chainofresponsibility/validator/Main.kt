package behavioral.chainofresponsibility.validator

fun main() {
    val request = Request("developer@company.com", "Who broke my build")
    val chain = BasicValidationHandler(
        AuthenticationHandler(
            FinalResponseHandler()
        )
    )
    val res = chain.handle(request)
    println(res.answer)
}
