package exer;
	import javax.swing.*;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JLabel;
	import java.awt.Font;
	import java.awt.Color;
	
	public class EntreNoJogo {

	    public static void main(String[] args) {
	    	JFrame frame = new JFrame("Entre no jogo");
	        frame.setSize(250, 100);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        JPanel panel = new JPanel();
	        panel.setBackground(Color.BLACK);
	        
	        JLabel label = new JLabel();
	        label.setFont(new Font("Monospaced", Font.BOLD, 24));
	        label.setForeground(Color.WHITE);
	        label.setText(" ******   **     **   ******    *******     **     **   ****** ");
	        
	        panel.add(label);
	        frame.add(panel);
	        frame.setVisible(true);
	    }
}
