public class PrimeNumber {

    public static void main (String[] args) {
        long i =0;
        long num =0;

        String  primeNumbers = "";

        for (i = 1; i <= 5000; i++) {
            long counter = 0;
            for(num =i; num>=1; num--){

                if(i%num==0) {
                    counter = counter + 1;
                }
            } if (counter ==2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 5000 are :");
        System.out.println(primeNumbers);
    }
}