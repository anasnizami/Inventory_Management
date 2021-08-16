package edu.neu.Strategy;

import edu.neu.API.StrategyAPI;

public class StrategyTrigger {

	private StrategyAPI strategy;

	public StrategyTrigger(StrategyAPI strategy) {
		this.strategy = strategy;
	}
	
	public void executeStrategy() {
		strategy.operation();
	}
	
}
