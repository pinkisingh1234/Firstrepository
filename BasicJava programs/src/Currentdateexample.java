import java.text.SimpleDateFormat;  

import java.util.Date;
public class Currentdateexample {
static void displaycurrentdate() {
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    //printing simple date
    System.out.println(date);
    //printing date in format
    System.out.println(formatter.format(date));  
    //convert i to string
    System.out.println(date.toString());

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displaycurrentdate();
		
	    	}

	}


