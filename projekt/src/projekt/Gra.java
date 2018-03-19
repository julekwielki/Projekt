package projekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gra extends JFrame{

	private static final long serialVersionUID = 1L;
	public Gra () throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//this.setUndecorated(true);
	
		JPanel panel=new JPanel();
		add(BorderLayout.CENTER,panel);
		this.setLayout(new GridLayout(1,2));
		getContentPane().setBackground(new Color(37,250,215,114));
		ServicePanel leftPanel = new ServicePanel();
		AnimationPanel rightPanel = new AnimationPanel();
		this.add(leftPanel);
		this.add(rightPanel);
		
		JLabel label =new JLabel("Tutaj bêdzie gra");
		panel.add(label);
		
		//Po przegraniu otwiera siê nowa ramka 
		/*JButton button1 = new JButton("START");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource () == button1)
			    {
			      End test = new End();
			      test.setVisible (true);
			      dispose();

			    }
			}

		});
		
		panel.add(button1);*/
		
		this.add(panel);
	}
	public static void main(String[] args) {
		Gra frame = new Gra();
		frame.setVisible(true);
	}

}
