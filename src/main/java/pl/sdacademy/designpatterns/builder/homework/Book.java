package pl.sdacademy.designpatterns.builder.homework;

public class Book {
    private String ISBN;
    private int pages;
    private String title;
    private String author;
    private String description;

    public Book(final String ISBN, final int pages, final String title, final String author, final String description) {
        this.ISBN = ISBN;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    static class Builder {
        private String ISBN;
        private int pages;
        private String title;
        private String author;
        private String description;

        Builder withISBN(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        Builder withPages(int pages) {
            this.pages = pages;
            return this;
        }

        Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        Book build() {
            return new Book(ISBN, pages, title, author, description);
        }
    }
}
