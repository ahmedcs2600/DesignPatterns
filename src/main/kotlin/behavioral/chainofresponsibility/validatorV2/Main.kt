package behavioral.chainofresponsibility.validatorV2

fun main() {
    val req = Request(
        "developer@company.com",
        "Why do we need Software Architects?"
    )
    val chain = basicValidation(authentication(finalResponse()))
    val res = chain(req)
    println(res)
}

data class Request(val email: String, val question: String) {
    fun isKnownEmail(): Boolean {
        return true
    }

    fun isFromJuniorDeveloper(): Boolean {
        return false
    }
}

typealias Handler = (request: Request) -> Response

data class Response(val answer: String)

val basicValidation = fun(next: Handler): Handler {
    return fun(request: Request): Response {
        if (request.email.isEmpty() || request.question.isEmpty()) {
            throw IllegalArgumentException()
        }
        return next(request)
    }
}

val finalResponse = fun(): Handler {
    return fun(_: Request): Response {
        return Response("I don't know")
    }
}

val authentication = fun(next: Handler): Handler {
    return fun(request: Request): Response {
        if(!request.isKnownEmail()) {
            throw IllegalArgumentException()
        }
        return next(request)
    }
}
