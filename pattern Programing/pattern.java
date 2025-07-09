import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //enter how many rows
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            //start num
            int num=1;
        for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;//increase num
        }
        System.out.println();
       }
       sc.close();
    }

}
