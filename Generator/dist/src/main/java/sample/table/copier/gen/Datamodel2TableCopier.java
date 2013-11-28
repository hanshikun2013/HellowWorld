package sample.table.copier.gen;

import sample.table.datamodel.gen.PlanFamily;
import sample.table.datamodel.gen.LtPension;
import sample.table.datamodel.gen.LtPlan;
import sample.table.datamodel.gen.Lbsc0009;
import sample.table.datamodel.gen.Lbsc0008;
import sample.table.datamodel.gen.Lbsc0010;
import sample.table.datamodel.gen.Lbsc00011;
import sample.table.datamodel.gen.Lbsc00013;
import sample.table.entity.gen.TCorpPlanFamily;
import sample.table.entity.gen.TCorpPfamlyNenkinDet;
import sample.table.entity.gen.TCorpKihonInfo;
import sample.table.entity.gen.TCorpKeieishaRbunseki;
import sample.table.entity.gen.TCorpCashfKaize;


class Datamodel2TableCopier{

	/*
	 * TODO:共通化する予定
	 */
	static class ConverterUtility{
		/*
		 * TODO:
		 */
		private static Object convert(Class clazz,String obj){
			if(clazz.equals(String.class)){
				if(obj==null) return "";
				return obj.toString();	
			}
			if(clazz.equals(java.math.BigDecimal.class)){
				if(obj==null) return "";
				return obj.toString();	
			}
			throw new RuntimeException("TODO");
		}
	}


