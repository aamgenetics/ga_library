import java.lang.Iterable;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author John Rutherford
 * @version 3/27/13
 *
 * Genome stores and manipulates the chromosomes for the Genetic Algorithm
 */
public class Genome implements Iterable {
    private Chromosome[] chromosomes;

    /**
     * creates a genome with all given chromosomes
     * @param genotype an array of Chromosomes
     */
    public void Genome(Chromosome[] genotype) {
        chromosomes = genotype;
    }
    
    /**
     * returns the chromosomes stored in Genome
     * @return stored chromosomes
     */
    public Chromosome[] getChromosomes() {
        return chromosomes;
    }
    
    /**
     * returns an iterator for the current chromosoms
     * @return an iterator
     */
    public Iterator<Chromosome> iterator() {
        return new ChromosomeIterator();
    }

    /**
     * An iterator class for chromosomes
     */
    private class ChromosomeIterator implements Iterator {
        private int loc = 0;
        
        /**
         * checks if there are any more chromosomes
         * @return true if there is another chromosome in the array and false if there is not
         */
        public boolean hasNext() {
            if (loc >= chromosomes.length - 1)
                return false;
            return true;
        }

        /**
         * returns the next chromosome in the list
         * @return the next chromosome
         */
        public Chromosome next() {
            loc++;
            return chromosomes[loc];
        }

        /**
         * removes the chromosome at the current location
         */
        public void remove() {
        	//UNSUPPORTED OPERATION
//            for (int i = loc; i < chromosomes.length - 2; i++) {
//                chromosomes[i] = chromosomes[i+1];
//            }
//            chromosomes = Arrays.copyOf(chromosomes, i);
        }
    }
}
