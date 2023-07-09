package lab3;

import java.util.Random;
import java.util.Stack;

public class Dealer {
    private Deck deck;
    public Player[] players;
    public Dealer(Player[] players, Deck deck){
        this.players = players;
        this.deck = deck;
        this.shuffle();
    }
    private void swap(int in1, int in2){
        Card temp = this.deck.actualDeck[in1];
        this.deck.actualDeck[in1] = this.deck.actualDeck[in2];
        this.deck.actualDeck[in2] = temp;
    }
    private void shuffle(){
        Random random = new Random();
        for(int i = 0; i < Deck.CARD_COUNT; i++){
            swap(random.nextInt(Deck.CARD_COUNT), random.nextInt(Deck.CARD_COUNT));
        }
    }
    public void distribute(){
        int count = 0;
        for (Player player : players) {
            Stack<Card> temp = new Stack<>();
            for (int j = 0; j < Deck.CARD_COUNT / players.length; j++) {
                temp.push(this.deck.actualDeck[51 - count]);//pushes last card onto player hand (stack)
                this.deck.actualDeck[51 - count] = new Card(0, 0); //remove cards from deck once dealt
                count++;
            }
            player.setHand(temp);
        }
    }
    public void printCards(){
        for(int i = 0; i < Deck.CARD_COUNT; i++){
            System.out.println("Suit: "+this.deck.actualDeck[i].getSuit()+"Rank: "+this.deck.actualDeck[i].getRank());
        }
    }
}
