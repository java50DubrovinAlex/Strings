package telran.performance;
import java.util.Arrays;

import telran.text.JoinStringsOnStandard;
import telran.text.JoinStringsOnString;
import telran.text.JoinStringsonBuilder;

public class JoinStringsPerformanceAppl {

	private static final int N_RUNS = 100;
	private static final int N_STRINGS = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] bigArray = new String[N_STRINGS];
		Arrays.fill(bigArray, "whats app");
		
		JoinStringsOnString onString = new JoinStringsOnString();
		JoinStringsonBuilder onBuilder = new JoinStringsonBuilder();
		JoinStringsOnStandard onStandard = new JoinStringsOnStandard();
		JoinStringPerformanceTest  string = new JoinStringPerformanceTest("whats app", N_RUNS, bigArray, onString);
		JoinStringPerformanceTest  builder = new JoinStringPerformanceTest("whats app", N_RUNS, bigArray, onBuilder);
		JoinStringPerformanceTest  standard = new JoinStringPerformanceTest("whats app", N_RUNS, bigArray, onStandard);
		string.run();
		builder.run();
		standard.run();
	}
	

}
