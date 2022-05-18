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

'Akan diarahkan ke halaman homepage'
WebUI.navigateToUrl('http://128.199.177.111:8001/id/login')

'Akan diarahkan ke halaman register Client'
WebUI.click(findTestObject('OR Registrasi/Page_Registrasi Freelancer  Sribulancer/span_Klik disini'))

'Meningput nama client yang sebelumnya pernah didaftarkan'
WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Nama Lengkap_input_register_freelance_dede7c'), 
    'testingsribulancer')

WebUI.delay(2)

'Menginput username client yang sebelumnya pernah didaftarkan'
WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Username_input_register_freelancer_username'), 
    'testingsribulancer2')

'Menginput password 12345678'
WebUI.setEncryptedText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Password_input_register_freelancer_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.delay(2)

'Menginput password 12345678'
WebUI.setEncryptedText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Ulangi Password_input_register_freela_0f0690'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Menginput email '
WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Email_input_register_freelancer_email'), 
    '5662testing@gmail.com')

'Menginput nomor telephone'
WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/input_Bangladesh - 880_input_register_freel_37f02d'), 
    '81816850009')

'Client dapat melakukan checklist pada checkbox "Kebijakan Privasi"'
WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/span_Kebijakan Privasi_check_register_freel_21944e'))

'Akan tampil pop up: Add failed. User ID and/or email address already existed.'
WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Freelancer  Sribulancer/div_Daftar dan Lanjutkan'))
