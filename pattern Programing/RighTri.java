import java.util.Scanner;
/*
        * [space row-i] ex= 5row for 1st row give space 4[5-1]=4
      * *  i=2==> [5-2]=3 3space and so.
    * * *
  * * * *
* * * * *
             */
public class RighTri{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //enter how many rows
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            //for space count
           int len=row-i;
        for(int j=1;j<=row;j++){
            if(j>len)
            System.out.print("*"+" ");
            else//give space
            System.out.print("  ");
        }
        System.out.println();
       }
       sc.close();
    }

}
