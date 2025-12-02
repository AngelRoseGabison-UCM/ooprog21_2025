import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 9, 1, 4};

        display("Original array values:", numbers);

        Arrays.fill(numbers, 8);
        display("Array after filling with 8:", numbers);

        numbers[0] = 10;  
        numbers[2] = 20; 
        display("Array after changing two elements:", numbers);

        Arrays.sort(numbers);
        display("Array after sorting:", numbers);
    }

    public static void display(String message, int array[]) {
        System.out.print(message + " ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); 
    }
}
