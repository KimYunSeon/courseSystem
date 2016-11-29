package kr.ac.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.course.dao.SubjectDAO;
import kr.ac.course.model.Subject;

@Service
public class SubjectService {

	private SubjectDAO subjectDao;
	
	@Autowired
	public void setSubjectDao(SubjectDAO subjectDao) {
		this.subjectDao = subjectDao;
	}
	
	public List<Subject> getCurrent(int year, int semester){
		return subjectDao.getSubjects(year, semester);
	}
	
	public List<Subject> getCurrent2(){
		return subjectDao.getSubjects2();
	}
	
	public List<Subject> getCurrent3(){
		return subjectDao.getSubjects3();
	}

	public void insert(Subject subject) {
		
		subjectDao.insert(subject);
	}
}
