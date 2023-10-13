package behavioral.command.copypasteundoredo

fun main() {
    val controller = Controller()
    val editor = Editor()
    controller.setCommand(CopyCommandImpl("Hello World", editor))
    controller.execute()
    controller.undo()
}