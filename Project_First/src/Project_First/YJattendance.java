package Project_First;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class YJattendance extends JFrame{
	
	JButton jbtn_new = new JButton("새일정");
	JButton jbtn_save = new JButton("저장");
	JButton jbtn_re = new JButton("수정");
	JButton jbtn_delete = new JButton("삭제");
	JTextArea jta_naeyoung = new JTextArea();
	JPanel jpn_textarea = new JPanel();
	JPanel jpn_button = new JPanel(new FlowLayout());
	YeelJungEvent yje = null;
	
	public YJattendance () {
		yje = new YeelJungEvent(this);
		initDisplay();
	}

	private void initDisplay() {
		jta_naeyoung.setBackground(Color.orange);
		jpn_textarea.setBackground(Color.green);
		jpn_textarea.add(jta_naeyoung);
		jpn_button.add(jbtn_new);
		jpn_button.add(jbtn_save);
		jpn_button.add(jbtn_re);
		jpn_button.add(jbtn_delete);
		
		this.setLocation(590, 100);
		this.setLayout(new BorderLayout());
		this.add("Center",jpn_textarea);
		this.add("South",jpn_button);
		this.setTitle("일정관리");
		this.setVisible(true);
		this.setSize(500, 500);
	}
	
	
}
