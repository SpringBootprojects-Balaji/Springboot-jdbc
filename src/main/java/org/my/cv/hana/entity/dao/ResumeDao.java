package org.my.cv.hana.entity.dao;

import java.util.List;
import java.util.Map;

import org.my.cv.entities.EducationData;
import org.my.cv.entities.PersonalData;
import org.my.cv.entities.ReferenceData;
import org.my.cv.entities.WorkExperienceData;

public interface ResumeDao {
	
	 public PersonalData getpersonaldata(int id);
	 public List<WorkExperienceData> getResumedata(int id);
	 public List<EducationData> getEducationData(int id);
	 public List<ReferenceData> getReferenceData(int id);

}
