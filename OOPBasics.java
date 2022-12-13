public class OOPBasics {

  int x = 5;

  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public static void main(String[] args) {
    OOPBasics myObj = new OOPBasics();

    myObj.x = 25; //Modify attributes

    System.out.println(myObj.x);

    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    OOPBasics myObjt = new OOPBasics(); // Create an object of Main
    myObjt.myPublicMethod(); // Call the public method on the object
  }
}
