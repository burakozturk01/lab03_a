/**
 * A class for Selectable Circle objects
 */
public class Circle extends Shape implements Selectable
{
   // properties
   private int radius;
   private static final double PI = 3.142;
   private boolean selected;

   // constructors
   // Creates instance with radius, centered at 0,0 position
   public Circle( int radius)
   {
      this.radius = radius;
      selected = false;
      x = 0;
      y = 0;
   }
   
   // methods
   // Calculates area of circle
   public double getArea()
   {
      return ( PI * radius * radius);
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   // Sets location of circle in XY-plane
   public void setLocation( int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   public boolean getSelected()
   {
      return selected;
   }
   
   public void setSelected( boolean selected)
   {
      this.selected = selected;
   }
    
   // if Circle contains given (x,y) point
   //    returns the shape
   // else
   //    returns null
   public Shape contains( int x, int y)
   {
      if ( ( x - this.x ) * ( x - this.x ) + ( y - this.y ) * ( y - this.y ) <= ( radius * radius ) )
         return this;
      else
         return null;
   }
   
   public String toString()
   {
      return "Circle - Radius: " + radius + " ( x, y) = ( " + x + ", " + y + ") - Selected: " + selected;
   }
}