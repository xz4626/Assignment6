import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.*;

public class EncoderInterface extends JFrame {

	JFileChooser jc;
	
	public EncoderInterface() {
		setSize(100,100);
	}
	
	private void loadFile() {
		// alternately, you can have it return
		// a File object or file path String or whatever you
		// like.
		if (jc == null) jc = new JFileChooser("."); 
		
		int returnValue = jc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jc.getSelectedFile();
			
		}
	}
	
	
	
	public static void main(String[] args) {
	      JFrame frame = new EncoderInterface();
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);    
	}

}
