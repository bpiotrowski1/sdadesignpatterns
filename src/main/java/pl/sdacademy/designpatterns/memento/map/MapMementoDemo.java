package pl.sdacademy.designpatterns.memento.map;

public class MapMementoDemo {

    public static void main(String[] args) {
        final MapEditorText editorText = new MapEditorText();
        final MapEditorTextMementoManager mementoManager = new MapEditorTextMementoManager();

        mementoManager.save(new MapEditorTextMemento(editorText));
        editorText.addText("This is my frist line.");
        mementoManager.save(new MapEditorTextMemento(editorText));
        editorText.addText("This is first line continuatnion.");
        mementoManager.save(new MapEditorTextMemento(editorText));
        editorText.addText("This is second line.");
        mementoManager.save(new MapEditorTextMemento(editorText));
        editorText.addText("This is third line.");
        mementoManager.save(new MapEditorTextMemento(editorText));

        System.out.println(editorText.getValue() + "\n");

        mementoManager.restore();
        mementoManager.restore();
        editorText.restoreFromMemento(mementoManager.restore());

        System.out.println(editorText.getValue());
    }
}
