public class Square extends Shape{

    private double side;

    Square(double startPosition, double side){
        super(startPosition);
        this.side = side;
    }

    @Override
    double calculateVolume(){
        return 0;
    }

    @Override
    double findArea(){
        return this.side * this.side;
    }
}