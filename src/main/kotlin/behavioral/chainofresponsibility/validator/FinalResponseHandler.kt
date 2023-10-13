package behavioral.chainofresponsibility.validator

class FinalResponseHandler(): Handler {
    override fun handle(request: Request): Response {
        return Response("I don't know")
    }
}
