public abstract class Shape {

     
        // private double height;
        
        private double startPosition;  //abstract must have properties thatbe used 

        Shape (double startPosition){
            this.startPosition = startPosition;
        }

        abstract double calculateVolume();

        abstract double findArea(); // this has to be abstract because you cannot find area unless you are given the
                                // digits to calculate it this makes it an abstract .  

    void move(double nextLocation){
        System.out.println("Moved from" + startPosition + "to" + nextLocation);
    }

}