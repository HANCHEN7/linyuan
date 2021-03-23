package com.atguigu.homework;

public class DateCommonsTools {
    public String getWeekName(int week){
        switch (week){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
        }
        return "";
    }
    public String getMonthName(int month){
        switch (month){
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
        }
        return "";
    }
    public int getTotalDaysOfMonth(int year, int month){
        int days = 0;
        switch (month){
            case 12: days+=31;
            case 11: days+=30;
            case 10: days+=30;
            case 9: days+=31;
            case 8: days+=31;
            case 7: days+=30;
            case 6: days+=31;
            case 5: days+=30;
            case 4: days+=31;
            case 3:
                if(year%4==0 && year%100!=0 || year%400==0){
                    days+=29;
                }else{
                days+=28;
                }
            case 2: days+=31;
            case 1:  return days;
        }
        return days;
    }
    public int getTotalDaysOfYear(int year){
        int days = 365;
        if(year%4==0 && year%100!=0 || year%400==0){
            days++;
        }
        return days;
    }
    public boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0 || year%400==0);
    }
}
