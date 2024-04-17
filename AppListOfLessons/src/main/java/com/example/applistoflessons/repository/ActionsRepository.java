package com.example.applistoflessons.repository;

import com.example.applistoflessons.entity.Actions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionsRepository extends JpaRepository<Actions, Long> {

}