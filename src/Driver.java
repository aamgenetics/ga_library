/**
 * Driver.java
 * @author christopherwaldon
 * @version 0.01
 * 
 * Runs a genetic algorithm.
*/

public abstract class Driver {
	
	private Population pop;
	private Crossover cross;
	private Mutation mute;
	private double mRate; // the mutation rate
	private UserInterface ui;
	
	//TODO: Insert statistics variables of some sort?
	
	/*
	 * MAIN
	 */
	public static void main(String[] args) {
		//TODO: Implement a basic test of creating different kinds of objects in the library
	}
	
	/**
	 * Creates a driver that will use the input as the elements for its genetic algorithm
	 * @param population The population of data that the program will run on
	 * @param crossover The specific crossover implementation that will recombine two PopMembers
	 * @param mutation A function object that will slightly alter a PopMember
	 * @param mutationRate the percent chance, as a double, of a mutation occurring
	 */
	public Driver(Population population, Crossover crossover, Mutation mutation, double mutationRate) {
		// Initialize fields
		pop = population;
		cross = crossover;
		mute = mutation;
		mRate = mutationRate;
		
		// TODO: any other initialization work
	}
	
	/**
	 * Creates an empty driver for progressive initialization using the getter/setter methods
	 */
	public Driver() {
		// TODO: Something here
	}
	
	/**
	 * Generates a double value for how desirable the solution contained within a given Genotype
	 * is. This value is for comparison purposes with other Genotype objects within the same population
	 * @param genotype
	 * @return a fitness value
	 */
	public abstract double evaluateFitness(Genome genotype);
	
	/**
	 * I don't remember why this method exists
	 */
	public abstract void setup();
	
	/**
	 * This method begins the execution of the genetic algorithm
	 */
	public abstract void run();
	
	/**
	 * Returns a random array of parents of size numParents
	 * @param numParents the number of parents to include in the returned array
	 * @return a random array of PopMembers from the population of size numParents
	 */
	public abstract PopMember[] selectParents(int numParents);
	
	/**
	 * Crosses the Genotypes contained within the parameter array and adds the child/children
	 * (depending upon what crossover is being employed) to the population
	 */
	public abstract void cross(PopMember[] parents);
	
	/**
	 * Checks whether the stopping criteria for this algorithm has been met
	 * @return true if the algorithm should stop, false otherwise
	 */
	public abstract boolean stopCriteriaMet();
	
	/*
	 * OUTPUT
	 */
	
	/**
	 * Outputs the current score of the best solution
	 * @param score
	 */
	public void display(double score) {
		ui.displayScore(pop.getBest().getFitness());
	}
	
	/**
	 * Displays information about the current progress of the algorithm
	 * @param status
	 */
	public void display(String status) {
		//TODO: Implement
	}
	
	/**
	 * Displays a given solution, normally used to display the best solution
	 * currently found.
	 * @param soln
	 */
	public void display(Genome soln) {
		ui.displaySolution(soln);
	}
	
	/**
	 * Displays all current, useful information about program status
	 * @param score
	 * @param status
	 * @param soln
	 */
	public void display(double score, String status, Genome soln) {
		display(score);
		display(status);
		display(soln);
	}
	
	/*
	 * GETTER AND SETTER METHODS
	 */
	
	/**
	 * @return the population
	 */
	public Population getPop() {
		return pop; 
	}

	/**
	 * @param pop the population to set
	 */
	public void setPop(Population pop) {
		this.pop = pop; 
	}

	/**
	 * @return the crossover
	 */
	public Crossover getCross() {
		return cross;
	}

	/**
	 * @param cross the crossover to set
	 */
	public void setCross(Crossover cross) {
		this.cross = cross;
	}

	/**
	 * @return the mutation object
	 */
	public Mutation getMute() {
		return mute;
	}

	/**
	 * @param mute the mutation object to set
	 */
	public void setMute(Mutation mute) {
		this.mute = mute;
	}

	/**
	 * @return the mutation rate
	 */
	public double getmRate() {
		return mRate;
	}

	/**
	 * @param mRate the mutation rate to set
	 */
	public void setmRate(double mRate) {
		this.mRate = mRate;
	}
}