package behavioral.mediator.chat

class ChatMediatorImpl: ChatMediator {
    private val users = ArrayList<User>()
    override fun sendMessage(message: String, user: User) {
        for(u in users)
            if(u != user)
                u.receive(message)
    }
    override fun addUser(user: User) {
        users.add(user)
    }
}
