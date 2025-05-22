import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('ListAppointmentPage/Facility_label'), 2)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('ListAppointmentPage/Facility_label'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('ListAppointmentPage/applyforhospitalradmission_label'), 2)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('ListAppointmentPage/applyforhospitalradmission_label'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('ListAppointmentPage/healthcareprogram_label'), 2)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('ListAppointmentPage/healthcareprogram_label'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('ListAppointmentPage/VisitDate_Label'), 2)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('ListAppointmentPage/VisitDate_Label'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('ListAppointmentPage/comment_label'), 2)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('ListAppointmentPage/VisitDate_Label'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('ListAppointmentPage/GoToHomepage_button'))

WebUI.delay(3)

WebUI.click(findTestObject('menu_beranda'))

WebUI.delay(3)

WebUI.click(findTestObject('submenu_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()