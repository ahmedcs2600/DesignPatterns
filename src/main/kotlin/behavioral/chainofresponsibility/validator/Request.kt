package behavioral.chainofresponsibility.validator

data class Request(
    val email: String,
    val question: String
) {
    fun isKnownEmail(): Boolean {
        return true
    }

    fun isFromJuniorDeveloper(): Boolean {
        return false
    }
}
