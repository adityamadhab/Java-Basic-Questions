//Java program to check a number is prime or not

class Prime {
    public static void main(String[] args) {
        int n=3,i,c=0;
        for(i=2;i<=n/2;i++) {
            if(n%i == 0) {
                System.out.println("Number is not prime");
                c = 1;
                break;
            }
        }
        if(c == 0) {
            System.out.println("Number is prime");
        }
    }
    
}