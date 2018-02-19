package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String domination = JOptionPane.showInputDialog("do you know how to write a code?");
		// 2. If they say "yes", tell them they will rule the world.
if(domination.equals("yes")) {
	speak("you will rule the world");
}else {
	speak("well good luck washing your moms dishes and dying in her basement alone");
}

		// 3. Otherwise, wish them good luck washing dishes.

}

	private static void speak(String string) {
		// TODO Auto-generated method stub
		
	}

}