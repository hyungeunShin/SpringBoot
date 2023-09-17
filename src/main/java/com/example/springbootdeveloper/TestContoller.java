package com.example.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestContoller {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMember() {
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
