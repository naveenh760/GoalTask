package com.cerner.goalTask;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cerner.goalTask.model.GoalModel;
import com.cerner.goalTask.repository.*;

@Path("goals")
public class GoalResource {

	private GoalRepository goalRepository =new GoalRepositoryStub();
	
	
	@POST
	@Path("goal")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public GoalModel createGoal(GoalModel goal) {
		System.out.println(goal.getGoalId());
		System.out.println(goal.getGoalName());
		System.out.println(goal.getGoalDescription());
		goalRepository.addGoal(goal);
		return goal;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<GoalModel> getAllGoals(){
		return goalRepository.ViewAllGoals();
	}
	
}
