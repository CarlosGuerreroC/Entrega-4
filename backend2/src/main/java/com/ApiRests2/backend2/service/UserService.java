package com.ApiRests2.backend2.service;

import com.ApiRests2.backend2.models.User;
import com.ApiRests2.backend2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {

    private static final Logger logger = Logger.getLogger(UserService.class.getName());

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        User newUser = userRepository.save(user);
        logger.info("Usuario creado: "+ newUser);
        return newUser;
    }

    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            User updatUser = userRepository.save(user);
            logger.info("Usuario actualizado: "+ updatUser);
            return updatUser;
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
        logger.info("El usuario y el Id fueron eliminados: "+ id);
    }
    
}
