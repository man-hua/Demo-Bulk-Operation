import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.util.KeywordUtil

class TestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		KatalonHelper.updateInfo()
	}
	
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		Map<String, Object> variables = testCaseContext.getTestCaseVariables()
		def isSkipped = variables.find { it.key.compareTo("isSkipped") == 0 }?.value
		if(Boolean.parseBoolean(String.valueOf(isSkipped)))
			testCaseContext.skipThisTestCase()
	}
}