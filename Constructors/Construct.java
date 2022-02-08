package methodss;

public class Construct{
    private String name;    
    private int id;
     
    Construct(){         
        name = "Ram";   // initializing instance variables inside constructor
        id = 77;
    }
    Construct(String n, int i){  // creating parameterized constructor with two values
        name = n; // initializing instance variables inside constructor
        id = i;
    }
 
    void details() {
        System.out.println("My name is " + name);
        System.out.println("My id is " + id);
    }
  
    public static void main(String[] args) {
        Construct ram = new Construct(); // creating object of class construct
        ram.details();                   // calling method using object
         
        Construct sita = new Construct("Sita", 55); // creating 2nd object of class construct by another programmer
        sita.details();                             // calling method using another object
         
        Construct lakshaman = new Construct("Lakshaman", 99); // creating 3rd object of class construct by another programmer
        lakshaman.details();                                  // calling method using another object
    }
}