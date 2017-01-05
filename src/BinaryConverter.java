import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public static void main(String[] args) {
		BinaryConverter bico = new BinaryConverter(); 
		bico.display();

	}
	JTextField box1 = new JTextField();
	JTextField box2 = new JTextField();
	public void display(){
		JFrame j = new JFrame();
		JPanel p = new JPanel();
		j.setVisible(true);
		j.add(p);
		
		p.add(box1);
		JButton b = new JButton("Convert");
		p.add(b);
		
		p.add(box2);
		
		box1.setPreferredSize(new Dimension(500,20));
		box2.setPreferredSize(new Dimension(500,20));
		b.addActionListener(this);
		
		j.pack();
		
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\\A[01]+\\Z", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}
	 String convert2(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String g = box1.getText();
		int answer = convert(g);
		String newanswer = ""+ answer;
		String na = convert2(newanswer);
		box2.setText(na);
		
}
}
