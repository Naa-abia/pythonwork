package Subsription;

public abstract class BaseSubscription {

    private double amount;
    private int durationInMonths;
    private String name;

    // subscription is adding a number to do . 
    //Boolean because it will return either true or false .(being able to add or not add. )
    //its abstract because you can define how it should be added)
    
    abstract boolean canAddToDo();
}
