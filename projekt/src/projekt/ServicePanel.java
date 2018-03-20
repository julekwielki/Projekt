package projekt;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ServicePanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	JButton start,end;
	JSlider velocity, angle;
	JLabel informations;

	public ServicePanel() {
		this.setSize(300, 600);
		this.setLayout(new GridLayout(5,1));
		this.setBackground(new Color(102,255,237,255));
		
	//informacje
		informations = new JLabel();
		informations.setText("Ustaw wybrane wartoœci pocz¹tkowe i podejmij wyzwanie trafienia w cel.");
		
	//przycisk startowy
		
		start = new JButton("Start");
		start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0)	
			{
				
			}	
		});	
		
	//przycisk koncowy
		end = new JButton("Zakoncz");
		end.setBounds(20,20,100,50);
		end.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)	
			{
				if(e.getSource () == end)
			    {
			      End test = new End();
			      test.setVisible (true);
			      
			    }
			}	
		});	
	//slider kata poczatkowego
		
		angle = new JSlider(JSlider.HORIZONTAL, 0, 89, 45);
		angle.setBackground(new Color(102,255,237,255));
		angle.setMajorTickSpacing(10);
		angle.setPaintTicks(true);
		
		ChangeListener angelListener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				
			}
		};		
		angle.addChangeListener(angelListener);
		
	//slider predkosci poczatkowej

		velocity = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
		velocity.setBackground(new Color(102,255,237,255));
		velocity.setMajorTickSpacing(1);
		velocity.setPaintTicks(true);
		
		ChangeListener velocityListener = new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			}
		};		
		velocity.addChangeListener(velocityListener);
		
		this.add(informations);
		this.add(start);
		this.add(angle);
		this.add(velocity);
		this.add(end);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}

