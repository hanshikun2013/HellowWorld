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
		
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_HYSKN_EVENT", "transferTLrms2LfHysknEvent")
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_HYSKN_JUTAKU", "transferTLrms2LfHysknJutaku")
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_HYSKN_LIFE", "transferTLrms2LfHysknLife")
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_HYSKN_OTHER", "transferTLrms2LfHysknOther")
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_JZSKN_NKJKM", "transferTLrms2LfJzsknNkjkm")
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_JZSKN_NKKNM", "transferTLrms2LfJzsknNkknm")
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_JZSKN_OTHER", "transferTLrms2LfJzsknOther")
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_JZSKN_SHUNYU", "transferTLrms2LfJzsknShunyu")
		Config.namingMap.put("ＬＲＭＳセカンドライフ_T_LRMS_2LF_KIHON", "transferTLrms2LfKihon")
		
		
		
		
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc0201Collection", "transferLlsc0201Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020201Collection", "transferLlsc020201Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020202Collection", "transferLlsc020202Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020203Collection", "transferLlsc020203Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020204Collection", "transferLlsc020204Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020205Collection", "transferLlsc020205Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020206Collection", "transferLlsc020206Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc0204Collection", "transferLlsc0204Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020501Collection", "transferLlsc020501Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020502Collection", "transferLlsc020502Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc020503Collection", "transferLlsc020503Collection")
		Config.namingMap.put("ＬＲＭＳ死亡保障_Llsc0207Collection", "transferLlsc0207Collection")
		
		
		Config.namingMap.put("_Lrsc0301Collection", "transferLrsc0301Collection")
		Config.namingMap.put("_Lrsc030201Collection", "transferLrsc030201Collection")
		Config.namingMap.put("_Lrsc030202Collection", "transferLrsc030202Collection")
		Config.namingMap.put("_Lrsc030203Collection", "transferLrsc030203Collection")
		Config.namingMap.put("_Lrsc030204Collection", "transferLrsc030204Collection")
		Config.namingMap.put("_Lrsc0304Collection", "transferLrsc0304Collection")
		Config.namingMap.put("_Lrsc030501Collection", "transferLrsc030501Collection")
		Config.namingMap.put("_Lrsc030502Collection", "transferLrsc030502Collection")
		Config.namingMap.put("_Lrsc030503Collection", "transferLrsc030503Collection")
		Config.namingMap.put("_Lrsc030701Collection", "transferLrsc030701Collection")
		
		
	}
}