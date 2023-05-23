package com.example.devoir23_05_2023.converter;

import com.example.devoir23_05_2023.domaine.MoodEntry;
import com.example.devoir23_05_2023.domaine.User;
import com.example.devoir23_05_2023.dto.MoodEntryDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.management.modelmbean.ModelMBean;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MoodEntryConverter {
    @Autowired
    UserConverter userConverter;
    public MoodEntry convertMoodEntryDtoToMoodEntry(MoodEntryDto moodEntryDto){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(MoodEntryDto.class, MoodEntry.class).addMapping(MoodEntryDto::getUsers, MoodEntry::setUsers);
        return modelMapper.map(moodEntryDto, MoodEntry.class);
    }

    public MoodEntryDto convertMoodEntryToMoodEntryDto (MoodEntry moodEntry){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(MoodEntry.class, MoodEntryDto.class).addMapping(MoodEntry::getUsers, MoodEntryDto::setUsers);
        return modelMapper.map(moodEntry, MoodEntryDto.class);
    }
}
