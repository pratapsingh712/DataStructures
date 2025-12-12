package analysisOfAlgorithm;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        // natural number given is 10 for an example

        int n = 10;
        // there can be multiple solution to this problem

        int sum = n*(n+1)/2;

        System.out.println("Sum of first "+n+" natural number is = "+sum);

        // the second solution can be using for loop

        int sumSlow = 0;

        for(int i=1;i<=n;i++){
            sumSlow = sumSlow + i;
        }

        System.out.println("Sum of first "+n+" natural number is = "+sumSlow);

    }
}
