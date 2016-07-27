/**
 *A class that print 
 * 1/ The Java version installed in the current machine, its OS name and its version
 * 2/our approximation for a given radius joined with its level of performance
 * in plain text 
 * @authors TeamD
 **/
package cheers_pb;
import mathematical_Functions.LevelPerformance;
public class MainClass {
   public static void main(String args[]) {
        LevelPerformance perf=new LevelPerformance();
        double radius=0;
        perf.print_error(perf.readRadius(radius), 1.0E-7);
    } 
}
