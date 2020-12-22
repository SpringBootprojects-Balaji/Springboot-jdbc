package org.my.cv.hana.entity.dao;

import java.util.LinkedList;
import java.util.List;

import org.my.cv.entities.EducationData;
import org.my.cv.entities.PersonalData;
import org.my.cv.entities.ReferenceData;
import org.my.cv.entities.ResumeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/*import org.my.cv.rowmappers.CustomerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;*/

@Repository
public class ResumeDaoImpl implements ResumeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public PersonalData getpersonaldata(int id) {

		String sql = "SELECT personid, personname, decription,dateofbirth,housenumber,street,city,country,email,phone,countrycode FROM public.GENERAL_INFO WHERE personid = ?";

		return jdbcTemplate.queryForObject(sql, new Object[] { id },
				(rs, rowNum) -> new PersonalData(rs.getInt("personid"), rs.getString("personname"),
						rs.getString("decription"), rs.getDate("dateofbirth"), rs.getInt("housenumber"),
						rs.getString("street"), rs.getString("city"), rs.getString("country"), rs.getString("email"),
						rs.getString("phone"), rs.getString("countrycode")));

	}

	@Override
	public List<ResumeData> getResumedata(int id) {

		List<ResumeData> workexp = new LinkedList<ResumeData>();
		// TODO Auto-generated method stub
		String sql = "SELECT personid, companyname, role, duration, \"Description\" FROM public.work_experience WHERE personid = " + id;

		return jdbcTemplate.query(sql,(rs, rowNum) ->

		new ResumeData(rs.getString("duration"), rs.getString("Description"), rs.getString("companyname"),
				rs.getString("role"))

		);
		
	
	}
	
	@Override
	public List<EducationData> getEducationData(int id) {

		List<ResumeData> workexp = new LinkedList<ResumeData>();
		// TODO Auto-generated method stub
		String sql = "SELECT personid, year , course, college, description  FROM public.education WHERE personid = " + id;

		return jdbcTemplate.query(sql,(rs, rowNum) ->

		new EducationData(rs.getString("year"), rs.getString("course"), rs.getString("college"),
				rs.getString("description"))

		);
	}

	@Override
	public List<ReferenceData> getReferenceData(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT refid, personid, description , customer, role, company  FROM public.references WHERE personid = " + id;

		return jdbcTemplate.query(sql,(rs, rowNum) ->
		
		new ReferenceData(rs.getString("description"), rs.getString("customer"), rs.getString("role"), rs.getString("company"))
		);
	}

}
