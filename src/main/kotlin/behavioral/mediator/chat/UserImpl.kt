package behavioral.mediator.chat

class UserImpl(mediator: ChatMediator, name: String): User(mediator, name) {

    override fun send(message: String) {
        println("$name: Sending Message=$message")
        mediator.sendMessage(message, this)
    }

    override fun receive(message: String) {
       println("$name: Received Message: $message")
    }
}
