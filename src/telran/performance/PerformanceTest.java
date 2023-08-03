package telran.performance;

public abstract class PerformanceTest {
	String testName;
	int nRuns;
	public PerformanceTest(String testName, int nRuns) {
		super();
		this.testName = testName;
		this.nRuns = nRuns;
	}
	public void run() {
		long startTime = 0;
		long finishTime = 0;
		startTime = System.currentTimeMillis();
		for(int i = 0; i < nRuns;i++) {
			runTest();
		}
		finishTime = System.currentTimeMillis();
		System.out.println("Test name is" + testName +" Value of nRuns is "
		+ nRuns + " Running time is " + ( finishTime - startTime));
		
	}
	protected abstract void runTest();
}
