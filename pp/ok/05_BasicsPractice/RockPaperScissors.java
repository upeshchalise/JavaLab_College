import java.util.Scanner;

public class RockPaperScissors {



    String getComputerChoice(){

        String computerChoice;
        
        int randomNumber = (int) (Math.random() * 3 + 1);
        if(randomNumber == 1) {
            computerChoice = "rock";
        }else if(randomNumber == 2) {
            computerChoice = "paper";
        }
        else {
            computerChoice = "scissors";
        }

        return computerChoice;
    }

    String getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rock, paper or scissors");
        String userInput = sc.next();
        userInput = userInput.toLowerCase();
        sc.close();
        return userInput;
    }

    String getResult(String userInput, String computerInput) {

        // condition for draw
        if(userInput.equals(computerInput)) {
            return "draw";
        }
        // condition for user to win
        else if(userInput.equals("paper") && computerInput.equals("rock")){
            return "win";
        }
        else if(userInput.equals("rock") && computerInput.equals("scissors")) {
            return "win";
        }
        else if(userInput.equals("scissors") && computerInput.equals("paper")) {
            return "win";
        }
        // all other condition result user in losing
        else {
            return "lose";
        }

    }
    public static void main(String[] args) {
        
        RockPaperScissors obj = new RockPaperScissors();
        String userChoice = obj.getUserInput();
      String computerChoice =   obj.getComputerChoice();
      String result = obj.getResult(userChoice, computerChoice);
      System.out.println("User choice: " + userChoice);
      System.out.println("Computer Choice: " + computerChoice);
      System.out.println("user: " + result);

    }
    
}