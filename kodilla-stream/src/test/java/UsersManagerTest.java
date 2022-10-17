import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

@Test
    public void ShouldCorrectReturnUsername(){

    //given

            UsersRepository.getUsersList();

    List<User> expectedUsers = new ArrayList<>();
    expectedUsers.add(new User("Walter White", 50,7,"Chemists"));
    expectedUsers.add(new User("Jesse Pinkman", 25, 4648, "Sales"));
    expectedUsers.add(new User("Tuco Salamanca", 34, 116, "Manager"));
    expectedUsers.add(new User("Gus Fring", 49, 0, "Board"));
    expectedUsers.add(new User("Gale Boetticher", 44, 2, "Chemists"));
    expectedUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

//when ???


    // then ???

}

}


