/*
 * <p>
 *   Copyright (c) All rights reserved
 * </p>
 */

package com.ideas2it.employee.dto;

import java.util.List;

/**
 * <p>
 *   Implmented to contain TrainerDto attributes 
 * </p>
 *
 * <p>  
 *   This file is created on 27/07/2022
 *   @author : Dhanesh Kumar
 * </p>
 */

public class TrainerDto extends EmployeeDto {

    private int trainerId;
    private byte projectsWorked;
    private List<TraineeDto> trainees;

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setProjectsWorked(byte projectsWorked) {
	this.projectsWorked = projectsWorked;
    }

    public byte getProjectsWorked() {
	return projectsWorked;
    } 

    public void setTrainee(List<TraineeDto> trainees) {
        this.trainees = trainees;
    }

    public List<TraineeDto> getTrainee() {
        return trainees;
    }

    public String toString() {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(super.toString())
                     .append("\nProjects worked: ")
		     .append(this.getProjectsWorked());

	return stringBuilder.toString();
    }
}