import java.util.Scanner;
import java.util.*;
import java.lang.Comparable;
enum subj{Math,Geometry,Physics} ;

public class Main {
    public static void main (String[] args) {
        String[] FIO = {"","","","",""};
        String[] level = {"","","","",""};
        String[] age = {"","","","",""};
        String[] subject = new String[subj.values().length];
        TreeSet<String> s1 = new TreeSet<>();
        TreeSet <String> s1_reversed = new TreeSet<>();
        s1_reversed = (TreeSet)s1.descendingSet();
        Student<String> s2 = new Student<>(level);
        Student<String> s3 = new Student<>(age);
        Student<String> s4 = new Student<>(subject);
        int e=0;
        while (e!=5) {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Ввести ученика");
        System.out.println("2. Вывести всех учеников по возрастанию");
        System.out.println("3. Вывести всех учеников по убыванию");
        System.out.println("4. Удалить ученика по индексу");
        System.out.println("5. Выйти из программы");
        Scanner scr_1 = new Scanner(System.in);
        String scr_1_string = scr_1.next();

            if (scr_1_string.equals("1")) {
                System.out.println("Введите ФИО:");
                Scanner sc_fio = new Scanner(System.in);
                String fio_string = sc_fio.next();
                System.out.println("Введите возраст:");
                Scanner sc_age = new Scanner(System.in);
                String age_string = sc_age.next();
                System.out.println("Введите класс:");
                Scanner sc_level = new Scanner(System.in);
                String level_string = sc_level.next();
                System.out.println("Введите любимый предмет (Math/Geometry/Physics):");
                Scanner sc_subj = new Scanner(System.in);
                String subj_string = sc_subj.next();
                if (!scr_1_string.equals("User")) {
                    int k = 0;
                    int f=0;
                    for(int i=1;i<FIO.length;i++){
                        if (!FIO[i-1].equals("")) {
                            k=i;
                        }
                        if (FIO[i-1].equals(fio_string)) {
                            f=f+1;
                        }
                    }
                    if (f>0){
                        System.out.println("Данный ученик уже есть в списке");
                    }
                    else {
                        FIO[k] = fio_string;
                        s1.add(fio_string);
                        level[k] = level_string;
                        age[k] = age_string;
                        subject[k] = subj_string;
                    }
                }
            }
            if (scr_1_string.equals("2")) {
                System.out.println(s1);
            }
            if (scr_1_string.equals("3")) {
                System.out.println(s1_reversed);
            }
            if (scr_1_string.equals("4")) {
                System.out.println("Введите индекс для удаления");
                Scanner ind = new Scanner(System.in);
                Integer ind_string = ind.nextInt();
                s1.remove(FIO[ind_string]);
                FIO[ind_string] = "";
                level[ind_string ] = "";
                age[ind_string ] = "";
                subject[ind_string ] = "";
            }
            if (scr_1_string.equals("5")) {
                e=5;
            }
        }
    }
}

