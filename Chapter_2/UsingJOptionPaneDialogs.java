import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            // Prompt user to enter their name
            String name = JOptionPane.showInputDialog(null, "Enter your name:", "Input Name", JOptionPane.QUESTION_MESSAGE);

            // If user presses Cancel or closes the dialog, exit the program
            if (name == null) {
                break;
            }

            // If input is empty, show message and prompt again
            if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No name input. Please enter your name.", "Warning", JOptionPane.WARNING_MESSAGE);
                continue; // Go back to input dialog
            }

            // Confirm if user wants their name to be shown (Yes or No only)
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want your name to be shown?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (confirm == JOptionPane.YES_OPTION) {
                // Show the name in a message dialog
                JOptionPane.showMessageDialog(null, "Your name is: " + name, "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break; // Exit the loop and program
            } else if (confirm == JOptionPane.NO_OPTION) {
                // Loop back to input dialog
                continue;
            } else {
                // Just in case, exit if dialog is closed without choosing
                System.exit(0);
            }
        }
    }
}
