package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public String getCurrentFormattedDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("DD MMMM YYYY");
        Date date = new Date();
        return formatter.format(date);
    }

}
