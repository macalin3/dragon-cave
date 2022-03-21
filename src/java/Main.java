import java.util.Scanner;

public class Main {
    private static int answer;

    public static void main(String[] args) {
        Scanner guessNumber = new Scanner (System.in);
        System.out.println("You are in a land full of dragons.");
        System.out.println("In front of you, you see two caves. In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight. Which cave will you go into? (1 or 2)");

        try {
//            if (!guessNumber.hasNextInt()){
//                System.out.println("Please enter a valid number. Try again.");
//            } else {
            switch (guessNumber.nextInt()) {
                case 1:
                    System.out.println("You approach the cave..." +
                            "It is dark and spooky..." +
                            "A large dragon jumps out in front of you! He opens his jaws and..." +
                            "Gobbles you down in one bite!");
                    break;
                case 2:
                    System.out.println("You approach the cave..." +
                            "And you find the treasure!");
                    break;
                default:
                    System.out.println("Please choose 1 or 2");
            }
//            }
        } catch (Exception e){
            System.out.println("Caught Error: Invalid selection. Must be an integer.");
        }

    }

    public static int getOption(int i) {
        answer = i;
        return answer;
    }

}