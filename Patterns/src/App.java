package src;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        if (args.length == 0){
            System.out.println( "Hello World!" );
        } else if (args.length == 1) {
            System.out.println("Hola " + args[0]);
        } else {
            System.out.println("Hola " + args[0] + " "+ args[1]);
        }
    }
}
