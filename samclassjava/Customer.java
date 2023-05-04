package samclassjava;

import coursechoice.Course;

public class Customer {

    private int member = 0 ;
    private Course chooseCourse = null;
    private Day bkday = null;

    public Course getChooseCourse() {
        return chooseCourse;
    }

    public void setChooseCourse(Course chooseCourse) {
        this.chooseCourse = chooseCourse;
    }

    public Day getbkday() {
        return bkday;
    }

    public void setbkday(Day bkday) {
        this.bkday = bkday;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }
    


}