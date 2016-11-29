package kr.ac.course.dao;

//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.course.model.Subject;

@Repository
public class SubjectDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from yunseon_course";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public Subject getSubject(String code) {
		String sqlStatement = "select * from offers where code=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { code }, new SubjectMapper());
	}

	public List<Subject> getSubjects(int year, int semester) {

		String sqlStatement = "select * from yunseon_course where year = ? && semester = ?";

		return jdbcTemplateObject.query(sqlStatement, new Object[]{year, semester}, new SubjectMapper());

	}
	
	public List<Subject> getSubjects2() {

		String sqlStatement = "select * from yunseon_course";
		return jdbcTemplateObject.query(sqlStatement, new SubjectMapper());

	}
	
	public List<Subject> getSubjects3() {

		String sqlStatement = "select * from yunseon_course where year = 2017 && semester = 1";
		return jdbcTemplateObject.query(sqlStatement, new SubjectMapper());

	}

	public boolean insert(Subject subject) {

		int year = subject.getYear();
		int semester = subject.getSemester();
		String code = subject.getCode();
		String name = subject.getName();
		String type = subject.getType();
		int credit = subject.getCredit();

		String sqlStatement = "insert into yunseon_course (year, semester, code, name, type, credit) values (?, ?, ?, ?, ?, ?)";
		return (jdbcTemplateObject.update(sqlStatement,
				new Object[] { year, semester, code, name, type, credit }) == 1);

	}

}
