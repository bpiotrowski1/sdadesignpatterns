package pl.sdacademy.designpatterns.memento.map;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class MapEditorText {

    @Getter private Map<Integer, String> value = new HashMap<>();
    @Getter private int lines = 1;

    public void addText(final String toAdd) {
        value.put(lines++, toAdd);
    }

    public void restoreFromMemento(final MapEditorTextMemento editorTextMemento) {
        value = editorTextMemento.getValue();
    }
}
