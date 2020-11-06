/**
 * A class for Square objects
 */
public class Square extends Rectangle
{
   // properties
   private int side;

   // constructors
   public Square( int side)
   {
      super( side, side);
      this.side = side;
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   public void setLocation( int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   public String toString()
   {
      return "Square - Side length: " + side + " - ( x, y) = ( " 
         + x + ", " + y + ") - Selected: " + selected;
   }
}