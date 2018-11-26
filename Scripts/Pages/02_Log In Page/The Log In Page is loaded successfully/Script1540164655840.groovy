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

actual_pagetitle = WebUI.getWindowTitle()

WebUI.verifyMatch(actual_pagetitle, expected_pagetitle, false)

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/div_Log in to the  network of'), 
    GlobalVariable.element_timeout, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/div_Google'), GlobalVariable.element_timeout, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/div_Facebook'), GlobalVariable.element_timeout)

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_Email_email'), GlobalVariable.element_timeout)

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_Password_password'), 
    GlobalVariable.element_timeout)

WebUI.verifyTextPresent('forgot?', false)

//WebUI.verifyTextPresent('click here to sign up', false)
WebUI.takeScreenshot()

