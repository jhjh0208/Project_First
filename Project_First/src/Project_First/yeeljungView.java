package Project_First;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class yeeljungView extends JFrame {
	int			i;
	Calendar	cl			= Calendar.getInstance();
	JLabel		jlb			= new JLabel("2021년 " + " 3월");
	JPanel		jp_up		= new JPanel(new FlowLayout());
	JPanel		jp_down		= new JPanel(new GridLayout(0, 7, 3, 3));
	JButton		jbtn_in		= new JButton("출근");
	JButton		jbtn_out	= new JButton("퇴근");
	JButton		jbtn_left	= new JButton("◀");
	JButton		jbtn_right	= new JButton("▶");
	JButton		jbtn_search	= new JButton("검색");
	JButton[]	jbtn_nalja	= new JButton[35];

	public yeeljungView() {
		initDisplay();
	}

	public void initDisplay() {
		jp_up.add(jbtn_in);
		jp_up.add(jbtn_out);
		jp_up.add(jbtn_left);
		jp_up.add(jlb);
		jp_up.add(jbtn_right);
		jp_up.add(jbtn_search);

		for (i = 0; i < 35; i++) {
			jbtn_nalja[i] = new JButton("" + (i + 1));
			jp_down.add(jbtn_nalja[i]);
		}
		this.setLayout(new BorderLayout());
		this.add("North", jp_up);
		this.add("Center", jp_down);
		this.setTitle("일정관리");
		this.setSize(650, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new yeeljungView();

	}

}
