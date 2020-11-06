import java.util.ArrayList;

/**
 * Container for a set of Shapes
 */
public class ShapeContainer
{
   // properties
   private ArrayList<Shape> shapes;

   // constructors
   public ShapeContainer()
   {
      shapes = new ArrayList<Shape>();
   }
   
   // methods
   public void add( Shape s)
   {
      shapes.add(s);
   }
   
   public double getArea( int index)
   {
      return shapes.get( index).getArea();
   }
   
   // Returns Shape if index is valid
   public Shape getShape( int index)
   {
      if ( index < 0 || index >= shapes.size() )
         return null;
      else
         return shapes.get( index);
   }
   
   // Toggles Shape's selected state
   public void setSelected( int index)
   {
      ( (Selectable) shapes.get( index) ).setSelected( !( ( (Selectable) shapes.get(index) ).getSelected() ) );
   }
   
   // Removes selected Shapes from ArrayList
   public void removeSelected()
   {
      for ( int i = 0; i < shapes.size(); i++)
      {
         if ( ( (Selectable) shapes.get(i) ).getSelected() )
            shapes.remove(i);
      }
   }
   
   // Returns ArrayList's size
   public int getContSize()
   {
      return shapes.size();
   }
   
   public String toString()
   {
      String s;
      
      if ( shapes.size() == 0)
         s = "Container is empty";
      else
      {
         s = "Index list:\n";
         for ( int i = 0; i < shapes.size(); i++)
         {
            s += i +  " - " + shapes.get(i).toString() + "\n";
         }
      }
      
      return s;
   }
   
   // Returns first Shape that contains (x,y) points
   // if there are not any, returns -1
   public int contains( int x, int y)
   {
      for ( int i = 0; i < shapes.size(); i++)
      {
         if ( ( ( Selectable ) shapes.get( i ) ).contains( x, y) != null)
            return i;
      }
         return -1;
   }
}