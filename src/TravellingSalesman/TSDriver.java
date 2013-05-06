package TravellingSalesman;
import ProblemNonSpecific.*;

public class TSDriver extends Driver{
	private SortedPopulation pop;
	private TSCrossover cross;
	private TSMutation mute;
	
	private final static int STOP_VAL = 1000;
	
	public TSDriver() {
		this.setPop(new SortedPopulation());
		this.setCross(new TSCrossover());
		this.setMute(new TSMutation());
	}

	@Override
	public double evaluateFitness(Genome genotype) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PopMember[] selectParents(int numParents) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cross(PopMember[] parents) {
		Genome[] parentsDNA = new Genome[parents.length]; //Converts from PopMember[] to Genome[] and crosses
		for (int i = 0; i < parents.length; i++) {
			parentsDNA[i] = parents[i].getDataSet();
		}
		Genome[] childrenDNA = cross.cross(parentsDNA); //Insert the children into the new population
		for (int i = 0; i < childrenDNA.length; i++) {
			pop.insert(new PopMember(childrenDNA[i], evaluateFitness(childrenDNA[i])));
		}
		
	}

	@Override
	public boolean stopCriteriaMet() {
		if (evaluateFitness(pop.getBest().getDataSet()) > STOP_VAL) { // if the fitness of the most fit member of the population exceeds
																	// the goal fitness
			return true;
		}
		return false;
	}
	
	public void runGeneration() {
		PopMember[] anscestors = selectParents(2);
		cross(anscestors); // crosses the parents in the array and inserts the children into the population
	}

	public static void main(String[] args) {
		TSDriver algorithm = new TSDriver(); //run new generations until the stop critera is met
		do {
			algorithm.runGeneration();
		} while (!algorithm.stopCriteriaMet());
	}

	/**
	 * @return the pop
	 */
	public SortedPopulation getPop() {
		return pop;
	}

	/**
	 * @param pop the pop to set
	 */
	public void setPop(SortedPopulation pop) {
		this.pop = pop;
	}

	/**
	 * @return the cross
	 */
	public TSCrossover getCross() {
		return cross;
	}

	/**
	 * @param cross the cross to set
	 */
	public void setCross(TSCrossover cross) {
		this.cross = cross;
	}

	/**
	 * @return the mute
	 */
	public TSMutation getMute() {
		return mute;
	}

	/**
	 * @param mute the mute to set
	 */
	public void setMute(TSMutation mute) {
		this.mute = mute;
	}
}
