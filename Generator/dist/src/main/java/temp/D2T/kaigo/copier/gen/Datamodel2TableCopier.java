package temp.D2T.kaigo.copier.gen;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.D2T.kaigo.datamodel.gen.LtPlanCollection;
import temp.D2T.kaigo.datamodel.gen.Lcsc0501Collection;
import temp.D2T.kaigo.entity.gen.TLrmsCareHoshoKihon;


class Datamodel2TableCopier{


	/*
	 * データ変換処理：
	 * ＬＲＭＳ介護:T_LRMS_CARE_HOSHO_KIHON
	 */
	static public TLrmsCareHoshoKihon ＬＲＭＳ介護_T_LRMS_CARE_HOSHO_KIHON(LtPlanCollection ltPlanCollection, Lcsc0501Collection lcsc0501Collection){
		TLrmsCareHoshoKihon result=new TLrmsCareHoshoKihon();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:取扱者ID key名:toriatsukaishaId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:取扱者ID 物理:AGENT_ID 属性:Varchar2 桁数:4 少数: 備考:
			//TODO:
			result.setAgentId(ConverterUtility.convert(String.class,ltPlanCollection.getToriatsukaishaId()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:顧客ID key名:kokyakuId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:顧客ID 物理:CUST_ID 属性:Varchar2 桁数:30 少数: 備考:
			//TODO:
			result.setCustId(ConverterUtility.convert(String.class,ltPlanCollection.getKokyakuId()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:分析種別 key名:bunsekiShubetsu 型: 備考: 03(介護保障分析)
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:分析種別コード 物理:BUNSEKI_SB_CD 属性:Char 桁数:2 少数: 備考:
			//TODO:
			result.setBunsekiSbCd(ConverterUtility.convert(String.class,ltPlanCollection.getBunsekiShubetsu()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:コメント key名:comment 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:分析一覧コメント 物理:BUNSEKI_COMMENT 属性:Varchar2 桁数:30 少数: 備考:
			//TODO:
			result.setBunsekiComment(ConverterUtility.convert(String.class,ltPlanCollection.getComment()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:プラン作成日時 key名:planCreated 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:分析実施日 物理:BUNSEKI_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			result.setBunsekiCreateDate(ConverterUtility.convert(java.util.Date.class,ltPlanCollection.getPlanCreated()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:プラン更新日時 key名:planUpdated 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:分析最終更新日 物理:BUNSEKI_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			result.setBunsekiUpdateDate(ConverterUtility.convert(java.util.Date.class,ltPlanCollection.getPlanUpdated()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:設計プランNo key名:sekkeiPlanNo 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:設計プランNO 物理:SEKKEI_PLAN_NO 属性:Varchar2 桁数:20 少数: 備考:
			//TODO:
			result.setSekkeiPlanNo(ConverterUtility.convert(String.class,ltPlanCollection.getSekkeiPlanNo()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:被保険者ID key名:insuredId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:被保険者ＩＤ 物理:INSURED_ID 属性:Varchar2 桁数:17 少数: 備考:
			//TODO:
			result.setInsuredId(ConverterUtility.convert(String.class,ltPlanCollection.getInsuredId()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:介護タイプ key名:careType 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:介護タイプコード 物理:CARE_TYPE_CD 属性:Char 桁数:1 少数: 備考:２桁にする？
			//TODO:
			result.setCareTypeCd(ConverterUtility.convert(String.class,lcsc0501Collection.getCareType()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:介護タイプ選択 key名:radioType 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:在宅/施設介護詳細コード 物理:ZITK_SSET_CARE_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setZitkSsetCareCd(ConverterUtility.convert(String.class,lcsc0501Collection.getRadioType()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:介護必要期間入力欄 key名:careKikan 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:介護必要年数 物理:CARE_HITSUYO_NENSU 属性:Number 桁数:2 少数: 備考:
			//TODO:
			result.setCareHitsuyoNensu(ConverterUtility.convert(java.math.BigDecimal.class,lcsc0501Collection.getCareKikan()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:一時金 key名:temporaryMoney 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障一時金 物理:JZKGHS_ICHIJIKIN 属性:Number 桁数:11 少数: 備考:？×1000？
			//TODO:
			result.setJzkghsIchijikin(ConverterUtility.convert(java.math.BigDecimal.class,lcsc0501Collection.getTemporaryMoney()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:介護年金 key名:careNenkin 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障年金 物理:JZKGHS_NENKIN 属性:Number 桁数:11 少数: 備考:？×1000？
			//TODO:
			result.setJzkghsNenkin(ConverterUtility.convert(java.math.BigDecimal.class,lcsc0501Collection.getCareNenkin()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:介護年金受取期間 key名:careNenkinUketorikikan 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障年金受取期間 物理:JZKGHS_NENKIN_KIKAN 属性:Number 桁数:2 少数: 備考:
			//TODO:
			result.setJzkghsNenkinKikan(ConverterUtility.convert(java.math.BigDecimal.class,lcsc0501Collection.getCareNenkinUketorikikan()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:保障期間 key名:hosyoKikan 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障期間 物理:JZKGHS_KIKAN 属性:Number 桁数:2 少数: 備考:
			//TODO:
			result.setJzkghsKikan(ConverterUtility.convert(java.math.BigDecimal.class,lcsc0501Collection.getHosyoKikan()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:保障期間単位リスト key名:listHosyoKikanTani 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障期間単位コード 物理:JZKGHS_KIKAN_TANI_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setJzkghsKikanTaniCd(ConverterUtility.convert(String.class,lcsc0501Collection.getListHosyoKikanTani()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:払込期間 key名:haraikomiKikan 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障払込期間 物理:JZKGHS_HARAIKOMIKIKAN 属性:Number 桁数:2 少数: 備考:
			//TODO:
			result.setJzkghsHaraikomikikan(ConverterUtility.convert(java.math.BigDecimal.class,lcsc0501Collection.getHaraikomiKikan()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:払込期間単位リスト key名:listHaraikomiKikanTani 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障払込期間単位コード 物理:JZKGHS_HARAIKOMI_TANI_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setJzkghsHaraikomiTaniCd(ConverterUtility.convert(String.class,lcsc0501Collection.getListHaraikomiKikanTani()));
		}
		{
			//FROM:画面データモデル:Lcsc0501 入力:解約返戻金有無 key名:checkModoshikin 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:準備済介護保障返戻金有無コード 物理:JZKGHS_W_UMU_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setJzkghsWUmuCd(ConverterUtility.convert(String.class,lcsc0501Collection.getCheckModoshikin()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_CARE_HOSHO_KIHON 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

}
