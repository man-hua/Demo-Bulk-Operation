import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.util.KeywordUtil

class NewTestListener {
	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestCase
	void skipTestCase(TestCaseContext testCaseContext) {
		if(testCaseContext.getProperties().get("testCaseId").contains("Return skipped"))
			testCaseContext.skipThisTestCase()
	}
}