import java.util.Scanner;

public class pattern3{
    public static void main(String ar[]){

Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
for(int i=1;i<=r;i++){
           for(int j =1;j<=(2*i)-1;j++){

         
            System.out.print(" ");
             for(int k =1;k<=(r-1);k++){

            System.out.print("*");
     }
     }
      
     System.out.println();
}


    }
}
