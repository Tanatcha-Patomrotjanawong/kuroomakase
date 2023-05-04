package samclassjava;

public class Day {

    private String date = "";
    private int day = 0;
    private int month = 0;
    private int year = 0;
    public String getDate() {
        return date;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(String date) {
        this.date = date;

        String[] fday = this.date.split("/");

        this.day = Integer.parseInt(fday[0]);
        this.month = Integer.parseInt(fday[1]);
        this.year = Integer.parseInt(fday[2]);

    }




}