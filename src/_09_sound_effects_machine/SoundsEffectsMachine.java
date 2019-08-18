package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundsEffectsMachine implements ActionListener {
JButton button1;	
JButton button2;
JButton button3;
public void showButton() {
JFrame frame = new JFrame();
frame.setVisible(true);
JPanel panel = new JPanel();
frame.add(panel);
button1 = new JButton();
button2 = new JButton();
button3 = new JButton();
panel.add(button1);
panel.add(button2);
panel.add(button3);
frame.pack();
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
}

private void playSound(String fileName) {

    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

    sound.play();

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonclicked = (JButton) e.getSource();
	if (button1 == buttonclicked) {
	playSound("clownlaugh.wav");	
	}
	
	if (button2 == buttonclicked) {
	playSound("duck.wav");	
	}
	
	if (button3 == buttonclicked) {
		playSound("goat.wav");	
		}
}   

}


