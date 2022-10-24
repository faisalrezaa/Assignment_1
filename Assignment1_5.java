import java.util.*;
public class Assignment1_5 {
    static public void main(String xyz[]){
        int n = 14;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(  (j == 0) || (i==n-1) || (i==0)  || (i-j >= (n-1)/2) || (i + j <= (n-1)/2) )
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

