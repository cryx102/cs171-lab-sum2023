package lab3;

import lab1.Circle;
import lab3.ClassA;
import lab3.ClassB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Both ClassA");
        ClassA objA = new ClassA();
        objA.sayName();

        System.out.println("Both ClassB");
        ClassB objB = new ClassB();
        objB.sayName();
        objB.extraMethod();

        System.out.println("ClassA, instance B");
        ClassA objAB = new ClassB();
        objAB.sayName();

        Deck mainDeck = new Deck();
        Player player1 = new Player();
        Player player2 = new Player();
        Player[] players = {player1, player2};
        Dealer dealer = new Dealer(players, mainDeck);

        dealer.distribute();

        dealer.players[0].playEverything();
        dealer.players[1].playEverything();
    }
}