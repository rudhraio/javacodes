class Loops{
    public static void main(String args[]){
        System.out.println("##################################");
        System.out.println("--------------Loops---------------");
        System.out.println("##################################");

        System.out.println("For Loop Example: calculating 10 factorial");
        int num = 1;
        for(int i = 1; i <= 10; i++){
            num *= i;
        }
        System.out.println("Factorial of 10 is: " + num);

        System.out.println("\nWhile Loop Example: down counter");
        int count = 10;
        while(count > 0){
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        System.out.println("\nDo-While Loop Example: calculating sum of first 100 numbers");
        int sum = 0, counter = 1;

        do{
            sum += counter;
            counter++;
        } while(counter <= 100);

         System.out.println("Sum of numbers up to 100 is: " + sum);

    }
}