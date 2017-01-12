import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame j = new JFrame("Type or Die");
	JLabel l = new JLabel();
	JPanel p = new JPanel();
	int score = 0;
	int count = 0;
	char currentLetter = generateRandomLetter();
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

public static void main(String[] args) {
	TypingTutor t = new TypingTutor();
	t.SetUp();
	
	
}

private void SetUp() {
	
	
	
	j.add(p);
	j.addKeyListener(this);
	p.add(l);
	j.setVisible(true);
	j.pack();
	j.setSize(500,500);
	l.setFont(l.getFont().deriveFont(250.0f));
	l.setHorizontalAlignment(l.CENTER);
	l.setText(currentLetter + "");
	
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	if (currentLetter==e.getKeyChar()) {
		System.out.println("correct");
		p.setBackground(Color.GREEN);
		score++;
	}
	else{
		p.setBackground(Color.RED);
		System.out.println("incorrect");
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	l.setText(currentLetter + "");
}
}
