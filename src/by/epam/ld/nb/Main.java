package by.epam.ld.nb;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NoteBook nb = new NoteBook();
        LocalDate date = LocalDate.now();

        Note note1 = new Note("Run", date);
        Note note2 = new Note("Eat", date);
        Note note3 = new Note("Work", date);
        Note note4 = new Note("Sleep", date);


        nb.add(note1);
        nb.add(note2);
        nb.add(note3);
        nb.add(note4);

        System.out.println(nb.toString()+"\n");

        Scanner sc_context = new Scanner(System.in);
        System.out.println("Find note by context:");
        String cntxt = sc_context.nextLine();
        System.out.println(nb.findByContext(cntxt));

        Scanner sc_date = new Scanner(System.in);
        System.out.println("Find note by date, please, fill in according to type: yyyy-mm-dd");
        String dt = sc_date.nextLine();
        LocalDate localDate = LocalDate.parse(dt);

        System.out.println(nb.findByDate(localDate));
    }
}
