package projekt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ServicePanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	JButton start,end;
	JSlider velocity, angle;
	JLabel informations, velocityLabel, angleLabel, result;
	int language, points;
	String startString, endString;
	
	public void setLanguage() {
		if(Game.language==1) {
			informations.setText("Ustaw wybrane wartoœci pocz¹tkowe i podejmij wyzwanie trafiaj¹c w cel.");
			startString = new String("Zakoncz");
		}
		else {
			informations.setText("Set initial values");
			endString = new String("End");
		}
	}

	public ServicePanel() {
		this.setSize(300, 600);
		this.setLayout(new GridLayout(8,1));
		this.setBackground(new Color(102,255,237,255));
		this.setBorder(new EmptyBorder(10, 20, 50, 20));
	
		
	//informacje
		informations = new JLabel();
		informations.setBorder(new EmptyBorder(10, 10, 10, 10));
		informations.setPreferredSize(new Dimension(400,30));
		informations.setMinimumSize(new Dimension(400,30));
		informations.setText("<html>"+"Ustaw wybrane wartosci poczatkowe, kat i predkosc, aby trafic do celu i zdobyc punkt."+"</html>");

		points = 0;
	//przycisk startowy
		
		start = new JButton("Start");
		start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0)	
			{
				points+=1;
				result.setText("Twoj wynik to:   "+ points + "   punktow");
			}	
		});	
		start.setPreferredSize(new Dimension(400,30));
		start.setMinimumSize(new Dimension(400,30));
		
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
		
		angleLabel = new JLabel("Kat poczatkowy", SwingConstants.CENTER);
		velocityLabel = new JLabel("Predkosc poczatkowa", SwingConstants.CENTER);
		angleLabel.setVerticalAlignment(SwingConstants.TOP);
		velocityLabel.setVerticalAlignment(SwingConstants.TOP);
		
	//slider kata poczatkowego
		
		angle = new JSlider(JSlider.HORIZONTAL, 0, 90, 45);
		angle.setBackground(new Color(102,255,237,255));
		angle.setMajorTickSpacing(10);
		angle.setMinorTickSpacing(2);
		angle.setPaintTicks(true);
		angle.setPaintLabels(true);
		
		ChangeListener angelListener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				
			}
		};		
		angle.addChangeListener(angelListener);
		
	//slider predkosci poczatkowej

		velocity = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		velocity.setBackground(new Color(102,255,237,255));
		velocity.setMajorTickSpacing(10);
		velocity.setMinorTickSpacing(2);
		velocity.setPaintTicks(true);
		velocity.setPaintLabels(true);
		
		ChangeListener velocityListener = new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			}
		};		
		velocity.addChangeListener(velocityListener);
		
	//wyniki
		result = new JLabel("Twoj wynik to:   "+ points + "   punktow");
		result.setVerticalAlignment(SwingConstants.CENTER);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.add(informations);
		this.add(start);
		this.add(angle);
		this.add(angleLabel);
		this.add(velocity);
		this.add(velocityLabel);
		this.add(result);
		this.add(end);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}

