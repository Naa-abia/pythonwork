//using this as a way to extend into cattle 

public class Mammals {
   
    int numberOfLegs;

    public Mammals(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;

    }
    //the setter is used to change something in the attribute 
    public void setnumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    //the modifier private means this method can only be used in Mammals class
    private void closeEye(){
        System.out.println("Eye Close");
    }
}
