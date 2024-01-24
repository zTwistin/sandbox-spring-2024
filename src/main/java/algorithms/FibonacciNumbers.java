package algorithms;

public class FibonacciNumbers {

    public static void main(String[] args) {

        FibonacciNumbers num= new FibonacciNumbers();

        for(int x=0; x <= 15; x++){
            System.out.println("fib("+x+") = " + num.fib(x));
        }

    }

    private long fib(int n) {

        if(n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

}
