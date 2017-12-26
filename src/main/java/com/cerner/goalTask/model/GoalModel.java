package com.cerner.goalTask.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"goalId","goalName","goalDescription"})

public class GoalModel {
	private int goalId;
	private String goalName;
	private String goalDescription;
	
	@XmlElement(name="id")
	public int getGoalId() {
		return goalId;
	}
	
	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}
	
	@XmlElement(name="name")
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	
	@XmlElement(name="description")
	public String getGoalDescription() {
		return goalDescription;
	}
	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}

}
