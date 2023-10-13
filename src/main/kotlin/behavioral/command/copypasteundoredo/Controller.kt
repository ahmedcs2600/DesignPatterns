package behavioral.command.copypasteundoredo

import java.util.Stack

class Controller {
    private val stack = Stack<ICommand>()
    private lateinit var command: ICommand
    fun setCommand(command: ICommand) {
        this.command = command
    }

    fun execute() {
        command.execute()
    }

    fun undo() {
        if(!stack.isEmpty()) {
            val command = stack.pop()
            command.redo()
        }
    }
}
