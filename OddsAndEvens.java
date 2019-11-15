import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args){
        // introduction
        // This takes the user's name, odd or evens values
        System.out.println("Let’s play a game called “Odds and Evens”");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? "); //only need to write O or E
        String userChoice = input.next();
        System.out.println("------------------------------");
        if (userChoice.equalsIgnoreCase("O")){
            System.out.println(name +  " has picked odds! The computer will be evens.");
        } else if (userChoice.equalsIgnoreCase("E")){
            System.out.println(name + " has picked evens! The computer will be odds.");
        } else {
            System.out.print("Enter only O or E to play");
        }

        //User and Computer chooses a number to play
        // takes in the number of fingers the user would like to play
        System.out.println("------------------------------");
        System.out.print("How many “fingers” do you put out? ");
        int userNumber;
        do {
            userNumber = input.nextInt();
        } while ( userNumber < 0 || userNumber > 5);

        // randomize
        // takes in the random generation of a number less than from 0-5
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);

        System.out.println("The computer plays " + computerNumber + " fingers.");
        System.out.println("------------------------------");

        // adds the two input from the user to generate the sum
        int sum = userNumber + computerNumber;
        System.out.println(userNumber + " " + " + " + " " +  computerNumber + " = " + sum);
        boolean oddOrEven = ((sum % 2) == 0);  // returns true if sum is Even
        System.out.println("------------------------------");

        //who wins {the user or the computer}

        if (oddOrEven){
            System.out.println(sum + " is ...even!");
            if(userChoice.equalsIgnoreCase("E")){
                System.out.println("That means " + name + " wins");
            }else if(userChoice.equalsIgnoreCase("O")){
                System.out.println("The computer wins");
            }
        }else{
            System.out.println(sum + " is ...odd!");
            if(userChoice.equalsIgnoreCase("O")){
                System.out.println("That means"+ name + " wins");
            }else if (userChoice.equalsIgnoreCase("E")){
                System.out.println("The computer wins");
            }
        }


    }
}

