//Java program for swapping of two numbers

class SwapNumber {
    void SwapwithTemp(int a,int b) {
        int temp;
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    void SwapwithoutTemp(int a,int b) {
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        SwapNumber obj  = new SwapNumber();
        obj.SwapwithTemp(1, 2);
        obj.SwapwithTemp(1, 2);
    }
}
