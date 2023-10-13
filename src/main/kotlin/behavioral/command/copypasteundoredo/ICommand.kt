package behavioral.command.copypasteundoredo

interface ICommand {
    fun execute()
    fun redo()
}
