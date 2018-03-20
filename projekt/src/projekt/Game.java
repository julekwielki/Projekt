package projekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Game extends JFrame{
	
	static int language =1;

	private static final long serialVersionUID = 1L;
	public Game () throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		
		ServicePanel leftPanel = new ServicePanel();
		AnimationPanel rightPanel = new AnimationPanel();
		getContentPane().setBackground(new Color(102,255,237,255));
		add(BorderLayout.WEST, leftPanel);
		add(BorderLayout.CENTER, rightPanel);
	

		
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
		
	}
	public static void main(String[] args) {
		Game frame = new Game();
		frame.setVisible(true);
	}

}

