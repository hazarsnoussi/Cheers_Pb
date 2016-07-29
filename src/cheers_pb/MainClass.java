/**
 *A class that prints 
 * 1/ The Java version installed in the current machine, its OS name and its version
 * 2/our approximation for a given radius joined with its level of performance
 * in plain text 
 **/
package cheers_pb;

/**
 *
 * @authors TeamD
 */

import mathematical_Functions.LevelPerformance;

/**
 *
 * @author TeamD
 */
public class MainClass {
    /**
     *
     * returns a plain text output.
     * it highlights the level of precision of our approximation
     * by comparing its results to incarnation2
     * @param args Java standard main function parameters
     */
        
   public static void main(String args[]) {
       LevelPerformance perf=new LevelPerformance();
       perf.print_error(perf.readRadius(), 1.0E-7);
    } 
}
