import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {

@Test
    public void shouldCorrectValueOfMembersAfterFilter(){
    // given
    List<User> expectedUsers = new ArrayList<>();
    expectedUsers.add(new User("Walter White", 50,7,"Chemists"));
    expectedUsers.add(new User("Gale Boetticher", 44, 2, "Chemists"));


    // when
    List <String> result = UsersManager.filterChemistGroupUsernames();

    // then
    assertEquals(expectedUsers.size(),result.size());



}

@Test
    public void shouldReturnListOfUsersOlderAndEqualFifty(){
    // given
    int expectedAge = 50;

    // wgen
    List<User> result = UsersManager.filterUsersOlderThan(expectedAge);
    int value = result.size();

    //then

    for (User user: result){
        int age = user.getAge();
        assertTrue(age >= expectedAge);
    }

}

}


