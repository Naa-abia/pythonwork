public class Dog{

    String name = "";
    int age = 0;
    String color = "";
    String breed = "";

    // METHODS AND RETURNS

    // METHODS
    static void bark() { // this is a static that returns nothing
        System.out.println("Barking");
    }

    void run() { // this is a dynamic method that returns nothing
        System.out.println("Running");
    }

    // RETURN TYPES
    String getName() { // when you decide to a string there whatever it returns must be a keyword which
                       // is a string . Void will have to go out now .
        return name;
    }

    int getDogAge() {
        return age;
    }

    // PARAMETERS
    String getColor(String type) { // this means this parameter is supposed to put in a string inside
        return name;
    }

    // PARAMETER OVERLOADING
    String getNameWithType(String type, String breed) {
        return type + breed + name;
    }

    String getNameWithBreed(String type, String breed) {
        return type + breed + name;
    }

    //CONSTRUCTORS 
    //this defines the signature of how the field should be created
    //should be the same name as class - 2 constructors means that two methods in your class with the same name asyour class.
    
    Dog(String name){
      this.name = name;
    }

    //Constructors can be overloaded as well based on the params you supply
   
    Dog(String name, int age){

        this.name = name; 
        this.age = age;

    }
}