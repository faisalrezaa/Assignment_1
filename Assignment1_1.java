import java.util.*;
public class Assignment1_1 {
    public static void main(String [] args){
        int n = 13;
        int space = 1;

//        ********I********
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(i==0 || i==n-1 || j == n/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int x = space; x <4; x++){
                System.out.print(" ");
            }

////        ********N********

            for(int j = 0; j<n; j++)
            {
                if(j==0 || j==n-1 || i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int x = space; x <4; x++){
                System.out.print(" ");
            }

////        ********E********

            for(int j = 0; j<n; j++)
            {
                if((j==0&& i<n-1 && i>0)  || (j>0 && (i==0|| i == n-1)) || i==n/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int x = space; x <4; x++){
                System.out.print(" ");
            }

////        ********U********

            for(int j = 0; j<n; j++)
            {
                if((j == 0 || j == n-1) && (i < n-1)   ||  (i == n-1 && j > 0 && j < n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int x = space; x <4; x++){
                System.out.print(" ");
            }

////        ********R********

            for(int j = 0; j<n; j++)
            {
                if((j == 0 && i>0) || (i == 0 && j>0 && j<n-1) || (j==n-1 && i<(n-1)/2 && i > 0)|| (i == (n-1)/2 && j>0 && j<n-1) ||
                        (i == j && j>=(n-1)/2) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int x = space; x <4; x++){
                System.out.print(" ");
            }


////               ********O********

            for(int j = 0; j<n; j++)
            {
                if(((i>0 && i<n-1) && (j==0 || j==n-1)) || (j>0 && j<n-1 && (i == 0 || i == n-1))   )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int x = space; x <4; x++){
                System.out.print(" ");
            }

////                ********N********

            for(int j = 0; j<n; j++)
            {
                if(j==0 || j==n-1 || i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
