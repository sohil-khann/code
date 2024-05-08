import java.math.*;
import java.net.SocketPermission;
import java.util.Scanner;

import javafx.scene.effect.Light.Spot;
class FunctionExample {



      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.print("enter the value of a :  ");
        int a = sc.nextInt();

        System.out.print("enter the value of b :  ");
        int b = sc.nextInt();

         double c= Math.pow(a,2) + Math.pow(b, 2) + 2*a*b;
 System.out.print("here is the a+b whole square  : ");
System.out.print(c);

        sc.close();
      }
      
      

        
    }

