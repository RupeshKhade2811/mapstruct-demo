package com.massil.mapstruct.mapstructdemo.services;

import com.massil.mapstruct.mapstructdemo.dto.CollegeDto;
import com.massil.mapstruct.mapstructdemo.mapper.CollegeMapper;
import com.massil.mapstruct.mapstructdemo.model.College;
import com.massil.mapstruct.mapstructdemo.repository.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CollegeServiceImpl implements CollegeService{

    @Autowired
    private CollegeMapper collegeMapper;
    @Autowired
    private CollegeRepo collegeRepo;
    @Override
    public void addCollege(CollegeDto college) {
        College college1 = collegeMapper.toCollege(college);
        collegeRepo.save(college1);

    }

    @Override
    public int removeCollege(UUID collegeId) {
        Optional<College> college = collegeRepo.findById(collegeId);
        if(college.isPresent()){
            collegeRepo.delete(college.get());
            return 1;
        }

        return 0;
    }

    @Override
    public List<CollegeDto> getCollegeList() {

        List<College> collegeRepoAll = collegeRepo.findAll();
        List<CollegeDto> collegeDtoList = collegeMapper.toCollegeDtoList(collegeRepoAll);
        return collegeDtoList;
    }
}
