class Operators{
    public static void main(String args[]){
        int a = 10, b = 5;

        System.out.println("##################################");
        System.out.println("------------Operators-------------");
        System.out.println("##################################");

        // Arithmetic Operators
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition:       " + addition);
        System.out.println("Subtraction:    " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division:       " + division);
        System.out.println("Modulus:        " + modulus);


        // Relational Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterThanOrEqual = (a >= b);
        boolean isLessThanOrEqual = (a <= b);


        System.out.println("\nRelational Operators:");
        System.out.println("Is Equal:            " + isEqual);
        System.out.println("Is Not Equal:        " + isNotEqual);
        System.out.println("Is Greater Than:     " + isGreaterThan);
        System.out.println("Is Less Than:        " + isLessThan);
        System.out.println("Is Greater or Equal: " + isGreaterThanOrEqual);
        System.out.println("Is Less or Equal:    " + isLessThanOrEqual);


        // Logical Operators
        boolean logicalAnd = (true && true);
        boolean logicalOr = (true || false);
        boolean logicalNot = !true; 

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND:  " + logicalAnd);
        System.out.println("Logical OR:   " + logicalOr);
        System.out.println("Logical NOT:  " + logicalNot); 


        // Assignment Operators
        int c = 20;
        c += 5; 
        int d = 15;
        d++; 
        int e = 8;
        e--;

        System.out.println("\nAssignment Operators:");
        System.out.println("Assignment Operators:  " + c);
        System.out.println("Increment Operators:   " + d);
        System.out.println("Decrement Operators:   " + e);

        // Conditional (Ternary) Operator
        int max = (a > b) ? a : b;
        System.out.println("\nConditional Operators:");
        System.out.println("Maximum: " + max);       

    }
}