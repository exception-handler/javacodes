package Answer2;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;

public class CompareAsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		Date date1=new Date();
		Date date2=new Date();
		try {
			 date1=sdf.parse(o1.getDob());
			 date2=sdf.parse(o2.getDob());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date2.compareTo(date1);
		
	}

}
