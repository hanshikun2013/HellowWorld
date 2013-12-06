package temp.T2D.kaigo.copier.gen;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.T2D.kaigo.datamodel.gen.Lcsc0501Collection;
import temp.T2D.kaigo.entity.gen.TLrmsCareHoshoKihon;


class Table2DatamodelCopier{


	/*
	 * データ変換処理：
	 * ＬＲＭＳ介護:Lcsc0501Collection
	 */
	static public Lcsc0501Collection ＬＲＭＳ介護_Lcsc0501Collection(TLrmsCareHoshoKihon tLrmsCareHoshoKihon){
		Lcsc0501Collection result=new Lcsc0501Collection();
		{
			//FROM:テーブル:０をセット 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:ID key名:id 型:NUMBER 備考: 
			//TODO:
			//result.setId(ConverterUtility.convert(String.class,０をセット.get()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:介護タイプコード 物理:CARE_TYPE_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護タイプ key名:careType 型:CODE 備考: 
			//TODO:
			result.setCareType(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getCareTypeCd()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:在宅/施設介護詳細コード 物理:ZITK_SSET_CARE_CD 属性:Char 桁数:1 少数:  備考:２桁にする？
			//TO:画面データモデル: Lcsc0501 入力:介護タイプ選択 key名:radioType 型:CODE 備考: 
			//TODO:
			result.setRadioType(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getZitkSsetCareCd()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:介護必要年数 物理:CARE_HITSUYO_NENSU 属性:Number 桁数:2 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護必要期間入力欄 key名:careKikan 型:NUMBER 備考: 
			//TODO:
			result.setCareKikan(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getCareHitsuyoNensu()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障一時金 物理:JZKGHS_ICHIJIKIN 属性:Number 桁数:11 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:一時金 key名:temporaryMoney 型:NUMBER 備考: ？÷1000？
			//TODO:
			result.setTemporaryMoney(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getJzkghsIchijikin()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障年金 物理:JZKGHS_NENKIN 属性:Number 桁数:11 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護年金 key名:careNenkin 型:NUMBER 備考: ？÷1000？
			//TODO:
			result.setCareNenkin(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getJzkghsNenkin()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障年金受取期間 物理:JZKGHS_NENKIN_KIKAN 属性:Number 桁数:2 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護年金受取期間 key名:careNenkinUketorikikan 型:NUMBER 備考: 
			//TODO:
			result.setCareNenkinUketorikikan(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getJzkghsNenkinKikan()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障期間 物理:JZKGHS_KIKAN 属性:Number 桁数:2 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:保障期間 key名:hosyoKikan 型:NUMBER 備考: 
			//TODO:
			result.setHosyoKikan(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getJzkghsKikan()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障期間単位コード 物理:JZKGHS_KIKAN_TANI_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:保障期間単位リスト key名:listHosyoKikanTani 型:CODE 備考: 
			//TODO:
			result.setListHosyoKikanTani(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getJzkghsKikanTaniCd()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障払込期間 物理:JZKGHS_HARAIKOMIKIKAN 属性:Number 桁数:2 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:払込期間 key名:haraikomiKikan 型:NUMBER 備考: 
			//TODO:
			result.setHaraikomiKikan(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getJzkghsHaraikomikikan()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障払込期間単位コード 物理:JZKGHS_HARAIKOMI_TANI_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:払込期間単位リスト key名:listHaraikomiKikanTani 型:CODE 備考: 
			//TODO:
			result.setListHaraikomiKikanTani(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getJzkghsHaraikomiTaniCd()));
		}
		{
			//FROM:テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障返戻金有無コード 物理:JZKGHS_W_UMU_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:解約返戻金有無 key名:checkModoshikin 型:CODE 備考: 
			//TODO:
			result.setCheckModoshikin(ConverterUtility.convert(String.class,tLrmsCareHoshoKihon.getJzkghsWUmuCd()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:家族No key名:familyNo 型:String 備考: 
			//TODO:
			//result.setFamilyNo(ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護タイプ文字 key名:careTypeString 型:String 備考: 
			//TODO:
			//result.setCareTypeString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護タイプ選択文字 key名:radioTypeString 型:String 備考: 
			//TODO:
			//result.setRadioTypeString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:要介護度選択リスト key名:listCareLevel 型:CODE 備考: 
			//TODO:
			//result.setListCareLevel(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:要介護度選択リスト文字 key名:listCareLevelString 型:String 備考: 
			//TODO:
			//result.setListCareLevelString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護開始時の初期費用 key名:initialCost 型:NUMBER 備考: 
			//TODO:
			//result.setInitialCost(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護期間中の自己負担（月額） key名:monthsOwnExpenses 型:NUMBER 備考: 
			//TODO:
			//result.setMonthsOwnExpenses(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護期間中の自己負担（年額） key名:yearsOwnExpenses 型:NUMBER 備考: 
			//TODO:
			//result.setYearsOwnExpenses(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:必要費用合計 key名:totalCost 型:NUMBER 備考: 
			//TODO:
			//result.setTotalCost(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:初期費用（福祉用具費用） key名:assistiveDeviceList 型:String[][] 備考: 
			//TODO:
			//result.setAssistiveDeviceList(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:初期費用（福祉用具費用 介護保険からの給付） key名:assistiveDeviceCareAmount 型:NUMBER 備考: 
			//TODO:
			//result.setAssistiveDeviceCareAmount(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:初期費用（福祉用具費用 自己負担） key名:assistiveDeviceOwnExpenses 型:NUMBER 備考: 
			//TODO:
			//result.setAssistiveDeviceOwnExpenses(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:初期費用（住宅改修費） key名:homeImprovementList 型:String[][] 備考: 
			//TODO:
			//result.setHomeImprovementList(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:初期費用（住宅改修費用 介護保険からの給付） key名:homeImprovementCareAmount 型:NUMBER 備考: 
			//TODO:
			//result.setHomeImprovementCareAmount(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:初期費用（住宅改修費用 自己負担） key名:homeImprovementOwnExpenses 型:NUMBER 備考: 
			//TODO:
			//result.setHomeImprovementOwnExpenses(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:初期費用（介護サービス利用額合計） key名:initialCostTotalCost 型:NUMBER 備考: 
			//TODO:
			//result.setInitialCostTotalCost(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:初期費用（介護保険からの給付） key名:initialCostCareAmount 型:NUMBER 備考: 
			//TODO:
			//result.setInitialCostCareAmount(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護期間中(内訳) key名:periodCostList 型:String[][] 備考: 
			//TODO:
			//result.setPeriodCostList(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護期間中（月額サービスの利用合計額） key名:periodCostTotalCost 型:NUMBER 備考: 
			//TODO:
			//result.setPeriodCostTotalCost(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護期間中（要介護度別の支給限度額） key名:periodCostCareAmount 型:NUMBER 備考: 
			//TODO:
			//result.setPeriodCostCareAmount(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護期間中（支給限度額超過分） key名:periodCostCareAmountOutLimit 型:NUMBER 備考: 
			//TODO:
			//result.setPeriodCostCareAmountOutLimit(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護期間中（支給限度額内のサービス利用1割負担） key名:periodCostTenPerExpenses 型:NUMBER 備考: 
			//TODO:
			//result.setPeriodCostTenPerExpenses(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:介護期間中（支給限度額超過分のサービス利用） key名:periodCostAllExpenses 型:NUMBER 備考: 
			//TODO:
			//result.setPeriodCostAllExpenses(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:分析年齢 key名:simulationAge 型:NUMBER 備考: 
			//TODO:
			//result.setSimulationAge(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:準備済み補償額 key名:hosyoMoney 型:NUMBER 備考: 
			//TODO:
			//result.setHosyoMoney(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:過不足額 key名:excessDeficiency 型:NUMBER 備考: 
			//TODO:
			//result.setExcessDeficiency(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:保障期間単位リスト文字 key名:listHosyoKikanTaniString 型:String 備考: 
			//TODO:
			//result.setListHosyoKikanTaniString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:払込期間単位リスト文字 key名:listHaraikomiKikanTaniString 型:String 備考: 
			//TODO:
			//result.setListHaraikomiKikanTaniString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:解約返戻金有無文字 key名:checkModoshikinString 型:String 備考: 
			//TODO:
			//result.setCheckModoshikinString(ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: Lcsc0501 入力:平均余命 key名:lifeSpanAvg 型:NUMBER 備考: 
			//TODO:
			//result.setLifeSpanAvg(ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

}
