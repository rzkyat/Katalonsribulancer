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

'Pada search box input keyword skill Freelancer yang di cari'
WebUI.setText(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/input_Indonesia_search__input__1vE40'), 
    'copywriting')

'Tekan Enter'
WebUI.sendKeys(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/input_Indonesia_search__input__1vE40'), 
    Keys.chord(Keys.ENTER))

'Tampil hasil pencarian list freelancer yang menginput Skill di Profile sesuai keyword yang dicari '
WebUI.click(findTestObject('Object Repository/Page_Cari Jasa Freelance Yang Dibutuhkan  S_53f4d7/img_Next_success__37L1h freelancer__portfol_4bd009'))

