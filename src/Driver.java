/**
 * Driver.java
 * @author christopherwaldon
 * @version 0.01
 * 
 * Runs a genetic algorithm.
*/

public class Driver {
	
	private Population pop;
	private Crossover cross;
	private Mutation mute;
	private double mRate; // the mutation rate
	
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
	public double evaluateFitness(Genome genotype) {
		return 0.0; //TODO: Implement
	}
	
	/**
	 * I don't remember why this method exists
	 */
	public void setup() {
		//TODO: Implement
	}
	
	/**
	 * This method begins the execution of the genetic algorithm
	 */
	public void run() {
		//TODO: Implement
	}
	
	/**
	 * Returns a random array of parents of size numParents
	 * @param numParents the number of parents to include in the returned array
	 * @return a random array of PopMembers from the population of size numParents
	 */
	public PopMember[] selectParents(int numParents) {
		return null; //TODO: Implement
	}
	
	/**
	 * Crosses the Genotypes contained within the parameter array and adds the child/children
	 * (depending upon what crossover is being employed) to the population
	 */
	public void cross(PopMember[] parents) {
		//TODO: Implement
	}
	
	/**
	 * Checks whether the stopping criteria for this algorithm has been met
	 * @return true if the algorithm should stop, false otherwise
	 */
	public boolean stopCriteriaMet() {
		return true; //TODO: Implement
	}
	
	/*
	 * OUTPUT
	 */
	
	/**
	 * 
	 * @param score
	 */
	public void display(double score) {
		//TODO: Implement
	}
	
	/**
	 * 
	 * @param status
	 */
	public void display(String status) {
		//TODO: Implement
	}
	
	/**
	 * 
	 * @param soln
	 */
	public void display(Genome soln) {
		//TODO: Implement
	}
	
	/**
	 * 
	 * @param score
	 * @param status
	 * @param soln
	 */
	public void display(double score, String status, Genome soln) {
		//TODO: Implement
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