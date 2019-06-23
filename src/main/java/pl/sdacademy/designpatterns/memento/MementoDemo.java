package pl.sdacademy.designpatterns.memento;

public class MementoDemo {

    public static void main(String[] args) {
        final EditorText editorText = new EditorText();
        final EditorTextMementoManager mementoManager = new EditorTextMementoManager();

        mementoManager.save(new EditorTextMemento(editorText));
        editorText.addText("This is my frist line");
        mementoManager.save(new EditorTextMemento(editorText));
        editorText.addText(". This is first line continuatnion");
        mementoManager.save(new EditorTextMemento(editorText));
        editorText.addText(".\nThis is second line");
        mementoManager.save(new EditorTextMemento(editorText));
        editorText.addText(".\nThis is third line");
        mementoManager.save(new EditorTextMemento(editorText));

        System.out.println(editorText.getValue() + "\n");

        mementoManager.restore();
        mementoManager.restore();
        editorText.restoreFromMemento(mementoManager.restore());

        System.out.println(editorText.getValue());
    }
}
