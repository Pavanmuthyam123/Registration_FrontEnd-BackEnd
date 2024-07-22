package com.marisarla.ffrontEnd.Service;

import com.marisarla.ffrontEnd.model.User;
import com.marisarla.ffrontEnd.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

}