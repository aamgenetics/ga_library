package ProblemNonSpecific;
/**
 * @author John Rutherford
 * @version 3/27/13
 *
 * Interface setting guidelines for interacting with user
 */
public abstract class UserInterface {
    //prompts user for input needed to start running genetic algorithm
    public abstract void promptUser();
    //displays the best score found
    public abstract void displayScore(double score);
    //displays the current status of the genetic algorithm
    public abstract void displayStatus(String status);
    //displays the best solution found
    public abstract void displaySolution(Genome soln);
    
    /**
     * displays score, status, and soln, using methods written for displaying
     * each one individually
     */
    public void displayAll(double score, String status, Genome soln) {
        displayScore(score);
        displayStatus(status);
        displaySolution(soln);
    }
}
