import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game! Can you guess the secret number?\nChoose a difficulty level: \n1.Hard\n2.Medium \n3.Easy \n4.Child");
        String diffi = sc.nextLine();

        int maximAttempts = 0;
        int min = 1;
        int max = 100;
        int score=0;
        boolean playagain = true;
        //if-else not used as switch case makes this easier.
         while(playagain){
            int currentattempt = 0;
            Random random = new Random();
            int randomnum = random.nextInt(max - min);

            switch (diffi.charAt(0)) {
                case 'H' -> maximAttempts = 7;
                case 'M' -> maximAttempts = 12;
                case 'E' -> maximAttempts = 18;
                case 'C' -> maximAttempts = 50;


            }
            while (currentattempt < maximAttempts) {
                System.out.println("Guess the number:");
                int numguess = sc.nextInt();
                currentattempt++;


                if (numguess < randomnum) {
                    System.out.println("You Guessed a bit lower.Try Again!!");
                } else if (numguess > randomnum) {
                    System.out.println("You Guessed a bit higher.Try Again!!");
                } else {
                    System.out.println("You guessed it right: " + randomnum);
                    score++;
                    break;
                }

                if (currentattempt == maximAttempts) {
                    System.out.println("You have reached the maximum limit of your attempts.Better luck next time.");
                    System.out.println("The number was: " + randomnum);
                }
            }
            System.out.println("Well played!!\nYou want to continue and give it another try?\n(Yes/N0)");
            sc.nextLine();
             String playagainInput = sc.nextLine();
             playagain = playagainInput.equalsIgnoreCase("Yes");
         }
        System.out.println("Game Over!!\nYour total score is: "+score);
        sc.close();
    }

}

