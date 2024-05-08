import java.util.*;
public class course {

    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        
   boolean  b=true;

int i=1;
int k =1;
int l=1;
for(int j=0;j<i;){
    System.out.print("please enter your name : ");
        String name=a.nextLine();
 System.out.print("please enter your course name : ");
                  String c_name=a.nextLine();

      while(b) {
    	     
   
     if(c_name.equals("java")) {
    	System.out.println("your Sid is : "+c_name+""+i);
    
    	 	i++;
         break;

    }
    else if(c_name.equals("python")) {
    	System.out.println("your Sid is : "+c_name+""+k);
        
    	k++;
             break;
    	
    }
    else if(c_name.equals("php")) {
    	System.out.println("your Sid is : "+c_name+""+l);
        
    	l++;
        break;
    	
    }
    else {
    	
    	System.out.println("invalid input  ");
           
break;
    }
 
    	  
      }
      	System.out.println("");
    
    }
}


}
