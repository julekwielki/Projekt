package projekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class User extends JFrame{

	private static final long serialVersionUID = 1L;

	public String nazwa() {
		return napis;
		
	}
	
	public User () throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
	
		JPanel panel=new JPanel();
		add(BorderLayout.CENTER,panel);
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.blue);
		text = new JTextField(40);
		napis = text.getText();
		text.setText(napis);
		panel.add(text);
		
	
		//panel.setLayout(new GridLayout(3,1));
		r1=new JCheckBox("Wiatr");
		r2=new JCheckBox("Grawitacja");
		r1.setSelected(false);
		r2.setSelected(false);
		//ButtonGroup group = new ButtonGroup();
		//group.add(r1);
		//group.add(r2);
		panel.add(r1);
		panel.add(r2);
		
		button1 = new JButton("START");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource () == button1)
			    {
			      Gra test = new Gra();
			      test.setVisible (true);
			      dispose();

			    }
			}

		});
		
		panel.add(button1);
	}
	public static void main(String[] args) {
		User frame = new User();
		frame.setVisible(true);
	}
	String napis;
	JTextField text;
	JCheckBox r1,r2;
	JButton button1;
}
