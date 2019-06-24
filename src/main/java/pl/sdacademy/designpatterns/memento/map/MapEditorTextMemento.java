package pl.sdacademy.designpatterns.memento.map;

import lombok.Getter;

import java.util.Map;

public class MapEditorTextMemento {

    @Getter private Map<Integer, String> value;
    @Getter private int lines;

    public MapEditorTextMemento(final MapEditorText editorText) {
        this.value = editorText.getValue();
        this.lines = editorText.getLines();
    }
}
