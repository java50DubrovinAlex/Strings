package telran.performance;

import telran.text.JoinStrings;

public class JoinStringPerformanceTest extends PerformanceTest {
	
	
	private String [] strings;
	private JoinStrings joinStrings;
	
	
	public JoinStringPerformanceTest(String testName, int nRuns, String[]strings, JoinStrings joinString) {
		super(testName, nRuns);
		this.testName = testName;
		this.nRuns = nRuns;
		this.strings = strings;
		this.joinStrings = joinString;
	}
	
	public void runTest() {
		joinStrings.join(strings, "");
	}
	
}
