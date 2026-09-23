public class OperaterDemo {
    void add(int a, int b){
        int sum = a + b;
        System.out.println("Addition: " +sum);
    }
int   multiply(int a, int b){
       return a * b;
}
public static void main(String[] args){

    byte a = 30, b =50;
    int result = a+b;
    System.out.println("Aritmatic Promotion Result:" + result);

    int x = 61, y = 13;
    System.out.println("x + y = "+ (x + y));
    System.out.println("x - y=" + (x - y ));
    System.out.println("x * y=" + (x * y ));
    System.out.println("X / y=" + (x / y ));
    System.out.println("x % y=" + (x % y ));


    OperaterDemo obj = new OperaterDemo();
    obj.add( 8, 3);
    int product = obj.multiply( 4, 6);
    System.out.println("Multiplication: " + product);

 
}
}
