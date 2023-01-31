package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * 
 * @author Bhavya Shah  
 */
        import java.util.Random;

        public class CardTrick {
            

            public static void main(String []args) {
             Card[] hand;
             hand = new Card[7];
            Random rand = new Random();
            Card card = new Card();
            int randomValue = rand.nextInt(13) + 1;
            int randomSuit = rand.nextInt(4);
            for (int i = 0; i < hand.length; i++) {
            
            card.setValue(randomValue);
            card.setSuit(Card.SUITS[randomSuit]);
            hand[i] = card;
        }
        
            
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the value and suits");
                int cardValue = input.nextInt();
                String SuitsValue = input.next();
              boolean found = false;
              for(int i=0; i<hand.length;i++){
                  if((hand[i].getValue()==cardValue)&& hand[i].getSuit().equalsIgnoreCase(SuitsValue))
                      System.out.println("Card is found at"+(i+1));
                  found = true;
                  break;
              }
              if(!found)
                  System.out.print("Card is not found in hand");
            }
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Saad, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
    }


}
