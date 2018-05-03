package com.lmy.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmy.mapper.ProjectMapper;
import com.lmy.pojo.Project;

@Service
public class ProjectService {

	@Autowired
	ProjectMapper projectMapper;

	public List<Project> getProjects() {
		return projectMapper.getProjects();
	}
	
	public List<Project> doInsert(Project project){
		int result=projectMapper.doInsert(project);
		if(result>0){
			return projectMapper.getProjects();
		}
		return null;
	}
	
	public List<Project> doUpdate(Project project){
		int result=projectMapper.doUpdate(project);
		if(result>0){
			return projectMapper.getProjects();
		}
		return null;
	}
	
	public List<Project> doDel(int id){
		int result=projectMapper.doDel(id);
		if(result>0){
			return projectMapper.getProjects();
		}
		return null;
	}
}
