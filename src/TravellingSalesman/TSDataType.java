package TravellingSalesman;

import java.util.HashSet;
import java.util.Set;

import ProblemNonSpecific.DataType;

public class TSDataType implements DataType{

	private int[] path;
	private static int pathSize;
	
	public TSDataType(int pathSize) {
		if (pathSize == 0) {
			System.out.println("Cannot create data, no pathSize set. Please set the static value pathSize.");
			return;
		}
		
	}
	
	private void generateRandomData() {
		HashSet<Integer> unused = new HashSet<Integer>();
		for (int i = 0; i < pathSize; i++) {
			unused.add(new Integer(i));
		}
		
	}

	@Override
	public void hillClimb() {
		//Unimplemented as of yet
	}
	
	/**
	 * @return the path
	 */
	public int[] getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(int[] path) {
		this.path = path;
	}

	/**
	 * @return the pathSize
	 */
	public static int getPathSize() {
		return pathSize;
	}

	/**
	 * @param pathSize the pathSize to set
	 */
	public static void setPathSize(int pathSize) {
		TSDataType.pathSize = pathSize;
	}
}
