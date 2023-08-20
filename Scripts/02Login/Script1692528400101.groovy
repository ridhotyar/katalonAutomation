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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Page_Home Page V1/a_Sign In'))

WebUI.setText(findTestObject('Page_Customer Login/input_Email_loginusername'), GlobalVariable.Email)

WebUI.setText(findTestObject('Page_Customer Login/input_Password_loginpassword'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_Customer Login/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page V1/span_Welcome, Ridho Tiyar'), 0)

WebUI.click(findTestObject('Page_Home Page V1/button_Change'))

WebUI.click(findTestObject('Page_Home Page V1/a_My Account'))

WebUI.click(findTestObject('Page_My Account/button_Change'))

WebUI.click(findTestObject('Page_My Account/a_Sign Out'))

WebUI.verifyElementPresent(findTestObject('Page_/span_You are signed out'), 0)

WebUI.delay(7)

WebUI.closeBrowser()

