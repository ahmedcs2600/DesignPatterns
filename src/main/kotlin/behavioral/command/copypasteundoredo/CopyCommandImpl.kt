package behavioral.command.copypasteundoredo

class CopyCommandImpl(private val text: String, private val editor: Editor) : ICommand {
    override fun execute() {
        editor.copy(text)
    }

    override fun redo() {
        editor.undo(text)
    }
}
