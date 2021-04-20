package Project_First;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class AvatarChoose extends JDialog {
	
	//선언부
	String imgPath = "C:\\git_Project_First\\Project_First\\Project_First_kt\\src\\images\\";
	String imgfile[] = {"lion11.png","lion22.png","lion33.png","lion44.png","lion55.png"};
	JPanel jp_emoticon = new JPanel();
	GridLayout gl_emoticon = new GridLayout(1,5,2,2);
	JButton pic0 = new JButton();
	JButton pic1 = new JButton();
	JButton pic2 = new JButton();
	JButton pic3 = new JButton();
	JButton pic4 = new JButton();
	JButton imgbutton[] = {pic0,pic1,pic2,pic3,pic4};
	ImageIcon img[] = new ImageIcon[imgfile.length];
	JButton pic[] = new JButton[imgfile.length];
	MembershipEvent mse = null;
	//생성자
	public AvatarChoose() {
		this.initDisplay();
	}
	//화면처리부
	public void initDisplay() {
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jp_emoticon.setLayout(gl_emoticon);
		for(int i=0;i<imgfile.length;i++) {
			img[i] = new ImageIcon(imgPath+imgfile[i]);
//			pic[i].setIcon(img[i]);
//			pic[i].setVisible(false);
//			jp_emoticon.add(pic[i]);
			
		}
		mse = new MembershipEvent(this);
		pic0.setIcon(img[0]);
		pic1.setIcon(img[1]);
		pic2.setIcon(img[2]);
		pic3.setIcon(img[3]);
		pic4.setIcon(img[4]);
		pic0.addActionListener(mse);
		pic1.addActionListener(mse);
		pic2.addActionListener(mse);
		pic3.addActionListener(mse);
		pic4.addActionListener(mse);
		jp_emoticon.add(pic0);
		jp_emoticon.add(pic1);
		jp_emoticon.add(pic2);
		jp_emoticon.add(pic3);
		jp_emoticon.add(pic4);
		this.add("Center",jp_emoticon);
		this.setLocation(920, 250);
		this.setSize(600,200);
		this.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		AvatarChoose pm = new AvatarChoose();
//		pm.initDisplay();
		// TODO Auto-generated method stub

	}

}
