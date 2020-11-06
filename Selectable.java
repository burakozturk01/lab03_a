/**
 * Selects, unselects objects and tests for inside points
 */
public interface Selectable
{
   // methods
   boolean getSelected();
   void setSelected( boolean selected);
   
   Shape contains( int x, int y);
}