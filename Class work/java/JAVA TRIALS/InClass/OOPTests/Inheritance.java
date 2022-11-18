class Inheritance {
    protected String brand = "Ford"; //Vehicle attribute
    public void honk() {
         System.out.println("Tatatata");
    }

  
    public static void main (String[] args){
        Car myCar = new Car();
        myCar.modelName = "play";
        System.out.println(myCar.modelName);

    }

    }

    class Car extends Inheritance{
        protected String modelName = "Hyundai";
    
    
    }






