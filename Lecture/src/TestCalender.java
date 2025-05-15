
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class TestCalender {
    public static void main(String[] args) {
        Calendar calender=new GregorianCalendar();

        System.out.println("Current time is: "+new Date());

        System.out.println("Year"+calender.get(Calendar.YEAR));
        System.out.println("Month"+calender.get(Calendar.MONTH));
        System.out.println("Day"+calender.get(Calendar.DATE));
        System.out.println("Hour"+calender.get(Calendar.HOUR));
        System.out.println("Minute"+calender.get(Calendar.MINUTE));
        System.out.println("Second"+calender.get(Calendar.SECOND));
    }
}
