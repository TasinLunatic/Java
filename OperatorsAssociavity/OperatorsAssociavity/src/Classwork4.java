public class Classwork4 {
    public static void main(String[] args) {
        final int number_of_primes =50 ;
        final  int primes_per_line =10;
        int count=0;
        int number=2;

        System.out.println("The first 50 primes number are : ");

        while (count<number_of_primes){
            boolean isprime=true;

            for (int divisor =2;divisor <= Math.sqrt(number);divisor++){
              if (number%divisor == 0){
                  isprime=false;
                  break;
              }
            }
            if (isprime){
                count++;
                if (count%primes_per_line == 0){
                    System.out.printf("%-4d",number);
                }else {
                    System.out.printf("%-4d",number);
                }
            }
            number++;
        }
    }
}
