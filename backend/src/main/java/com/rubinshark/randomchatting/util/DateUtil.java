package com.rubinshark.randomchatting.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by rubin on 2016. 4. 21..
 */
public class DateUtil {
    public static final String BASIC_FORMAT = "yyyy-MM-dd HH:mm";
    public static final String BASIC_FORMAT_DATE = "yyyy-MM-dd";

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static String getCurrentTimeString() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String getDateByFormat(String format, long timeMillis) {
        SimpleDateFormat sdfDate = new SimpleDateFormat(format);//yyyy-MM-dd HH:mm:ss.SSS
        Date date = new Date(timeMillis);
        return sdfDate.format(date);
    }

    public static String getDateByFormat(String format, int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(calendar.getTime());
    }

    public static void setCalendarDateTime(Calendar calendar, int month, int day, int hour, int minute, int second) {
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
    }

    public static void setCalendarTime(Calendar calendar, int hour, int minute, int second) {
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
    }
}
