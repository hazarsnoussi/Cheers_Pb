package com.cheers.math;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArithmeticFunctionTest.class, 
				Incarnation2Test.class, 
				OverlapDistanceTest.class,
				TrigonometricFunctionTest.class})
public class AllTests {

}