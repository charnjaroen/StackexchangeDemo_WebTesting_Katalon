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

WebUI.waitForElementVisible(findTestObject('Test Objects/Pages/Page_Login Success - Stack Exchange/header_Stack Exchange'), 
    GlobalVariable.element_timeout)

WebUI.verifyTextPresent('Tour', false)

WebUI.verifyTextPresent('About Us', false)

WebUI.verifyTextPresent('Meta', false)

WebUI.verifyElementVisible(findTestObject('Test Objects/Pages/Page_Login Success - Stack Exchange/a_Meta_my-profile js-gps-track'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Test Objects/Pages/Page_Login Success - Stack Exchange/a_Meta_-link js-inbox-button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Test Objects/Pages/Page_Login Success - Stack Exchange/a_Meta_-link js-achievements-b'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Test Objects/Pages/Page_Login Success - Stack Exchange/a_Meta_-link js-site-switcher-'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

