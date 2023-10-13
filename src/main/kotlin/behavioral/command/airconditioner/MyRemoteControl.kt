package behavioral.command.airconditioner//Invoker

/*
Remote Control has command object
 */
class MyRemoteControl {
    private lateinit var command: ICommand

    fun setCommand(command: ICommand) {
        this.command = command
    }

    fun pressButton() {
        command.execute()
    }
}