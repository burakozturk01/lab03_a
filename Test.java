import java.util.Scanner;

/**
 * Extra test-only main method
 * @author Burak Ozturk
 * @version 05.11.2020
 */ 
public class Test
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      Shape shep;
      ShapeContainer box;

      // program code
      System.out.println( "Start...");
      
      box = new ShapeContainer();
      System.out.println( box.toString() );
      
      shep = new Circle(4);
      box.add(shep);
      System.out.println( box.toString() );
      
      shep = new Rectangle( 3, 4);
      box.add(shep);
      System.out.println( box.toString() );
      
      shep = new Square( 16);
      box.add(shep);
      System.out.println( box.toString() );
      
      System.out.println( "End.");
   }

}