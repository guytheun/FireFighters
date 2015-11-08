package Firefighters;

import repast.simphony.context.Context;
import repast.simphony.context.space.grid.GridFactory;
import repast.simphony.context.space.grid.GridFactoryFinder;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridBuilderParameters;
import repast.simphony.space.grid.RandomGridAdder;
import repast.simphony.space.grid.SimpleGridAdder;
import repast.simphony.space.grid.StrictBorders;
import repast.simphony.valueLayer.GridValueLayer;

public class Builder implements ContextBuilder<Object> {	
	
	private static int xdim = 30;
	private static int ydim = 30;
	
	@Override
	public Context build(Context<Object> context) {
		
		// define identification
		context.setId("Firefighters");
		
		// create grid
		GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);
		Grid<Object> grid = gridFactory.createGrid("grid", context, 
				new GridBuilderParameters<Object>(new StrictBorders(), 
						new RandomGridAdder<Object>(), true, xdim, ydim));
		
		// get forest size parameter
		Parameters param = RunEnvironment.getInstance().getParameters();
		int forest_size = (Integer)param.getValue("Forest Size");
		
		// create forest patches
		for (int i=0; i<Math.sqrt(forest_size); i++){
			for (int j=0; j<Math.sqrt(forest_size); j++){
				new Forest(context, grid, i, j);
			}
		}
		
		
		
		
		
		
		
		
		return context;
		
	}

}
