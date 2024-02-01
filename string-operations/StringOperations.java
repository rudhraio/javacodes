class StringOperations{
    public static void main(String args[]){
        String originalString = "Java is a versatile programming language. Java is fun!";
        String str1 = "Hello";
        String str2 = "World";

        // String Concatenation
        String combinedString = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + combinedString);

        // String Length
        int length = originalString.length();
        System.out.println("\nLength of the String: " + length);

        // Substring based on Index
        System.out.println("\nSubstring from index 7 to 16: " + originalString.substring(7, 17));

        // Finding Occurrences
        int occurrencesOfJava = originalString.indexOf("programming");
        System.out.println("\nOccurrences of 'programming': " + occurrencesOfJava);

        String upperCaseString = originalString.toUpperCase();
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("\nUppercase: " + upperCaseString);
        System.out.println("Lowercase: " + lowerCaseString);

        // Trim leading and trailing whitespaces
        String stringWithSpaces = "   Trim Me   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("\nOriginal String with Spaces: '" + stringWithSpaces + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");

        // Replace characters
        String replacedString = originalString.replace("Java", "java");
        System.out.println("\nString after replacing Java with java: " + replacedString);

        // Splitting a String
        String sentence = "Java is a powerful programming language";
        String[] words = sentence.split(" ");
        System.out.println("\nWords in the sentence:");
        for (String word : words) {
            System.out.print(word + ", ");
        }

        // Joining Strings
        String[] joinedWords = {"Java", "is", "powerful"};
        String joinedString = String.join(" ", joinedWords);
        System.out.println("\nJoined String: " + joinedString);


        // Checking Substring Presence
        System.out.println("\nSubstring Java is present? " + originalString.contains("Java"));

        // String Builder for Dynamic String Construction
        StringBuilder dynamicString = new StringBuilder("Dynamic ");
        dynamicString.append("String ").append("Construction");
        System.out.println("\nDynamic String: " + dynamicString.toString());

        // String Formatting
        String formattedString = String.format("The value of pi is approximately %.2f", Math.PI);
        System.out.println(formattedString);

    }
}