import java.util.Date;
import java.text.SimpleDateFormat;  
import java.util.Calendar;
public class Calanderdatedemo {
static void displaydate() {
	Calendar c=  Calendar.getInstance();
	SimpleDateFormat sd= new SimpleDateFormat("dd/mm/yyyy  HH:mm:ss");
	System.out.println(sd.format(c.getTime()));
	System.out.println(c.get(Calendar.DAY_OF_MONTH));
	System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println(c.get(Calendar.DAY_OF_YEAR));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
displaydate();

	}

}
