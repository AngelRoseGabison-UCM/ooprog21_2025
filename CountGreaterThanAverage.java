public class CountGreaterThanAverage {

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        
        // Call the method to get the count
        int result = countElementsGreaterThanAverage(responseTimes);
        
        // Output the result
        System.out.println("Output: " + result);
    }
    
    // Method to count elements greater than the average of previous elements
    public static int countElementsGreaterThanAverage(int[] responseTimes) {
        int count = 0;
        double sum = 0;
        int numberOfElements = responseTimes.length;
        
        // Loop through the array, skipping the first element
        for (int i = 1; i < numberOfElements; i++) {
            sum += responseTimes[i - 1]; // Sum previous elements
            double average = sum / i; // Calculate the average of previous elements
            
            // Check if the current element is greater than the average
            if (responseTimes[i] > average) {
                count++; // Increment count if condition is met
            }
        }
        
        return count; // Return the count of elements greater than the average
    }
}

