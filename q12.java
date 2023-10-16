//Java program to convert binary to decimal

class BinaryToDecimalConverter {
    public static void main(String[] args) {
        int binaryNumber = 1010;
        int decimal = binaryToDecimal(binaryNumber);
        System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimal);
    }

    public static int binaryToDecimal(int binaryNumber) {
        int decimal = 0;
        int power = 0;
        while (binaryNumber > 0) {
            int bit = binaryNumber % 10;
            decimal += bit * Math.pow(2, power);
            binaryNumber /= 10;
            power++;
        }
        return decimal;
    }
}