package com.example.devoir23_05_2023.infrastructure;

import com.example.devoir23_05_2023.domaine.MoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMoodEntryRepository extends JpaRepository<MoodEntry, Long> {
}
