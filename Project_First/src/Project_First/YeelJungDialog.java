package Project_First;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class YeelJungDialog extends JDialog {

//	String[]	yearList	= new String[100];
//	String[]	monthList	= null;
	Vector<String>		yearList	= new Vector<String>();
	Vector<String>		monthList	= new Vector<String>();
	JComboBox<String>	combo_year	= null;
	JComboBox<String>	combo_month	= null;
	JLabel jlb_year = new JLabel("년");
	JLabel jlb_month = new JLabel("월");
	JPanel				jp_combo	= new JPanel();
	JPanel				jp_ok		= new JPanel();
	JButton				jbtn_ok		= new JButton("확인");

	YeelJungDialog() {
		yearlogic();
		
	}

	public void yearlogic() {

		for(int y = 2011; y <= 2031; y++) {
			yearList.add("" + y);
		}
		monthlogic();
	}
	public void monthlogic() {
		for(int m = 1; m<=12;m++) {
			monthList.add("" + m);
		}
		initDisplay();
	}

	public void initDisplay() {
		this.setLayout(new GridLayout(2, 1));
		combo_year = new JComboBox<String>(yearList);
		combo_month = new JComboBox<String>(monthList);
		jp_combo.add(combo_year);
		jp_combo.add(jlb_year);
		jp_combo.add(combo_month);
		jp_combo.add(jlb_month);
		jp_ok.add(jbtn_ok);
		this.add(jp_combo);
		this.add(jp_ok);
		this.setTitle("날짜 검색기");
		this.setSize(250, 150);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

}
