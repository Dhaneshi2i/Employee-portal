/*
 * <p>
 *   Copyright (c) All rights reserved
 * </p>
 */

package com.ideas2it.employee.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

/**
 * <p>
 *   Implmented to contain Trainer attributes 
 * </p>
 *
 * <p>  
 *   This file is created on 27/07/2022
 *   @author : Dhanesh Kumar
 * </p>
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "get_all_trainers",
                query = "from Trainer where isActiveEmployee = :isActiveEmployee"),
    @NamedQuery(name = "get_trainer_by_id",
                query = "from Trainer where isActiveEmployee = :isActiveEmployee AND id = :id") })
public class Trainer extends Employee {

    @Id
    @GeneratedValue
    private int trainerId;

    private byte projectsWorked;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,mappedBy = "trainers")
    private List<Trainee> trainees;

    public void setTrainee(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    public List<Trainee> getTrainee() {
        return trainees;
    }

    public void setProjectsWorked(byte projectsWorked) {
	this.projectsWorked = projectsWorked;
    }

    public byte getProjectsWorked() {
	return projectsWorked;
    } 

}