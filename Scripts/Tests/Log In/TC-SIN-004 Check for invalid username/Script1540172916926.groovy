import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Pages/01_Stack Exchage Homepage/The Homepage is loaded successfully'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/01_Stack Exchage Homepage/To click the login link'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/02_Log In Page/The Log In Page is loaded successfully'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_Email_email'), 'charnjaroen')

WebUI.setEncryptedText(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_Password_password'), 'mrT19oHkhOlZrHldn5/zAA==')

WebUI.click(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_forgot_submit-button'))

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/Data Validation/div_The email is not a valid e'), 
    GlobalVariable.element_timeout)

WebUI.takeScreenshot()

