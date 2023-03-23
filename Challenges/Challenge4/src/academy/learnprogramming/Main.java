package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    
    public static void main(String[] args) {

        System.out.println(getDurationstring(189,45));
        System.out.println(getDurationstring(155,22));
        System.out.println(getDurationstring(3200,59));
        System.out.println(getDurationstring(4200,55));
        System.out.println(getDurationstring(12500));
        System.out.println(getDurationstring(15532));
        System.out.println(getDurationstring(-250));
    }

    public static String getDurationstring(long minutes, long seconds){
        if(minutes>=0&&seconds>=0&&seconds<=59){
            long hours=minutes/60;
            minutes=minutes%60;
            String hoursString = hours +"h";
            if(hours<10){
                hoursString="0"+hoursString;
            }
            String minutesString = minutes +"m";
            if(minutes<10){
                minutesString="0"+minutesString;
            }
            String secondsString = seconds +"m";
            if(seconds<10){
                secondsString="0"+secondsString;
            }
            return (hoursString+" "+minutesString+" "+secondsString);
        }else{
            return INVALID_VALUE_MESSAGE;
        }
    }
    
    public static String getDurationstring(long seconds){
        if(seconds>=0){
            long minutes=seconds/60;
            long remseconds=seconds%60;
            return getDurationstring(minutes,remseconds);
        }else{
            return INVALID_VALUE_MESSAGE;
        }
    }
}
