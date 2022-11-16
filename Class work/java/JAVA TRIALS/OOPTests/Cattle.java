public class Cattle extends Mammals {
    /**
     * @param numberOfLegs
     */

    public Cattle(int numberOfLegs, int numberOfHead) {
        super(numberOfLegs); // we are saying new mammal which takes the argument of mammal and after that
    }

    public static void main(String[] args) {
        Cattle mainCattle = new Cattle(4, 5);
        mainCattle.setnumberOfLegs(4);
        mainCattle.setnumberOfHead(5);
    }

    private void setnumberOfHead(int i) {
    }

    // this overide would cause an override in the mammal class which is the parent
    // class
    @Override
    public void setnumberOfLegs(int numberOfLegs) {
        super.setnumberOfLegs(numberOfLegs);
    }

}
