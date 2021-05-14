import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Date time = new Date();
        System.out.println("time: " + time);

        String time1 = format1.format(time);
        String time2 = ("2021-05-09");
        System.out.println(time1);
        try {
            Date today = format1.parse(time1);
            Date expirDay = format1.parse(time2);

            long diffInMillies = expirDay.getTime() - today.getTime();
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            System.out.println(String.format("today %s, expirDay %s Diff %s Days", today, expirDay, diff));
        } catch (Exception e) {
            e.printStackTrace();
        }
    } //end of main
}  //end of class




