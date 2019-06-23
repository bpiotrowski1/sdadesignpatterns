package pl.sdacademy.designpatterns.memento;

import lombok.Getter;

public class EditorTextMemento {

    @Getter private String value;

    public EditorTextMemento(final EditorText editorText) {
        this.value = editorText.getValue();
    }
}
