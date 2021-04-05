package Project_First;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class YeelJungDialog extends JDialog {
	int i = 0;
	String[]			yearList	= new String[100];
	String[]			monthList	= null;
	JComboBox<String>	combo1		= new JComboBox<>();
	JComboBox<String>	combo2		= new JComboBox<>();
	JPanel				comboPanel	= new JPanel();
	JPanel				goPanel		= new JPanel();
	JButton				jbtn_go		= new JButton("확인");

	YeelJungDialog() {
		logic();
	}
	public void logic() {
		for(int y = 2011; y <= 2031; y++) {
			yearList[i] = ""+y;
			i++;
		}
		
		initDisplay();
	}

	public void initDisplay() {
		this.setLayout(new GridLayout(2,1));
		comboPanel.add(combo1);
		comboPanel.add(combo2);
//		goPanel.add(yearList);
		goPanel.add(jbtn_go);
		this.add(comboPanel);
		this.add(goPanel);
		this.setTitle("날짜 검색기");
		this.setSize(250, 150);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

}
