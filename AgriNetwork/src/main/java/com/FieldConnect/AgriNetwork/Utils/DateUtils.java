package com.FieldConnect.AgriNetwork.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private Date addCurrentTimeStampToDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dateStr = sdf.format(date);
        dateStr = dateStr + " " + new SimpleDateFormat("HH:mm:ss").format(new Date());
        try {
            return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException("Error while parsing date");
        }
    }
}
