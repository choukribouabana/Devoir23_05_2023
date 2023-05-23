package com.example.devoir23_05_2023.Application;

import com.example.devoir23_05_2023.domaine.MoodEntry;

public interface IMoodEntryService {
    void create (MoodEntry moodEntry);
    MoodEntry readById(Long id);
}
