package com.example.telegramapp;

import android.graphics.drawable.Drawable;

public class ChatModel {
    Drawable avatar;
    String chatName, lastMassage;
    boolean isRead;



    public ChatModel(Drawable avatar, String chatName, String lastMassage, boolean isRead ) {
        this.avatar = avatar;
        this.chatName = chatName;
        this.lastMassage = lastMassage;
        this.isRead = isRead;
    }
}
