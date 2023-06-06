public class factorialDemo{
    public static void main(String[] args) {
        int test1 = 5;
        System.out.println(factorial(test1));
    }


public static int factorial(int n) {
    if (n == 1) return 1;
    return n * factorial(n-1);
  }

}