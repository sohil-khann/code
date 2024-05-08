import java.util.*;
public class bill{

public static void main(String[] arg){  Boolean t=true;
    int A_qty=100;
        int A_price=10;
        int B_qty=100;
        int B_price=10;
        int C_qty=100;
        int C_price=10;
        int amount_1=0,amount_2=0,amount_3=0;
int j=0;
        while(j<1){
System.out.print(" please enter the product do you want : 'A','B','C' : ");

Scanner sc =new Scanner(System.in);
String choice= sc.nextLine();

while(t){
        switch(choice){
                case "A":  System.out.print(" please enter the Quantity  of A: ");

                   int a= sc.nextInt();


                   if(a>A_qty){
                    System.out.println(" insufficient Quantity ");
                       System.out.println(" do you want to continue  :  ");
                   String cnt= sc.nextLine();
                   if(cnt.equals("no")){
                           continue;
                   }
                   }
                   else{
                    
                    amount_1=a*10;
   
                   System.out.print(" As per your  Quantity  the amount of product  is  A : "+amount_1);}
                

            case "B":
            System.out.print(" please enter the Quantity of B : ");
                   int b= sc.nextInt();
                      if(b>B_qty){
                    System.out.println(" insufficient Quantity ");
                       System.out.print(" do you want to continue  :  ");
                   String cnt= sc.nextLine();
                   if(cnt.equals("no")){
                           break;
                    
                   }
                    

                   }
                    else{ 
                        amount_2=b*20;
                      System.out.print(" As per your  Quantity  the amount of product  is B : "+amount_2);}
                
            
            case "C": System.out.print(" please enter the Quantity of C : ");
                   int c= sc.nextInt();
                      if(c>C_qty){
                    System.out.println(" insufficient Quantity ");
                    System.out.println(" do you want to continue  : yes/no ");
                   String cnt= sc.nextLine();
                   if(cnt.equals("no")){
                           break;
                    
                   }
                   }
                      
                   else{
                    
                      amount_3=c*5;
                       System.out.println(" As per your  Quantity  the amount of product C  is : "+amount_3) ; 
                   }
                
 


} 
            int Total = amount_1+amount_2+amount_3;
System.out.print("the total  amount  is : "+Total);
        }

}
}}