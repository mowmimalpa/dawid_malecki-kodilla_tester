package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Następnie w klasie UsersManager stwórz metodę statyczną wykorzystującą Stream,
// która będzie zwracała kolekcję elementów typu User.
// Metoda ma przyjmować argument typu int i zwrócić
// użytkowników starszych od podanej liczby w argumencie metody.
// Napisz testy sprawdzające czy wszystkie zwrócone elementy posiadają
// wiek większy od podanej wartości.
//}
 // lambda (a, b) -> {
//        int c = (a + b) / 2;
//        return c;

public class UsersManager {
    public static void main(String[] args) {
        List<String> declaredAge = filterDeclaredAgeUsernames();
        System.out.println(declaredAge);
    }

    private static List<String> filterDeclaredAgeUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getAge() < 50)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }


//    private boolean correct;
//
//    public boolean isCorrect() {
//        return correct;
//    }

    public static List<User> findDeclaredAge() {
        List <User> declaredAgeToWork = new ArrayList<>();
        for(User user : UsersRepository.getUsersList()) {
            if(user.getAge()<50) {
                declaredAgeToWork.add(user);
            }
        }
        if(declaredAgeToWork.size() >50) {
            System.out.println("Za młody do pracy;");
        }
        return declaredAgeToWork;
    }
}








