package org.example.sevices;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService {
    private User user;

    private List<User> userList;

    private static final String USERS_PATH="app/src/main/java/org/example/localDb/users.json";
    private ObjectMapper objectMapper = new ObjectMapper();

    //User -> app -> login (user logged in to app)
    //|                                         |
    //-> BookTicket            The constructor<-|
    //                         is called once logged in
    //                         , object is passed and all
    //                         details can be fetched, etc. i.e. CRUD
    public UserBookingService(User user) throws IOException
    {
        this.user = user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }
}
