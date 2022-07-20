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

Mobile.tap(findTestObject('User/Profil/android.widget.Button - Edit Profil'), 0)

Mobile.tap(findTestObject('User/Profil/Edit Profil/android.view.View-change password'), 0)

Mobile.tap(findTestObject('User/Profil/Edit Profil/android.widget.EditText - Enter your old password'), 0)

Mobile.setText(findTestObject('User/Profil/Edit Profil/android.widget.EditText - Enter your old password'), 'Maudy12345', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('User/Profil/Edit Profil/android.widget.EditText - Enter your password'), 0)

Mobile.setText(findTestObject('User/Profil/Edit Profil/android.widget.EditText - Enter your password'), 'Qwer1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('User/Profil/Edit Profil/android.widget.EditText - Enter the same password'), 0)

Mobile.setText(findTestObject('User/Profil/Edit Profil/android.widget.EditText - Enter the same password'), 'Qwer1234', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('User/Profil/Edit Profil/android.widget.Button-save changes password'), 0)