	/*
	 * データ変換処理：
	 * 共通部 : T_CORP_PLAN_FAMILY
	 */
	static public TCorpPlanFamily method1(PlanFamily planFamily){
		TCorpPlanFamily result=new TCorpPlanFamily();
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : プランID key名 : planId 型 : 
			//             備考 :  
			result.setPlanId((String)ConverterUtility.convert(String.class,planFamily.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:家族コード 物理:FAMILY_CD 属性:Char 桁数:2 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 家族No key名 : familyNo 型 : 
			//             備考 :  
			result.setFamilyCd((String)ConverterUtility.convert(String.class,planFamily.getFamilyNo()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:家族氏名（漢字） 物理:FAMILY_NAME_KANJI 属性:Varchar2 桁数:32 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 名前（漢字） key名 : kanjiName 型 : 
			//             備考 :  
			result.setFamilyNameKanji((String)ConverterUtility.convert(String.class,planFamily.getKanjiName()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:家族氏名（カナ） 物理:FAMILY_NAME_KANA 属性:Varchar2 桁数:32 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 名前（カナ） key名 : kanaName 型 : 
			//             備考 :  
			result.setFamilyNameKana((String)ConverterUtility.convert(String.class,planFamily.getKanaName()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:生年月日 物理:BIRTH 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 生年月日 key名 : dateOfBirth 型 : 
			//             備考 :  
			result.setBirth((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,planFamily.getDateOfBirth()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:年齢 物理:AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 年齢 key名 : age 型 : 
			//             備考 :  
			result.setAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,planFamily.getAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:生年月日・年齢選択コード 物理:BIRTH_AGE_SELECT_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 生年月日・年齢選択フラグ key名 : dateAgeFlg 型 : 
			//             備考 :  
			result.setBirthAgeSelectCd((String)ConverterUtility.convert(String.class,planFamily.getDateAgeFlg()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:続柄コード 物理:ZOKUGARA_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 続柄 key名 : zokugara 型 : 
			//             備考 :  
			result.setZokugaraCd((String)ConverterUtility.convert(String.class,planFamily.getZokugara()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:性別コード 物理:SEX_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 性別 key名 : gender 型 : 
			//             備考 :  
			result.setSexCd((String)ConverterUtility.convert(String.class,planFamily.getGender()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:職業コード 物理:JOB_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 仕事 key名 : job 型 : 
			//             備考 :  
			result.setJobCd((String)ConverterUtility.convert(String.class,planFamily.getJob()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:年収 物理:NENSHU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:PlanFamily 入力 : 年収 key名 : annualIncome 型 : 
			//             備考 :  
			result.setNenshu((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,planFamily.getAnnualIncome()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:退職予定年齢 物理:TAISHOKU_PLAN_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 退職予定年齢 key名 : retirementAge 型 : 
			//             備考 :  
			result.setTaishokuPlanAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,planFamily.getRetirementAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:平均余命 物理:HEIKIN_YOMEI 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : 平均寿命 key名 : heikinJumyo 型 : 
			//             備考 :  
			result.setHeikinYomei((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,planFamily.getHeikinJumyo()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:イメージ画像コード 物理:IMEJI_GAZOU_CD 属性:Char 桁数:8 少数 :  
			//             備考 : 
			//TO:画面データモデル:PlanFamily 入力 : イメージ画像 key名 : image 型 : 
			//             備考 :  
			result.setImejiGazouCd((String)ConverterUtility.convert(String.class,planFamily.getImage()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PLAN_FAMILY 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 共通部 : T_CORP_PFAMLY_NENKIN_DET
	 */
	static public TCorpPfamlyNenkinDet method2(LtPension ltPension){
		TCorpPfamlyNenkinDet result=new TCorpPfamlyNenkinDet();
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : プランID key名 : planId 型 : 
			//             備考 :  
			result.setPlanId((String)ConverterUtility.convert(String.class,ltPension.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:家族コード 物理:FAMILY_CD 属性:Char 桁数:2 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : 家族No key名 : familyNo 型 : 
			//             備考 :  
			result.setFamilyCd((String)ConverterUtility.convert(String.class,ltPension.getFamilyNo()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:行番号 物理:GYO_NO 属性:Number 桁数:2 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : 行番号 key名 : rowNo 型 : 
			//             備考 :  
			result.setGyoNo((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,ltPension.getRowNo()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:年金タイプコード 物理:NENKIN_TYPE_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : 年金タイプ key名 : pensionType 型 : 
			//             備考 :  
			result.setNenkinTypeCd((String)ConverterUtility.convert(String.class,ltPension.getPensionType()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:開始年月 物理:START_NENGETSU 属性:Char 桁数:6 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : 開始年月 key名 : jobStart 型 : 
			//             備考 :  
			result.setStartNengetsu((String)ConverterUtility.convert(String.class,ltPension.getJobStart()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:開始年齢 物理:AGE_FROM 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : 開始年齢 key名 : jobStartAge 型 : 
			//             備考 :  
			result.setAgeFrom((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,ltPension.getJobStartAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:終了年月 物理:END_NENGETSU 属性:Char 桁数:6 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : 終了年月 key名 : jobEnd 型 : 
			//             備考 :  
			result.setEndNengetsu((String)ConverterUtility.convert(String.class,ltPension.getJobEnd()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:終了年齢 物理:AGE_TO 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : 終了年齢 key名 : jobEndAge 型 : 
			//             備考 :  
			result.setAgeTo((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,ltPension.getJobEndAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:加入月数 物理:KANYU_TSUKISU 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPension 入力 : 加入月数 key名 : entryMonth 型 : 
			//             備考 :  
			result.setKanyuTsukisu((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,ltPension.getEntryMonth()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:年収 物理:NENSHU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:LtPension 入力 : 年収 key名 : income 型 : 
			//             備考 :  
			result.setNenshu((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,ltPension.getIncome()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 経営者リスク分析 : T_CORP_KIHON_INFO
	 */
	static public TCorpKihonInfo method3(LtPlan ltPlan, Lbsc0009 lbsc0009){
		TCorpKihonInfo result=new TCorpKihonInfo();
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プランID key名 : planId 型 : 
			//             備考 :  
			result.setPlanId((String)ConverterUtility.convert(String.class,ltPlan.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:取扱者ID 物理:AGENT_ID 属性:Varchar2 桁数:8 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 取扱者ID key名 : toriatsukaishaId 型 : 
			//             備考 :  
			result.setAgentId((String)ConverterUtility.convert(String.class,ltPlan.getToriatsukaishaId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:顧客ID 物理:CUST_ID 属性:Varchar2 桁数:30 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 顧客ID key名 : kokyakuId 型 : 
			//             備考 :  
			result.setCustId((String)ConverterUtility.convert(String.class,ltPlan.getKokyakuId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析種別コード 物理:BUNSEKI_SB_CD 属性:Char 桁数:2 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 分析種別 key名 : bunsekiShubetsu 型 : 
			//             備考 :  8(経営者リスク対策)
			result.setBunsekiSbCd((String)ConverterUtility.convert(String.class,ltPlan.getBunsekiShubetsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析一覧コメント 物理:BUNSEKI_COMMENT 属性:Varchar2 桁数:30 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : コメント key名 : comment 型 : 
			//             備考 :  
			result.setBunsekiComment((String)ConverterUtility.convert(String.class,ltPlan.getComment()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析実施日 物理:BUNSEKI_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プラン作成日時 key名 : planCreated 型 : 
			//             備考 :  
			result.setBunsekiCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,ltPlan.getPlanCreated()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析最終更新日 物理:BUNSEKI_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プラン更新日時 key名 : planUpdated 型 : 
			//             備考 :  
			result.setBunsekiUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,ltPlan.getPlanUpdated()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人名 物理:CORP_NAME 属性:Varchar2 桁数:32 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0009 入力 : 法人名漢字 key名 : hojinmei 型 : VARCHAR2
			//             備考 :  
			result.setCorpName((String)ConverterUtility.convert(String.class,lbsc0009.getHojinmei()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人名カナ 物理:CORP_NAME_KANA 属性:Varchar2 桁数:64 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0009 入力 : 法人名カナ key名 : hojinmeiKana 型 : VARCHAR2
			//             備考 :  
			result.setCorpNameKana((String)ConverterUtility.convert(String.class,lbsc0009.getHojinmeiKana()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人実効税率 物理:CORP_JIKKOUZEI_RT 属性:Number 桁数:5 少数 : 2 
			//             備考 : 
			//TO:画面データモデル:lbsc0009 入力 : 法人税実効税率 key名 : houjinzeiJikkouZeiritsu 型 : NUMBER
			//             備考 :  
			result.setCorpJikkouzeiRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0009.getHoujinzeiJikkouZeiritsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:役員就任年齢 物理:YAKUIN_SHUNIN_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0009 入力 : 役員就任年齢 key名 : yakuinShuninAge 型 : NUMBER
			//             備考 :  
			result.setYakuinShuninAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0009.getYakuinShuninAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:功績倍率 物理:KOSEKI_BAI_RT 属性:Number 桁数:3 少数 : 1 
			//             備考 : 
			//TO:画面データモデル:lbsc0009 入力 : 報酬月額(現在) key名 : hoshuGetugakuCurrent 型 : NUMBER
			//             備考 :  
			result.setKosekiBaiRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0009.getHoshuGetugakuCurrent()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:現在報酬月額 物理:GENZAI_HOSHU_GETSUGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc0009 入力 : 功績倍率 key名 : achievementMagnification 型 : NUMBER
			//             備考 :  
			result.setGenzaiHoshuGetsugaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0009.getAchievementMagnification()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setNyushaAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:厚生年金加入年齢 物理:EP_KANYU_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setEpKanyuAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:勇退予測報酬月額 物理:YUTAI_YSHOSHU_GETSUGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setYutaiYshoshuGetsugaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:勇退予測年齢 物理:YUTAI_YOSOKU_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setYutaiYosokuAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:希望役員退職慰労金額 物理:KIBO_YAKUIN_TIROKIN 属性:Number 桁数:11 少数 :  
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setKiboYakuinTirokin((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 経営者リスク分析 : T_CORP_KEIEISHA_RBUNSEKI
	 */
	static public TCorpKeieishaRbunseki method4(LtPlan ltPlan, Lbsc0009 lbsc0009, Lbsc0008 lbsc0008){
		TCorpKeieishaRbunseki result=new TCorpKeieishaRbunseki();
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プランID key名 : planId 型 : 
			//             備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)ConverterUtility.convert(String.class,ltPlan.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:借入相当額 物理:KARIRE_SOTOGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc0009 入力 : 借入相当額 key名 : karireSotogaku 型 : NUMBER
			//             備考 :  
			result.setKarireSotogaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0009.getKarireSotogaku()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:従業員給与(月間) 物理:JUGYOIN_KYUYO 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc0009 入力 : 従業員給与(月間) key名 : jugyoinkyuyoMonth 型 : NUMBER
			//             備考 :  
			result.setJugyoinKyuyo((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0009.getJugyoinkyuyoMonth()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:従業員給与必要月数 物理:JUGYOIN_KYUYO_HYOGETU 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0009 入力 : 従業員給与必要月数 key名 : jugyoinKyuyoHituyoTukisu 型 : NUMBER
			//             備考 :  
			result.setJugyoinKyuyoHyogetu((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0009.getJugyoinKyuyoHituyoTukisu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:弔慰金算出係数区分コード 物理:CHOIKIN_SANSHUTSU_KB_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0009 入力 : 弔慰金算出係数 key名 : tyoikinSanshutuKesu 型 : CHAR
			//             備考 :  
			result.setChoikinSanshutsuKbCd((String)ConverterUtility.convert(String.class,lbsc0009.getTyoikinSanshutuKesu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:経営立て直し資金種別コード 物理:KENAOSI_SHIKIN_SB_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0009 入力 : 経営立直し資金種別 key名 : rebuildType 型 : CHAR
			//             備考 :  
			result.setKenaosiShikinSbCd((String)ConverterUtility.convert(String.class,lbsc0009.getRebuildType()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:経営立て直し資金 物理:KENAOSI_SHIKIN 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc0009 入力 : 経営立直し資金 key名 : keieiTatenaosiSikin 型 : NUMBER
			//             備考 :  
			result.setKenaosiShikin((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0009.getKeieiTatenaosiSikin()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:業種コード 物理:GYOSHU_CD 属性:Char 桁数:2 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0008 入力 : 業種　（業種コード） key名 : gyoshu 型 : CHAR
			//             備考 :  
			result.setGyoshuCd((String)ConverterUtility.convert(String.class,lbsc0008.getGyoshu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:従業員数 物理:JUGYOINSU 属性:Number 桁数:5 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0008 入力 : 従業員数（人） key名 : jugyoinsu 型 : NUMBER
			//             備考 :  
			result.setJugyoinsu((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0008.getJugyoinsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:売上高予想 物理:URIAGEDAKA_YOSOU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc0008 入力 : 現在の売上高 key名 : uriagedakaCurrent 型 : NUMBER
			//             備考 :  
			result.setUriagedakaYosou((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0008.getUriagedakaCurrent()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:万一1年後売上予想比率 物理:M1NGO_URIYOSO_RT 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0008 入力 : 売上高予想の1年後(％) key名 : uriagedakayosoOneYearLater 型 : NUMBER
			//             備考 :  
			result.setM1ngoUriyosoRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0008.getUriagedakayosoOneYearLater()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:万一2年後売上予想比率 物理:M2NGO_URIYOSO_RT 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0008 入力 : 売上高予想の2年後(％) key名 : uriagedakayosoTwoYearLater 型 : NUMBER
			//             備考 :  
			result.setM2ngoUriyosoRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0008.getUriagedakayosoTwoYearLater()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:万一3年後売上予想比率 物理:M3NGO_URIYOSO_RT 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0008 入力 : 売上高予想の3年後(％) key名 : uriagedakayosoThreeYearLater 型 : NUMBER
			//             備考 :  
			result.setM3ngoUriyosoRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0008.getUriagedakayosoThreeYearLater()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算 : T_CORP_KIHON_INFO
	 */
	static public TCorpKihonInfo method5(LtPlan ltPlan, Lbsc0010 lbsc0010){
		TCorpKihonInfo result=new TCorpKihonInfo();
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プランID key名 : planId 型 : 
			//             備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)ConverterUtility.convert(String.class,ltPlan.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:取扱者ID 物理:AGENT_ID 属性:Varchar2 桁数:8 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 取扱者ID key名 : toriatsukaishaId 型 : 
			//             備考 :  
			result.setAgentId((String)ConverterUtility.convert(String.class,ltPlan.getToriatsukaishaId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:顧客ID 物理:CUST_ID 属性:Varchar2 桁数:30 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 顧客ID key名 : kokyakuId 型 : 
			//             備考 :  
			result.setCustId((String)ConverterUtility.convert(String.class,ltPlan.getKokyakuId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析種別コード 物理:BUNSEKI_SB_CD 属性:Char 桁数:2 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 分析種別 key名 : bunsekiShubetsu 型 : 
			//             備考 :  9(退職慰労金試算)
			result.setBunsekiSbCd((String)ConverterUtility.convert(String.class,ltPlan.getBunsekiShubetsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析一覧コメント 物理:BUNSEKI_COMMENT 属性:Varchar2 桁数:30 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : コメント key名 : comment 型 : 
			//             備考 :  
			result.setBunsekiComment((String)ConverterUtility.convert(String.class,ltPlan.getComment()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析実施日 物理:BUNSEKI_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プラン作成日時 key名 : planCreated 型 : 
			//             備考 :  
			result.setBunsekiCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,ltPlan.getPlanCreated()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析最終更新日 物理:BUNSEKI_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プラン更新日時 key名 : planUpdated 型 : 
			//             備考 :  
			result.setBunsekiUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,ltPlan.getPlanUpdated()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人名 物理:CORP_NAME 属性:Varchar2 桁数:32 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0010 入力 : 法人名漢字 key名 : hojinmei 型 : VARCHAR2
			//             備考 :  
			result.setCorpName((String)ConverterUtility.convert(String.class,lbsc0010.getHojinmei()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人名カナ 物理:CORP_NAME_KANA 属性:Varchar2 桁数:64 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0010 入力 : 法人名カナ key名 : hojinmeiKana 型 : VARCHAR2
			//             備考 :  
			result.setCorpNameKana((String)ConverterUtility.convert(String.class,lbsc0010.getHojinmeiKana()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人実効税率 物理:CORP_JIKKOUZEI_RT 属性:Number 桁数:5 少数 : 2 
			//             備考 : 
			//TO:画面データモデル:lbsc0010 入力 : 法人税実効税率 key名 : houjinzeiJikkouZeiritsu 型 : NUMBER
			//             備考 :  
			result.setCorpJikkouzeiRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0010.getHoujinzeiJikkouZeiritsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0010 入力 : 入社年齢 key名 : nyushaAge 型 : NUMBER
			//             備考 :  
			result.setNyushaAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0010.getNyushaAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:役員就任年齢 物理:YAKUIN_SHUNIN_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0010 入力 : 役員就任年齢 key名 : yakuinShuninAge 型 : NUMBER
			//             備考 :  
			result.setYakuinShuninAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0010.getYakuinShuninAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:勇退予測報酬月額 物理:YUTAI_YSHOSHU_GETSUGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc0010 入力 : 予想報酬月額(勇退時) key名 : hoshuGetugakuYutai 型 : NUMBER
			//             備考 :  
			result.setYutaiYshoshuGetsugaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0010.getHoshuGetugakuYutai()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:功績倍率 物理:KOSEKI_BAI_RT 属性:Number 桁数:3 少数 : 1 
			//             備考 : 
			//TO:画面データモデル:lbsc0010 入力 : 功績倍率 key名 : achievementMagnification 型 : NUMBER
			//             備考 :  
			result.setKosekiBaiRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0010.getAchievementMagnification()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:勇退予測年齢 物理:YUTAI_YOSOKU_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc0010 入力 : 勇退予定年齢 key名 : yutaiAge 型 : NUMBER
			//             備考 :  
			result.setYutaiYosokuAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0010.getYutaiAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:希望役員退職慰労金額 物理:KIBO_YAKUIN_TIROKIN 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc0010 入力 : 希望退職慰労金額 key名 : kiboTaishokuIrokin 型 : NUMBER
			//             備考 :  
			result.setKiboYakuinTirokin((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc0010.getKiboTaishokuIrokin()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:厚生年金加入年齢 物理:EP_KANYU_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setEpKanyuAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:現在報酬月額 物理:GENZAI_HOSHU_GETSUGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setGenzaiHoshuGetsugaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * キャッシュフロー改善試算 : T_CORP_KIHON_INFO
	 */
	static public TCorpKihonInfo method6(LtPlan ltPlan, Lbsc00011 lbsc00011){
		TCorpKihonInfo result=new TCorpKihonInfo();
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プランID key名 : planId 型 : 
			//             備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)ConverterUtility.convert(String.class,ltPlan.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:取扱者ID 物理:AGENT_ID 属性:Varchar2 桁数:8 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 取扱者ID key名 : toriatsukaishaId 型 : 
			//             備考 :  
			result.setAgentId((String)ConverterUtility.convert(String.class,ltPlan.getToriatsukaishaId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:顧客ID 物理:CUST_ID 属性:Varchar2 桁数:30 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 顧客ID key名 : kokyakuId 型 : 
			//             備考 :  
			result.setCustId((String)ConverterUtility.convert(String.class,ltPlan.getKokyakuId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析種別コード 物理:BUNSEKI_SB_CD 属性:Char 桁数:2 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 分析種別 key名 : bunsekiShubetsu 型 : 
			//             備考 :  10(キャッシュフロー改善試算)
			result.setBunsekiSbCd((String)ConverterUtility.convert(String.class,ltPlan.getBunsekiShubetsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析一覧コメント 物理:BUNSEKI_COMMENT 属性:Varchar2 桁数:30 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : コメント key名 : comment 型 : 
			//             備考 :  
			result.setBunsekiComment((String)ConverterUtility.convert(String.class,ltPlan.getComment()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析実施日 物理:BUNSEKI_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プラン作成日時 key名 : planCreated 型 : 
			//             備考 :  
			result.setBunsekiCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,ltPlan.getPlanCreated()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析最終更新日 物理:BUNSEKI_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プラン更新日時 key名 : planUpdated 型 : 
			//             備考 :  
			result.setBunsekiUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,ltPlan.getPlanUpdated()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人名 物理:CORP_NAME 属性:Varchar2 桁数:32 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00011 入力 : 法人名漢字 key名 : hojinmei 型 : VARCHAR2
			//             備考 :  
			result.setCorpName((String)ConverterUtility.convert(String.class,lbsc00011.getHojinmei()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人名カナ 物理:CORP_NAME_KANA 属性:Varchar2 桁数:64 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00011 入力 : 法人名カナ key名 : hojinmeiKana 型 : VARCHAR2
			//             備考 :  
			result.setCorpNameKana((String)ConverterUtility.convert(String.class,lbsc00011.getHojinmeiKana()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人実効税率 物理:CORP_JIKKOUZEI_RT 属性:Number 桁数:5 少数 : 2 
			//             備考 : 
			//TO:画面データモデル:lbsc00011 入力 : 法人税実効税率 key名 : houjinzeiJikkouZeiritsu 型 : NUMBER
			//             備考 :  
			result.setCorpJikkouzeiRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00011.getHoujinzeiJikkouZeiritsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00011 入力 : 入社年齢 key名 : nyushaAge 型 : NUMBER
			//             備考 :  
			result.setNyushaAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00011.getNyushaAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:役員就任年齢 物理:YAKUIN_SHUNIN_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00011 入力 : 役員就任年齢 key名 : yakuinShuninAge 型 : NUMBER
			//             備考 :  
			result.setYakuinShuninAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00011.getYakuinShuninAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:厚生年金加入年齢 物理:EP_KANYU_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00011 入力 : 厚生年金加入年齢 key名 : nenkinkanyuAge 型 : NUMBER
			//             備考 :  
			result.setEpKanyuAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00011.getNenkinkanyuAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:現在報酬月額 物理:GENZAI_HOSHU_GETSUGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc00011 入力 : 報酬月額(現在) key名 : hoshuGetugakuCurrent 型 : NUMBER
			//             備考 :  
			result.setGenzaiHoshuGetsugaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00011.getHoshuGetugakuCurrent()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:勇退予測年齢 物理:YUTAI_YOSOKU_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00011 入力 : 勇退予定年齢 key名 : yutaiAge 型 : NUMBER
			//             備考 :  
			result.setYutaiYosokuAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00011.getYutaiAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:希望役員退職慰労金額 物理:KIBO_YAKUIN_TIROKIN 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc00011 入力 : 希望退職慰労金額 key名 : kiboTaishokuIrokin 型 : NUMBER
			//             備考 :  
			result.setKiboYakuinTirokin((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00011.getKiboTaishokuIrokin()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:勇退予測報酬月額 物理:YUTAI_YSHOSHU_GETSUGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setYutaiYshoshuGetsugaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:功績倍率 物理:KOSEKI_BAI_RT 属性:Number 桁数:3 少数 : 1 
			//             備考 : 
			//TO:画面データモデル:0 をセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setKosekiBaiRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * キャッシュフロー改善試算 : T_CORP_CASHF_KAIZE
	 */
	static public TCorpCashfKaize method7(LtPlan ltPlan){
		TCorpCashfKaize result=new TCorpCashfKaize();
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プランID key名 : planId 型 : 
			//             備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)ConverterUtility.convert(String.class,ltPlan.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:引下金額 物理:SAGE_KINGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:LtPlan 入力 : 役員報酬引下額 key名 : amountOfExecutiveCompensationReduction 型 : NUMBER
			//             備考 :  
			result.setSageKingaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,ltPlan.getAmountOfExecutiveCompensationReduction()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:参考保険 保険種類コード 物理:SKHK_HOKEN_SHURUI_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 保険種類 key名 : insuranceKind 型 : CHAR
			//             備考 :  
			result.setSkhkHokenShuruiCd((String)ConverterUtility.convert(String.class,ltPlan.getInsuranceKind()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 退職金＋キャッシュフロー改善試算 : T_CORP_KIHON_INFO
	 */
	static public TCorpKihonInfo method8(LtPlan ltPlan, Lbsc00013 lbsc00013){
		TCorpKihonInfo result=new TCorpKihonInfo();
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プランID key名 : planId 型 : 
			//             備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)ConverterUtility.convert(String.class,ltPlan.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:取扱者ID 物理:AGENT_ID 属性:Varchar2 桁数:8 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 取扱者ID key名 : toriatsukaishaId 型 : 
			//             備考 :  
			result.setAgentId((String)ConverterUtility.convert(String.class,ltPlan.getToriatsukaishaId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:顧客ID 物理:CUST_ID 属性:Varchar2 桁数:30 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 顧客ID key名 : kokyakuId 型 : 
			//             備考 :  
			result.setCustId((String)ConverterUtility.convert(String.class,ltPlan.getKokyakuId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析種別コード 物理:BUNSEKI_SB_CD 属性:Char 桁数:2 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 分析種別 key名 : bunsekiShubetsu 型 : 
			//             備考 :  11(退職慰労金試算　キャッシュフロー改善試算)
			result.setBunsekiSbCd((String)ConverterUtility.convert(String.class,ltPlan.getBunsekiShubetsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析一覧コメント 物理:BUNSEKI_COMMENT 属性:Varchar2 桁数:30 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : コメント key名 : comment 型 : 
			//             備考 :  
			result.setBunsekiComment((String)ConverterUtility.convert(String.class,ltPlan.getComment()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析実施日 物理:BUNSEKI_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プラン作成日時 key名 : planCreated 型 : 
			//             備考 :  
			result.setBunsekiCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,ltPlan.getPlanCreated()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:分析最終更新日 物理:BUNSEKI_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プラン更新日時 key名 : planUpdated 型 : 
			//             備考 :  
			result.setBunsekiUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,ltPlan.getPlanUpdated()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人名 物理:CORP_NAME 属性:Varchar2 桁数:32 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 法人名漢字 key名 : hojinmei 型 : VARCHAR2
			//             備考 :  
			result.setCorpName((String)ConverterUtility.convert(String.class,lbsc00013.getHojinmei()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人名カナ 物理:CORP_NAME_KANA 属性:Varchar2 桁数:64 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 法人名カナ key名 : hojinmeiKana 型 : VARCHAR2
			//             備考 :  
			result.setCorpNameKana((String)ConverterUtility.convert(String.class,lbsc00013.getHojinmeiKana()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:法人実効税率 物理:CORP_JIKKOUZEI_RT 属性:Number 桁数:5 少数 : 2 
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 法人税実効税率 key名 : houjinzeiJikkouZeiritsu 型 : NUMBER
			//             備考 :  
			result.setCorpJikkouzeiRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getHoujinzeiJikkouZeiritsu()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 入社年齢 key名 : nyushaAge 型 : NUMBER
			//             備考 :  
			result.setNyushaAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getNyushaAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:役員就任年齢 物理:YAKUIN_SHUNIN_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 役員就任年齢 key名 : yakuinShuninAge 型 : NUMBER
			//             備考 :  
			result.setYakuinShuninAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getYakuinShuninAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:厚生年金加入年齢 物理:EP_KANYU_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 厚生年金加入年齢 key名 : nenkinkanyuAge 型 : NUMBER
			//             備考 :  
			result.setEpKanyuAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getNenkinkanyuAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:現在報酬月額 物理:GENZAI_HOSHU_GETSUGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc00013 入力 : 報酬月額(現在) key名 : hoshuGetugakuCurrent 型 : NUMBER
			//             備考 :  
			result.setGenzaiHoshuGetsugaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getHoshuGetugakuCurrent()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:勇退予測報酬月額 物理:YUTAI_YSHOSHU_GETSUGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:lbsc00013 入力 : 予想報酬月額(勇退時) key名 : hoshuGetugakuYutai 型 : NUMBER
			//             備考 :  
			result.setYutaiYshoshuGetsugaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getHoshuGetugakuYutai()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:功績倍率 物理:KOSEKI_BAI_RT 属性:Number 桁数:3 少数 : 1 
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 功績倍率 key名 : achievementMagnification 型 : NUMBER
			//             備考 :  
			result.setKosekiBaiRt((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getAchievementMagnification()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:勇退予測年齢 物理:YUTAI_YOSOKU_AGE 属性:Number 桁数:3 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 勇退予定年齢 key名 : yutaiAge 型 : NUMBER
			//             備考 :  
			result.setYutaiYosokuAge((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getYutaiAge()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:希望役員退職慰労金額 物理:KIBO_YAKUIN_TIROKIN 属性:Number 桁数:11 少数 :  
			//             備考 : 
			//TO:画面データモデル:lbsc00013 入力 : 希望退職慰労金額 key名 : kiboTaishokuIrokin 型 : NUMBER
			//             備考 :  
			result.setKiboYakuinTirokin((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,lbsc00013.getKiboTaishokuIrokin()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_KIHON_INFO 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 退職金＋キャッシュフロー改善試算 : T_CORP_CASHF_KAIZE
	 */
	static public TCorpCashfKaize 退職金＋キャッシュフロー改善試算_T_CORP_CASHF_KAIZE(LtPlan ltPlan){
		TCorpCashfKaize result=new TCorpCashfKaize();
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : プランID key名 : planId 型 : 
			//             備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)ConverterUtility.convert(String.class,ltPlan.getPlanId()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:引下金額 物理:SAGE_KINGAKU 属性:Number 桁数:11 少数 :  
			//             備考 : ×10000をセット
			//TO:画面データモデル:LtPlan 入力 : 役員報酬引下額 key名 : amountOfExecutiveCompensationReduction 型 : NUMBER
			//             備考 :  
			result.setSageKingaku((java.math.BigDecimal)ConverterUtility.convert(java.math.BigDecimal.class,ltPlan.getAmountOfExecutiveCompensationReduction()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:参考保険 保険種類コード 物理:SKHK_HOKEN_SHURUI_CD 属性:Char 桁数:1 少数 :  
			//             備考 : 
			//TO:画面データモデル:LtPlan 入力 : 保険種類 key名 : insuranceKind 型 : CHAR
			//             備考 :  
			result.setSkhkHokenShuruiCd((String)ConverterUtility.convert(String.class,ltPlan.getInsuranceKind()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:システム作成日時 物理:SYSTEM_CREATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//FROM:テーブル.テーブル:T_CORP_CASHF_KAIZE 論理:システム更新日時 物理:SYSTEM_UPDATE_DATE 属性:Date 桁数:　 少数 :  
			//             備考 : 
			//TO:画面データモデル:登録時のSYSDATEをセット 入力 :  key名 :  型 : 
			//             備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)ConverterUtility.convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

}
