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

'Step 13: At Page plugins servlet com thinktilt proforma add-on project-forms, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_project-forms/div_object'))

'Step 14: At Page plugins servlet com thinktilt proforma add-on project-forms, click on h1 project config header name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_project-forms/h1_project_config_header_name'))

'Step 15: At Page plugins servlet com thinktilt proforma add-on project-forms, input on input shifter dialog field'

WebUI.setText(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_project-forms/input_shifter_dialog_field'), input_shifter_dialog_field)

'Step 16: At Page plugins servlet com thinktilt proforma add-on project-forms, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_project-forms/div_object_1'))

'Step 17: At Page plugins servlet com thinktilt proforma add-on project-forms, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_project-forms/div_object_1'))

'Step 18: At Page plugins servlet com thinktilt proforma add-on project-forms, input on input shifter dialog field'

WebUI.setText(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_project-forms/input_shifter_dialog_field'), input_shifter_dialog_field_1)

'Step 19: At Page plugins servlet com thinktilt proforma add-on project-forms, click on em object > navigate to Page secure admin EditAnnouncementBanner'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_plugins_servlet_com_thinktilt_proforma_add-on_project-forms/em_object'))

'Step 20: At Page secure admin EditAnnouncementBanner, input on input websudopassword'

WebUI.setText(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/input_websudopassword'), input_websudopassword_1)

'Step 21: At Page secure admin EditAnnouncementBanner, click on button login form submit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/button_login_form_submit'))

'Step 22: At Page secure admin EditAnnouncementBanner, click on textarea announcement'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/textarea_announcement'))

'Step 23: At Page secure admin EditAnnouncementBanner, click on hyperlink general configuration'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/hyperlink_general_configuration'))

'Step 24: At Page secure admin EditAnnouncementBanner, click on hyperlink browse link'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/hyperlink_browse_link'))

'Step 25: At Page secure admin EditAnnouncementBanner, click on hyperlink global if link'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/hyperlink_global_if_link'))

'Step 26: At Page secure admin EditAnnouncementBanner, click on input proforma q22t'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/input_proforma_q22t'))

'Step 27: At Page secure admin EditAnnouncementBanner, input on input proforma q22t'

WebUI.setText(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/input_proforma_q22t'), input_proforma_q22t)

'Step 28: At Page secure admin EditAnnouncementBanner, click on button create > navigate to Page browse'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure_admin_EditAnnouncementBanner/button_create'))

'Step 29: At Page browse, click on div websudo banner'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/div_websudo_banner'))

'Step 30: At Page browse, click on hyperlink global if link'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/hyperlink_global_if_link'))

'Step 31: At Page browse, click on button issue create change form btn'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/button_issue_create_change_form_btn'))

'Step 32: At Page browse, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_browse/div_object'))

'Step 33: Add visual checkpoint at Page browse'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Creation of Announcement Banner_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
