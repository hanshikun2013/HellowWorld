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


	/*
	 * データ変換処理：
	 * 共通部 : T_CORP_PLAN_FAMILY
	 */
	static public TCorpPlanFamily method1(PlanFamily planFamily){
		TCorpPlanFamily result=new TCorpPlanFamily();
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : プランID
			//テーブル.項目名(物理) : PLAN_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 36
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : プランID
			//画面データモデル.key名 : planId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setPlanId((String)convert(String.class,planFamily.getPlanId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 家族コード
			//テーブル.項目名(物理) : FAMILY_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 2
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 家族No
			//画面データモデル.key名 : familyNo
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setFamilyCd((String)convert(String.class,planFamily.getFamilyNo()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 家族氏名（漢字）
			//テーブル.項目名(物理) : FAMILY_NAME_KANJI
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 32
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 名前（漢字）
			//画面データモデル.key名 : kanjiName
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setFamilyNameKanji((String)convert(String.class,planFamily.getKanjiName()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 家族氏名（カナ）
			//テーブル.項目名(物理) : FAMILY_NAME_KANA
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 32
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 名前（カナ）
			//画面データモデル.key名 : kanaName
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setFamilyNameKana((String)convert(String.class,planFamily.getKanaName()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 生年月日
			//テーブル.項目名(物理) : BIRTH
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 生年月日
			//画面データモデル.key名 : dateOfBirth
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBirth((java.sql.Date)convert(java.sql.Date.class,planFamily.getDateOfBirth()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 年齢
			//テーブル.項目名(物理) : AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 年齢
			//画面データモデル.key名 : age
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,planFamily.getAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 生年月日・年齢選択コード
			//テーブル.項目名(物理) : BIRTH_AGE_SELECT_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 1
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 生年月日・年齢選択フラグ
			//画面データモデル.key名 : dateAgeFlg
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBirthAgeSelectCd((String)convert(String.class,planFamily.getDateAgeFlg()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 続柄コード
			//テーブル.項目名(物理) : ZOKUGARA_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 1
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 続柄
			//画面データモデル.key名 : zokugara
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setZokugaraCd((String)convert(String.class,planFamily.getZokugara()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 性別コード
			//テーブル.項目名(物理) : SEX_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 1
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 性別
			//画面データモデル.key名 : gender
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setSexCd((String)convert(String.class,planFamily.getGender()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 職業コード
			//テーブル.項目名(物理) : JOB_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 1
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 仕事
			//画面データモデル.key名 : job
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setJobCd((String)convert(String.class,planFamily.getJob()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 年収
			//テーブル.項目名(物理) : NENSHU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 年収
			//画面データモデル.key名 : annualIncome
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setNenshu((java.math.BigDecimal)convert(java.math.BigDecimal.class,planFamily.getAnnualIncome()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 退職予定年齢
			//テーブル.項目名(物理) : TAISHOKU_PLAN_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 退職予定年齢
			//画面データモデル.key名 : retirementAge
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setTaishokuPlanAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,planFamily.getRetirementAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : 平均余命
			//テーブル.項目名(物理) : HEIKIN_YOMEI
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : 平均寿命
			//画面データモデル.key名 : heikinJumyo
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setHeikinYomei((java.math.BigDecimal)convert(java.math.BigDecimal.class,planFamily.getHeikinJumyo()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : イメージ画像コード
			//テーブル.項目名(物理) : IMEJI_GAZOU_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 8
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : PlanFamily
			//画面データモデル.入力 : イメージ画像
			//画面データモデル.key名 : image
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setImejiGazouCd((String)convert(String.class,planFamily.getImage()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : システム作成日時
			//テーブル.項目名(物理) : SYSTEM_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PLAN_FAMILY
			//テーブル.項目名(論理)" : システム更新日時
			//テーブル.項目名(物理) : SYSTEM_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
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
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : プランID
			//テーブル.項目名(物理) : PLAN_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 36
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : プランID
			//画面データモデル.key名 : planId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setPlanId((String)convert(String.class,ltPension.getPlanId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 家族コード
			//テーブル.項目名(物理) : FAMILY_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 2
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 家族No
			//画面データモデル.key名 : familyNo
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setFamilyCd((String)convert(String.class,ltPension.getFamilyNo()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 行番号
			//テーブル.項目名(物理) : GYO_NO
			//テーブル.属性 : Number
			//テーブル.桁数 : 2
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 行番号
			//画面データモデル.key名 : rowNo
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setGyoNo((java.math.BigDecimal)convert(java.math.BigDecimal.class,ltPension.getRowNo()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 年金タイプコード
			//テーブル.項目名(物理) : NENKIN_TYPE_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 1
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 年金タイプ
			//画面データモデル.key名 : pensionType
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setNenkinTypeCd((String)convert(String.class,ltPension.getPensionType()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 開始年月
			//テーブル.項目名(物理) : START_NENGETSU
			//テーブル.属性 : Char
			//テーブル.桁数 : 6
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 開始年月
			//画面データモデル.key名 : jobStart
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setStartNengetsu((String)convert(String.class,ltPension.getJobStart()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 開始年齢
			//テーブル.項目名(物理) : AGE_FROM
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 開始年齢
			//画面データモデル.key名 : jobStartAge
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setAgeFrom((java.math.BigDecimal)convert(java.math.BigDecimal.class,ltPension.getJobStartAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 終了年月
			//テーブル.項目名(物理) : END_NENGETSU
			//テーブル.属性 : Char
			//テーブル.桁数 : 6
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 終了年月
			//画面データモデル.key名 : jobEnd
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setEndNengetsu((String)convert(String.class,ltPension.getJobEnd()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 終了年齢
			//テーブル.項目名(物理) : AGE_TO
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 終了年齢
			//画面データモデル.key名 : jobEndAge
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setAgeTo((java.math.BigDecimal)convert(java.math.BigDecimal.class,ltPension.getJobEndAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 加入月数
			//テーブル.項目名(物理) : KANYU_TSUKISU
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 加入月数
			//画面データモデル.key名 : entryMonth
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setKanyuTsukisu((java.math.BigDecimal)convert(java.math.BigDecimal.class,ltPension.getEntryMonth()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : 年収
			//テーブル.項目名(物理) : NENSHU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : LtPension
			//画面データモデル.入力 : 年収
			//画面データモデル.key名 : income
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setNenshu((java.math.BigDecimal)convert(java.math.BigDecimal.class,ltPension.getIncome()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : システム作成日時
			//テーブル.項目名(物理) : SYSTEM_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_PFAMLY_NENKIN_DET
			//テーブル.項目名(論理)" : システム更新日時
			//テーブル.項目名(物理) : SYSTEM_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
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
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : プランID
			//テーブル.項目名(物理) : PLAN_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 36
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プランID
			//画面データモデル.key名 : planId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setPlanId((String)convert(String.class,ltPlan.getPlanId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 取扱者ID
			//テーブル.項目名(物理) : AGENT_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 8
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 取扱者ID
			//画面データモデル.key名 : toriatsukaishaId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setAgentId((String)convert(String.class,ltPlan.getToriatsukaishaId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 顧客ID
			//テーブル.項目名(物理) : CUST_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 30
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 顧客ID
			//画面データモデル.key名 : kokyakuId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setCustId((String)convert(String.class,ltPlan.getKokyakuId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析種別コード
			//テーブル.項目名(物理) : BUNSEKI_SB_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 2
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 分析種別
			//画面データモデル.key名 : bunsekiShubetsu
			//画面データモデル.型 : 
			//画面データモデル.備考 :  8(経営者リスク対策)
			result.setBunsekiSbCd((String)convert(String.class,ltPlan.getBunsekiShubetsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析一覧コメント
			//テーブル.項目名(物理) : BUNSEKI_COMMENT
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 30
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : コメント
			//画面データモデル.key名 : comment
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiComment((String)convert(String.class,ltPlan.getComment()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析実施日
			//テーブル.項目名(物理) : BUNSEKI_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プラン作成日時
			//画面データモデル.key名 : planCreated
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiCreateDate((java.sql.Date)convert(java.sql.Date.class,ltPlan.getPlanCreated()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析最終更新日
			//テーブル.項目名(物理) : BUNSEKI_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プラン更新日時
			//画面データモデル.key名 : planUpdated
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiUpdateDate((java.sql.Date)convert(java.sql.Date.class,ltPlan.getPlanUpdated()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人名
			//テーブル.項目名(物理) : CORP_NAME
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 32
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 法人名漢字
			//画面データモデル.key名 : hojinmei
			//画面データモデル.型 : VARCHAR2
			//画面データモデル.備考 :  
			result.setCorpName((String)convert(String.class,lbsc0009.getHojinmei()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人名カナ
			//テーブル.項目名(物理) : CORP_NAME_KANA
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 64
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 法人名カナ
			//画面データモデル.key名 : hojinmeiKana
			//画面データモデル.型 : VARCHAR2
			//画面データモデル.備考 :  
			result.setCorpNameKana((String)convert(String.class,lbsc0009.getHojinmeiKana()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人実効税率
			//テーブル.項目名(物理) : CORP_JIKKOUZEI_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 5
			//テーブル.少数 : 2
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 法人税実効税率
			//画面データモデル.key名 : houjinzeiJikkouZeiritsu
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setCorpJikkouzeiRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0009.getHoujinzeiJikkouZeiritsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 役員就任年齢
			//テーブル.項目名(物理) : YAKUIN_SHUNIN_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 役員就任年齢
			//画面データモデル.key名 : yakuinShuninAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYakuinShuninAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0009.getYakuinShuninAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 功績倍率
			//テーブル.項目名(物理) : KOSEKI_BAI_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 1
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 報酬月額(現在)
			//画面データモデル.key名 : hoshuGetugakuCurrent
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setKosekiBaiRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0009.getHoshuGetugakuCurrent()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 現在報酬月額
			//テーブル.項目名(物理) : GENZAI_HOSHU_GETSUGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 功績倍率
			//画面データモデル.key名 : achievementMagnification
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setGenzaiHoshuGetsugaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0009.getAchievementMagnification()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 入社年齢
			//テーブル.項目名(物理) : NYUSHA_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setNyushaAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 厚生年金加入年齢
			//テーブル.項目名(物理) : EP_KANYU_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setEpKanyuAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 勇退予測報酬月額
			//テーブル.項目名(物理) : YUTAI_YSHOSHU_GETSUGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setYutaiYshoshuGetsugaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 勇退予測年齢
			//テーブル.項目名(物理) : YUTAI_YOSOKU_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setYutaiYosokuAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 希望役員退職慰労金額
			//テーブル.項目名(物理) : KIBO_YAKUIN_TIROKIN
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setKiboYakuinTirokin((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : システム作成日時
			//テーブル.項目名(物理) : SYSTEM_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : システム更新日時
			//テーブル.項目名(物理) : SYSTEM_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
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
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : プランID
			//テーブル.項目名(物理) : PLAN_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 36
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プランID
			//画面データモデル.key名 : planId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)convert(String.class,ltPlan.getPlanId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 借入相当額
			//テーブル.項目名(物理) : KARIRE_SOTOGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 借入相当額
			//画面データモデル.key名 : karireSotogaku
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setKarireSotogaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0009.getKarireSotogaku()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 従業員給与(月間)
			//テーブル.項目名(物理) : JUGYOIN_KYUYO
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 従業員給与(月間)
			//画面データモデル.key名 : jugyoinkyuyoMonth
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setJugyoinKyuyo((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0009.getJugyoinkyuyoMonth()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 従業員給与必要月数
			//テーブル.項目名(物理) : JUGYOIN_KYUYO_HYOGETU
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 従業員給与必要月数
			//画面データモデル.key名 : jugyoinKyuyoHituyoTukisu
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setJugyoinKyuyoHyogetu((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0009.getJugyoinKyuyoHituyoTukisu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 弔慰金算出係数区分コード
			//テーブル.項目名(物理) : CHOIKIN_SANSHUTSU_KB_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 1
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 弔慰金算出係数
			//画面データモデル.key名 : tyoikinSanshutuKesu
			//画面データモデル.型 : CHAR
			//画面データモデル.備考 :  
			result.setChoikinSanshutsuKbCd((String)convert(String.class,lbsc0009.getTyoikinSanshutuKesu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 経営立て直し資金種別コード
			//テーブル.項目名(物理) : KENAOSI_SHIKIN_SB_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 1
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 経営立直し資金種別
			//画面データモデル.key名 : rebuildType
			//画面データモデル.型 : CHAR
			//画面データモデル.備考 :  
			result.setKenaosiShikinSbCd((String)convert(String.class,lbsc0009.getRebuildType()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 経営立て直し資金
			//テーブル.項目名(物理) : KENAOSI_SHIKIN
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc0009
			//画面データモデル.入力 : 経営立直し資金
			//画面データモデル.key名 : keieiTatenaosiSikin
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setKenaosiShikin((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0009.getKeieiTatenaosiSikin()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 業種コード
			//テーブル.項目名(物理) : GYOSHU_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 2
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0008
			//画面データモデル.入力 : 業種　（業種コード）
			//画面データモデル.key名 : gyoshu
			//画面データモデル.型 : CHAR
			//画面データモデル.備考 :  
			result.setGyoshuCd((String)convert(String.class,lbsc0008.getGyoshu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 従業員数
			//テーブル.項目名(物理) : JUGYOINSU
			//テーブル.属性 : Number
			//テーブル.桁数 : 5
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0008
			//画面データモデル.入力 : 従業員数（人）
			//画面データモデル.key名 : jugyoinsu
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setJugyoinsu((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0008.getJugyoinsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 売上高予想
			//テーブル.項目名(物理) : URIAGEDAKA_YOSOU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc0008
			//画面データモデル.入力 : 現在の売上高
			//画面データモデル.key名 : uriagedakaCurrent
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setUriagedakaYosou((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0008.getUriagedakaCurrent()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 万一1年後売上予想比率
			//テーブル.項目名(物理) : M1NGO_URIYOSO_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0008
			//画面データモデル.入力 : 売上高予想の1年後(％)
			//画面データモデル.key名 : uriagedakayosoOneYearLater
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setM1ngoUriyosoRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0008.getUriagedakayosoOneYearLater()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 万一2年後売上予想比率
			//テーブル.項目名(物理) : M2NGO_URIYOSO_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0008
			//画面データモデル.入力 : 売上高予想の2年後(％)
			//画面データモデル.key名 : uriagedakayosoTwoYearLater
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setM2ngoUriyosoRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0008.getUriagedakayosoTwoYearLater()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : 万一3年後売上予想比率
			//テーブル.項目名(物理) : M3NGO_URIYOSO_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0008
			//画面データモデル.入力 : 売上高予想の3年後(％)
			//画面データモデル.key名 : uriagedakayosoThreeYearLater
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setM3ngoUriyosoRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0008.getUriagedakayosoThreeYearLater()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : システム作成日時
			//テーブル.項目名(物理) : SYSTEM_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KEIEISHA_RBUNSEKI
			//テーブル.項目名(論理)" : システム更新日時
			//テーブル.項目名(物理) : SYSTEM_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
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
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : プランID
			//テーブル.項目名(物理) : PLAN_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 36
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プランID
			//画面データモデル.key名 : planId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)convert(String.class,ltPlan.getPlanId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 取扱者ID
			//テーブル.項目名(物理) : AGENT_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 8
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 取扱者ID
			//画面データモデル.key名 : toriatsukaishaId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setAgentId((String)convert(String.class,ltPlan.getToriatsukaishaId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 顧客ID
			//テーブル.項目名(物理) : CUST_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 30
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 顧客ID
			//画面データモデル.key名 : kokyakuId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setCustId((String)convert(String.class,ltPlan.getKokyakuId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析種別コード
			//テーブル.項目名(物理) : BUNSEKI_SB_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 2
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 分析種別
			//画面データモデル.key名 : bunsekiShubetsu
			//画面データモデル.型 : 
			//画面データモデル.備考 :  9(退職慰労金試算)
			result.setBunsekiSbCd((String)convert(String.class,ltPlan.getBunsekiShubetsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析一覧コメント
			//テーブル.項目名(物理) : BUNSEKI_COMMENT
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 30
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : コメント
			//画面データモデル.key名 : comment
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiComment((String)convert(String.class,ltPlan.getComment()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析実施日
			//テーブル.項目名(物理) : BUNSEKI_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プラン作成日時
			//画面データモデル.key名 : planCreated
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiCreateDate((java.sql.Date)convert(java.sql.Date.class,ltPlan.getPlanCreated()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析最終更新日
			//テーブル.項目名(物理) : BUNSEKI_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プラン更新日時
			//画面データモデル.key名 : planUpdated
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiUpdateDate((java.sql.Date)convert(java.sql.Date.class,ltPlan.getPlanUpdated()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人名
			//テーブル.項目名(物理) : CORP_NAME
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 32
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 法人名漢字
			//画面データモデル.key名 : hojinmei
			//画面データモデル.型 : VARCHAR2
			//画面データモデル.備考 :  
			result.setCorpName((String)convert(String.class,lbsc0010.getHojinmei()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人名カナ
			//テーブル.項目名(物理) : CORP_NAME_KANA
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 64
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 法人名カナ
			//画面データモデル.key名 : hojinmeiKana
			//画面データモデル.型 : VARCHAR2
			//画面データモデル.備考 :  
			result.setCorpNameKana((String)convert(String.class,lbsc0010.getHojinmeiKana()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人実効税率
			//テーブル.項目名(物理) : CORP_JIKKOUZEI_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 5
			//テーブル.少数 : 2
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 法人税実効税率
			//画面データモデル.key名 : houjinzeiJikkouZeiritsu
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setCorpJikkouzeiRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0010.getHoujinzeiJikkouZeiritsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 入社年齢
			//テーブル.項目名(物理) : NYUSHA_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 入社年齢
			//画面データモデル.key名 : nyushaAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setNyushaAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0010.getNyushaAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 役員就任年齢
			//テーブル.項目名(物理) : YAKUIN_SHUNIN_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 役員就任年齢
			//画面データモデル.key名 : yakuinShuninAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYakuinShuninAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0010.getYakuinShuninAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 勇退予測報酬月額
			//テーブル.項目名(物理) : YUTAI_YSHOSHU_GETSUGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 予想報酬月額(勇退時)
			//画面データモデル.key名 : hoshuGetugakuYutai
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYutaiYshoshuGetsugaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0010.getHoshuGetugakuYutai()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 功績倍率
			//テーブル.項目名(物理) : KOSEKI_BAI_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 1
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 功績倍率
			//画面データモデル.key名 : achievementMagnification
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setKosekiBaiRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0010.getAchievementMagnification()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 勇退予測年齢
			//テーブル.項目名(物理) : YUTAI_YOSOKU_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 勇退予定年齢
			//画面データモデル.key名 : yutaiAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYutaiYosokuAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0010.getYutaiAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 希望役員退職慰労金額
			//テーブル.項目名(物理) : KIBO_YAKUIN_TIROKIN
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc0010
			//画面データモデル.入力 : 希望退職慰労金額
			//画面データモデル.key名 : kiboTaishokuIrokin
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setKiboYakuinTirokin((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc0010.getKiboTaishokuIrokin()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 厚生年金加入年齢
			//テーブル.項目名(物理) : EP_KANYU_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setEpKanyuAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 現在報酬月額
			//テーブル.項目名(物理) : GENZAI_HOSHU_GETSUGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setGenzaiHoshuGetsugaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : システム作成日時
			//テーブル.項目名(物理) : SYSTEM_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : システム更新日時
			//テーブル.項目名(物理) : SYSTEM_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
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
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : プランID
			//テーブル.項目名(物理) : PLAN_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 36
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プランID
			//画面データモデル.key名 : planId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)convert(String.class,ltPlan.getPlanId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 取扱者ID
			//テーブル.項目名(物理) : AGENT_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 8
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 取扱者ID
			//画面データモデル.key名 : toriatsukaishaId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setAgentId((String)convert(String.class,ltPlan.getToriatsukaishaId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 顧客ID
			//テーブル.項目名(物理) : CUST_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 30
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 顧客ID
			//画面データモデル.key名 : kokyakuId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setCustId((String)convert(String.class,ltPlan.getKokyakuId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析種別コード
			//テーブル.項目名(物理) : BUNSEKI_SB_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 2
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 分析種別
			//画面データモデル.key名 : bunsekiShubetsu
			//画面データモデル.型 : 
			//画面データモデル.備考 :  10(キャッシュフロー改善試算)
			result.setBunsekiSbCd((String)convert(String.class,ltPlan.getBunsekiShubetsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析一覧コメント
			//テーブル.項目名(物理) : BUNSEKI_COMMENT
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 30
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : コメント
			//画面データモデル.key名 : comment
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiComment((String)convert(String.class,ltPlan.getComment()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析実施日
			//テーブル.項目名(物理) : BUNSEKI_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プラン作成日時
			//画面データモデル.key名 : planCreated
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiCreateDate((java.sql.Date)convert(java.sql.Date.class,ltPlan.getPlanCreated()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析最終更新日
			//テーブル.項目名(物理) : BUNSEKI_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プラン更新日時
			//画面データモデル.key名 : planUpdated
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiUpdateDate((java.sql.Date)convert(java.sql.Date.class,ltPlan.getPlanUpdated()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人名
			//テーブル.項目名(物理) : CORP_NAME
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 32
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 法人名漢字
			//画面データモデル.key名 : hojinmei
			//画面データモデル.型 : VARCHAR2
			//画面データモデル.備考 :  
			result.setCorpName((String)convert(String.class,lbsc00011.getHojinmei()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人名カナ
			//テーブル.項目名(物理) : CORP_NAME_KANA
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 64
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 法人名カナ
			//画面データモデル.key名 : hojinmeiKana
			//画面データモデル.型 : VARCHAR2
			//画面データモデル.備考 :  
			result.setCorpNameKana((String)convert(String.class,lbsc00011.getHojinmeiKana()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人実効税率
			//テーブル.項目名(物理) : CORP_JIKKOUZEI_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 5
			//テーブル.少数 : 2
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 法人税実効税率
			//画面データモデル.key名 : houjinzeiJikkouZeiritsu
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setCorpJikkouzeiRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00011.getHoujinzeiJikkouZeiritsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 入社年齢
			//テーブル.項目名(物理) : NYUSHA_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 入社年齢
			//画面データモデル.key名 : nyushaAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setNyushaAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00011.getNyushaAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 役員就任年齢
			//テーブル.項目名(物理) : YAKUIN_SHUNIN_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 役員就任年齢
			//画面データモデル.key名 : yakuinShuninAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYakuinShuninAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00011.getYakuinShuninAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 厚生年金加入年齢
			//テーブル.項目名(物理) : EP_KANYU_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 厚生年金加入年齢
			//画面データモデル.key名 : nenkinkanyuAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setEpKanyuAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00011.getNenkinkanyuAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 現在報酬月額
			//テーブル.項目名(物理) : GENZAI_HOSHU_GETSUGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 報酬月額(現在)
			//画面データモデル.key名 : hoshuGetugakuCurrent
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setGenzaiHoshuGetsugaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00011.getHoshuGetugakuCurrent()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 勇退予測年齢
			//テーブル.項目名(物理) : YUTAI_YOSOKU_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 勇退予定年齢
			//画面データモデル.key名 : yutaiAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYutaiYosokuAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00011.getYutaiAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 希望役員退職慰労金額
			//テーブル.項目名(物理) : KIBO_YAKUIN_TIROKIN
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc00011
			//画面データモデル.入力 : 希望退職慰労金額
			//画面データモデル.key名 : kiboTaishokuIrokin
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setKiboYakuinTirokin((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00011.getKiboTaishokuIrokin()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 勇退予測報酬月額
			//テーブル.項目名(物理) : YUTAI_YSHOSHU_GETSUGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setYutaiYshoshuGetsugaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 功績倍率
			//テーブル.項目名(物理) : KOSEKI_BAI_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 1
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 0 をセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setKosekiBaiRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,0 をセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : システム作成日時
			//テーブル.項目名(物理) : SYSTEM_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : システム更新日時
			//テーブル.項目名(物理) : SYSTEM_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
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
			//テーブル.テーブル(物理/論理) : T_CORP_CASHF_KAIZE
			//テーブル.項目名(論理)" : プランID
			//テーブル.項目名(物理) : PLAN_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 36
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プランID
			//画面データモデル.key名 : planId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)convert(String.class,ltPlan.getPlanId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_CASHF_KAIZE
			//テーブル.項目名(論理)" : 引下金額
			//テーブル.項目名(物理) : SAGE_KINGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 役員報酬引下額
			//画面データモデル.key名 : amountOfExecutiveCompensationReduction
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setSageKingaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,ltPlan.getAmountOfExecutiveCompensationReduction()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_CASHF_KAIZE
			//テーブル.項目名(論理)" : 参考保険 保険種類コード
			//テーブル.項目名(物理) : SKHK_HOKEN_SHURUI_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 1
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 保険種類
			//画面データモデル.key名 : insuranceKind
			//画面データモデル.型 : CHAR
			//画面データモデル.備考 :  
			result.setSkhkHokenShuruiCd((String)convert(String.class,ltPlan.getInsuranceKind()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_CASHF_KAIZE
			//テーブル.項目名(論理)" : システム作成日時
			//テーブル.項目名(物理) : SYSTEM_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_CASHF_KAIZE
			//テーブル.項目名(論理)" : システム更新日時
			//テーブル.項目名(物理) : SYSTEM_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
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
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : プランID
			//テーブル.項目名(物理) : PLAN_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 36
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プランID
			//画面データモデル.key名 : planId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  このアプリ内で、ユニークなプランID（UUID形式）(DBテーブルの主キー）
			result.setPlanId((String)convert(String.class,ltPlan.getPlanId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 取扱者ID
			//テーブル.項目名(物理) : AGENT_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 8
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 取扱者ID
			//画面データモデル.key名 : toriatsukaishaId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setAgentId((String)convert(String.class,ltPlan.getToriatsukaishaId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 顧客ID
			//テーブル.項目名(物理) : CUST_ID
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 30
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 顧客ID
			//画面データモデル.key名 : kokyakuId
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setCustId((String)convert(String.class,ltPlan.getKokyakuId()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析種別コード
			//テーブル.項目名(物理) : BUNSEKI_SB_CD
			//テーブル.属性 : Char
			//テーブル.桁数 : 2
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : 分析種別
			//画面データモデル.key名 : bunsekiShubetsu
			//画面データモデル.型 : 
			//画面データモデル.備考 :  11(退職慰労金試算　キャッシュフロー改善試算)
			result.setBunsekiSbCd((String)convert(String.class,ltPlan.getBunsekiShubetsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析一覧コメント
			//テーブル.項目名(物理) : BUNSEKI_COMMENT
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 30
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : コメント
			//画面データモデル.key名 : comment
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiComment((String)convert(String.class,ltPlan.getComment()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析実施日
			//テーブル.項目名(物理) : BUNSEKI_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プラン作成日時
			//画面データモデル.key名 : planCreated
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiCreateDate((java.sql.Date)convert(java.sql.Date.class,ltPlan.getPlanCreated()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 分析最終更新日
			//テーブル.項目名(物理) : BUNSEKI_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : LtPlan
			//画面データモデル.入力 : プラン更新日時
			//画面データモデル.key名 : planUpdated
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			result.setBunsekiUpdateDate((java.sql.Date)convert(java.sql.Date.class,ltPlan.getPlanUpdated()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人名
			//テーブル.項目名(物理) : CORP_NAME
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 32
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 法人名漢字
			//画面データモデル.key名 : hojinmei
			//画面データモデル.型 : VARCHAR2
			//画面データモデル.備考 :  
			result.setCorpName((String)convert(String.class,lbsc00013.getHojinmei()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人名カナ
			//テーブル.項目名(物理) : CORP_NAME_KANA
			//テーブル.属性 : Varchar2
			//テーブル.桁数 : 64
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 法人名カナ
			//画面データモデル.key名 : hojinmeiKana
			//画面データモデル.型 : VARCHAR2
			//画面データモデル.備考 :  
			result.setCorpNameKana((String)convert(String.class,lbsc00013.getHojinmeiKana()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 法人実効税率
			//テーブル.項目名(物理) : CORP_JIKKOUZEI_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 5
			//テーブル.少数 : 2
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 法人税実効税率
			//画面データモデル.key名 : houjinzeiJikkouZeiritsu
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setCorpJikkouzeiRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getHoujinzeiJikkouZeiritsu()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 入社年齢
			//テーブル.項目名(物理) : NYUSHA_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 入社年齢
			//画面データモデル.key名 : nyushaAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setNyushaAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getNyushaAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 役員就任年齢
			//テーブル.項目名(物理) : YAKUIN_SHUNIN_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 役員就任年齢
			//画面データモデル.key名 : yakuinShuninAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYakuinShuninAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getYakuinShuninAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 厚生年金加入年齢
			//テーブル.項目名(物理) : EP_KANYU_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 厚生年金加入年齢
			//画面データモデル.key名 : nenkinkanyuAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setEpKanyuAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getNenkinkanyuAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 現在報酬月額
			//テーブル.項目名(物理) : GENZAI_HOSHU_GETSUGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 報酬月額(現在)
			//画面データモデル.key名 : hoshuGetugakuCurrent
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setGenzaiHoshuGetsugaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getHoshuGetugakuCurrent()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 勇退予測報酬月額
			//テーブル.項目名(物理) : YUTAI_YSHOSHU_GETSUGAKU
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : ×1000をセット
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 予想報酬月額(勇退時)
			//画面データモデル.key名 : hoshuGetugakuYutai
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYutaiYshoshuGetsugaku((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getHoshuGetugakuYutai()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 功績倍率
			//テーブル.項目名(物理) : KOSEKI_BAI_RT
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 1
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 功績倍率
			//画面データモデル.key名 : achievementMagnification
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setKosekiBaiRt((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getAchievementMagnification()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 勇退予測年齢
			//テーブル.項目名(物理) : YUTAI_YOSOKU_AGE
			//テーブル.属性 : Number
			//テーブル.桁数 : 3
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 勇退予定年齢
			//画面データモデル.key名 : yutaiAge
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setYutaiYosokuAge((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getYutaiAge()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : 希望役員退職慰労金額
			//テーブル.項目名(物理) : KIBO_YAKUIN_TIROKIN
			//テーブル.属性 : Number
			//テーブル.桁数 : 11
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : lbsc00013
			//画面データモデル.入力 : 希望退職慰労金額
			//画面データモデル.key名 : kiboTaishokuIrokin
			//画面データモデル.型 : NUMBER
			//画面データモデル.備考 :  
			result.setKiboYakuinTirokin((java.math.BigDecimal)convert(java.math.BigDecimal.class,lbsc00013.getKiboTaishokuIrokin()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : システム作成日時
			//テーブル.項目名(物理) : SYSTEM_CREATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemCreateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}
		{
			//テーブル.テーブル(物理/論理) : T_CORP_KIHON_INFO
			//テーブル.項目名(論理)" : システム更新日時
			//テーブル.項目名(物理) : SYSTEM_UPDATE_DATE
			//テーブル.属性 : Date
			//テーブル.桁数 : 　
			//テーブル.少数 : 
			//テーブル.備考 : 
			//画面データモデル.モデルID/概要 : 登録時のSYSDATEをセット
			//画面データモデル.入力 : 
			//画面データモデル.key名 : 
			//画面データモデル.型 : 
			//画面データモデル.備考 :  
			//TODO:
			//result.setSystemUpdateDate((java.sql.Date)convert(java.sql.Date.class,登録時のSYSDATEをセット.get()));
		}

		return result;

	}

}
