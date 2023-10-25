import java.util.*;
public class Matrix_Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter elements");
        int arr[][]=new int[r][c];
        int transpose[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
            transpose[j][i]=arr[i][j];}
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++)
             System.out.print(transpose[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
