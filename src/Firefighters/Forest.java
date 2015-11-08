package Firefighters;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;

public class Forest {

	private int state;
	
	public Forest(Context context, Grid grid, int x, int y) {
		context.add(this);
		grid.moveTo(this, x, y);
	}
	
	@ScheduledMethod(start = 1, interval = 1)
	public void step() {
		
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
