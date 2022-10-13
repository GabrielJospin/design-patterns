package creational.singleton;

import java.io.IOException;

public class Singleton {

    public static void testHello(){
        Writer player1;
        Writer player2;
        Writer player3;
        Writer player4;

        try {
            player1 = Writer.getInstance();
            player2 = Writer.getInstance();
            player3 = Writer.getInstance();
            player4 = Writer.getInstance();
        } catch (IOException e) {
            System.out.println("Error in construct players");
            throw new RuntimeException(e);
        }

        player1.messageSystem("A Long time ago, in a galaxy far far away");

        player1.messageUser("Arroy", "Carlos");
        player2.messageUser("Hello Guys", "Raul");
        player3.messageUser("Hello There", "Kenoby");
        player4.messageUser("General Kenoby!!", "???");

        player3.close();
    }

    public static void main(String[] args) {
        testHello();
        testHello();
    }
}
