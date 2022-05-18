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

'1. Bagaimana cara merekrut Freelancer?\nSetiap klien bisa merekrut freelancer dengan cara memasang iklan lowongan pekerjaan dengan GRATIS. Selain itu, tersedia juga fitur Chat & Hire untuk merekrut freelancer secara langsung. Sribulancer juga menyediakan paket jasa yang lengkap & praktis dengan jasa freelancer terpilih & terekomendasi.'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'2. Bagaimana cara untuk memasang proyek freelancer?\nMemasang iklan lowongan pekerjaan di Sribulancer sangat mudah sekali. Cukup klik Buat Job & ikuti langkah-langkah yang telah dilengkapi dengan panduan singkat untuk menuntun proses pemasangan iklan pekerjaan Anda.'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'3. Pekerjaan apa saja yang dapat dikerjakan di Sribulancer?\nDi Sribulancer, jenis pekerjaan yang dapat dikerjakan oleh Freelancer kami terdiri dari 8 kategori utama dengan 138 subkategori khusus. Dimulai dari pengembangan website, penulisan, social media marketing, jasa SEO, penerjemahan, desain grafis hingga konsultasi hukum dapat Anda dapatkan dengan mudah.'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'4. Apakah saya diperbolehkan bertemu dengan freelancer? \nSribulancer menganjurkan agar seluruh komunikasi antar klien & freelancer tetap menggunakan platform messenger atau workspace yang tersedia di Sribulancer. Hal ini adalah demi mencegah terjadinya penipuan, hit & run & resiko lain yang mungkin terjadi tanpa mediasi & kontrol dari Sribulancer.\n'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'5. Berapa harga jasa Sribulancer? \nKlien memilliki kebebasan untuk menentukan budget nilai pekerjaan. Walaupun Sribulancer menetapkan Batas Minimum untuk jenis pekerjaan, namun klien masih bisa melakukan penawaran harga dengan freelancer yang melamar di pekerjaan Anda.'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

'6. Setelah Pekerjaan selesai, apa langkah selanjutnya?\nSelamat! Setelah pekerjaan Anda diterima dengan baik, silahkan menutup workspace & Sribulancer akan segera memproses pembayaran untuk freelancing Anda. Perlu diingat bahwa Sribulancer akan menutup workspace secara otomatis apabila Anda sudah menerima hasil pekerjaan namun belum menutup workspace dalam kurun waktu yang sudah ditentukan. Hal ini dilakukan agar Freelancer dapat menerima pembayaran.'
WebUI.click(findTestObject('Object Repository/Page_Cari Freelancer Indonesia, Selesaikan _96a419/img'))

