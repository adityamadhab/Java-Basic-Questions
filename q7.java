//Java program to multiply two given matrices

class MatrixMulti {
    public static void main(String[] args) {
        int A[][] = {{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
        int B[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3}};
        int C[][] = new int[4][4];
        int i,j,k;
        for(i=0;i<4;i++) {
            for(j=0;j<4;j++) {
                for(k=0;k<3;k++) {
                C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("The Resultant matrix is : ");
        for(i=0;i<4;i++) {
            for(j=0;j<4;j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}