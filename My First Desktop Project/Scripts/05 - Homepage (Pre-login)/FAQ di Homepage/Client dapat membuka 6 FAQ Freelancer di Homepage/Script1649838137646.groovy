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

'Isi Content: 1. Bagaimana cara mendaftarkan diri sebagai freelancer? \nProses registrasi di Sribulancer praktis, cepat & 100% bebas biaya. Anda hanya memerlukan alamat email yang aktif & anda segera bisa mendaftarkan diri hanya dengan beberapa langkah mudah Di sini'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'Isi Content: 2. Bagaimana cara kerja Sribulancer?\nSribulancer bekerja untuk freelancer dengan cara mempertemukan freelancer dengan para klien yang membutuhkan kemampuan & skill tertentu. Dengan platform online Sribulancer, seluruh proses dari job posting, merekrut, work progress hingga selesai, telah tertata rapi melalui sistem online Sribulancer. Apabila anda masih ada pertanyaan, silahkan baca Cara Kerja Sribulancer\n'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'Isi Content: 3. Biaya apa saja yang dikenakan oleh Sribulancer?\nSribulancer tidak mengenakan biaya pendaftaran, rekrutmen, administrasi & biaya lain dalam bentuk apapun. Freelancer hanya akan dikenakan 10% biaya komisi dari total nilai job yang berhasil diselesaikan dengan baik'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'Isi Content: 4. Apa keunggulan menggunakan Sribulancer?\nBanyak sekali keunggulan Sribulancer yang dapat dirasakan manfaatnya oleh freelancer. Dimulai dari jumlah lowongan pekerjaan yang tersedia hingga sebanyak 16,100 klien, 138 jenis job yang dapat dikerjakan, sistem Safepay yang melindungi freelancer, hingga Support Tim Admin Sribulancer yang siaga setiap saat.'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/div_4.Apa keunggulan menggunakan Sribulancer'))

'Isi Content: 5. Bagaimana cara mendapatkan pekerjaan dari Sribulancer? \nSeorang freelancer bisa mendapatkan job melalui posting iklan lowongan pekerjaan yang tersedia ataupun direkrut langsung oleh klien & tim Sribulancer.'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'Isi Content: 6. Apa itu Workspace? \nWorkspace adalah sebuah wadah komunikasi & ruang kerja online berupa platform messenger yang disediakan oleh Sribulancer untuk klien & Sribulancer. Di dalam workspace, telah tersedia fitur upload & download file yang lengkap sehingga seluruh proses job dapat berjalan mudah, cepat & terpercaya.'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

