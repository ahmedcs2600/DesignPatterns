package behavioral.memento.editor

//Memento (The object that is going to maintain the state of originator. Its just a POJO)
class TextWindowState(private val text: String) {
    fun getText(): String {
        return text
    }
}
