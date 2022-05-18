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

WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/a_Jasa Penulisan Lainnya'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Penulisan Perusahaan Profesional _5c7117/a_Jasa Bisnis dan Pemasaran Online Lainnya'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Digital Marketing Terbaik  Sribulancer/a_Jasa Website E-commerceToko Online'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pembuatan Toko Online Murah dan B_a771db/a_Jasa Desain UIUX'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pembuatan Desain UIUX Berkualitas_4d3cde/a_Jasa Desain UIUX'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pembuatan Desain UIUX Berkualitas_4d3cde/a_Jasa Akuntansi dan Keuangan'))

WebUI.click(findTestObject('Object Repository/Page_Sribulancer Jasa Akuntansi Berkualitas_d0a9e0/a_Jasa Aplikasi Android'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pembuatan Aplikasi Android Terper_de16f2/a_Jasa Aplikasi IOS'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Pembuatan Aplikasi iOS Profesiona_671180/a_Jasa Social Media Marketing'))

WebUI.click(findTestObject('Object Repository/Page_Jasa Sosial Media Marketing Terpercaya_0c7f1c/a_Jasa SEO (Search Engine Optimization)'))

WebUI.click(findTestObject('Object Repository/Page_Jasa SEO Murah, Terbaik dan Terpercaya_cc4efe/a_Jasa Pembuatan Video'))

'Seluruh Sub Categori apabila dipilih page akan mengarahkan ke Landing Page'
WebUI.click(findTestObject('Object Repository/Page_Video Production  Sribulancer/a_Jasa Desain Logo'))

