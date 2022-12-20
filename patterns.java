import java.util.Scanner;
public class patterns
{

    public static void hollowRectangle(int r, int c)
    {
        for(int i = 1 ; i <= r ; i++)
        {
            for(int j = 1; j <= c ; j++)
            {
                if(i == 1 || i == r || j == 1 || j == c)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rotatedHalfPyramid(int r)
    {
        for(int i = 1 ; i <= r; i++)
        {
            for(int j = 1 ; j <= r - i ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverterdNumbers(int r)
    {
        for(int  i = r ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void FLOYD(int n)
    {
        int  k = 1;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {    
                System.out.print(k + " ");
                k++;
            } 
            System.out.println();
        }
    }

// BUTTERFLY PATTERN....
    public static void butterfly(int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
                System.out.print("* ");
            for(int j = 1 ; j <= 2*n - 2*i ; j++)
                System.out.print("  ");
            for(int j = 1 ; j <= i ; j++)
                System.out.print("* ");    
            System.out.println();    
        }

        for(int i = n ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= i ; j++)
                System.out.print("* ");
            for(int j = 1 ; j <= 2*n - 2*i ; j++)
                System.out.print("  ");
            for(int j = 1 ; j <= i ; j++)
                System.out.print("* ");
            System.out.println();    
        }
    }

// SOLID RHOMBUS...
    public static void solidRhombus(int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= n ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// HOLLOW RHOMBUS...
    public static void hollowRhombus(int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1 ; j <= n ; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

// DIAMOND PATTERN...
    public static void diamond(int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*i -1 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n - 1 ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= n - i ; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*i -1 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// 0-1 TRIANGLE PATTERN
    public static void zeroOne(int n)
    {
        int k = 1;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                if((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
// main fn...
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter no. of rows and columns: ");
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // hollowRectangle(r, c);
        // rotatedHalfPyramid(r);
        // inverterdNumbers(r);
        // FLOYD(r);
        // butterfly(5);
        // solidRhombus(5);
        // hollowRhombus(5);
        diamond(5);
        // zeroOne(5);
    }
}