package projekt;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Start extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton button1;
	
	public Start () throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
	
		JPanel panel=new JPanel();
		panel.setBackground(Color.pink);
		add(BorderLayout.CENTER,panel);
		button1 = new JButton("START");
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource () == button1)
			    {
			      User test = new User();
			      test.setVisible (true);
			      dispose();

			    }
			}

		});
		
		panel.add(button1);
		this.add(panel);
	}
	public static void main(String[] args) {
		Start frame = new Start();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
