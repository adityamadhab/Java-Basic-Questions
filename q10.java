//Java program to find transpose of a matrix

class Transpose {
    public static void main(String[] args) {
        int A[][] = {{1,2,3,4},{4,5,6,7}};
        int B[][] = new int[4][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<4;j++) {
                B[j][i] = A[i][j];
            }
        }
        System.out.println("The transpose of the matrix is : ");
        for(int i=0;i<4;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
