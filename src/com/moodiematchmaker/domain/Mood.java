package com.moodiematchmaker.domain;

import java.util.Objects;

public abstract class Mood {
    protected final String name;
    protected final String emoji;
    protected final String color;
    protected final String message;

    protected Mood(String name, String emoji, String color, String message) {
        this.name = Objects.requireNonNull(name, "Mood name can not be null");
        this.emoji = Objects.requireNonNull(emoji,  "Emoji can not be null");
        this.color = Objects.requireNonNull(color,  "Color can not be null");
        this.message = Objects.requireNonNull(message,  "Message can not be null");
    }

    public final  boolean equals (String input){
        return this.name.equalsIgnoreCase(input);
    }

    public  MoodieCard createCard(){
        return new MoodieCard(color,emoji,message);
    }

}
