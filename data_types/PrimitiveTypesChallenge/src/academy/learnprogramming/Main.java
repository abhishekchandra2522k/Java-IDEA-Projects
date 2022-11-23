package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByteNumber = 100;
        short myShortNumber = 10000;
        int myIntNumber = 1000000;

        long myLongNumber = (50000L + 10L*(myByteNumber + myShortNumber + myIntNumber));
        short shortTotal = (short)(1000 + 10*(myByteNumber + myShortNumber +myIntNumber));
        System.out.println(myLongNumber);
    }
}
