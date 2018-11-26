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

//for (def row : (1..2)) {
WebUI.callTestCase(findTestCase('Pages/01_Stack Exchage Homepage/To click the login link'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/02_Log In Page/The Log In Page is loaded successfully'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.switchToFrame(findTestObject('Test Objects/Pages/Page_Log In/iFrame/Page_Log In/iframeaffiliate-signin-iframe'), GlobalVariable.element_timeout)
WebUI.setText(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_Email_email'), findTestData('testdata/stackexchange_user').getValue(
        1, 2))

WebUI.setEncryptedText(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_Password_password'), findTestData(
        'testdata/stackexchange_user').getValue(2, 2))

WebUI.click(findTestObject('Test Objects/Pages/Page_Log In - Meta Stack Exchange/input_forgot_submit-button'))

WebUI.delay(10)

//WebUI.switchToDefaultContent()
WebUI.callTestCase(findTestCase('Pages/03_Dashboard Page/The Dashboard Page is loaded successfully'), [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Pages/03_Dashboard Page/To click the user profile'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/03_Dashboard Page/To click the logout link'), [:], FailureHandling.CONTINUE_ON_FAILURE)

