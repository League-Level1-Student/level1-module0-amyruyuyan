package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String ChallengeImage = "https://thenaturalweddingcompany.co.uk/blog/wp-content/uploads/2014/02/cake_love_chocolate_drizzle.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component holder; 
		// 3. use the "createImage()" method below to initialize your Component
		holder=createImage(ChallengeImage);
		// 4. add the image to the quiz window
		quizWindow.add(holder);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String relatableQuestion = JOptionPane.showInputDialog("Is this cake frosting chocolate or vanilla?");
		// 7. print "CORRECT" if the user gave the right answer
		if (relatableQuestion == "vanilla") {
		JOptionPane.showMessageDialog(null, "YOU HAVE ANSWERED THE QUESTION CORRECTLY");	
		}
		// 8. print "INCORRECT" if the answer is wrong
		else if (relatableQuestion == "chocolate"){
			JOptionPane.showMessageDialog(null, "YOU HAVE ANSWERED THE QUESTION INCORRECTLY");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(holder);
		// 10. find another image and create it (might take more than one line
		// of code)
		String ChallengeImage2 = "https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwizh5fEobXjAhUNRKwKHVowDVkQjRx6BAgBEAU&url=https%3A%2F%2Fwww.amazon.com%2FYeahii-Single-Artificial-Flower-Wedding%2Fdp%2FB076J8G1PV&psig=AOvVaw3t1oDGYEjNc1dBQ1bfY4In&ust=1563222968480869";
		Component holder2;
		holder2=createImage(ChallengeImage2);
		// 11. add the second image to the quiz window
		quizWindow.add(holder2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String relatableQuestion2 = JOptionPane.showInputDialog("Is this rose real or fake?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (relatableQuestion2 == "fake") {
		JOptionPane.showMessageDialog(null, "YOU HAVE ANSWERED THE QUESTION CORRECTLY");	
		}
		else if (relatableQuestion2 == "real"){
		JOptionPane.showMessageDialog(null, "YOU HAVE ANSWERED THE QUESTION INCORRECTLY");	
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
