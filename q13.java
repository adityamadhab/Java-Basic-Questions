//Java program to convert octal to binary

class OctalToBinaryConverter {

    int octalToBinary(int octalNumber) {
        int binaryNumber = 0;
        int power = 1;
        while (octalNumber > 0) {
            int octalDigit = octalNumber % 10;
            int binaryDigit = 0; 
            int bitPosition = 1;
            while (octalDigit > 0) {
                binaryDigit += (octalDigit % 2) * bitPosition;
                octalDigit /= 2;
                bitPosition *= 10;
            }
            binaryNumber += binaryDigit * power;
            power *= 1000;
            octalNumber /= 10;
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
        OctalToBinaryConverter converter = new OctalToBinaryConverter();
        System.out.println("The binary equivalent of octal " + converter.octalToBinary(123));
    }
}