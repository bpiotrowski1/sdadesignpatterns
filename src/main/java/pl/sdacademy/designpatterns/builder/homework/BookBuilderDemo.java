package pl.sdacademy.designpatterns.builder.homework;

public class BookBuilderDemo {
    public static void main(String[] args) {
        final Book bookA = new Book.Builder().withISBN("1234").withAuthor("Gienek").withPages(100).build();

        System.out.println(bookA);
    }
}
