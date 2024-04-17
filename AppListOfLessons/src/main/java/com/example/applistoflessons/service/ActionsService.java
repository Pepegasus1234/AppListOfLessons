package com.example.applistoflessons.service;

import com.example.applistoflessons.entity.Actions;

import java.time.LocalDateTime;

public interface ActionsService {
    Actions saveAction(LocalDateTime date_actions, String description);
}