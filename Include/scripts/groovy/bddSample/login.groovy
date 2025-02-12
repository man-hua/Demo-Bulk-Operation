package bddSample
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to click Make Appointment button")
	def I_want_to_click_make_appointment_button() {
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))
	}

	@Then("I fill out the username input with value (.*)")
	def I_fill_out_the_username_input_with_value(String value) {
		WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), value)
	}

	@And("I fill out the password input with value (.*)")
	def I_fill_out_the_password_input_with_value(String value) {
		WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), value)
	}

	@Then("I click login button")
	def I_click_on_login_button() {
		WebUI.click(findTestObject("Object Repository/Page_CURA Healthcare Service/button_Login"))
	}

	@And("I verify the failed login message")
	def I_verify_the_failed_login_message() {
		WebUI.verifyMatch(WebUI.getText(findTestObject("Object Repository/Page_CURA Healthcare Service/p_Login failed Please ensure the username and password are valid.")), "Login failed! Please ensure the username and password are valid.", false)
	}

	@And("I verify Make Appointment label")
	def I_verify_make_appintment_label() {
		WebUI.verifyMatch(WebUI.getText(findTestObject("Object Repository/Page_CURA Healthcare Service/h2_Make Appointment")), "Make Appointment", false)
	}
}