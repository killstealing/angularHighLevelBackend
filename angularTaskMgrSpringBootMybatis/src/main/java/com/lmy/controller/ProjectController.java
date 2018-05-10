package com.lmy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmy.pojo.Project;
import com.lmy.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ProjectController {

	@Autowired
	ProjectService projectService;

	@RequestMapping("/projects")
	public List<Project> getProjects() {
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return projectService.getProjects();
	}
	
	@PostMapping("/project")
	public List<Project> doInsert(@RequestBody Project project){
		return projectService.doInsert(project);
	}
	
	@PutMapping("/project")
	public List<Project> doUpdate(@RequestBody Project project){
		return projectService.doUpdate(project);
	}
	
	@DeleteMapping("/project/{id}")
	public List<Project> doDel(@PathVariable int id){
		return projectService.doDel(id);
	}
}
