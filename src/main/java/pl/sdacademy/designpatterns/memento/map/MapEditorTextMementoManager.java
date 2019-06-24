package pl.sdacademy.designpatterns.memento.map;

import java.util.ArrayDeque;
import java.util.Deque;

public class MapEditorTextMementoManager {

    private Deque<MapEditorTextMemento> editorTextMementos = new ArrayDeque<>();

    public void save(final MapEditorTextMemento editorTextMemento) {
        editorTextMementos.push(editorTextMemento);
    }

    public MapEditorTextMemento restore() {
        return editorTextMementos.pop();
    }
}
