package JOURNAL;

class NoBallException extends Exception {
    public NoBallException(String message) {
        super(message);
    }
}

public class CricketOver {
    public static void main(String[] args) {
        // Raw sequence representation of balls thrown
        int[] inputRuns = {2, 0, -1, 4, 1, 6, 0}; 
        int totalRuns = 0;
        int validBalls = 0;

        for (int run : inputRuns) {
            try {
                if (run == -1) {
                    totalRuns += 1; // Extra 1 run added for No Ball
                    throw new NoBallException("Umpire signals: No Ball! Extra run awarded.");
                } else {
                    totalRuns += run;
                    validBalls++;
                }
            } catch (NoBallException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
        System.out.println("\nTotal runs scored in the over: " + totalRuns);
    }
}
