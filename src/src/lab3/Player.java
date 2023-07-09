package lab3;

import java.util.ArrayList;
import java.util.Stack;

public class Player {
    public String name;
    private Stack<Card> hand;
    public Player(){
        name = "";
        this.hand = new Stack<>();
    }
    public Player(Stack<Card> hand){
        name = "";
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Card> getHand() {
        return hand;
    }

    public void setHand(Stack<Card> hand) {
        this.hand = hand;
    }

    public Card play() {
        return hand.pop();
    }
    public void playAndPrint(){
        System.out.println(hand.pop().toString());
    }
    public void playEverything(){
        while(!hand.isEmpty()){
            playAndPrint();
        }
    }
}
