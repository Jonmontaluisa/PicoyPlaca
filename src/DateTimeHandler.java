public class DateTimeHandler {
    private String dateString;
    private String timeString;
    private int hour;
    private int minute;

    public  DateTimeHandler(String dateGiven, String timeGiven){
        dateString=dateLowerCase(dateGiven);
        timeString=timeGiven;
        dateFormatting();
    }
    //Check the right format is being used for time
    public boolean  verifyTime(){
        if ( timeString.matches("[0-9]{4}")
                && hour<24 && 0<hour && 0<minute && minute<60){
            return true;
        }
        return false;

    }

    public String dateLowerCase(String dateGiven){
        return dateGiven.toLowerCase();
    }
    //Fill up the hour and minute
    public void dateFormatting(){

        hour= Integer.parseInt(timeString.substring(0,2));
        minute= Integer.parseInt(timeString.substring(2,4));
    }
    public String getDay(){
        return dateString;
    }
    public int getHour(){
        return hour;
    }
    public  int getMinute(){
        return  minute;
    }

}
