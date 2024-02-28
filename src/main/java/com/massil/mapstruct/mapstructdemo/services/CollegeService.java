package com.massil.mapstruct.mapstructdemo.services;

import com.massil.mapstruct.mapstructdemo.dto.CollegeDto;
import com.massil.mapstruct.mapstructdemo.model.College;

import java.util.List;
import java.util.UUID;

public interface CollegeService {
     void addCollege(CollegeDto college);
     int removeCollege(UUID collegeId);
     List<CollegeDto> getCollegeList();
}
