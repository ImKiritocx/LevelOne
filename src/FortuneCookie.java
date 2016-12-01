import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
		JButton button = new JButton("Fortune");
public static void main(String[] args) {

	FortuneCookie fortune = new FortuneCookie();
	fortune.showButton();
}

private void showButton() {
	// TODO Auto-generated method stub
	JFrame j = new JFrame();
	JPanel p = new JPanel();
	j.add(p);
	j.setVisible(true);
	
	p.add(button);
	button.addActionListener(this);
	j.pack();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	int rand = new Random().nextInt(5);
	
	if (button==e.getSource()) {
		String anything = null;
		if (rand==1) {
			anything = "I see wealth in your future ";
		}
		if (rand==2) {
			anything = "You will meet someone of special importance to you";
		}
		if (rand==3) {
			anything = "You will gain lots of knowledge";
		}
		if (rand==4) {
			anything = "you will gain the skills you need to be successful";
		}
		JOptionPane.showMessageDialog(null, anything);
		
	}
	
	
}
}
