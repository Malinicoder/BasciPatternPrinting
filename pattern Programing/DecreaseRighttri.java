import java.util.Scanner;
/*

* * * * * [len==0] no space jloop ends len=1;
* * * *[len=1] 1 space when j<1 inc[len]
* * *[len=2] 2 space  j=2 $2>2 false[space] $ j=1 1>2 false
* *
*

 */

public class DecreaseRighttri {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        //enter how many rows
        int row=sc.nextInt();
        int len=0;//for space count
        for(int i=1;i<=row;i++){
            
           
        for(int j=row;j>=i;j--)
{
            
            if(j>len)
            System.out.print("*"+" ");
            
            else//give space
            System.out.print("  ");
        
            
        }
        len++;
        System.out.println();
       }
       sc.close();
    }
}
