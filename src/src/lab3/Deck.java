package lab3;

public class Deck {
    static final int CARD_COUNT = 52;
    Card[] actualDeck = new Card[CARD_COUNT];
    public Deck(){
        for(int suit = 0; suit < 4; suit++){
            for(int rank = 1; rank <= 13; rank++){
                this.actualDeck[((suit*13)+rank)-1] = new Card(rank, suit);
            }
        }
    }
}
