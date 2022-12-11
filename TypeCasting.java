public class TypeCasting {

  public static void main(String[] args) {
    /* Wide Casting */
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt); // Outputs 9
    System.out.println(myDouble); // Outputs 9.0

    /* Narrow Casting */
    double theDouble = 9.78d;
    int theInt = (int) theDouble; // Manual casting: double to int

    System.out.println(theDouble); // Outputs 9.78
    System.out.println(theInt); // Outputs 9
  }
}
