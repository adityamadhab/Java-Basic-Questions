//Java Program to find the roots of a quadratic equation

class Quad {
    public static void main(String[] args) {
        double a = 1, b = 4,c = 1,root1,root2;
        double det = (b * b) - (4*a*c);
        if(det>0)
        {
            root1 = (-b + Math.sqrt(det)) / (2*a);            
            root2 = (-b - Math.sqrt(det)) / (2*a);      
            System.out.println("Roots are : "+root1+" "+root2);      
        }
        else if (det == 0) {
            root1 = -b / (2*a);
            root2 = -b / (2*a);
            System.out.println("Roots are : "+root1+" "+root2);
        }
        else {
            double real = -b / (2*a);
            double imaginary = Math.sqrt(-det) / (2*a);
            root1 = real+imaginary;
            root2 = real-imaginary;
            System.out.println("Roots are : "+root1+" "+root2);
        }
    } 
}