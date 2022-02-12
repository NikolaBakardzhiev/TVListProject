package com.example.tvProject.web;

import com.example.tvProject.models.entities.UserModel;
import com.example.tvProject.service.UsersService;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Demo {

    private final UsersService usersService;

    public Demo(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping("/import")
    public String getImportPage(Model model){
        return "import";
    }

    @GetMapping("/mainPage")
    public String getMainPage(Model model){
        model.addAttribute("enteringRequest", new UserModel());
        return "mainPage";
    }

    @PostMapping("/mainPage")
    public String importation (@ModelAttribute UserModel userModel, Model model) {
        UserModel authenticated = null;
        try {
            authenticated = usersService.authenticate(userModel.getName(), userModel.getRadioOrTv());
        } catch (IncorrectResultSizeDataAccessException exc) {
            return "dataAlreadyExists";
        } catch (Exception exc) {
            return "Error";
        }
        if(authenticated != null) {
            model.addAttribute("userEntering", "You've been registered successfully");
            return "mainPage";
        } else {
            return "Error";
        }
    }
}
