public class FindPrimes {
    public static void main(String [] args){
        int number= Integer.parseInt(args[0]);

        for(int i=2; i<number; i++){

            int divisor = 2;

            boolean isPrime=true;

            while(divisor<i && isPrime) {

                if (i % divisor == 0) {
                    isPrime = false;
                }
                divisor++;
            }
            if (isPrime){
                System.out.print(i + " ");
            }

        }

    }

}
