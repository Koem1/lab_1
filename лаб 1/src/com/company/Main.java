/*package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main
{

   // сделать метод который будет выводить даты
    private double y, d;

    public static void main(String[] args)
    {
        Main prog = new Main();
        double a = 3.2, b = 17.5, x = -4.8;
        double y = prog.calcY(a, x);
        double d = prog.calcD(a, b, x);
    }

    private double calcY(double a, double x)
    {
        return Math.sqrt(Math.tan(x)) - a / Math.sqrt(Math.sin(x / a));

    }

    private double calcD(double a, double b, double x)
    {
        return a * Math.exp(-Math.sqrt(a)) * Math.cos(b * x / a);
    }

    private void print(double y, double d) {
        System.out.println("y=" + y);
        System.out.println("d=" + d);
    }

    private void printCurrentDate() {
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Дата/время[new]: %d %s, %d:%d:", now.getDayOfMonth(), now.getMonth(), now.getHour(), now.getMinute());
        System.out.println(now.format(DateTimeFormatter.ofPattern("ss.SSS")));
    }

}*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main
{
    private double a,b,x;

    public static void main(String[] args)
    {
        Main m = new Main();
        m.enterVars();
        double y = m.calcY();
        double d = m.calcD();
        m.datePrintOld();
        m.datePrintNew();
        m.printVar(y, d);
    }


    private void datePrintNew ()
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Дата и время[new]: %d %s, %d:%d:" ,now.getDayOfMonth(), now.getMonth(), now.getHour(), now.getMinute());
        System.out.println(now.format(DateTimeFormatter.ofPattern("ss.SSS")));
    }
    private void enterVars()
    {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a= ");
        a = s.nextDouble();
        System.out.print("Enter b= ");
        b = s.nextDouble();
        System.out.print("Enter x= ");
        x = s.nextDouble();
    }
    private double calcY()
    {
        return Math.sqrt(Math.tan(x)) - a / Math.sqrt(Math.sin(x / a));
    }
    private double calcD()
    {
        return a * Math.exp(-Math.sqrt(a)) * Math.cos(b * x / a);
    }
    private void privatVar (double y, double d)
    {
        System.out.printf("a = %d, b=%y, x=%d\n", a, b, x);
        System.out.printf("Y=%y, D=%f\n", y,d);
    }
    private void datePrintOld()
    {
        Date date = new Date();
        System.out.printf("Дата и время[ald]: %1$te %1tB,%1$tH:%1$tM");
    }

}
