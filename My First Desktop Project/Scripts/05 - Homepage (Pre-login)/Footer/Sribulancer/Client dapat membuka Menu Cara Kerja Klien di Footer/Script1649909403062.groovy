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

WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/a_Cara Kerja Klien'))

WebUI.click(findTestObject('Object Repository/Page_Cara Kerja  Sribulancer/a_Cara Kerja Freelancer'))

WebUI.click(findTestObject('Object Repository/Page_Cara Kerja  Sribulancer/a_Keunggulan'))

'Page akan mengarahkan ke halaman dengan 4 Menu, yaitu: \n1. Cara kerja klien\n2. Cara Kerja Freelancer \n3. Keunggulan\n4. Harga Jasa'
WebUI.click(findTestObject('Object Repository/Page_Kenapa Sribulancer/a_Harga Jasa'))

