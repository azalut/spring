package com.maciej.logic;

import com.maciej.dto.User;
import org.springframework.stereotype.Service;

@Service
public class SthService {
    public String serviceGetString(){
        return "String z metody service";
    }

    public User returnSomeUser(){
        return new User("Maciej", "Tulaza", 12);
    }
}
