import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Rectangle

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

Rectangle rectangleSize = new Rectangle(250, 250, 250, 250)

WebUI.comment('Story: Login to CURA system')

WebUI.comment('Given that the user has the valid login information')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username)

WebUI.takeAreaScreenshotAsCheckpoint('areaCheckpoint', rectangleSize)

WebUI.setText(findTestObject('Page_Login/txt_Password'), Password)

WebUI.takeElementScreenshotAsCheckpoint('elementCheckpoint', findTestObject('Page_Login/txt_Password'))

WebUI.comment('When he logins to CURA system')

WebUI.click(findTestObject('Page_Login/btn_Login'))

WebUI.takeFullPageScreenshotAsCheckpoint('fullCheckpoint')

WebUI.comment('Then he should be able to login successfully')

landingPage = WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), GlobalVariable.G_Timeout)

WebUI.closeBrowser()

