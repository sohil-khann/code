public class anything {static int capa=20;
    public static void main(String agrgs[]){

    }

    public static void cd(int qua){
        System.out.println("the quantity of sugar will be:  "+(qua*.1)+"\n the quantity of flavour: "+
        qua*.4+" \nthe quantity of water will be:"+qua*.5);
    }

    

    public static String bus(int pas ,boolean var){
        if(var){int temp=capa;
            capa+=pas;
            if(capa>=20){
                System.out.println("out of capacity and the passangers on stop are :"+ (pas-(20-capa)));
            }
            else{
                capa=temp;
                return "the pasangers in bus are :"+capa+"   the pasanger on the stop are "+pas;}
        }
        else{
            if(capa<0){
                System.out.println("no pasangers left ");
            }
            else{capa-=pas;}
            
        }
        return "the pasangers in bus are :"+capa+"   the pasanger on the stop are "+pas;

    }


}
