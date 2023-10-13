package behavioral.mediator.chat

abstract class User(protected val mediator: ChatMediator, protected val name: String) {
    abstract fun send(message: String)
    abstract fun receive(message: String)
}
