package behavioral.mediator.chat

fun main() {
    val mediator = ChatMediatorImpl()
    val sender = UserImpl(mediator, "ABC")
    mediator.addUser(sender)
    mediator.addUser(UserImpl(mediator, "EFG"))
    mediator.addUser(UserImpl(mediator, "IJK"))
    mediator.addUser(UserImpl(mediator, "LMN"))
    sender.send("Hello World")
}
