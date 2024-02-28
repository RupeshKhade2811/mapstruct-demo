package com.massil.mapstruct.mapstructdemo.controller;

import com.massil.mapstruct.mapstructdemo.dto.CollegeDto;
import com.massil.mapstruct.mapstructdemo.dto.Response;
import com.massil.mapstruct.mapstructdemo.services.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @GetMapping("/getallcolleges")
    public List<CollegeDto> getAll(){
        return collegeService.getCollegeList();
    }

    @PostMapping("addcollege")
    public Response addCollege(@RequestBody CollegeDto collegeDto){

        collegeService.addCollege(collegeDto);
        return new Response(HttpStatus.OK.value(), "Saved",true);

    }

}
