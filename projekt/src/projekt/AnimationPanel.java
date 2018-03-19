package projekt;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class AnimationPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	public AnimationPanel() {
		this.setSize(300, 500);
		this.setBackground(Color.WHITE);
	}

	public AnimationPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public AnimationPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public AnimationPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
}
