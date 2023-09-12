/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        // Seems to begin and tell the code to execute
        int i = 1;
        while (i<100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        //for (int i = 1; i < 100; i++) {
        // for every integer starting at 1 and less than 100, go onto the next one

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        // mod is the same as Python

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");
            // print line println instead of just print in Python

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}
