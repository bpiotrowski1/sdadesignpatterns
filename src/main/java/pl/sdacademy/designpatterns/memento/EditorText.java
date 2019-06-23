package pl.sdacademy.designpatterns.memento;

import lombok.Getter;

public class EditorText {

    @Getter private String value = "";

    public void addText(final String toAdd) {
        value += toAdd;
    }

    public void restoreFromMemento(final EditorTextMemento editorTextMemento) {
        value = editorTextMemento.getValue();
    }
}
