package com.example.devoir23_05_2023.converter;

import com.example.devoir23_05_2023.domaine.Activity;
import com.example.devoir23_05_2023.dto.ActivityDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ActivityConverter {
    public Activity convertActivityDtoToActivity(ActivityDto activityDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(activityDto, Activity.class);
    }
    public ActivityDto convertActivityToActivityDto(Activity activity){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(activity, ActivityDto.class);
    }
}
