package com.jdktomcat.web;

import com.jdktomcat.dto.User;
import com.jdktomcat.service.HelloService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RefactorHelloController implements HelloService {

	@Override
	public String hello(@RequestParam("name") String name) {
		return "Hello " + name;
	}

	@Override
	public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
		return new User(name, age);
	}

	@Override
	public String hello(@RequestBody User user) {
		return "Hello "+ user.getName() + ", " + user.getAge();
	}

}