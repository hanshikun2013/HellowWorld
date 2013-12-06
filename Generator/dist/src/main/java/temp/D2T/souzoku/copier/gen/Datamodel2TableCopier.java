package temp.D2T.souzoku.copier.gen;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.D2T.souzoku.datamodel.gen.LtPlanCollection;
import temp.D2T.souzoku.datamodel.gen.Lisc0001Collection;
import temp.D2T.souzoku.datamodel.gen.Lisc000101Collection;
import temp.D2T.souzoku.entity.gen.TLrmsSogakuKihon;
import temp.D2T.souzoku.entity.gen.TLrmsSogakuZisn;


class Datamodel2TableCopier{


	/*
	 * データ変換処理：
	 * ＬＲＭＳ相続:T_LRMS_SOGAKU_KIHON
	 */
	static public TLrmsSogakuKihon ＬＲＭＳ相続_T_LRMS_SOGAKU_KIHON(LtPlanCollection ltPlanCollection, Lisc0001Collection lisc0001Collection){
		TLrmsSogakuKihon result=new TLrmsSogakuKihon();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:取扱者ID key名:toriatsukaishaId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:取扱者ID 物理:AGENT_ID 属性:Varchar2 桁数:4 少数: 備考:
			//TODO:
			result.setAgentId(ConverterUtility.convert(String.class,ltPlanCollection.getToriatsukaishaId()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:顧客ID key名:kokyakuId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:顧客ID 物理:CUST_ID 属性:Varchar2 桁数:30 少数: 備考:
			//TODO:
			result.setCustId(ConverterUtility.convert(String.class,ltPlanCollection.getKokyakuId()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:分析種別 key名:bunsekiShubetsu 型: 備考: 05(相続税簡易試算)
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:分析種別コード 物理:BUNSEKI_SB_CD 属性:Char 桁数:2 少数: 備考:
			//TODO:
			result.setBunsekiSbCd(ConverterUtility.convert(String.class,ltPlanCollection.getBunsekiShubetsu()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:プラン作成日時 key名:planCreated 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:分析実施日 物理:BUNSEKI_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			result.setBunsekiCreateDate(ConverterUtility.convert(java.util.Date.class,ltPlanCollection.getPlanCreated()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:プラン更新日時 key名:planUpdated 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:分析最終更新日 物理:BUNSEKI_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			result.setBunsekiUpdateDate(ConverterUtility.convert(java.util.Date.class,ltPlanCollection.getPlanUpdated()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:コメント key名:comment 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:分析一覧コメント 物理:BUNSEKI_COMMENT 属性:Varchar2 桁数:30 少数: 備考:
			//TODO:
			result.setBunsekiComment(ConverterUtility.convert(String.class,ltPlanCollection.getComment()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:設計プランNo key名:sekkeiPlanNo 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:設計プランNO 物理:SEKKEI_PLAN_NO 属性:Varchar2 桁数:20 少数: 備考:
			//TODO:
			result.setSekkeiPlanNo(ConverterUtility.convert(String.class,ltPlanCollection.getSekkeiPlanNo()));
		}
		{
			//FROM:画面データモデル:LtPlan 入力:被保険者ID key名:insuredId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:被保険者ＩＤ 物理:INSURED_ID 属性:Varchar2 桁数:17 少数: 備考:
			//TODO:
			result.setInsuredId(ConverterUtility.convert(String.class,ltPlanCollection.getInsuredId()));
		}
		{
			//FROM:画面データモデル:Lisc0001 入力:配偶者有無 key名:maritalStatus 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:配偶者有無コード 物理:SPOUSE_UMU_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setSpouseUmuCd(ConverterUtility.convert(String.class,lisc0001Collection.getMaritalStatus()));
		}
		{
			//FROM:画面データモデル:Lisc0001 入力:法定相続人設定 key名:settingOfHeir 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:法定相続人種別コード 物理:HTSZN_SB_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setHtsznSbCd(ConverterUtility.convert(String.class,lisc0001Collection.getSettingOfHeir()));
		}
		{
			//FROM:画面データモデル:Lisc0001 入力:相続人数 key名:heirNumber 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:法定相続人数 物理:HTSZN_CNT 属性:Number 桁数:1 少数: 備考:
			//TODO:
			result.setHtsznCnt(ConverterUtility.convert(java.math.BigDecimal.class,lisc0001Collection.getHeirNumber()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_KIHON 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * ＬＲＭＳ相続:T_LRMS_SOGAKU_ZISN
	 */
	static public TLrmsSogakuZisn ＬＲＭＳ相続_T_LRMS_SOGAKU_ZISN(LtPlanCollection ltPlanCollection, Lisc000101Collection lisc000101Collection){
		TLrmsSogakuZisn result=new TLrmsSogakuZisn();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_ZISN 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:Lisc000101 入力:ID key名:id 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_ZISN 論理:SEQ 物理:SEQ 属性:Number 桁数:1 少数: 備考:
			//TODO:
			result.setSeq(ConverterUtility.convert(java.math.BigDecimal.class,lisc000101Collection.getId()));
		}
		{
			//FROM:画面データモデル:Lisc000101 入力:相続財産 key名:inheritance 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_ZISN 論理:相続財産コード 物理:SOZOKU_ZISN_CD 属性:Char 桁数:2 少数: 備考:
			//TODO:
			result.setSozokuZisnCd(ConverterUtility.convert(String.class,lisc000101Collection.getInheritance()));
		}
		{
			//FROM:画面データモデル:Lisc000101 入力:評価額 key名:appraisedValue 型:NUMBER 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_ZISN 論理:相続財産評価額 物理:SOZOKU_GAKU 属性:Number 桁数:11 少数: 備考:
			//TODO:
			result.setSozokuGaku(ConverterUtility.convert(java.math.BigDecimal.class,lisc000101Collection.getAppraisedValue()));
		}
		{
			//FROM:画面データモデル:Lisc000101 入力:相続人 key名:heir 型:CODE 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_ZISN 論理:法定相続人種別（個別）コード 物理:HTSZN_SB_KOBETSU_CD 属性:Char 桁数:2 少数: 備考:
			//TODO:
			result.setHtsznSbKobetsuCd(ConverterUtility.convert(String.class,lisc000101Collection.getHeir()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_ZISN 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_LRMS_SOGAKU_ZISN 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

}
