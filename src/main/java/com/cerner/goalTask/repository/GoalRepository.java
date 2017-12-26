package com.cerner.goalTask.repository;

import java.util.List;
import com.cerner.goalTask.model.*;

public interface GoalRepository {
	
 List<GoalModel> ViewAllGoals();
 
 public void addGoal(GoalModel goal);
}