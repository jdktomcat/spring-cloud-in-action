package com.jdktomcat.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author Administrator
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

}