package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskToDo {

    public static List<Task> getTasks() {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Formatowanie komputera", LocalDate.of(2022, 9, 1), LocalDate.of(2022, 12, 5)));
        taskList.add(new Task("Sprzedaż laptopa", LocalDate.of(2022,9,5), LocalDate.of(2022,12,20)));
        taskList.add(new Task("Kupno PC", LocalDate.of(2022,9,2), LocalDate.of(202,12,10)));
        return taskList;
    }
}



///ublic static LocalDate of(int year,
//                           int month,
//                           int dayOfMonth)