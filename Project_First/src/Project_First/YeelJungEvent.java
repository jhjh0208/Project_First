package Project_First;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class YeelJungEvent implements ActionListener {
	Calendar		cal				= Calendar.getInstance();
	YeelJungView	yjv				= null;
	YeelJungDialog	searchDialog	= null;
	YJattendance yja = null;
	int i = 0;

	public YeelJungEvent(YeelJungView yjv) {
		this.yjv = yjv;
	}
	
	public YeelJungEvent(YJattendance yja) {
		this.yja=yja;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();

		if (obj == yjv.jbtn_left) {
			yjv.month--;

			if (yjv.month < 1) {
				yjv.month = 12;
				yjv.year--;
			}
			yjv.RefreshDate();
		}

		if (obj == yjv.jbtn_right) {
			yjv.month++;

			if (yjv.month > 12) {
				yjv.month = 1;
				yjv.year++;
			}
			yjv.RefreshDate();

		}
		if (obj == yjv.jbtn_search) {
			searchDialog = new YeelJungDialog();
		}
		
		if (obj == yjv.jbtn_in) {
			cal.getTime();
			System.out.println(cal.getTime());
		}
		
		if (obj == yjv.jbtn_out) {
			System.out.println("퇴근시간:");
		}
		
		if (obj == yjv.jbtn_attendance) {
			System.out.println("이걸 어쩐다요??");
		}
		for(i=0;i<yjv.jbtn_nalja.length;i++) {
			
			if (obj == yjv.jbtn_nalja[i]) {
				System.out.println("새창이 나온다요??"+i);
				YJattendance yjt= new YJattendance(); 
			}
		}
		
//	
//		System.out.println("나석원 바보");
//		System.out.println("형 화이팅 무야호");
	}

}
