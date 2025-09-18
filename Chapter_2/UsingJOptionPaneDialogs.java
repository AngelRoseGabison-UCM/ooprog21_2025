import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {

    public static void main(String[] args) {
        // Infinite loop to keep asking for the name until confirmed
        while (true) {
            // Prompt the user to enter their name
            String name = JOptionPane.showInputDialog(null, "Please enter your name:");

            // Check if the user entered a valid name (non-null and non-empty)
            if (name != null && !name.trim().isEmpty()) {
                // Ask if the user wants to show their name
                int confirmation = JOptionPane.showConfirmDialog(null,
                        "Do you want your name to be shown?\n" + name, "Confirm Name", JOptionPane.YES_NO_OPTION);
                
                // If the user confirms (YES), display the name and exit the loop
                if (confirmation == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Your name is: " + name);
                    break;  // Exit the loop since the name is confirmed
                }
            } else {
                // If no name is entered, prompt again
                JOptionPane.showMessageDialog(null, "Please enter a valid name.");
            }
        }
    }
}
