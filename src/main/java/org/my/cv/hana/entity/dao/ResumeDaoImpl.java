package org.my.cv.hana.entity.dao;

import org.my.cv.entities.PersonalData;
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
		
		  String sql =
		  "SELECT personid, personname, decription,dateofbirth,housenumber,street,city,country,email,phone,countrycode FROM public.GENERAL_INFO WHERE personid = ?";
		
		  return jdbcTemplate.queryForObject(
				  sql, new Object[]{id},
	                (rs, rowNum) -> 
				  new PersonalData(rs.getInt("personid"), rs.getString("personname"), 
						  rs.getString("decription"),
						  rs.getDate("dateofbirth"),
						  rs.getInt("housenumber"),
						  rs.getString("street"),
						  rs.getString("city"),
						  rs.getString("country"),
						  rs.getString("email"),
						  rs.getString("phone"),
						  rs.getString("countrycode")) 
	          );	 

	}  

}
