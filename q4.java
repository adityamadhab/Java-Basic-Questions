//Java program to find out the factors of a number using object creation and method call

class Fact {
    void factor(int x) {
        int i,fact=1;
        for(i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is : "+fact);
    }
    public static void main(String args[]){
        int x=5;
        Fact F1 = new Fact();
        F1.factor(x);
    }
}