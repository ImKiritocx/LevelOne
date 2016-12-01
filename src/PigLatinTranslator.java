import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
	JTextField box = new JTextField();
		JTextField box2 = new JTextField();
	public static void main(String[] args) {
		PigLatinTranslator pig = new PigLatinTranslator();
		pig.Display();
	
//Display();
}

	private void Display() {
		JFrame j = new JFrame();
		JPanel p = new JPanel();
		j.setVisible(true);
		j.add(p);
		JButton button = new JButton("Traslate");
		
		p.add(box);
		p.add(button);
		
		p.add(box2);
		box.setPreferredSize(new Dimension(500,20));
		box2.setPreferredSize(new Dimension(500,20));
		j.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		PigLatinTranslate late = new PigLatinTranslate();
		String words = box.getText();
		String PigLatin = late.translate(words);
		box2.setText(PigLatin);
	}
}
