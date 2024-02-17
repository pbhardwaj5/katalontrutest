import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page secure admin ViewLogging jspa'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/secure/admin/ViewLogging.jspa')

'Step 2: Login into Application'

TrueTestScripts.login()

'Step 3: At Page secure admin ViewLogging jspa, input on input websudopassword'

WebUI.setText(findTestObject('AI-Generated/Page_secure_admin_ViewLogging_jspa/input_websudopassword'), input_websudopassword)

'Step 4: At Page secure admin ViewLogging jspa, click on button login form submit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_ViewLogging_jspa/button_login_form_submit'))

'Step 5: At Page secure admin ViewLogging jspa, click on hyperlink manage apps > navigate to Page plugins servlet upm marketplace featured'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_ViewLogging_jspa/hyperlink_manage_apps'))

'Step 6: At Page plugins servlet upm marketplace featured, click on hyperlink com thinktilt proforma add on admin proj > navigate to Page plugins servlet com thinktilt proforma add-on admin-project'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_upm_marketplace_featured/hyperlink_com_thinktilt_proforma_add_on_admin_proj'))

'Step 7: At Page plugins servlet com thinktilt proforma add-on admin-project, click on hyperlink com thinktilt proforma add on admin form > navigate to Page plugins servlet com thinktilt proforma add-on admin-forms'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_admin-project/hyperlink_com_thinktilt_proforma_add_on_admin_form'))

'Step 8: At Page plugins servlet com thinktilt proforma add-on admin-forms, click on button create form > navigate to Page plugins servlet com thinktilt proforma add-on form-builder'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_admin-forms/button_create_form'))

'Step 9: At Page plugins servlet com thinktilt proforma add-on form-builder, click on button building access'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_form-builder/button_building_access'))

'Step 10: At Page plugins servlet com thinktilt proforma add-on form-builder, click on button insert template'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_form-builder/button_insert_template'))

'Step 11: At Page plugins servlet com thinktilt proforma add-on form-builder, click on button save'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_form-builder/button_save'))

'Step 12: At Page plugins servlet com thinktilt proforma add-on form-builder, click on button close > navigate to Page plugins servlet com thinktilt proforma add-on project-forms'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_form-builder/button_close'))

'Step 13: At Page plugins servlet com thinktilt proforma add-on project-forms, click on button copy'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_project-forms/button_copy'))

'Step 14: Add visual checkpoint at Page plugins servlet com thinktilt proforma add-on project-forms'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Successful Copying of Project Forms_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
