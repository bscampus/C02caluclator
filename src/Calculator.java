public class Calculator {

    public static void main(String[] args) {

        int a = 1;
        double b = 2141;
        boolean c = true;
        char d = 'D';
        String f = "HelloWorld";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

        System.out.println("----------------------------------------------------------------------------");

        int result = add(5,3);
        returnResult(result);

        int result1 = sub(5,3);
        returnResult(result1);

        int result2 = div(5,3);
        returnResult(result2);

        int result3 = mul(5,3);
        returnResult(result3);

        int result4 = mod(5,3);
        returnResult(result4);

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int div(int a, int b){
        return a / b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;

    }

    public static void returnResult(int result){
        System.out.println(result);
    }
}
