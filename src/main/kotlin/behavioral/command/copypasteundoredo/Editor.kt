package behavioral.command.copypasteundoredo

class Editor {
    fun copy(text: String) {
        println("Copy -> $text")
    }

    fun undo(text: String) {
        println("Undo -> $text")
    }
}
