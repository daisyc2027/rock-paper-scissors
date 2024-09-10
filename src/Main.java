import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> userChoices = new ArrayList<>();
        ArrayList<String> computerChoices = new ArrayList<>();

        System.out.println("How many rounds would you like to play?");
        int numberRounds = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberRounds; i++) {
            int userScore = 0;
            int computerScore = 0;
            //rock will be 0, paper 1, scissors 2
            String[] options = {"rock", "paper", "scissors"};
            int userChoiceIndex;
            String userChoice;
            String computerChoice;

            System.out.println("lets start! rock, paper, scissors shoot!");
            userChoice = sc.nextLine();
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Please enter a valid argument");
                userChoice = sc.nextLine();
            }
            userChoiceIndex = convertingUserChoice(userChoice);
            userChoices.add(options[userChoiceIndex]);

            int computerChoiceIndex = (int) (Math.random() * 2);
            computerChoice = convertingComputerChoice(computerChoiceIndex);
            computerChoices.add(options[computerChoiceIndex]);

            int a = Integer.parseInt(userChoices.get(i));
            int b = Integer.parseInt(computerChoices.get(i));


            if (a == b) {
                System.out.println("its a tie! the computer chose: " + computerChoice);
            }
            else if(a == 0 && b == 2 || a == 1 && b == 0 || a == 2 && b ==1){
                ++userScore;
                System.out.println("You win this round! The score is: " + userScore + ", " + computerScore +
                        "\n The computer chose: " + computerChoice);
            }
            else{
                ++computerScore;
                System.out.println("You lose this round! The score is: " + userScore + ", " + computerScore +
                        "\n The computer chose: " + computerChoice);
            }

        }

    }


    public static String convertingComputerChoice(int computerChoiceIndex){
        if (computerChoiceIndex == 0) {
            return "rock";
        } else if (computerChoiceIndex == 1) {
            return "paper";
        } else {
            return "scissors";
        }

    }

    public static int convertingUserChoice(String userChoice){
        if (userChoice.equals("rock")) {
            return 0;
        } else if (userChoice.equals("paper")) {
            return 1;
        } else {
            return 2;
        }
    }

}

