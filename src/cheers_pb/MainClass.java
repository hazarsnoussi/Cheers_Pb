/**
 *
 * @author TeamD
 */
package cheers_pb;
import mathematical_Functions.LevelPerformance;
public class MainClass {
   public static void main(String args[]) {
      double r=0;
      LevelPerformance perf=new LevelPerformance();
      perf.print_error(perf.readRadius(r), 1.0E-7);
      
    } 
}
