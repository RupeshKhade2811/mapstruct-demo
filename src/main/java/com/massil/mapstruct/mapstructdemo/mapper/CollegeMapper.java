package com.massil.mapstruct.mapstructdemo.mapper;

import com.massil.mapstruct.mapstructdemo.dto.CollegeDto;
import com.massil.mapstruct.mapstructdemo.dto.StudentDto;
import com.massil.mapstruct.mapstructdemo.model.College;
import com.massil.mapstruct.mapstructdemo.model.Student;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CollegeMapper {

    @Mapping(target = "collegeId",source = "id")
    CollegeDto toCollegeDto(College college);
    List<CollegeDto> toCollegeDtoList(List<College> collegeList);
    @InheritInverseConfiguration
    College toCollege(CollegeDto collegeDto);
    List<College> toCollegeList(List<CollegeDto> collegeDtoList);
}
