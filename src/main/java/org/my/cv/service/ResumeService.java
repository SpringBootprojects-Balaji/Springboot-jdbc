package org.my.cv.service;

import java.time.LocalDate;
import java.util.Date;

import org.my.cv.entities.PersonalData;
import org.my.cv.hana.entity.dao.ResumeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
//import org.my.cv.entities.PersonalData;
//import org.my.cv.hana.entity.dao.ResumeDao;
//import org.my.cv.hana.entity.dao.ResumeDaoImpl;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service("resumeservice")
public class ResumeService {
	
	@Autowired
	ResumeDaoImpl rdaoimpl;
	
	public void setHeader(ModelMap model) {
		PersonalData pd = rdaoimpl.getpersonaldata(1);
		model.put("heading", pd.getName());
		model.put("caption", "Enhance your online presence");
		model.put("description", pd.getDesc());
		model.put("address", Integer.toString(pd.getHousenumber()) + ' ' + 
				pd.getStreet() +','+pd.getCity() + ',' + pd.getCountry());
		model.put("email", pd.getEmail());
		model.put("phone", pd.getCountrycode() + ' ' + pd.getPhone());
	    LocalDate ld = LocalDate.parse(pd.getDob().toString());
		model.put("dateofbirth" ,ld.getDayOfMonth() + "th" + ' ' + 
				ld.getMonth().toString().toLowerCase() + ' ' +  
				ld.getYear());
	} 
	
	
	public void creategetmodel(ModelMap model) {
		
		setHeader(model);
		
	}
	
	public void createpostmodel(ModelMap model) {
	 	
	

	}
	
	
	
	

}
