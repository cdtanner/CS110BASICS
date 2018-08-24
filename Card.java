

/**
 * Card.java<br>
 * CS 110 Sample Class<br>
 * Models a Playing Card such as the ace of spades
 */
public class Card
{
    public enum Suits{spades,hearts,clubs,diamonds}

    public final static int ACE =1;
    public final static int JACK =11;
    public final static int QUEEN =12;
    public final static int KING =13;
    
    private int face;
    private Suits suit;


    //Constructors
     /**null constructor randomly generates a card<br>
       * Pre-Conditions: none <br>
       * Post-conditions: a single legitimate card is generated, no test for uniqueness*/
    public Card ()
     
    {
      face = (int)(Math.random() * 13 +1);
      switch((int)(Math.random()*4))
      {
        case 0: suit = Suits.spades;
        break;
        case 1: suit = Suits.hearts;
        break;
        case 2: suit = Suits.clubs;
        break;
        case 3: suit = Suits.diamonds;
        break;
      }
    }
      
    /**initializes suit_type=>s, face=>f<br>
      * Pre-Conditions: legimitmate face and suit value<br>
      * Post-Condition: a speciific card face=f, suit=s is generated<br>
      * responses: illegitimate Card
      * @param s = suit value specified
      * @param f = face value specified*/
    public Card (Suits s, int f)
    {
      suit = s;
      face = f;
    }
   
    //accessors
    /**returns the suit value of the specified card<br>
      * pre-conditions: none<br>
      * post-conditions: card is unchanged
      * @return suit value of card specified*/
    public Suits getSuit ()
    {
      return suit;
    }  

    /**returns the face value of the specified card<br>
      * pre-conditions: none<br>
      * post-conditions: card is unchanged
      * @return face value of card specified*/
    public int getFace ()
    {
     return face;
    } 
 
    /**Function to display card face of suit<br>
      * pre-conditions: none<br>
      * post-conditions: the card value as face of suit is display on the screen*/
    public void printCard()
    {
      System.out.print("The card is ");
      if (face > 1 && face <= 10)
        System.out.print(face);
      else
      {
        if (face == ACE) System.out.print("Ace");
        else if (face == JACK) System.out.print("Jack");
        else if (face == QUEEN) System.out.print("Queen");
        else System.out.print("King");
      }
  
      System.out.print(" of " + suit);
    }

    /**function to test equality of two cards<br>
      * pre-conditions: card  c1 is a valid card<br>
      * post-conditions: none the object recieveing the message remains unchanged<br>
      * responses: error terminate
      * @param c1 = valid Card
      * @return true if the cards are equivalent, false if different in either face or suit*/
    public boolean equals (Card c1)
    {
      return (c1.face == face && c1.suit == suit);
    }

    /**function to determine if same face value<br>
      * pre-conditions: card  c1 is a valid card<br>
      * post-conditions: none the object recieveing the message remains unchanged<br>
      * responses: error terminate
      * @param c1 = valid Card
      * @return true if the cards face values are are equivalent, false if different in face*/
    public boolean sameFace (Card c1)
    {
      return (c1.face == face);
    }
    
    /**function to test same suit<br>
      * pre-conditions: card  c1 is a valid card<br>
      * post-conditions: none the object recieveing the message remains unchanged<br>
      * repsonses: error terminate
      * @param c1 = valid Card
      * @return true if the cards suit values are are equivalent, false if different in suit*/
    public boolean sameSuit (Card c1)
    {
      return (c1.suit == suit);
    }

    /**Function to convert card values to a string value<br>
      * pre-conditions: none<br>
      * post-conditions: card remains unchanged
      * @return string contents of the card as face of suit*/
    public String toString()
    {
     return face + " of " + suit;
    }
}



