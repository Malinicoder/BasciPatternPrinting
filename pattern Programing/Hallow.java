import java.util.Scanner;

class Hallow{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //enter how many rows
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
        
        for(int j=1;j<=row;j++){
            if((i==1 || i==5 )|| (j==1 ||j==5))
            System.out.print("*"+" ");
            else
            System.out.print("  ");

        }
        System.out.println();
       }
       sc.close();
    }
}
