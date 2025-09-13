package com.moodiematchmaker.domain;

public class MoodieCard {
    private String color;
    private String emoji;
    private String message;

    public MoodieCard(String color, String emoji, String message) {
        this.color = color;
        this.emoji = emoji;
        this.message = message;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void showCard() {
        System.out.println(this.color + " " + this.emoji + " " + this.message);
    }
}
