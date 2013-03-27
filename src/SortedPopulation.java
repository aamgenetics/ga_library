/*
 * SortedPopulation.java
 *
 * Implementation of the Popluation class.
 *
 */

public class SortedPopulation implements Popluation
{
    PopMember[] population;
    
    /*
     * Name: SortedPopulation
     * Description: Basic constructor
     *
     */
    public SortedPopulation()
    {
        //constructor stuff
    }

    /*
     * Name: insertionSort
     * Description: Performs an insertion sort on the population.
     */
    public void insertionSort()
    {
        // This may be wrong, kinda rushed
        for(int i = 0; i < population.length; i++)
        {
            int j = i;
            int curr = population[i];

            while((j > 0 && (population[j-1].getFitness() > curr.getFitness())))
            {
                popluation[j] = population[j-1];
                j--;
            }

            population[j] = curr;
        }
    }
    
    /*
     * Name: Insert
     * Description: Inserts a population member into the popluation.
     *
     * Parameters:
     *      member - member to be inserted into the population.
     */
    public void insert(Popmember member)
    {
        //Insert method here
    }

    /*
     * Name: getPopulation
     * Description: Returns the population.
     *
     * Returns:
     *      popMember array representing the population.
     */
    public PopMember[] getPopulation()
    {
        return population;
    }
    
    /*
     * Name: Remove
     * Description: Removes a member from the population.
     *
     * Parameters:
     *      member to be removed.
     */
    public void remove(PopMember member)
    {
        // insert method here
    }

    /*
     * Name: getBest
     * Description: Returns the best member of the popluation.
     *
     * Returns: 
     *      Best PopMember in the population.
     */
    public PopMember getBest()
    {
        return population[0];
    }

    /*
     * Name: Populate
     * Description: Creates an initial population.
     */
    public void populate()
    {
        // insert method here
    }

    /*
     * Name: returnParents
     * Description: Returns a specified number of parents from the
     *              population in an array.
     *
     * Parameters:
     *      numParents - number of parents to return.
     * Returns:
     *      PopMember array of parents.
     */
    public PopMember[] returnParents(int numParents)
    {
        PopMember[] parents = new PopMember[numParents];
        
        // select parents here
        
        return parents;
    }

}
