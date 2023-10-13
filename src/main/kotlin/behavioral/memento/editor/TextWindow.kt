package behavioral.memento.editor

import java.lang.StringBuilder

//Orginator (The object whose state needs to be saved)
class TextWindow {
    private var currentText = StringBuilder()

    fun addText(text: String) {
        currentText.append(text)
    }

    fun save(): TextWindowState {
        return TextWindowState(currentText.toString())
    }

    fun restore(state: TextWindowState) {
        currentText = StringBuilder(state.getText())
    }
}