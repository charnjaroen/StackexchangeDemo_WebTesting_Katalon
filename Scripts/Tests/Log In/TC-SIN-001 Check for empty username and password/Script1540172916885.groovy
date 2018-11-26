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

WebUI.callTestCase(findTestCase('Pages/01_Stack Exchage Homepage/The Homepage is loaded successfully'), [('expected_pagetitle') : 'Hot Questions - Stack Exchange'
        , ('actual_pagetitle') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/01_Stack Exchage Homepage/To click the login link'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/02_Log In Page/The Log In Page is loaded successfully'), [('expected_pagetitle') : 'Log In - Meta Stack Exchange'
        , ('actual_pagetitle') : ''], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_forgot_submit-button'))

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/Data Validation/div_Email cannot be empty.'), 
    GlobalVariable.element_timeout)

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/Data Validation/div_Password cannot be empty.'), 
    GlobalVariable.element_timeout)

WebUI.takeScreenshot()

