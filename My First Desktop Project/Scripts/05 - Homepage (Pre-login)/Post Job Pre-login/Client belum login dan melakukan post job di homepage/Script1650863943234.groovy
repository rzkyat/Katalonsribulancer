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

WebUI.navigateToUrl('http://128.199.177.111:8001/')

'KLIK BUTTON BUAT JOB\n'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/div_Buat Job'))

'KLIK MENU JOB BARU UNTUK DITAWARKAN\n'
WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/p_Job baru untuk ditawarkan'))

'KLIK BUTTON LANJUTKAN'
WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Lanjutkan'))

WebUI.setText(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/input_Judul Pekerjaan_input_title_job'), 
    'Testing post job')

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Pilih Kategori'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/span_Video  Fotografi'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Pilih Sub Kategori'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/span_Fotografi Mode Busana'))

WebUI.setText(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/textarea_Deskripsi Pekerjaan_input_job_description'), 
    'Testing post jobTesting post jobTesting post jobTesting post jobTesting post jobTesting post jobTesting post job')

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Pilih Industri'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/span_Media'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/input_Kapan job posting ini akan ditutup_da_a92bc0'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_18'))

WebUI.setText(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/input_IDR_input_client_budget'), 
    '750,000')

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Buat Job Sekarang'))

'Client harus melakukan login dahulu apabila ingin melanjutkan proses posting Job'
WebUI.click(findTestObject('Object Repository/Page_Buat Job Freelance Baru, Cari Freelanc_c9dd9c/div_Login'))

