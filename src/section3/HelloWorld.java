package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("HelloWorld");
	JOptionPane.showMessageDialog(null, "Hi There");
	String name=JOptionPane.showInputDialog("What Is Your Name");
	System.out.println(name);
}
}
