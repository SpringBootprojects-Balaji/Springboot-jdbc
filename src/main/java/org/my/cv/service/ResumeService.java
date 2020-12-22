package org.my.cv.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.my.cv.entities.EducationData;
import org.my.cv.entities.PersonalData;
import org.my.cv.entities.ReferenceData;
import org.my.cv.entities.ResumeData;
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
	
	public void setHero(ModelMap model) {
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
	
	public void setResume(ModelMap model) {
		List<ResumeData> pd = rdaoimpl.getResumedata(1);
		pd.stream().forEach((data) -> data.setCompany("MYONWNCOMPANY"));
		model.put("employeesdata", pd);
	}
	public void setEducation(ModelMap model) {
		
		List<EducationData> ed = rdaoimpl.getEducationData(1);
		model.put("educationdatalist", ed);
	}
	public void setReferences(ModelMap model) {
		
		List<ReferenceData> ref = rdaoimpl.getReferenceData(1);
		model.put("references", ref);
	}

	public void creategetmodel(ModelMap model) {
		
		setHero(model);
		setResume(model);
		setEducation(model);
		setReferences(model);
		
	}
	
	public void createpostmodel(ModelMap model) {
	 	
	

	}
	
	
	
	

}
