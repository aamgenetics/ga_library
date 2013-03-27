/**
 * PopMember.java
 *
 * @author Triggs, Gabriel
 * @version 2013/3/27
 */

public abstract class PopMember {
    private Genome dataSet;
    private double fitness;

    public PopMember(Genome genes, double score) {
        dataSet = genes;
        fitness = score;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double score) {
        fitness = score;
    }

    public abstract void hillClimb();
}
