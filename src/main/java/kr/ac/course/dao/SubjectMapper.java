package kr.ac.course.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.course.model.Subject;

public class SubjectMapper implements RowMapper<Subject>{

		public Subject mapRow(ResultSet rs, int rowNum) throws SQLException{
			
			Subject subject = new Subject();
			
			subject.setYear(rs.getInt("year"));
			subject.setSemester(rs.getInt("semester"));
			subject.setCode(rs.getString("code"));
			subject.setName(rs.getString("name"));
			subject.setType(rs.getString("type"));
			subject.setCredit(rs.getInt("credit"));
			
			return subject;
		}
	
}
