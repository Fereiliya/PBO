import java.util.Random;
import java.util.Scanner;
public class GameWithTimer {
    private static boolean timeUp = false;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String[] words = {
            "apple", "banana", "cherry", "date", "elderberry",
            "fig", "grape", "honeydew", "kiwi", "lemon"
        };

        Random random = new Random();
        
        // Generate a random index to pick a word
        int randomIndex = random.nextInt(words.length);
        String randomWord = words[randomIndex];

        System.out.println("Randomly selected word: " + randomWord);
    


        // Create a timer thread
        Thread timerThread = new Thread(() -> {
            int timeLeft = 10;  // Timer set for 10 seconds
            while (timeLeft > 0 && !timeUp) {
                try {
                    System.out.println("Time left: " + timeLeft + " seconds");
                    Thread.sleep(1000); // Sleep for 1 second
                    timeLeft--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (timeLeft == 0) {
                System.out.println("Time's up!");
                timeUp = true;  // Signal that time has expired
            }
        });

        // Start the timer
        timerThread.start();

        // Wait for the user to input an answer
        System.out.print("You have 10 seconds to enter your answer: ");
        String answer = null;

        while (!timeUp && (answer == null || answer.isEmpty())) {
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
            }
        }

    if (!timeUp) {
        if (answer.equalsIgnoreCase(randomWord)) {
            System.out.println("You're Correct.");
        } else {
            System.out.println("You Failed.");
        }
        }else{
            System.out.println("Time's up, you failed.");
        }
        // Ensure the timer thread stops after input is received or time runs out
        try {
            timerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

