//Java program to compute quoteint or remainder using method

class RemQ {
    int Quo(int a,int b) {
        return a/b;
    }
    int Rem(int a,int b) {
        return a%b;
    }
    public static void main(String[] args) {
        int l = 11, m= 2;
        RemQ R1 = new RemQ();
        int x = R1.Quo(l,m);
        int y = R1.Rem(l,m);
        System.out.println("The quotient is : "+x);
        System.out.println("The remainder is : "+y);
    }
} 