class Factorial {
    public static void main(String[] args) {
        // Check if argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }

        // Convert argument to integer
        int num = Integer.parseInt(args[0]);
        long factorial = 1;

        // Check for negative input
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        // Calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Print result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
