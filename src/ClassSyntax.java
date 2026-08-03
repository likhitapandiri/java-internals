public class ClassSyntax {
    //constructor - must match class name.No return type.Not even void.
    ClassSyntax() {
        System.out.println("obj created");
    }

    //A static block runs when the class is loaded by the JVM, before any object is created and before any static method is executed.
    //When does Java load a class?
    //Answer: When the class is actively used for the first time.
    //Runs only once. - Because the class is loaded only once.Once loaded, the JVM remembers it.
    static {
        System.out.println("Loading Product Class");
    }

    //Parameterized Constructor
    ClassSyntax(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Fields - each obj gets its own copy
    int id;
    String name;
    double price;
    int stock;

    //Methods - define behaviour
    void display() {
        System.out.println(name + " : " + price);
    }
}

