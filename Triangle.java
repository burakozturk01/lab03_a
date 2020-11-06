/**
 *Triangle shape selectable
 */
public class Triangle extends Shape implements Selectable
{
   // properties
   private int a, b, c;
   private boolean selected;

   // constructors
   public Triangle( int side1, int side2, int side3)
   {
      selected = false;
      a = side1;
      b = side2;
      c = side3;
      x = 0;
      y = 0;
   }
   
   // methods
   public double getArea()
   {
      double p = (a + b + c) / 2;
      
      return Math.sqrt(p*(p-a)*(p-b)*(p-c));
   }
   
   public int getX()
   {
      return x;
   }
   
   public int getY()
   {
      return y;
   }
   
   // Sets location of triangle in XY-plane
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
      double r = (a * b * c) / (4 * this.getArea());
      
      Circle tmp = new Circle( (int)r);
      tmp.setLocation( this.x, this.y);
      
      if (tmp.contains( x, y) != null)
         return this;
      else
         return null;
   }
   
   public String toString()
   {
      return "Triangle - Sides: " + a + " - " + b + " - " + c + "| ( x, y) = ( " + x + ", " + y + ") - Selected: " + selected;
   }
}