/**
 * PopMember.java
 *
 * @author Triggs, Gabriel
 * @version 2013/3/27
 */

public abstract class PopMember {
    //our Genome of data
    private Genome dataSet;
    //the "fitness" of this PopMember
    private double fitness;

    /*
     * Name: PopMember
     * Description: Creates a new PopMember object using
     *              genes(Genome) and score(double).
     */
    public PopMember(Genome genes, double score) {
        dataSet = genes;
        fitness = score;
    }
    /*
     * Name: getFitness
     * Description: returns the fitness value associated
     *              with this PopMember
     * Return: fitness(double) - the fitness value or "score"
     */
    public double getFitness() {
        return fitness;
    }

    /*
     * Name: setFitness
     * Description: setter function for the fitness of this PopMember
     *              using score(double)
     */
    public void setFitness(double score) {
        fitness = score;
    }
    
    /*
     * Name: hillClimb
     * Description: This can be implemented in concrete classes
     *              if the user wishes to implement hill-climbing
     *              in their genetic algorithm application.
     */
    public abstract void hillClimb();
}
