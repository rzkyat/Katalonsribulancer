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

'Akan Diarahkan ke halaman login'
WebUI.navigateToUrl('http://128.199.177.111:8001/id/login')

'Dapat memilih dropdown pendaftaran "Client"\n'
WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Login Sribulancer/span_Klik disini'))

'Client dapat menginput nama lengkap '
WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/input_Nama Lengkap_input_r_c_fullname'), 
    'rizkytestingggg')

'Dapat menginput username yang belum pernah didaftarkan sebelumnya'
WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/input_Username_input_r_c_username'), 
    'rizkytestingggg')

'Dapat menginput password 8 digit atau lebih'
WebUI.setEncryptedText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/input_Password_input_r_c_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Dapat mengulangi input password yang sama sesuai dengan password yang diinput sebelumnya'
WebUI.setEncryptedText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/input_Ulangi Password_input_r_c_confirm_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'Dapat menginput email dengan menggunakan nama email+ @domain.com'
WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/input_Email_input_r_c_email'), 
    'rizksyvsuy@gmail.com')

'Dapat menginput nomor telepon tanpa menggunakan "0" diawal digit'
WebUI.setText(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/input_Bangladesh - 880_input_r_c_phone'), 
    '8726363537')

'Dapat memilih salah satu dari semua pilihan dropdown industri yang tersedia '
WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/span_Industri'))

'Dapat memilih salah satu dari semua pilihan dropdown Media yang tersedia '
WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/span_Media'))

'Checkbox pada kebijakan privasi dapat di checklist'
WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/span_Kebijakan Privasi_check_register_client_agree'))

'Client dapat melakukan registrasi dan page akan menagarahkan untuk dapat melakukan verifikasi email\n'
WebUI.click(findTestObject('Object Repository/OR Registrasi/Page_Registrasi Klien  Sribulancer/div_Daftar dan Lanjutkan'))

