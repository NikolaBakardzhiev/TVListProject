package com.example.tvProject.service;

import com.example.tvProject.models.entities.UserModel;
import com.example.tvProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UserRepository userRepository;

    public UserModel registerUser(String radioOrTv, String name, String site,
                                  String logo, String frame, String specifications,
                                  String streamLocation){
        if (radioOrTv == null || name == null || streamLocation == null){
            return null;
        } else {
            UserModel userModel = new UserModel();
            userModel.setRadioOrTv(radioOrTv);
            userModel.setName(name);
            userModel.setSite(site);
            userModel.setLogo(logo);
            userModel.setFrame(frame);
            userModel.setSpecifications(specifications);
            userModel.setStreamLocation(streamLocation);
            return userRepository.save(userModel);
        }


    }
    public UserModel authenticate(String name, String radioOrTv) {
        return userRepository.findByNameAndRadioOrTv(name, radioOrTv).orElse(null);
    }

}

