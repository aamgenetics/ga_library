import java.util.Random;
import java.util.Iterator;

/*
 * SortedPopulation.java
 *
 * Implementation of the Popluation class.
 *
 */

public class SortedPopulation implements Population
{
    PopMember[] population;
    
    /*
     * Name: SortedPopulation
     * Description: Basic constructor
     *
     */
    public SortedPopulation()
    {
        // creates population of size 500, with 1 placeholder.
        population = new PopMember[501];

        populate();
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
            PopMember curr = population[i];

            while((j > 0 && (population[j-1].getFitness() > curr.getFitness())))
            {
                population[j] = population[j-1];
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
    public void insert(PopMember member)
    {
        // inserts member as last of population
        population[population.length-1] = member;
        
        // sorts the population
        insertionSort();
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
        int found = 0;

        // finds the member in the population
        for(int i = 0; i < population.length; i++)
        {
            if(population[i] == member)
            {
                found = i;
                break;
            }
        }

        PopMember remove = population[found];
        
        // Moves the rest of the population down to overright value
        for(int j = found; j < population.length; j++)
        {
            population[j] = population[j+1];
        }

        // sets element as last of array to be overwritten.
        population[population.length-1] = remove;
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
        Random rand = new Random();

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
        
        Random rand = new Random();

        // Selects first parent from the first half of population
        parents[0] = population[rand.nextInt(population.length/2)];

        // Selects the rest of the parents from the entire population
        for(int i = 1; i < numParents; i++)
        {
            parents[i] = population[rand.nextInt(population.length)];
        }
        
        return parents;
    }

    public Iterator<PopMember> iterator()
    {
       return new PopMemberIterator();
    }

    //Iterator for PopMembers.
    private class PopMemberIterator implements Iterator
    {
        private int location = 0;

        /*
         * Name: hasNext
         * Description: Checks to see if there are any more
         * members of the population.
         *
         * Return:
         *      true if there are more popMembers in population.
         */
        public boolean hasNext()
        {
            if(location >= population.length-1) return false;
            return true;
        }

        /*
         * Name: next
         * Description: returns the next member of the population.
         *
         * Return:
         *      the next PopMember in the population.
         */
        public PopMember next()
        {
            location++;
            return population[location];
        }

        /*
         * Name: remove
         * Description: Removes the member at the current location.
         */
        public void remove()
        {
             //May need to be changed, Null reference could cause problems
        	population[location] = null;
        }
            
   }
}
