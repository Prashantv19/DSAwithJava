package OOPsInJava;
import java.util.Scanner;
// Scanner scanner = new Scanner(System.in);

public class StudentClass {
    public static class student{
    String  name;
    int rollno;
    double percent;
}
    public static class car{
    String name;
    int cost;
    double average;
}
 

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Prashant";
        s1.rollno = 141;
        s1.percent = 88.5;
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.percent);

        student s2 = new student();
        s2.name = "Prachi";
        s2.rollno = 138;
        s2.percent = 94.5;
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.percent);

        car c1 = new car();
        c1.name= "Thar";
        c1.cost= 1100000;
        c1.average= 110.0;
        System.out.println(c1.name);
        System.out.println(c1.cost);
        System.out.println(c1.average);
    }
}
