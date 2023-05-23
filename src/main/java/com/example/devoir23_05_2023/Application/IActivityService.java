package com.example.devoir23_05_2023.Application;

import com.example.devoir23_05_2023.domaine.Activity;

public interface IActivityService {
    void create(Activity activity);
    Activity readById(Long id);
}
