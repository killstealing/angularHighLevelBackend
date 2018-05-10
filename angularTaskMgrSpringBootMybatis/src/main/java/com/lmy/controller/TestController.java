package com.lmy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmy.pojo.Project;

@RestController
@RequestMapping("/api")
public class TestController {

	@RequestMapping("/test")
	public Project getProjects() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//int id, String title, String descT, String image
		return new Project(1,"title","desc","image");
	}
}
