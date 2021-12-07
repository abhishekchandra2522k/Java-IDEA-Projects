package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum Integer Value : " + minIntValue);
        System.out.println("Maximum Integer Value : " + maxIntValue);

        System.out.println("Busted Maximum Integer Value : " + (maxIntValue + 1));

    }
}
