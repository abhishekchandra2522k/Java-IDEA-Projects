package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum Integer Value : " + minIntValue);
        System.out.println("Maximum Integer Value : " + maxIntValue);

        System.out.println("Busted Maximum Integer Value : " + (maxIntValue + 1));
        System.out.println("Busted Minimum Integer Value : " + (minIntValue - 1));

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value : " + minByteValue);
        System.out.println("Maximum Byte Value : " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value : " + minShortValue);
        System.out.println("Maximum Short Value : " + maxShortValue);
        
        long myLongValue = 100L; // L is necessary to be put at the end of the number
        
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long Value : " + minLongValue);
        System.out.println("Maximum Long Value : " + maxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (minIntValue / 2);

        byte myNewByteValue = (byte)(minByteValue / 2);

        short myNewShortValue = (short)(minShortValue / 2);
    }
}
