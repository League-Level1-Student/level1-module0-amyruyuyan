package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton Ducks;
	JButton Frog;
	JButton FluffyUnicorns;
	public void showButton () {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton Ducks = new JButton();
		Ducks.setText("Ducks");
		JButton Frog = new JButton();
		Frog.setText("Frog");
		JButton FluffyUnicorns = new JButton();
		FluffyUnicorns.setText("Fluffy Unicorns");
		panel.add(Ducks);
		panel.add(Frog);
		panel.add(FluffyUnicorns);
		frame.pack();
		Ducks.addActionListener(this);
		Frog.addActionListener(this);
		FluffyUnicorns.addActionListener(this);
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonclicked = (JButton) e.getSource();
	
	if (Ducks == buttonclicked) {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");	
	}
	
	if (Frog == buttonclicked) {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");	
	}
	
	if (FluffyUnicorns == buttonclicked) {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	

}

