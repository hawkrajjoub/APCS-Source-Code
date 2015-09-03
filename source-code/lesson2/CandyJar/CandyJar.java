/**
 * Complete the definition of the method doubleCandyAmount.
 */

public class CandyJar {

   private int myCandyCount;
   private int blueCandy;
   
   
   public CandyJar (){}
   
   // Initialize a CandyJar object having startingCount pieces of candy.
   public CandyJar (int startingCount, int blueCount) {
      myCandyCount = startingCount ;
    }
   
   public void blueCandy(int blueCount){
    blueCandy = blueCount;
    }
    
    // Eat amount pieces of candy.
   public void eat(int amount) {
      myCandyCount = myCandyCount - amount;
   }
   
    public void eatBlueCandy(int amount) {
      blueCandy = blueCandy - amount;
   }
   
   
   
   
   // Add amount to the candy currently in the jar.
   public void refill (int amount) {
      myCandyCount = myCandyCount + amount;
   }
   
   // Return the number of pieces of candy currently in the jar.
   public int candyCount ( ) {
      return myCandyCount;
   }
   
   // Double the amount of candy currently in the jar
   public void doubleCandyAmount(){
      myCandyCount = myCandyCount + myCandyCount;
   }
   
   
}
  