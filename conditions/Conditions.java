import java.util.Scanner;

class Conditions{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("##################################");
        System.out.println("------------Conditions------------");
        System.out.println("##################################");

        System.out.println("Welcome to the Simple Java Quiz!");
        int score = 0;

        // Question 1
        System.out.println("\nQuestion 1: What is 2 + 3?");
        System.out.println("A. 4");
        System.out.println("B. 5");
        System.out.println("C. 6");
        System.out.print("Your answer (A, B, or C): ");
        char answer1 = Character.toUpperCase(scanner.next().charAt(0));

        if (answer1 == 'B') {
            System.out.println("Correct! 2 + 3 equals 5.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is B. 5.");
        }

        // Question 2
        System.out.println("\nQuestion 2: How many sides does a hexagon have?");
        System.out.println("A. 4");
        System.out.println("B. 6");
        System.out.println("C. 8");
        System.out.print("Your answer (A, B, or C): ");
        char answer2 = Character.toUpperCase(scanner.next().charAt(0));

        // Using a switch statement for variety
        switch (answer2) {
            case 'B':
                System.out.println("Correct! A hexagon has 6 sides.");
                score++;
                break;
            default:
                System.out.println("Incorrect. The correct answer is B. 6.");
                break;
        }

        // Question 3
        System.out.println("\nQuestion 3: Which programming language is this quiz written in?");
        System.out.println("A. Python");
        System.out.println("B. Java");
        System.out.println("C. JavaScript");
        System.out.print("Your answer (A, B, or C): ");
        char answer3 = Character.toUpperCase(scanner.next().charAt(0));

        if (answer3 == 'B') {
            System.out.println("Correct! This quiz is written in Java.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is B. Java.");
        }


        // Question 4
        System.out.println("\nQuestion 4: Which is the largest planet in our solar system?");
        System.out.println("A. Earth");
        System.out.println("B. Jupiter");
        System.out.println("C. Mars");
        System.out.print("Your answer (A, B, or C): ");
        char answer4 = Character.toUpperCase(scanner.next().charAt(0));

        if (answer4 == 'B') {
            System.out.println("Correct! Jupiter is the largest planet.");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is B. Jupiter.");
        }

        // Question 5
        System.out.println("\nQuestion 2: What is the capital of Italy?");
        System.out.println("A. Rome");
        System.out.println("B. Madrid");
        System.out.println("C. Paris");
        System.out.print("Your answer (A, B, or C): ");
        char answer5 = Character.toUpperCase(scanner.next().charAt(0));

        switch (answer5) {
            case 'A':
                System.out.println("Correct! Rome is the capital of Italy.");
                score++;
                break;
            default:
                System.out.println("Incorrect. The correct answer is A. Rome.");
        }

        scanner.close();
        System.out.println("\nQuiz completed! Your final score is: " + score + " out of 5.");
        if(score == 5) {
            System.out.println("You Scored Great");
        } else if(score >= 3) {
            System.out.println("You Scored Average");
        } else if(score < 3) {
            System.out.println("You Scored Poor");
        }
    }
}