public class CandyFactory {
    public static Candy getCandy(CandyType candyType) {
        if (candyType == CandyType.MINTY) {
            return new MintyCandy();
        } else if(candyType ==CandyType.HARD){
            return new HardCandy();
        }
        return null;
    }
}
