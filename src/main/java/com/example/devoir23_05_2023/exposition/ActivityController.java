package com.example.devoir23_05_2023.exposition;

import com.example.devoir23_05_2023.Application.IActivityService;
import com.example.devoir23_05_2023.converter.ActivityConverter;
import com.example.devoir23_05_2023.domaine.Activity;
import com.example.devoir23_05_2023.dto.ActivityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/activities")
public class ActivityController {
    @Autowired
    IActivityService iActivityService;
    @Autowired
    ActivityConverter activityConverter;

    @PostMapping
    public void create (@RequestBody ActivityDto activityDto){
        Activity activity = activityConverter.convertActivityDtoToActivity(activityDto);
        iActivityService.create(activity);
    }

    @GetMapping("/{id}")
    public ActivityDto readById(@PathVariable("id") Long id){
        Activity activity = iActivityService.readById(id);
        return activityConverter.convertActivityToActivityDto(activity);
    }
}
