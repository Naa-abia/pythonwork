public class Dog {

    String name = "";
    int age = 0;

    // METHODS AND RETURNS

    //METHODS
    static void bark() { // this is a static that returns nothing
        System.out.println("Barking");
    }

    void run() { // this is a dynamic method that returns nothing
        System.out.println("Running");
    }


    //RETURN TYPES
    String getName() { // when you decide to a string there whatever it returns must be a keyword which
                       // is a string . Void will have to go out now .
        return name;
    }

    int getDogAge(){
        return age;
    }
}