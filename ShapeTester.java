import java.util.Scanner;
import java.util.ArrayList;

/**
 * Shape tester program with a menu
 * @author Burak Ozturk
 * @version 05.11.2020
 */ 
public class ShapeTester
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      

      // variables
      
      // containers
      ShapeContainer box;
      ArrayList<Integer> indexes;
      
      // temporary storages
      Shape tmp;
      int temp;
      
      // user intake vars
      int take1, take2;
      int x, y;
      
      
      // program code
      System.out.println( "---Shape container program---\n");
      box = new ShapeContainer();
      indexes = new ArrayList<Integer>();
      
      // Menu loop
      do
      {
         // Menu options
         System.out.println( "1. Create new Shape container");
         System.out.println( "2. Add a Shape");
         System.out.println( "3. Total surface area of the entire set of Shapes");
         System.out.println( "4. Information about all of the Shapes in the container");
         System.out.println( "5. Toggle selection of the first Shape that contains a given x, y point");
         System.out.println( "6. Remove selected Shapes");
         System.out.println( "7. Set a shape's coordinates");
         System.out.println( "\n0. Exit\n");
         
         // Taking selection
         take1 = scan.nextInt();
         
         // Create new shape container
         if ( take1 == 1)
         {
            box = new ShapeContainer();
            System.out.println( "New Shape container created\n");
         }
         
         // Add a shape
         if ( take1 == 2)
         {
            // Sub-menu for selecting wanted shape to add
            System.out.println( "1. Rectangle");
            System.out.println( "2. Square");
            System.out.println( "3. Circle");
            System.out.println( "4. Triangle\n");
            System.out.println( "0. Exit");
            
            take2 = scan.nextInt();
            
            // Menu option 2
            if ( take2 != 0)
            {
               // Create rectangle instance with width and height. And add to collection
               if ( take2 == 1)
               {
                  System.out.println( "Enter Rectangle's sides (width, height):");
                  tmp = new Rectangle( scan.nextInt(), scan.nextInt() );
                  box.add( tmp );
                  System.out.println( "Shape added\n");
               }
               
               // Create square instance with side length. And add to collection
               if ( take2 == 2)
               {
                  System.out.println( "Enter Square's side length:");
                  tmp = new Square( scan.nextInt() );
                  box.add( tmp );
                  System.out.println( "Shape added\n");
               }
               
               // Create circle instance with radius. And add to collection
               if ( take2 == 3)
               {
                  System.out.println( "Enter circle's radius:");
                  tmp = new Circle( scan.nextInt() );
                  box.add( tmp );
                  System.out.println( "Shape added\n");
               }
               
               // Create triangle instance with sides. And add to collection
               if ( take2 == 4)
               {
                  System.out.println( "Enter triangle's three sides:");
                  tmp = new Triangle( scan.nextInt(), scan.nextInt(), scan.nextInt());
                  box.add( tmp );
                  System.out.println( "Shape added\n");
               }
            }
            // Exit without add anything
            else
               System.out.println( "No Shape added\n");
         }
         
         // Total surface area of the entire set of shapes
         if ( take1 == 3)
         {
            double total;
            total = 0;
            
            for ( int i = 0; i < box.getContSize(); i++)
               total += box.getArea(i);
            
            System.out.println( "Total area of Shape(s) is " + total + ".\n");
         }
         
         // Information about all of the shapes in the container
         if ( take1 == 4)
         {
            System.out.println( box.toString() + "\n");
         }
         
         // Toggle selection of the first Shape that contains a given x, y point
         if ( take1 == 5)
         {
            // Get x and y from user
            System.out.println( "Enter x and y (int):");
            x = scan.nextInt();
            y = scan.nextInt();
            temp = box.contains( x, y);
            
            if ( temp != -1)
            {
               // get index number of first match from ShapeContainer box
               // add it to indexes ArrayList
               indexes.add( temp );
               box.setSelected( indexes.get( indexes.size() - 1 ) );
               
               // report toggled Shape
               System.out.println( "Index number " + indexes.get( indexes.size() - 1 ) + " selected.\n");
            }
            else
               // report if no Shape found
               System.out.println( "No Shape found\n");
         }
         
         // Remove selected Shapes
         if ( take1 == 6)
         {
            box.removeSelected();
            System.out.println( "Selected shapes removed\n");
         }
         
         if ( take1 == 7)
         {
            System.out.println( box.toString() + "\n");
            
            System.out.println( "Enter index:");
            take2 = scan.nextInt();
            
            tmp = box.getShape( take2);
            
            int t1, t2;
            System.out.println( "Enter x-y coordinates:");
            t1 = scan.nextInt(); t2 = scan.nextInt();
            
            tmp.setLocation( t1, t2);
         }
      } while ( take1 != 0); // last menu option of Exit
      
      System.out.println( "End.");
   }

}