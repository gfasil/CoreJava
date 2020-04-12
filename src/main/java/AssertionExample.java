import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class AssertionExample {
        LocalDate localDate;
        public AssertionExample(String year,String month,String date){
            String datet= date+"/"+month+"/"+year;
            this.localDate=convToDate(datet);
            System.out.println(localDate);

        }
    public static LocalDate convToDate(String date){

        return LocalDate.parse(date, DateTimeFormatter.ofPattern("DD/mm/yyyy",Locale.ENGLISH));

    }
    synchronized void main(int[] x) {

        GregorianCalendar cal = new GregorianCalendar(1999, 11, 31, 23, 12, 58);

        cal.set(Calendar.MONTH,Calendar.JANUARY);
        GregorianCalendar cal1 = new GregorianCalendar(1994, Calendar.JULY,cal.get(Calendar.DATE));
        Date d=  new Date();
        d.setDate(cal1.get(Calendar.DATE));
        d.setMonth(cal.get(Calendar.MONTH));

        assert x.length > 0 && cal1.compareTo(cal)>1 : "empty array " + d;
    }
    public synchronized final static void main(String[] args) {
        System.out.println("he;;p");
        System.runFinalization();
        AssertionExample x = new AssertionExample("2020","10","12");
        try {
            x.finalize();
            System.out.println("finalized");
           System.out.println(AssertionExample.convToDate("12/10/1994"));
            new AssertionExample("2020","10","12").main(new int[]{1,2,3});
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
