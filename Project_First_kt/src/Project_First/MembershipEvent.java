package Project_First;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MembershipEvent implements ActionListener {
	AvatarChoose avch = null;
	public MembershipEvent(AvatarChoose avch){
		this.avch = avch;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("바뀔거야");
		// TODO Auto-generated method stub
		
	}

}
