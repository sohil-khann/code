import java.util.*;
 class method {
    


    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        method obj = new method();

        int x = obj.add(a, b);
        int y = obj.divide(a, b);
        int p = obj.mul(a, b);
        int z = obj.sub(a, b);

        System.out.println("Addition: " + x);
        System.out.println("Division: " + y);
        System.out.println("Multiplication: " + p);
        System.out.println("Subtraction: " + z);
    }
}

    

