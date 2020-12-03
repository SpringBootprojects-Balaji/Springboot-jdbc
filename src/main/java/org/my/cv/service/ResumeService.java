package org.my.cv.service;

//import org.my.cv.entities.PersonalData;
//import org.my.cv.hana.entity.dao.ResumeDao;
//import org.my.cv.hana.entity.dao.ResumeDaoImpl;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service("resumeservice")
public class ResumeService {
	
	public void setHeader(ModelMap model) {
		
		model.put("heading", "Preethi Balaji");
		model.put("caption", "Enhance your online presence");
		
		/*ResumeDaoImpl rdaoimpl =  new ResumeDaoImpl();
		PersonalData pd = rdaoimpl.getpersonaldata("Mary Albert");
		System.out.println(pd.getName()); */
	}
	
	
	public void createModel(ModelMap model) {
		
		setHeader(model);
		
	}
	
	

}
