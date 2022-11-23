package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value : " + myMinFloatValue);
        System.out.println("Max Float Value : " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value : " + myMinDoubleValue);
        System.out.println("Max Double Value : " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue : " + myIntValue + "\nMyFloatValue : " + myFloatValue + "\nMyDoubleValue : " + myDoubleValue);


        // Challenge - Pound to Kg
        double myPound = 200d;
        double resultKG = myPound * 0.45359237d;

        System.out.println(resultKG);

    }
}
