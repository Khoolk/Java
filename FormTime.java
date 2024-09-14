//java.time package has date & time classes
//use now() method to display current time
//DateTimeFormatter class has ofPattern() method to display in custom format

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormTime {

    public static void main(String[] args) {
        LocalDate dObj = LocalDate.now();
        System.out.println(dObj);
        LocalTime tObj = LocalTime.now();
        System.out.println(tObj);
        LocalDateTime dtObj = LocalDateTime.now();
        System.out.println(dtObj);
        DateTimeFormatter fObj = DateTimeFormatter.ofPattern("E, dd-MM-yyy HH:mm:ss");
        String fDate = dtObj.format(fObj);
        System.out.println(fDate);
    }
}
