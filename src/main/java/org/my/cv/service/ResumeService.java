package org.my.cv.service;

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
		
		model.put("heading", "Preethi Balaji");
		model.put("caption", "Enhance your online presence");
		
		
		PersonalData pd = rdaoimpl.getpersonaldata(1);
		System.out.println(pd.getName()); 
	} 
	
	
	public void createModel(ModelMap model) {
		
		setHeader(model);
		
	}
	
	

}
