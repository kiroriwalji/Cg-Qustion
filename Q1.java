// Create a Java class called Person with the following attributes and methods:

// Attributes:
// name (String)
// age (int)
// Methods:
// isAdult(): Check if the person is an adult (age >= 18) and return a boolean value.
// greet(): Display a greeting message including the person's name and age.
// Additionally, create a Main class with a main method to test your Person class by creating an instance, setting its attributes, and calling the isAdult and greet methods.

// Would you like to see the solution code, or do you want to give it a try first?
class person{
    String name;
    int age;
    person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean isAdult(){
        return age >= 18;
        
    }
    public void greet() {
        System.out.println(name + " = "+age );

    }
}
public class Cg {
    public static void main(String[] args) {
        person k = new person("vishal", 18);
        if (k.isAdult()) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult yet.");
        }
        k.greet();
    }
}


