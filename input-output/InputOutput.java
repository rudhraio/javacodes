import java.util.Scanner;

class InputOutput{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("##################################");
        System.out.println("----------Input Output-----------");
        System.out.println("##################################");

        System.out.print("Enter an Integer Number: ");
        int num = scanner.nextInt();
        System.out.println("You entered: "+ num);

        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // Consume the remaining newline character
        scanner.nextLine();


        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("You entered: " + text);


        System.out.print("Enter a boolean (true/false): ");
        boolean flag = scanner.nextBoolean();
        System.out.println("You entered: " + flag);

        scanner.close();
    }
}