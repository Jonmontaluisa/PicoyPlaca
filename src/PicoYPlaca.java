import java.util.Calendar;


public class PicoYPlaca {

    private static  Calendar shift1Start = Calendar.getInstance();
    private static  Calendar shift1End = Calendar.getInstance();
    private static  Calendar shift2Start = Calendar.getInstance();
    private static  Calendar shift2End = Calendar.getInstance();
    private static int shift1StartHour= 6 ;
    private static int shift1EndHour= 8;
    private static int shift2StartHour= 17 ;
    private static int shift2EndHour= 20;



    public static void main(String[] args ) {
        //Initialize the shifts for theday
        initShifts();

        // Create a Plate and DateTimeHandler
        Plate givenPlate = new Plate(args[0]);
        DateTimeHandler dth = new DateTimeHandler(args[1], args[2]);



        Calendar givenTime = Calendar.getInstance();
        givenTime.set(Calendar.HOUR_OF_DAY, dth.getHour());
        givenTime.set(Calendar.MINUTE,dth.getMinute());

        if(givenPlate.verifyPlate() && dth.verifyTime()){
            checkPicoYPlaca(givenPlate, givenTime, dth);
        }else{
            System.out.println("We kindly remind you the right format for plate, day and time is ABC01234 Day HHMM. " +
                    "For example PBC1123 Monday 0530");
        }


    }

    public  static void initShifts(){
        shift1Start.set(Calendar.HOUR_OF_DAY,shift1StartHour);
        shift1End.set(Calendar.HOUR_OF_DAY,shift1EndHour);
        shift2Start.set(Calendar.HOUR_OF_DAY,shift2StartHour);
        shift2End.set(Calendar.HOUR_OF_DAY,shift2EndHour);
    }

    public static void checkPicoYPlaca(Plate plate, Calendar calender, DateTimeHandler dth){
        int lastDigitPlate = plate.lastDigit();
        String day = dth.getDay();

        if( hasRestrictionToday(day, lastDigitPlate)){
            if(hasRestrictionRightNow(calender)) {
                System.out.println("We are sorry, your car can not be on the road right now");
            }
        }else {
            System.out.println("Congrats, you can be in the road");
        }
    }

    public static boolean hasRestrictionToday(String day , int lastDigit){
        String monday = "monday";
        String tuesday= "tuesday";
        String wednesday = "wednesday";
        String thursday = "thursday";
        String friday = "friday";
        String saturday = "saturday";
        String sunday = "sunday";
        System.out.println(day + lastDigit);
        if( day.equals(monday) && (lastDigit==0 || lastDigit==1) ){
            System.out.println("test monday");
            return true;
        }
        if(day.equals(tuesday) && (lastDigit==2 || lastDigit==3) ){
            System.out.println("test tuesday");
            return true;
        }
        if(day.equals(wednesday) && (lastDigit==4 || lastDigit==5) ){
            return true;
        }
        if(day.equals(thursday) && (lastDigit==6 || lastDigit==7) ){
            return true;
        }
        if(day.equals(friday) && (lastDigit==8 || lastDigit==9) ){
            return true;
        }

        return false;
    }

    public static boolean hasRestrictionRightNow(Calendar calendar){
        if ( (shift1Start.before(calendar) && calendar.before(shift1End) )||
                (shift2Start.before(calendar) && calendar.before(shift1End))){
            return true;
        }
        return false;
    }



}
