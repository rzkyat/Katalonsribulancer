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

'Page akan mengarahkan ke halaman homepage'
WebUI.navigateToUrl('https://www.sribulancer.com/')

'Klik Login,Page akan mengarahkan ke halaman login'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/a_Login'))

'Input username yang benar'
WebUI.setText(findTestObject('Object Repository/Page_Login Sribulancer/input_Email  Username_input_l_username'), 'bambangsudarsono')

'Input password yang benar'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Sribulancer/input_Password_input_l_password'), 'wNwzvJrYZMUB36N7Gzj1+g==')

'Klik login'
WebUI.click(findTestObject('Object Repository/Page_Login Sribulancer/div_Login'))

'Ketika login berhasil, klik menu profile '
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img_Lihat Semua_profile__icon__selected__3h94X'))

'Expected: Pada menu logo avatar profile apabila di klik akan tampil informasi "Sebagai Freelancer"'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/div_Sebagai Freelancer'))

