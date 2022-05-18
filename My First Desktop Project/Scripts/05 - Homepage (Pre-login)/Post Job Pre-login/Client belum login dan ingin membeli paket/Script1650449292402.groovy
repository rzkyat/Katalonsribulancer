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

'Klik button lihat semua paket'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/a_Lihat Semua Paket'))

'Klik button Beli Paket'
WebUI.click(findTestObject('Object Repository/Page_Pilih Paket Jasa Sesuai Kebutuhan amp _ab5189/a_Beli Paket'))

'Pada halaman detail paket, pilih harga paket yang diinginkan kemudian klik button Beli Paket'
WebUI.click(findTestObject('Object Repository/Page_Detail Paket Manajemen Tampilan Media _e6c424/div_Beli Paket'))

'Expected: Client akan diminta login terlebih dahulu sebelum melanjutkan pembelian paket'
WebUI.click(findTestObject('Object Repository/Page_Login Sribulancer/h6_Masuk Sribulancer'))

