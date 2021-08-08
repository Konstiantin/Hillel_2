package Swets;

public class Candies {

    private int Weight;

    static int arrayLength = 0;

    public Candies (int weight) {
        this.Weight = weight;
        arrayLength++;
    }


    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public static int getArrayLength() {
        return arrayLength;
    }

    public static void setArrayLength(int arrayLength) {
        Candies.arrayLength = arrayLength;
    }
}






