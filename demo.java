public class demo {
    public static void main(String[] args) {
       
        int num1 = 10;
        int num2 = 5;

        
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        int sub = num1 - num2;
        System.out.println("sub: " + sub);
        
        int mul = num1 * num2;
        System.out.println("Mul: " + mul);

        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println("Div: " + div);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
 