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

WebUI.navigateToUrl('https://www.sribulancer.com/')

WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/a_Jasa Video  Fotografi'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pembuatan dan Editing Video  Sribulancer/a_Jasa Penerjemahan'))

WebUI.click(findTestObject('Object Repository/Page_Translation  Sribulancer/a_Jasa Entri Data'))

WebUI.click(findTestObject('Object Repository/Page_Data Entry  Sribulancer/a_Jasa Pengembangan Aplikasi Mobile'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pembuatan Aplikasi Mobile Berkual_b4b93d/a_Jasa Bisnis  Pemasaran Online'))

WebUI.click(findTestObject('Object Repository/Page_Perusahaan Jasa Pemasaran Online Berku_4a4431/a_Jasa Desain  Identitas Branding'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pembuatan Desain Grafis  Sribulancer/a_Jasa Penulisan'))

'Setiap Kategori Footer yang dipilih, page akan mengarahkan ke Landing Page'
WebUI.click(findTestObject('Object Repository/Page_Jasa Custom Penulisan Murah dan Profes_d2e4b1/a_Jasa Website  Pengembangan'))

