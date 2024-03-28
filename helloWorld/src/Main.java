import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        for (int i = 0; i < 1000; i++) {
            LocalTime myObj = LocalTime.parse(LocalTime.now()
            .truncatedTo(ChronoUnit.SECONDS)
            .format(DateTimeFormatter.ISO_LOCAL_TIME));
            System.out.println(myObj);
            System.out.println("");
            Thread.sleep(1000);
        }

    }
}