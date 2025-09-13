package com.moodiematchmaker.service;

import com.moodiematchmaker.domain.ExcitedMood;
import com.moodiematchmaker.domain.HappyMood;
import com.moodiematchmaker.domain.Mood;
import com.moodiematchmaker.domain.SadMood;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MoodieMatchmakerService {
    private final List<Mood> moods;
    public MoodieMatchmakerService(){
        moods=initializeMoods();

    }

    public Optional<Mood> findByInput(String input) {
        return moods.stream()
                .filter(mood -> mood.equals(input))
                .findFirst();
    }

    private List<Mood>   initializeMoods(){
        return Arrays.asList(
                new HappyMood(),
                new SadMood(),
                new ExcitedMood());

    }
}
