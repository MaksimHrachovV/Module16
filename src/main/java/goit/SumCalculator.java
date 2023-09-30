package goit;

public class SumCalculator {
    int sum(int n) {
        int number = 0;
        for (int i = 0; i < n + 1; i++) {
            if (n==0){
                throw new IllegalArgumentException ("number equals zero");}

            number += i;
        }
        return number;
    }

}
