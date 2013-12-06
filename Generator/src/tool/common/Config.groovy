package tool.common

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Config  {
	public static Map<String,String> namingMap =new HashMap<String,String>()
	static{
		Config.namingMap.put("ＬＲＭＳ介護_T_LRMS_CARE_HOSHO_KIHON", "lrmsKaigoTLrmsCareHoshoKihon")
		Config.namingMap.put("共通部_T_KRNS_PLAN_FAMILY", "kyoutsuTKrnsPlanFamily")
		Config.namingMap.put("ＬＲＭＳ相続_T_LRMS_SOGAKU_KIHON", "lrmsSouzokuTLrmsSogakuKihon")
		Config.namingMap.put("ＬＲＭＳ相続_T_LRMS_SOGAKU_ZISN", "lrmsSouzokuTLrmsSogakuZisn")
		Config.namingMap.put("ＬＲＭＳ介護_Lcsc0501Collection", "lrmsKaigoLcsc050Collection")
		Config.namingMap.put("共通部_LtPlanCollection", "kyotsuLtPlanCollection")
		Config.namingMap.put("共通部_PlanFamilyCollection", "kyotsuPlanFamilyCollection")
		Config.namingMap.put("ＬＲＭＳ相続_Lisc0001Collection", "lrmsSouzokuLisc0001Collection")
		Config.namingMap.put("ＬＲＭＳ相続_Lisc000101Collection", "lrmsSouzokuLisc000101Collection")
		Config.namingMap.put("ＬＲＭＳ相続_lbsc0002Collection", "lrmsSouzokulbsc0002Collection")
	}
}