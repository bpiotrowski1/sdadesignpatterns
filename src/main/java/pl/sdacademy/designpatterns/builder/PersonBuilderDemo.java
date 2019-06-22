package pl.sdacademy.designpatterns.builder;

public class PersonBuilderDemo {
    public static void main(String[] args) {
        final Person person = new Person.PersonBuilder().age(23).name("Qwerty").build();

        System.out.println(person);
    }
}
