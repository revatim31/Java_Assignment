package DateTtime;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAfter2Week_p9 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		GregorianCalendar g = new GregorianCalendar();
		Date d = g.getTime();
		d.setDate(d.getDate()+(7*2));
		System.out.println("After 2 week date : "+d);
	}
}