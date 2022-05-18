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

WebUI.navigateToUrl('http://128.199.177.111:8001/id/login')

WebUI.setText(findTestObject('Object Repository/Page_Login Sribulancer/input_Email  Username_input_l_username'), 'clientsribu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Sribulancer/input_Password_input_l_password'), 'T9pF6N9G31Y=')

WebUI.click(findTestObject('Object Repository/Page_Login Sribulancer/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img_Lihat Semua_profile__icon__selected__3h94X'))

WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/p_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dashboard/input_Password Lama_input_old_password'), 'T9pF6N9G31Y=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dashboard/input_Password Baru_input_new_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Dashboard/input_Konfirmasi Password_input_confirmatio_275ec2'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Ubah Password'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Ubah Password_1'))

