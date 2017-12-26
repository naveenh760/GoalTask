package com.cerner.goalTask.repository;

import java.util.List;
import java.util.ArrayList;

import com.cerner.goalTask.model.GoalModel;

public class GoalRepositoryStub implements GoalRepository {

	@Override
	public List<GoalModel> ViewAllGoals() {
		List<GoalModel> goals =new ArrayList<GoalModel>();
		
		GoalModel goal1= new GoalModel();
		goal1.setGoalId(1000);
		goal1.setGoalName("Career improvement");
		goal1.setGoalDescription("Learn technologies");
		goals.add(goal1);
		
		GoalModel goal2= new GoalModel();
		goal2.setGoalId(1001);
		goal2.setGoalName("Stay healthy");
		goal2.setGoalDescription("Fitness improvement");
		goals.add(goal2);
		
		
		return goals;
	}

	@Override
	public void addGoal(GoalModel goal) {
		
		
	}

	
}
