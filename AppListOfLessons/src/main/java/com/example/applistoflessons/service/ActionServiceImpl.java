package com.example.applistoflessons.service;

import com.example.applistoflessons.entity.Actions;
import com.example.applistoflessons.repository.ActionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ActionServiceImpl implements ActionsService {
    private final ActionsRepository actionsRepository;

    @Autowired
    public ActionServiceImpl(ActionsRepository actionsRepository) {
        this.actionsRepository = actionsRepository;
    }

    @Override
    public Actions saveAction(LocalDateTime date_actions, String action) {

        Actions actions = new Actions(date_actions,  action);
        return  actionsRepository.save(actions);
    }
}