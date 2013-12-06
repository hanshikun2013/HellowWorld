package temp.D2T.kyotsu.copier.gen;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.D2T.kyotsu.datamodel.gen.LtPlanCollection;
import temp.D2T.kyotsu.datamodel.gen.PlanFamilyCollection;
import temp.D2T.kyotsu.entity.gen.TKrnsPlanFamily;


class Datamodel2TableCopier{


	/*
	 * データ変換処理：
	 * 共通部:T_KRNS_PLAN_FAMILY
	 */
	static public TKrnsPlanFamily 共通部_T_KRNS_PLAN_FAMILY(LtPlanCollection ltPlanCollection, PlanFamilyCollection planFamilyCollection){
		TKrnsPlanFamily result=new TKrnsPlanFamily();
		{
			//FROM:画面データモデル:LtPlan 入力:プランID key名:planId 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 備考:
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,ltPlanCollection.getPlanId()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:家族No key名:familyNo 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:家族コード 物理:FAMILY_CD 属性:Char 桁数:2 少数: 備考:
			//TODO:
			result.setFamilyCd(ConverterUtility.convert(String.class,planFamilyCollection.getFamilyNo()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:名前（漢字） key名:kanjiName 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:家族氏名（漢字） 物理:FAMILY_NAME_KANJI 属性:Varchar2 桁数:32 少数: 備考:
			//TODO:
			result.setFamilyNameKanji(ConverterUtility.convert(String.class,planFamilyCollection.getKanjiName()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:名前（カナ） key名:kanaName 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:家族氏名（カナ） 物理:FAMILY_NAME_KANA 属性:Varchar2 桁数:32 少数: 備考:
			//TODO:
			result.setFamilyNameKana(ConverterUtility.convert(String.class,planFamilyCollection.getKanaName()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:生年月日 key名:dateOfBirth 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:生年月日 物理:BIRTH 属性:Date 桁数:　 少数: 備考:
			//TODO:
			result.setBirth(ConverterUtility.convert(java.util.Date.class,planFamilyCollection.getDateOfBirth()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:年齢 key名:age 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:年齢 物理:AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setAge(ConverterUtility.convert(java.math.BigDecimal.class,planFamilyCollection.getAge()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:生年月日・年齢選択フラグ key名:dateAgeFlg 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:生年月日・年齢選択コード 物理:BIRTH_AGE_SELECT_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setBirthAgeSelectCd(ConverterUtility.convert(String.class,planFamilyCollection.getDateAgeFlg()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:続柄 key名:zokugara 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:続柄コード 物理:ZOKUGARA_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setZokugaraCd(ConverterUtility.convert(String.class,planFamilyCollection.getZokugara()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:性別 key名:gender 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:性別コード 物理:SEX_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setSexCd(ConverterUtility.convert(String.class,planFamilyCollection.getGender()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:仕事 key名:job 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:職業コード 物理:JOB_CD 属性:Char 桁数:1 少数: 備考:
			//TODO:
			result.setJobCd(ConverterUtility.convert(String.class,planFamilyCollection.getJob()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:年収 key名:annualIncome 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:年収 物理:NENSHU 属性:Number 桁数:11 少数: 備考:×10000をセット
			//TODO:
			result.setNenshu(ConverterUtility.convert(java.math.BigDecimal.class,planFamilyCollection.getAnnualIncome()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:退職予定年齢 key名:retirementAge 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:退職予定年齢 物理:TAISHOKU_PLAN_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setTaishokuPlanAge(ConverterUtility.convert(java.math.BigDecimal.class,planFamilyCollection.getRetirementAge()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:平均寿命 key名:heikinJumyo 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:平均余命 物理:HEIKIN_YOMEI 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setHeikinYomei(ConverterUtility.convert(java.math.BigDecimal.class,planFamilyCollection.getHeikinJumyo()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:入社年齢 key名:enterCompanyAge 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数: 備考:
			//TODO:
			result.setNyushaAge(ConverterUtility.convert(java.math.BigDecimal.class,planFamilyCollection.getEnterCompanyAge()));
		}
		{
			//FROM:画面データモデル:PlanFamily 入力:イメージ画像 key名:image 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:イメージ画像コード 物理:IMEJI_GAZOU_CD 属性:Char 桁数:8 少数: 備考:
			//TODO:
			result.setImejiGazouCd(ConverterUtility.convert(String.class,planFamilyCollection.getImage()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemCreateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}
		{
			//FROM:画面データモデル:登録時のSYSDATEをセット 入力: key名: 型: 備考: 
			//TO:テーブル.テーブル:T_KRNS_PLAN_FAMILY 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数: 備考:
			//TODO:
			//result.setSystemUpdateDate(ConverterUtility.convert(java.util.Date.class,登録時のSYSDATEをセットCollection.get()));
		}

		return result;

	}

}
