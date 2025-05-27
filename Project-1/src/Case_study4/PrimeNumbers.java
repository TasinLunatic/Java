package Case_study4;

public class PrimeNumbers {
    public static void main(String[] args) {
        final int Number_of_Primes=50;
        final int Number_of_Primes_PerLine=10;
        int count =0;
        int number = 2;

        System.out.println("The first 50 prime numbers are  \n");

        while (count < Number_of_Primes) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor ==0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;

                if (count % Number_of_Primes_PerLine == 0) {
                    System.out.println(number);
                } else{
                    System.out.print(number + " ");}
            }
                number++;
        }
    }
}
