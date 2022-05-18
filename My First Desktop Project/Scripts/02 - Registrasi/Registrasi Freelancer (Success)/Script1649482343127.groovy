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

WebUI.click(findTestObject('OR Registrasi/Page_Registrasi Freelancer  Sribulancer/span_Klik disini'))

WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Nama Lengkap_input_register_freelance_dede7c'), 
    'testingsribulancer')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Username_input_register_freelancer_username'), 
    'testingsribulancer2')

WebUI.setEncryptedText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Password_input_register_freelancer_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Ulangi Password_input_register_freela_0f0690'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Email_input_register_freelancer_email'), 
    '5662testing@gmail.com')

WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Bangladesh - 880_input_register_freel_37f02d'), 
    '81816850009')

WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/span_Kebijakan Privasi_check_register_freel_21944e'))

'Apabila pendaftaran freelancer berhasil, Page akan mengarahkan mengarahkan ke halaman homepage dengan tampilnya alert "Lengkapi Profile"'
WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/div_Daftar dan Lanjutkan'))

