//Java program to add two compplex numbers by passing class to a function

class Complex {
    double real, imaginary;
 
    Complex(double real, double imaginary) {
       this.real = real;
       this.imaginary = imaginary;
    }
 
    int add(Complex c) {
       this.real += c.real;
       this.imaginary += c.imaginary;
       return 1;
    }
 
    void print() {
       System.out.print("(" + real + " + " + imaginary + "i)");
    }
    public static void main(String args[]) {
       Complex c1 = new Complex(2.5,4.0);
       Complex c2 = new Complex(1.5,3.0);
       c1.add(c2);
       System.out.print("The required sum is ");
       c1.print();
    }
 }
 