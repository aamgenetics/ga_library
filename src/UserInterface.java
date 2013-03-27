/**
 * @author John Rutherford
 * @version 3/27/13
 *
 * Interface setting guidelines for interacting with user
 */
public abstract class UserInterface {
    //prompts user for input needed to start running genetic algorithm
    public void promptUser();
    //displays the best score found
    public void displayBestScore(double score);
    //displays the current status of the genetic algorithm
    public void displayStatus(String status);
    //displays the best solution found
    public void displayBestSolution(Genome soln);
    
    /**
     * displays score, status, and soln, using methods written for displaying
     * each one individually
     */
    public void displayAll(double score, String status, Genome soln) {
        displayBestScore(score);
        displayStatus(status);
        displayBestSolution(soln);
    }
}
