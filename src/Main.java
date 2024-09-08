import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Here we will calculate the winner of the game. 0 means that its a tie, 1 is user wins and 2 is opponents win.

        int userScore = 0;
        int opponentScore = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many rounds would you like to play?");
        int howManyRounds = sc.nextInt();

        for (int firstToThree = 1; firstToThree <= howManyRounds; firstToThree++) {
            int winOrLose = playGame();
            if (winOrLose == 0) {
                System.out.println("round " + firstToThree + ": its a tie!");
            } else if (winOrLose == 1) {
                ++userScore;
                System.out.println("round " + firstToThree + ": You win this round!");
            } else if (winOrLose == 2) {
                ++opponentScore;
                System.out.println("round " + firstToThree + ": You win this round!");
            }
        }
        System.out.println("The final scores are: " + userScore + " to you, " + opponentScore + " to your opponent.");
    }

    public static int playGame(){
        Scanner sc = new Scanner(System.in);

        //rock will be 0, paper 1, scissors 2

        String rockPaperScissors;
        int userPlay;
        int opponentsPlay = (int) (Math.random()*3);
        System.out.println("rock, paper, or scissors?");
        rockPaperScissors = sc.nextLine();
        while(!rockPaperScissors.equals("rock")&&!rockPaperScissors.equals("paper")&&!rockPaperScissors.equals("scissors")) {
            System.out.println("please input a valid argument");
            rockPaperScissors = sc.nextLine();
        }
        if (rockPaperScissors.equals("rock")){
            userPlay = 0;
        }
        else if(rockPaperScissors.equals("paper")){
            userPlay = 1;
        }
        else{
            userPlay = 2;
        }

        return gameResults(userPlay, opponentsPlay);
    }


    //Here we will calculate the winner of the game. 0 means that it's a tie, 1 is user wins and 2 is opponents win.
    public static int gameResults(int userPlay, int opponentsPlay){
        if(userPlay == opponentsPlay){
            return 0;
        }
        else if(userPlay - opponentsPlay == 1 || userPlay - opponentsPlay == -2){
            return 1;
        }
        else{
            return 2;
        }
    }
}