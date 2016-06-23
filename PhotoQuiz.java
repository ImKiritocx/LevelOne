

	 // Copyright Wintriss Technical Schools 2013
	import java.awt.Component;
	import java.awt.Frame;
	import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class PhotoQuiz {

		public static void main(String[] args) throws Exception {
			Frame quizWindow = new Frame();
			quizWindow.setVisible(true);

			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
			String url = "https://pbs.twimg.com/profile_images/692135917704855552/BaUV-aEG.png";
			// 2. create a variable of type "Component" that will hold your image
			Component image;	
			// 3. use the "createImage()" method below to initialize your Component
			image = createImage(url);
			// 4. add the image to the quiz window
			quizWindow.add(image);
			// 5. call the pack() method on the quiz window
			quizWindow.pack();
			// 6. ask a question that relates to the image
			String answer = JOptionPane.showInputDialog("what gaming team is this?");
			// 7. print "CORRECT" if the user gave the right answer
			if (answer.equalsIgnoreCase("FaZe")) {
				JOptionPane.showConfirmDialog(null, "CORRECT");
			}
			// 8. print "INCORRECT" if the answer is wrong
			else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
			quizWindow.remove(image);
			// 10. find another image and create it (might take more than one line of code)
			String url2 = "http://cdn.shopify.com/s/files/1/0223/3113/products/newgfuel-fazeberry-tubs-PNG_large.png?v=1448660607";
			// 11. add the second image to the quiz window
			Component image2;	
			image2 = createImage(url2);
			quizWindow.add(image2);
			
			// 12. pack the quiz window
			quizWindow.pack();
			// 13. ask another question
			String answer2 = JOptionPane.showInputDialog("do you like Gfuel ?");
			
			// 14+ check answer, say if correct or incorrect, etc.
			if (answer2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "INCORRECT");
			}
			//int score = 0 ;
			//quizWindow.
		}

		private static Component createImage(String imageUrl) throws MalformedURLException {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}

		/* OPTIONAL */
		// *14. add scoring to your quiz
		
		// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	






}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
