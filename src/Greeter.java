import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "hey " + answer);
	JOptionPane.showInputDialog("Write a message");
	JOptionPane.showMessageDialog(null, "Very good, Thanks!");
}
}
