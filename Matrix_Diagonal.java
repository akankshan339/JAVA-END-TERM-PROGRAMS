import java.util.Scanner;
public class Matrix_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int n, ltdiagSum=0, rtdigSum =0;
        System.out.println("Enter size of matrix ");
        n = sc.nextInt();
        int mat[][] = new int[n][n];
        System.out.println("Enter matrix elements :");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
          //  System.out.println();
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i == j)
                    ltdiagSum += mat[i][j];

                if(i + j == n-1)
                    rtdigSum += mat[i][j];

            }
        }
        System.out.println("Left Diagonal Sum or Principal Diagonal " + ltdiagSum);
        System.out.println("Right Diagonal Sum or Secondary Diagonal " + rtdigSum);
        sc.close();
    }  
}
