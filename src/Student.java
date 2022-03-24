import java.util.TreeSet;
import java.util.Scanner;
import java.util.*;
import java.lang.Comparable;


class Student<X> implements Comparable <Student> {

    public X[] array;

    public Student(X[] array) {
        this.array = array;
    }

    String[] FIO = {};
    String[] level = {};
    String[] age = {};
    String[] subject = new String[subj.values().length];

    String getFIO() {
        return FIO[0];
    }

    String getFIO2() {
        return FIO[1];
    }

    String getage() {
        return age[0];
    }

    String getage2() {
        return age[1];
    }


    public int compareTo(Student p1) {
        return p1.getFIO().compareTo(p1.getFIO2());
    }

    public int compareTo2(Student p1) {
        return p1.getage().compareTo(p1.getage2());
    }
}