package pl.sdacademy.designpatterns.builder;

public class PlayerBuilderDemo {
    public static void main(String[] args) {
        final Player player = new Player.Builder().withHealth(100).withMana(20).withNick("Qwerty").build();
        final Player player2 = new Player.Builder().withNick("Andrzej").withLevel(70).withHealth(100).build();

        System.out.println(player);
        System.out.println(player2);
    }
}
