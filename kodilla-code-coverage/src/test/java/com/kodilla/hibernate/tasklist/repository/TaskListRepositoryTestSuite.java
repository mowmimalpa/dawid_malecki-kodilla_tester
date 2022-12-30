package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
 class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "Tasks to be performed";
    private static final String DESCRIPTION = "Tasks to be done this week";

    @Test
     void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(listName);

        //Then
        assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}

///W sekcji //Giventworzymy obiekt task, którego wartość pola duration wynosi 7.
// Zapisujemy go w bazie danych i zapamiętujemy, ile wynosi.
//W sekcji //When wywołujemy testowaną metodę – czyli metodę findByDuration(int duration).
//Następnie, w sekcji //Then sprawdzamy, czy zwrócony został dokładnie jeden rekord.
//Ostatecznie, w sekcji //CleanUp sprzątamy po testach, czyli usuwamy dodany rekord.
