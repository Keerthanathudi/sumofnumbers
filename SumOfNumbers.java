public class SumOfNumbers {

    public static void main(String[] args) {
        // Predefined numbers to sum
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Variable to store the sum
        int sum = 0;
        
        // Loop through the array and add each number to sum
        for (int num : numbers) {
            sum += num;
        }
        
        // Print the sum
        System.out.println("The sum of the numbers is: " + sum);
    }
}
