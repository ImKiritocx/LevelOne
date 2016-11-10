import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton b1 = new JButton("ducks");
	JButton b2 = new JButton("Frogs");
	JButton	b3 = new JButton("FluffyUnicorns");
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}


	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}


	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public void ButtonVideos(){
	JFrame j = new JFrame();
	JPanel g = new JPanel();
	j.add(g);
	
	g.add(b1);
	g.add(b2);
	g.add(b3);
	j.setVisible(true);
	j.pack();
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
}
public static void main(String[] args) {
	CutenessTV duck = new CutenessTV();
	duck.ButtonVideos();
	
	
	
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (b1==e.getSource()) {
	showDucks();	
	}
	if(b2==e.getSource()){
		showFrog();
	}
	if(b3==e.getSource()){
		showFluffyUnicorns();
	}
	
}

}
