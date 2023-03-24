package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Bank SBI= new Bank("7019605809",0,12334,"manish29na@gmail.com","Manish");
        System.out.println(SBI.getBalance());
        System.out.println(SBI.getAccountnumber());
        SBI.withdrawal(100);
        SBI.deposit(150);
        SBI.withdrawal(160);
        SBI.deposit(25);
        SBI.withdrawal(175);
        Bank CBI= new Bank("manish","manish@gmail","123456");
        System.out.println(CBI.getBalance()+" "+CBI.getAccountnumber());

        VipCustomer Myself=new VipCustomer();
        VipCustomer Yourself= new VipCustomer("Mani",25000);
        VipCustomer Themself=new VipCustomer("People",500000,"Their.com");
        System.out.println(Myself.getName()+" "+Myself.getCreditLimit()+" "+Myself.getEmailAddress());
        System.out.println(Yourself.getName()+" "+Yourself.getCreditLimit()+" "+Yourself.getEmailAddress());
        System.out.println(Themself.getName()+" "+Themself.getCreditLimit()+" "+Themself.getEmailAddress());
    }
}
