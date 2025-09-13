package com.moodiematchmaker;


import com.moodiematchmaker.domain.HappyMood;
import com.moodiematchmaker.domain.Mood;
import com.moodiematchmaker.domain.MoodieCard;
import com.moodiematchmaker.service.MoodieMatchmakerService;

import java.util.Scanner;

public class Main {
    private static final MoodieMatchmakerService service = new MoodieMatchmakerService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter mood of client ");
        String moodInput = scanner.nextLine();
        Mood mood = service.findByInput(moodInput).get();
        mood.createCard().showCard();
    }

}
