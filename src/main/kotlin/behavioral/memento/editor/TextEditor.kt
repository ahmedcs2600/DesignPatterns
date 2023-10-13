package behavioral.memento.editor

//CareTaker (is the object that keeps track of multiple memento. Like maintaining savepoints)
class TextEditor {
    private val textWindow = TextWindow()
    private var savedTextWindow = TextWindowState("")

    fun hitSave() {
        savedTextWindow = textWindow.save()
    }

    fun hitUndo() {
        textWindow.restore(savedTextWindow)
    }
}