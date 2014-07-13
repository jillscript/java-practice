package conditionalsandloops;

public class twentyfive {

	public static void main(String[] args) {
        // command-line argument
        long n = Long.parseLong(args[0]);

        System.out.print("The prime factorization of " + n + " is: ");
        
        //var to store what the last i was
        long lasti = 0;        	

        // for each potential factor i
        for (long i = 2; i*i <= n; i++) {
            // if i is a factor of N, repeatedly divide it out
            while (n % i == 0) {
                //print if the current factor is different from last factor
            	if (lasti != i) {
                	System.out.print(i + " ");
                }
                n = n / i;
                //save what the last factor was
                lasti = i;
            }
        }

        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();
    }
}

