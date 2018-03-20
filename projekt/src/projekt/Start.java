package projekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Start extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton start, polish, english;
	int language;
	String name;
	JTextField gettingName;
	JCheckBox gravity,wind;
	JPanel mainPanel, languagePanel, extrasPanel;
	
	public String nazwa() {
		return name;	
	}
	
//funkcja zmiany jêzyka
	public void SetLanguage(int a) {
		if(a ==2) {
			gettingName.setText("Enter your username");
			gravity.setText("Gravity");
			wind.setText("Wind");
		}
		else {
			gettingName.setText("Podaj nazwê u¿ytkownika");
			gravity.setText("Grawitacja");
			wind.setText("Wiatr");
			
		}
	}
	
	public Start () throws HeadlessException {
	
	//ustawienia ramki
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(450,250);	
		this.setLocationRelativeTo(null);
		this.setBackground(new Color(102,255,237,255));
		this.setLayout(new BorderLayout());
	
	//zmiana tego inta bêdzie wywo³ywa³a zmianê jêzyka 1 - polski, 2 - angielski
		language = 1;
		
	//nowe, wspania³e... panele
		mainPanel=new JPanel();
		languagePanel = new JPanel();
		extrasPanel = new JPanel();
		
		mainPanel.setBackground(new Color(102,255,237,255));
		languagePanel.setBackground(new Color(102,255,237,255));
		extrasPanel.setBackground(new Color(102,255,237,255));
	
		
	//przycisk startu, którym przechodzimy dalej
		start = new JButton("START");	
		start.setPreferredSize(new Dimension(90,30));
		start.setMinimumSize(new Dimension(90,30));
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Game test = new Game();
				test.setVisible (true);
				dispose();
			}

		});
	//zmiana jezyka na polski
		polish = new JButton("Polski");
		polish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)	
			{
				language = 1;
				SetLanguage(language);
				
			}
		});
		
	//zmiana jêzyka na angielski
		english = new JButton("English");
		english.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)	
			{
				language = 2;
				SetLanguage(language);
				
			}
		});
		
		languagePanel.add(polish);
		languagePanel.add(english);
		
		mainPanel.setLayout(new FlowLayout());
		
		gettingName = new JTextField("Podaj nazwê u¿ytkownika");
		name = gettingName.getText();
		gettingName.setText(name);
		gettingName.setPreferredSize(new Dimension(400,30));
		gettingName.setMinimumSize(new Dimension(400,30));
		
		mainPanel.add(gettingName);
		mainPanel.add(start);
		
	//panel z dodatkami - wiatr i grawitacja
		wind =new JCheckBox("Wiatr");
		wind.setBackground(new Color(102,255,237,255));
		gravity =new JCheckBox("Grawitacja");
		gravity.setBackground(new Color(102,255,237,255));
		wind.setSelected(false);
		gravity.setSelected(false);

		extrasPanel.add(wind);
		extrasPanel.add(gravity);
		
		
		this.add(BorderLayout.NORTH, extrasPanel );
		this.add(BorderLayout.SOUTH, languagePanel );

		this.add(mainPanel);
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
