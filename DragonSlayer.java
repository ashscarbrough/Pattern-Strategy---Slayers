/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 9
 */

public class DragonSlayer
{
	private DragonSlayingStrategy strategy;	// strategy data member contains unique fighting strategy
	
	public DragonSlayer (DragonSlayingStrategy strategy)	// Constructor initializes strategy
	{
		this.strategy = strategy;
	}
	
	public void changeStrategy (DragonSlayingStrategy strategy)	// Change strategy type
	{
		this.strategy = strategy;
	}
	
	public void goToBattle()	// Executes the strategy overridden by DragonSlayingStrategy
	{
		strategy.execute();
	}
}
