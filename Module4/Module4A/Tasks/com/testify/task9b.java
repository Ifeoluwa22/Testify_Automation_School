import java.util.Scanner;

public class task9b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the secret passcode: ");
        String userInput = input.nextLine();

        while (true){
            if (!userInput.equalsIgnoreCase("testify")){
                System.out.println("try again");
                userInput = input.nextLine();
                continue;
            } else if (userInput.equalsIgnoreCase("testify")){
                break;
            }



        }
    }
}
//Write a logic that takes in input from the user. It keeps printing "try again "until the user enters "testify