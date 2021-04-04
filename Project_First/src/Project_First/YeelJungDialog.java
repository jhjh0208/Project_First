package Project_First;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class YeelJungDialog extends JDialog {

	String[]			comboList	= { "1", "1", "1", "1", "1", "1", "1", "1", "1" };
	JComboBox<String>	combo1		= new JComboBox<>(comboList);
	JComboBox<String>	combo2		= new JComboBox<>();
	JPanel				comboPanel	= new JPanel();

	YeelJungDialog() {
		initDisplay();
	}

	public void initDisplay() {
		this.setLayout(new FlowLayout());
		comboPanel.add(combo1);
		comboPanel.add(combo2);
		this.add(comboPanel);
		this.setTitle("temp");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

}
