package dsa.recursion;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {
        System.out.println("Sum of N natural Numbers:"+sumOfN(5));
    }

    public static int sumOfN(int n){
        if(n==1)
            return 1;
        return n+sumOfN(n-1);
    }

}
