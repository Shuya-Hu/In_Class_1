package exercise1;
import java.util.*;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author shuya
 * @author Shuya Hu May 23, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int random = 1 + (int)(Math.random() * 13);
            card.setValue(random);
            int randomSuit = (int) (Math.random() * 4);
            card.setSuit(Card.SUITS[randomSuit]);
            hand[i] = card;
        }
        System.out.println("Enter the card value");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        System.out.println("Guess the card face");
        String userSuit = input.next();
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(userSuit);
        for (int i =0; i< hand.length;i++) {
          //System.out.println(hand[i].getValue() + hand[i].getSuit() + "");
          if(hand[i].getValue() == userCard.getValue() && hand[i].getSuit().equals(userCard.getSuit())){
            printInfo();
            break;
          }
         }    
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Shuya Hu May 2023
     */
    private static void printInfo() {
    
      // I'm done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Shuya.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be proud of myself");
        System.out.println("-- Work hard!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Manga");
        System.out.println("-- Feminism");
        System.out.println("-- Outdoor activities");
        

        System.out.println();
        
    
    }

}
