import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

WebUI.verifyElementVisible(findTestObject('Test Objects/Pages/Page_Hot Questions - Stack Exchange/header_Stack Exchange'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Tour', false)

WebUI.verifyTextPresent('About Us', false)

WebUI.verifyTextPresent('Meta', false)

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Page_Hot Questions - Stack Exchange/input_Meta_q'), GlobalVariable.element_timeout)

WebUI.verifyTextPresent('All Sites', false)

WebUI.verifyTextPresent('Top Users', false)

WebUI.verifyTextPresent('Newsletters', false)

WebUI.verifyTextPresent('Log In', false)

WebUI.verifyTextPresent('Stack Exchange', false)

WebUI.takeScreenshot()

