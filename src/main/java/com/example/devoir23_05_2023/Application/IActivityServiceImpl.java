package com.example.devoir23_05_2023.Application;

import com.example.devoir23_05_2023.domaine.Activity;
import com.example.devoir23_05_2023.infrastructure.IActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IActivityServiceImpl implements IActivityService{
    @Autowired
    IActivityRepository iActivityRepository;
    @Override
    public void create(Activity activity) {
        iActivityRepository.save(activity);
    }

    @Override
    public Activity readById(Long id) {
        Optional<Activity> activityOptional = iActivityRepository.findById(id);
        return activityOptional.isPresent() ? activityOptional.get():null;
    }
}
