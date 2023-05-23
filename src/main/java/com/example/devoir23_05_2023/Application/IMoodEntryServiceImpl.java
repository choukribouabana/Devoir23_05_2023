package com.example.devoir23_05_2023.Application;

import com.example.devoir23_05_2023.domaine.MoodEntry;
import com.example.devoir23_05_2023.infrastructure.IMoodEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IMoodEntryServiceImpl implements IMoodEntryService{
    @Autowired
    IMoodEntryRepository iMoodEntryRepository;
    @Override
    public void create(MoodEntry moodEntry) {
        iMoodEntryRepository.save(moodEntry);
    }

    @Override
    public MoodEntry readById(Long id) {
        Optional<MoodEntry> moodEntryOptional = iMoodEntryRepository.findById(id);
        return moodEntryOptional.isPresent() ? moodEntryOptional.get(): null;
    }
}
