import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> userChoices = new ArrayList<>();
        ArrayList<String> computerChoices = new ArrayList<>();
        int userScore = 0;
        int computerScore = 0;

        System.out.println("How many rounds would you like to play?");
        int numberRounds = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberRounds; i++) {
            //rock will be 0, paper 1, scissors 2
            String[] options = {"rock", "paper", "scissors"};
            int userChoiceIndex;
            String userChoice;

            System.out.println("lets start! rock, paper, scissors shoot!");
            userChoice = sc.nextLine();
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Please enter a valid argument");
                userChoice = sc.nextLine();
            }
            userChoiceIndex = convertingUserChoice(userChoice);

            int computerChoiceIndex = (int) (Math.random() * 2);
            computerChoices.add(options[computerChoiceIndex]);
            userChoices.add(options[userChoiceIndex]);

            if (userChoiceIndex == computerChoiceIndex ) {
                System.out.println("its a tie! The score is: " + userScore + ", " + computerScore);
            }
            else if(userChoiceIndex == 0 && computerChoiceIndex == 2
                    || userChoiceIndex == 1 && computerChoiceIndex == 0
                    || userChoiceIndex == 2 &&  computerChoiceIndex == 1){
                ++userScore;
                System.out.println("You win this round! The score is: " + userScore + ", " + computerScore);
            }
            else{
                ++computerScore;
                System.out.println("You lose this round! The score is: " + userScore + ", " + computerScore);
            }

            System.out.println("For round " + (i+1) + " you chose " + userChoices.get(i) + ", and the computer chose " + computerChoices.get(i));

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
