/**
 * A class for Selectable Rectangle objects
 */
public class Rectangle extends Shape implements Selectable
{
   // properties
   private int width;
   private int height;
   boolean selected;

   // constructors
   // Creates instance with width and height, centered at 0,0 position
   public Rectangle( int width, int height)
   {
      this.width = width;
      this.height = height;
      selected = false;
      x = 0;
      y = 0;
   }
   
   // methods
   // Calculates area of rectangle
   public double getArea()
   {
      return width * height;
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   // Sets location of rectangle in XY-plane
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
   
   // if Rectangle contains given (x,y) point
   //    returns the shape
   // else
   //    returns null
   public Shape contains( int x, int y)
   {
      if ( Math.abs( x - this.x) <= ( height / 2 ) && Math.abs( y - this.y) <= ( width / 2 ) )
         return this;
      else
         return null;
   }
   public String toString()
   {
      return "Rectangle - Height: " + height + " Width: " + width + " - ( x, y) = ( " + x + ", " + y + ") - Selected: " + selected;
   }
}