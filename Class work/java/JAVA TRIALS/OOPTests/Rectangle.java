public class Rectangle extends Shape { // Rectangle inherits shape but because its an abstract it has somethings that
                                       // have to be implemented to be able to use it
   private double length;
   private double width;
   
    Rectangle(double startPosition){
        super(startPosition);
    
    }

    @Override
    double calculateVolume(){
        return 0;
    }


    @Override
    double findArea(){
        return this.length * this.width;
    }}
