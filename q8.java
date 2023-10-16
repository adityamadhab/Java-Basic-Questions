//Java program to display armstrong number using method

class Armstrong {
    int calcu(int n) {
        int army = 0;
        while(n!=0) {
            int temp = n%10;
            army = army + temp*temp*temp;
            n=n/10;
        }
        return army;
    }
    public static void main(String[] args) {
        int low = 99, high = 999;
        for(int i=low+1;i<high;i++) {
            int x =i;
            Armstrong A = new Armstrong();
            int y = A.calcu(x);
            if(y == i) {
                System.out.println(i);
            }
        }
    }
}
