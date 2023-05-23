package com.example.devoir23_05_2023.exposition;

import com.example.devoir23_05_2023.Application.IMoodEntryService;
import com.example.devoir23_05_2023.converter.MoodEntryConverter;
import com.example.devoir23_05_2023.converter.UserConverter;
import com.example.devoir23_05_2023.domaine.MoodEntry;
import com.example.devoir23_05_2023.domaine.User;
import com.example.devoir23_05_2023.dto.MoodEntryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/moods")
public class MoodEntryController {
    @Autowired
    IMoodEntryService iMoodEntryService;

    @Autowired
    MoodEntryConverter moodEntryConverter;
    @Autowired
    UserConverter userConverter;

    @PostMapping
    public void create(@RequestBody MoodEntryDto moodEntryDto){
        MoodEntry moodEntry = moodEntryConverter.convertMoodEntryDtoToMoodEntry(moodEntryDto);
        iMoodEntryService.create(moodEntry);
    }

    @GetMapping("/{id}")
    public MoodEntryDto readById(@PathVariable("id") Long id){
        MoodEntry moodEntry = iMoodEntryService.readById(id);
        return moodEntryConverter.convertMoodEntryToMoodEntryDto(moodEntry);
    }
}
