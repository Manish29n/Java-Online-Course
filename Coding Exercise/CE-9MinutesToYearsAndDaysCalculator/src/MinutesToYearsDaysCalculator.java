public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            long year=minutes/60/24/365;
            long days=(minutes/(60*24))%365;
            String YearString= year+" y and ";
            String DayString= days+" d";
            String MinutesString=minutes+" min = ";
            System.out.println(MinutesString+YearString+DayString);
        }
    }
}
