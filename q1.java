//Java program to find the sum of two numbers

class AddTwo {
    int Sum(int x,int y) {
        return x+y;
    }
    public static void main(String[] args) {
        AddTwo A1 = new AddTwo();
        int v = A1.Sum(10, 20);
        System.out.println("The sum is : "+v);
    }
}