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

WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/a_Lihat Semua Paket'))

WebUI.click(findTestObject('Object Repository/Page_Pilih Paket Jasa Sesuai Kebutuhan amp _ab5189/a_Beli Paket'))

WebUI.click(findTestObject('Object Repository/Page_Detail Paket Desain Kemasan  Sribulancer/p_Saya ingin memilih freelancer'))

WebUI.click(findTestObject('Object Repository/Page_Detail Paket Desain Kemasan  Sribulancer/div_Beli Paket'))

WebUI.click(findTestObject('Object Repository/Page_Detail Paket Desain Kemasan  Sribulancer/div_Batal'))

WebUI.click(findTestObject('Object Repository/Page_Detail Paket Desain Kemasan  Sribulancer/p_Saya ingin memilih freelancer'))

WebUI.click(findTestObject('Object Repository/Page_Detail Paket Desain Kemasan  Sribulancer/div_Beli Paket'))

WebUI.setText(findTestObject('Object Repository/Page_Kenapa Sribulancer/textarea_Jelaskan kebutuhan anda secara len_f6dc49'), 
    'TESTING POST PAKET JOB MOHON UNTUK MENGGUNAKAN DESAIN YANG BAGUS AGAR MUDAH DIPAHAMI DAN TAMPILANNYA MENARIK')

WebUI.click(findTestObject('Object Repository/Page_Kenapa Sribulancer/div_Pilih industri'))

WebUI.click(findTestObject('Object Repository/Page_Kenapa Sribulancer/span_Media'))

WebUI.click(findTestObject('Object Repository/Page_Kenapa Sribulancer/input_Deadline pekerjaan selesai_datepicker_e7c10e'))

WebUI.click(findTestObject('Object Repository/Page_Kenapa Sribulancer/div_18'))

WebUI.click(findTestObject('Object Repository/Page_Kenapa Sribulancer/div_Beli Paket'))

WebUI.click(findTestObject('Object Repository/Page_Kenapa Sribulancer/div_Setuju'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/p_Lainnya'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Konfirmasi Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Tanggal Pembayaran_datepicker__input__3Qe19'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_12'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/input_Total invoice_invoiceTotal'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_IDR_paymentTotal'), '686,044')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Nama Bank Anda_bankName'), 'BCA')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Cabang Bank_bankBranch'), 'BCA')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Nomor Rekening_accountNumber'), '7263648362')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Nama Pemegang Rekening_accountName'), 'RIZKY')

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/textarea_Catatan_note'), 'TESTING PAYMENT')

'Setelah client melakukan konfirmasi pembayaran, client akan di arahkan ke landing page setelah konfirmasi pembayaran manual. Data pembayaran yang disubmit client akan masuk ke Jarvis menu "Payments"'
WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Konfirmasi'))

