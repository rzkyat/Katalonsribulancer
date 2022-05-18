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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Sribulancer/input_Password_input_l_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Login Sribulancer/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/div_Buat Job'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/a_Cari Freelancer'))

WebUI.click(findTestObject('Object Repository/Page_Cari Jasa Freelance Yang Dibutuhkan  S_53f4d7/img_Next_img success__37L1h freelancer__por_e95e07'))

WebUI.click(findTestObject('Object Repository/Page_testingfreelancersri - Freelancer  Sri_ac3b62/a_Chat  Negosiasi'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/p_Job baru untuk ditawarkan'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Lanjutkan'))

WebUI.setText(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/input_Judul Pekerjaan_input_title_job'), 
    'Private job')

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Pilih Kategori'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/span_Video  Fotografi'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/span_Pilih Sub Kategori'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/span_Dokumentasi Acara'))

WebUI.setText(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/textarea_Deskripsi Pekerjaan_input_job_description'), 
    'Private Job Private Job Private Job Private Job Private Job Private Job Private Job Private Job Private Job ')

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Pilih Industri'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/span_Periklanan'))

WebUI.setText(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/input_IDR_input__1z_nb'), 
    '5,000,000')

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Lanjutkan_1'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Buat Job Sekarang'))

'Job akan tampil pada list di menu dashboard "Job Saya" dan freelancer akan menerima notifikasi bahwa ada penawaran job yang masuk '
WebUI.click(findTestObject('Object Repository/Page_Dashboard/p_Private job'))

