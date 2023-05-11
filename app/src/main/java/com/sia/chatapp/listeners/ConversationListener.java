package com.sia.chatapp.listeners;

import com.sia.chatapp.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
