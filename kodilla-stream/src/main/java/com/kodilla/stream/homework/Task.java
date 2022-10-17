package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {

        String name;
        LocalDate opened;
        LocalDate deadline;
        public Task(String name, LocalDate opened, LocalDate deadline) {
            this.name = name;
            this.opened = opened;
            this.deadline = deadline;
        }
        public String getName() {
            return name;
        }
        public LocalDate getOpened() {
            return opened;
        }


        public LocalDate getDeadline() {
            return deadline;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Task task = (Task) o;
            return getName().equals(task.getName()) &&
                    getOpened().equals(task.getOpened()) &&
                    getDeadline().equals(task.getDeadline());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getOpened(), getDeadline());
        }
    }

