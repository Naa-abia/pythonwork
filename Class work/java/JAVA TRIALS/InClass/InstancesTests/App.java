public class App {
    
    public static void main(String[] args) {
      
        //calling the method from another class which has that same method .
        Dog bruce = new Dog("Shelby"); // showing how the enforcement of the contructor is being used .
        
        String color = bruce.getColor("Red");
        // Dog jam = new Dog(); a copy of the object



        bruce.run();
        bruce.getName();
    
        
    }
}
