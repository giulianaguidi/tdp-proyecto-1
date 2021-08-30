package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student giuliana = new Student(130422,"Guidi","Giuliana","giuliguidi6@gmail.com","https://github.com/giulianaguidi","/images/yo.png");
            	SimplePresentationScreen s = new SimplePresentationScreen(giuliana);
            	s.setVisible(true);
            }
        });
    }
}