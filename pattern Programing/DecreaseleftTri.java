import java.util.Scanner;

public class DecreaseleftTri{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //enter how many rows
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
        
        for(int j=row;j>=i;j--){
    
            System.out.print("*"+" ");

        }
        System.out.println();
       }
       sc.close();
    }

}
