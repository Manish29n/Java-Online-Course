public class Main {
    public static void main(String[] args) {
        boolean Result;
        System.out.println(Result=NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println(Result=NumberOfDaysInMonth.isLeapYear(2020));
        System.out.println(Result=NumberOfDaysInMonth.isLeapYear(1700));
        System.out.println(Result=NumberOfDaysInMonth.isLeapYear(2019));
        System.out.println(Result=NumberOfDaysInMonth.isLeapYear(0));
        System.out.println(Result=NumberOfDaysInMonth.isLeapYear(10000));
        int MonthResult;
        System.out.println(MonthResult=NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(MonthResult=NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(MonthResult=NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(MonthResult=NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(MonthResult=NumberOfDaysInMonth.getDaysInMonth(1,-2020));
    }
}
