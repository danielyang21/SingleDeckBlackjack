public class Deck {
    Card[]  deckCards;
    int     numCards;


    public String toString(){
        String outString = "";
        for (int i = 0; i < numCards; i++){
            outString += deckCards[i];
        }

        return outString;
    }

    public void generateDeck(int modifier){
        int suit;
        int cardsPerSuit;
        if (modifier == 0){
            suit            = 0;
            cardsPerSuit    = 13;
            
            for (int i = 0; i < numCards; i++){
                if (i % cardsPerSuit == 0) suit++;
		        deckCards[i].number = (byte)(i % cardsPerSuit);
		        deckCards[i].number++;
		
		        if 		    (suit == 1) deckCards[i].suit = "Clubs";
		        else if 	(suit == 2) deckCards[i].suit = "Diamonds";
		        else if 	(suit == 3) deckCards[i].suit = "Hearts";
		        else if 	(suit == 4) deckCards[i].suit = "Spades";
		        else 	    deckCards[i].suit = "Joker" + suit;
            }
        }
    }


}
