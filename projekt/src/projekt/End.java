package projekt;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class End extends JFrame{

	private static final long serialVersionUID = 1L;
	public End () throws HeadlessException {
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(500,500);	
		this.setLocationRelativeTo(null);
	
		JPanel panel=new JPanel();
		add(BorderLayout.CENTER,panel);
		JLabel label = new JLabel("Tu bêdzie nazwa uzytkownika i wynik gry");
		panel.add(label);
		
		JButton button = new JButton("Wyjscie");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}});
		panel.add(button);
	}
	public static void main(String[] args) {
		End frame = new End();
		frame.setVisible(true);
	}

}

