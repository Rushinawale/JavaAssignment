package JavaAssignments;

public class Demo1 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // Example array
        
        int max = findMax(numbers);
        double average = calculateAverage(numbers);
        
        System.out.println("Maximum Element: " + max);
        System.out.println("Average of Elements: " + average);
    }
    
    // Method to find the maximum element in the array
    public static int findMax(int[] array) {
        int max = array[0]; // Start with the first element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is larger
            }
        }
        return max;
    }

    // Method to calculate the average of the elements in the array
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num; // Sum up all the elements
        }
        return (double) sum / array.length; // Calculate average
    }
}

