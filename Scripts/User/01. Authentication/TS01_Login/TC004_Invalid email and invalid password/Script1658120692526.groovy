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

Mobile.startApplication('C:\\Users\\windows\\Downloads\\Telegram Desktop\\app-release.apk', false)

Mobile.tap(findTestObject('User/Authentication/Login/android.widget.EditText - Enter your email'), 0)

Mobile.setText(findTestObject('User/Authentication/Login/android.widget.EditText - Enter your email'), 'maudy.ayunda@gmail.com', 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('User/Authentication/Login/android.widget.EditText - Enter your password'), 0)

Mobile.setText(findTestObject('User/Authentication/Login/android.widget.EditText - Enter your password'), 'Qwer1234', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('User/Authentication/Login/android.widget.Button - Login Submit'), 0)

Mobile.closeApplication()

