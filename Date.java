public class Date {
    private int day;
    private int month;
    private int year;
    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDay(){
        this.day = day;
    }
    public void setMonth(){
        this.month = month;
    }
    public void setYear(){
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void displayDate(){
        System.out.println("The Date is: " + day + "/" + month + "/" + year);
    }
}
