public class Arithmetic{

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        float x = 0.2f;
        float y = 1.4f;
        double answer;

        // A and B
        answer = a + b;
        
        System.out.println(a + " + " + b + " = " + answer);

        answer = a / b;

        System.out.println(a + " / " + b + " = " + answer);

        answer = b / a;

        System.out.println(b + " / " + a + " = " + answer);

        // X and Y
        answer = x + y;

        System.out.println(x + " + " + y + " = " + answer);

        answer = x / y;

        System.out.println(x + " / " + y + " = " + answer);

        answer = y / x;

        System.out.println(y + " / " + x + " = " + answer);


    }
    
}