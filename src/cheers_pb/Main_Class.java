/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheers_pb;
import mathematical_Functions.Level_Performance;
/**
 *
 * @author Fadhel
 */
public class Main_Class {
   public static void main(String args[]) {
      double r=0;
      Level_Performance perf=new Level_Performance();
      //r=perf.readRadius(r);
      perf.print_error(2.5d, 1.0E-7);
      
    } 
}
