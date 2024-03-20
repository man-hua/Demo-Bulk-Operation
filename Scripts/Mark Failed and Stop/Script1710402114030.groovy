import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

KeywordUtil.markFailedAndStop("Mark Failed And Stop")

WebUI.openBrowser(GlobalVariable.G_SiteURL)