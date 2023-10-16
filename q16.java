//Java program to implement a calculator which will throw exception while dividing by 0

class CalException {
    public static void main(String[] args) {
        int a = 5, b = 0, result = 0;
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
        System.out.println("The sub of "+a+" and "+b+" is "+(a-b));
        System.out.println("The multiplication of "+a+" and "+b+" is "+(a*b));
        try {
            result = a/b;
            System.out.println("The division of "+a+" and "+b+" is "+result);
        }
        catch(ArithmeticException e) {
            System.out.println("Can't divided "+e.getMessage());
        }
    }
}