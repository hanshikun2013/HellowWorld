package sample2.table.copier.gen;

import sample2.table.datamodel.gen.PlanFamily;
import sample2.table.datamodel.gen.LtPension;
import sample2.table.datamodel.gen.Lbsc0009;
import sample2.table.datamodel.gen.Lbsc0008;
import sample2.table.datamodel.gen.Lbsc0002;
import sample2.table.datamodel.gen.Lbsc0010;
import sample2.table.datamodel.gen.Lbsc0003;
import sample2.table.datamodel.gen.Lbsc0004;
import sample2.table.datamodel.gen.Lbsc00011;
import sample2.table.datamodel.gen.Lbsc00005;
import sample2.table.datamodel.gen.Lbsc00006;
import sample2.table.datamodel.gen.Lbsc00013;
import sample2.table.entity.gen.TCorpPlanFamily;
import sample2.table.entity.gen.MConsulting;
import sample2.table.entity.gen.TCorpPfamlyNenkinDet;
import sample2.table.entity.gen.TCorpKihonInfo;
import sample2.table.entity.gen.TCorpKeieishaRbunseki;
import sample2.table.entity.gen.TCorpCashfKaize;


class Datamodel2TableCopier{

	/*
	 * TODO:共通化する予定
	 */
	static class ConverterUtility{
		/*
		 * TODO:
		 */
		private static Object convert(Class clazz,Object obj){
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
	 * 共通部 : PlanFamily
	 */
	static public PlanFamily 共通部_PlanFamily(TCorpPlanFamily tCorpPlanFamily, MConsulting mConsulting){
		PlanFamily result=new PlanFamily();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : プランID key名 : planId 型 : 
			//備考 :  
			result.setPlanId((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getPlanId()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:家族コード 物理:FAMILY_CD 属性:Char 桁数:2 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 家族No key名 : familyNo 型 : 
			//備考 :  
			result.setFamilyNo((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getFamilyCd()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:家族氏名（漢字） 物理:FAMILY_NAME_KANJI 属性:Varchar2 桁数:32 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 名前（漢字） key名 : kanjiName 型 : 
			//備考 :  
			result.setKanjiName((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getFamilyNameKanji()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:家族氏名（カナ） 物理:FAMILY_NAME_KANA 属性:Varchar2 桁数:32 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 名前（カナ） key名 : kanaName 型 : 
			//備考 :  
			result.setKanaName((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getFamilyNameKana()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:生年月日 物理:BIRTH 属性:Date 桁数:　 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 生年月日 key名 : dateOfBirth 型 : 
			//備考 :  
			result.setDateOfBirth((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getBirth()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:年齢 物理:AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 年齢 key名 : age 型 : 
			//備考 :  
			result.setAge((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getAge()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:生年月日・年齢選択コード 物理:BIRTH_AGE_SELECT_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 生年月日・年齢選択フラグ key名 : dateAgeFlg 型 : 
			//備考 :  
			result.setDateAgeFlg((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getBirthAgeSelectCd()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:続柄コード 物理:ZOKUGARA_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 続柄 key名 : zokugara 型 : 
			//備考 :  
			result.setZokugara((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getZokugaraCd()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:性別コード 物理:SEX_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 性別 key名 : gender 型 : 
			//備考 :  
			result.setGender((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getSexCd()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:職業コード 物理:JOB_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 仕事 key名 : job 型 : 
			//備考 :  
			result.setJob((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getJobCd()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:年収 物理:NENSHU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 年収 key名 : annualIncome 型 : 
			//備考 :  ÷10000をセット
			result.setAnnualIncome((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getNenshu()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:退職予定年齢 物理:TAISHOKU_PLAN_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 退職予定年齢 key名 : retirementAge 型 : 
			//備考 :  
			result.setRetirementAge((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getTaishokuPlanAge()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:平均余命 物理:HEIKIN_YOMEI 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 平均寿命 key名 : heikinJumyo 型 : 
			//備考 :  
			result.setHeikinJumyo((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getHeikinYomei()));
		}
		{
			//FROM:テーブル:T_CORP_PLAN_FAMILY 論理:イメージ画像コード 物理:IMEJI_GAZOU_CD 属性:Char 桁数:8 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : イメージ画像 key名 : image 型 : 
			//備考 :  
			result.setImage((String)ConverterUtility.convert(String.class,tCorpPlanFamily.getImejiGazouCd()));
		}
		{
			//FROM:テーブル:M_CONSULTING 論理:条件[コードID=CM03、コード値=性別コード]で、[値1]を取得 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 性別名 key名 : genderString 型 : 
			//備考 :  
			//TODO:
			//result.setGenderString((String)ConverterUtility.convert(String.class,mConsulting.get()));
		}
		{
			//FROM:テーブル:マスタ情報 論理:条件[コードID=CM08、コード値=職業コード]で、[値1]を取得 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 仕事名 key名 : jobString 型 : 
			//備考 :  
			//TODO:
			//result.setJobString((String)ConverterUtility.convert(String.class,マスタ情報.get()));
		}
		{
			//FROM:テーブル: 論理:条件[コードID=CM07、コード値=続柄コード]で、[値1]を取得 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 続柄名 key名 : zokugaraName 型 : 
			//備考 :  
			//TODO:
			//result.setZokugaraName((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:※項目セット無し 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: PlanFamily 入力 : 入社年齢 key名 : enterCompanyAge 型 : 
			//備考 :  
			//TODO:
			//result.setEnterCompanyAge((String)ConverterUtility.convert(String.class,※項目セット無し.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 共通部 : LtPension
	 */
	static public LtPension 共通部_LtPension(TCorpPfamlyNenkinDet tCorpPfamlyNenkinDet, MConsulting mConsulting){
		LtPension result=new LtPension();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : プランID key名 : planId 型 : 文字列
			//備考 :  
			result.setPlanId((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getPlanId()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:家族コード 物理:FAMILY_CD 属性:Char 桁数:2 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 家族No key名 : familyNo 型 : 文字列
			//備考 :  
			result.setFamilyNo((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getFamilyCd()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:行番号 物理:GYO_NO 属性:Number 桁数:2 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 行番号 key名 : rowNo 型 : 数値
			//備考 :  
			result.setRowNo((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getGyoNo()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:年収 物理:NENSHU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 収入 key名 : income 型 : 数値
			//備考 :  ÷10000をセット
			result.setIncome((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getNenshu()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:年金タイプコード 物理:NENKIN_TYPE_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 年金タイプ key名 : pensionType 型 : 文字列
			//備考 :  
			result.setPensionType((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getNenkinTypeCd()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:開始年月 物理:START_NENGETSU 属性:Char 桁数:6 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 開始年月 key名 : jobStart 型 : 文字列
			//備考 :  
			result.setJobStart((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getStartNengetsu()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:終了年月 物理:END_NENGETSU 属性:Char 桁数:6 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 終了年月 key名 : jobEnd 型 : 文字列
			//備考 :  
			result.setJobEnd((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getEndNengetsu()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:開始年齢 物理:AGE_FROM 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 開始年齢 key名 : jobStartAge 型 : 数値
			//備考 :  
			result.setJobStartAge((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getAgeFrom()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:終了年齢 物理:AGE_TO 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 終了年齢 key名 : jobEndAge 型 : 数値
			//備考 :  
			result.setJobEndAge((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getAgeTo()));
		}
		{
			//FROM:テーブル:T_CORP_PFAMLY_NENKIN_DET 論理:加入月数 物理:KANYU_TSUKISU 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 加入月数 key名 : entryMonth 型 : 数値
			//備考 :  
			result.setEntryMonth((String)ConverterUtility.convert(String.class,tCorpPfamlyNenkinDet.getKanyuTsukisu()));
		}
		{
			//FROM:テーブル:M_CONSULTING 論理:条件[コードID=CM11、コード値=年金タイプコード]で、[値１]を取得 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: LtPension 入力 : 年金名称 key名 : pensionName 型 : 文字列
			//備考 :  
			//TODO:
			//result.setPensionName((String)ConverterUtility.convert(String.class,mConsulting.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 経営者リスク分析 : lbsc0009
	 */
	static public Lbsc0009 経営者リスク分析_lbsc0009(TCorpKihonInfo tCorpKihonInfo, TCorpKeieishaRbunseki tCorpKeieishaRbunseki, MConsulting mConsulting){
		Lbsc0009 result=new Lbsc0009();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人名 物理:CORP_NAME 属性:Varchar2 桁数:32 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 法人名漢字 key名 : hojinmei 型 : CHAR
			//備考 :  
			result.setHojinmei((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpName()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人名カナ 物理:CORP_NAME_KANA 属性:Varchar2 桁数:64 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 法人名カナ key名 : hojinmeiKana 型 : CHAR
			//備考 :  
			result.setHojinmeiKana((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpNameKana()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人実効税率 物理:CORP_JIKKOUZEI_RT 属性:Number 桁数:5 少数: 2
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 法人税実効税率 key名 : houjinzeiJikkouZeiritsu 型 : NUMBER
			//備考 :  
			result.setHoujinzeiJikkouZeiritsu((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpJikkouzeiRt()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:役員就任年齢 物理:YAKUIN_SHUNIN_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 役員就任年齢 key名 : yakuinShuninAge 型 : NUMBER
			//備考 :  
			result.setYakuinShuninAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYakuinShuninAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:現在報酬月額 物理:GENZAI_HOSHU_GETSUGAKU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 報酬月額(現在) key名 : hoshuGetugakuCurrent 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setHoshuGetugakuCurrent((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getGenzaiHoshuGetsugaku()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:功績倍率 物理:KOSEKI_BAI_RT 属性:Number 桁数:3 少数: 1
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 功績倍率 key名 : achievementMagnification 型 : NUMBER
			//備考 :  
			result.setAchievementMagnification((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getKosekiBaiRt()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:借入相当額 物理:KARIRE_SOTOGAKU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 借入相当額 key名 : karireSotogaku 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setKarireSotogaku((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getKarireSotogaku()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:従業員給与(月間) 物理:JUGYOIN_KYUYO 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 従業員給与(月間) key名 : jugyoinkyuyoMonth 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setJugyoinkyuyoMonth((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getJugyoinKyuyo()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:従業員給与必要月数 物理:JUGYOIN_KYUYO_HYOGETU 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 従業員給与必要月数 key名 : jugyoinKyuyoHituyoTukisu 型 : NUMBER
			//備考 :  
			result.setJugyoinKyuyoHituyoTukisu((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getJugyoinKyuyoHyogetu()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:弔慰金算出係数区分コード 物理:CHOIKIN_SANSHUTSU_KB_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 弔慰金算出係数 key名 : tyoikinSanshutuKesu 型 : CODE
			//備考 :  
			result.setTyoikinSanshutuKesu((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getChoikinSanshutsuKbCd()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:経営立て直し資金 物理:KENAOSI_SHIKIN 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 経営立直し資金 key名 : keieiTatenaosiSikin 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setKeieiTatenaosiSikin((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getKenaosiShikin()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:経営立て直し資金種別コード 物理:KENAOSI_SHIKIN_SB_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 経営立直し資金種別 key名 : rebuildType 型 : CHAR
			//備考 :  
			result.setRebuildType((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getKenaosiShikinSbCd()));
		}
		{
			//FROM:テーブル:M_CONSULTING 論理:条件[コードID=LR32、コード値=弔慰金算出係数区分コード]で、[値2]を取得 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0009 入力 : 弔慰金算出係数値 key名 : tyoikinSanshutuKesuValue 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setTyoikinSanshutuKesuValue((String)ConverterUtility.convert(String.class,mConsulting.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 経営者リスク分析 : lbsc0008
	 */
	static public Lbsc0008 経営者リスク分析_lbsc0008(TCorpKeieishaRbunseki tCorpKeieishaRbunseki, MConsulting mConsulting){
		Lbsc0008 result=new Lbsc0008();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:売上高予想 物理:URIAGEDAKA_YOSOU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 現在の売上高 key名 : uriagedakaCurrent 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setUriagedakaCurrent((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getUriagedakaYosou()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:万一1年後売上予想比率 物理:M1NGO_URIYOSO_RT 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 売上高予想の1年後(％) key名 : uriagedakayosoOneYearLater 型 : NUMBER
			//備考 :  
			result.setUriagedakayosoOneYearLater((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getM1ngoUriyosoRt()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:万一2年後売上予想比率 物理:M2NGO_URIYOSO_RT 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 売上高予想の2年後(％) key名 : uriagedakayosoTwoYearLater 型 : NUMBER
			//備考 :  
			result.setUriagedakayosoTwoYearLater((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getM2ngoUriyosoRt()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:万一3年後売上予想比率 物理:M3NGO_URIYOSO_RT 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 売上高予想の3年後(％) key名 : uriagedakayosoThreeYearLater 型 : NUMBER
			//備考 :  
			result.setUriagedakayosoThreeYearLater((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getM3ngoUriyosoRt()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:業種コード 物理:GYOSHU_CD 属性:Char 桁数:2 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 業種コード key名 : gyoshu 型 : CODE
			//備考 :  
			result.setGyoshu((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getGyoshuCd()));
		}
		{
			//FROM:テーブル:T_CORP_KEIEISHA_RBUNSEKI 論理:従業員数 物理:JUGYOINSU 属性:Number 桁数:5 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 従業員数（人） key名 : jugyoinsu 型 : NUMBER
			//備考 :  
			result.setJugyoinsu((String)ConverterUtility.convert(String.class,tCorpKeieishaRbunseki.getJugyoinsu()));
		}
		{
			//FROM:テーブル:M_CONSULTING 論理:条件[コードID=LR01、コード値=業種コード]で、[値1]を取得 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 業種名 key名 : gyoshuName 型 : CHAR
			//備考 :  
			//TODO:
			//result.setGyoshuName((String)ConverterUtility.convert(String.class,mConsulting.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 経営立直し資金 key名 : keieiTatenaosiSikin 型 : NUMBER
			//備考 :  ÷10000をセット
			//TODO:
			//result.setKeieiTatenaosiSikin((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 経営立直し資金の(b)減価償却額 key名 : genkashokyakuhiTotal 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setGenkashokyakuhiTotal((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 経営立直し資金の(a)経常利益 key名 : kejoriekiTotal 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKejoriekiTotal((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 現状の変動費 key名 : hendohiCurrent 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setHendohiCurrent((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 現状の固定費 key名 : koteihiCurrent 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKoteihiCurrent((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 現状の固定費のうち減価償却費 key名 : genkashokyakuhiCurrent 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setGenkashokyakuhiCurrent((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 現状の経常利益 key名 : keijoriekiCurrent 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKeijoriekiCurrent((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の1年後の売上高 key名 : uriagedakaOneYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setUriagedakaOneYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の1年後の変動費 key名 : hendohiOneYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setHendohiOneYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の1年後の固定費 key名 : koteihiOneYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKoteihiOneYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の1年後の固定費のうち減価償却費 key名 : genkashokyakuhiOneYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setGenkashokyakuhiOneYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の1年後の経常利益 key名 : keijoriekiOneYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKeijoriekiOneYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の2年後の売上高 key名 : uriagedakaTwoYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setUriagedakaTwoYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の2年後の変動費 key名 : hendohiTwoYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setHendohiTwoYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の2年後の固定費 key名 : koteihiTwoYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKoteihiTwoYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の2年後の固定費のうち減価償却費 key名 : genkashokyakuhiTwoYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setGenkashokyakuhiTwoYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の2年後の経常利益 key名 : keijoriekiTwoYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKeijoriekiTwoYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の3年後の売上高 key名 : uriagedakaThreeYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setUriagedakaThreeYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の3年後の変動費 key名 : hendohiThreeYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setHendohiThreeYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の3年後の固定費 key名 : koteihiThreeYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKoteihiThreeYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の3年後の固定費のうち減価償却費 key名 : genkashokyakuhiThreeYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setGenkashokyakuhiThreeYearLater((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0008 入力 : 万一後の3年後の経常利益 key名 : keijoriekiThreeYearLater 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setKeijoriekiThreeYearLater((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 経営者リスク分析 : lbsc0002
	 */
	static public Lbsc0002 経営者リスク分析_lbsc0002(){
		Lbsc0002 result=new Lbsc0002();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0002 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0002 入力 : 経営立直し資金 key名 : keieiTatenaosiSikin 型 : NUMBER
			//備考 :  ÷10000をセット
			//TODO:
			//result.setKeieiTatenaosiSikin((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル:　データモデルの生成は必要 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0002 入力 : 納税準備資金 key名 : nozeijunbikin 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setNozeijunbikin((String)ConverterUtility.convert(String.class,　データモデルの生成は必要.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0002 入力 : 事業保障資金 key名 : jigyohoshokin 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setJigyohoshokin((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0002 入力 : 役員在任年数 key名 : zaininYear 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setZaininYear((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0002 入力 : 死亡退職金 key名 : sibotaishokukin 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setSibotaishokukin((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0002 入力 : 弔慰金 key名 : tyoikin 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setTyoikin((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0002 入力 : 経営者の必要保障額合計 key名 : hituyohoshogaku 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setHituyohoshogaku((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算 : lbsc0010
	 */
	static public Lbsc0010 役員退職慰労金試算_lbsc0010(TCorpKihonInfo tCorpKihonInfo){
		Lbsc0010 result=new Lbsc0010();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人名 物理:CORP_NAME 属性:Varchar2 桁数:32 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 法人名漢字 key名 : hojinmei 型 : CHAR
			//備考 :  
			result.setHojinmei((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpName()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人名カナ 物理:CORP_NAME_KANA 属性:Varchar2 桁数:64 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 法人名カナ key名 : hojinmeiKana 型 : CHAR
			//備考 :  
			result.setHojinmeiKana((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpNameKana()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人実効税率 物理:CORP_JIKKOUZEI_RT 属性:Number 桁数:5 少数: 2
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 法人税実効税率 key名 : houjinzeiJikkouZeiritsu 型 : NUMBER
			//備考 :  
			result.setHoujinzeiJikkouZeiritsu((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpJikkouzeiRt()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 入社年齢 key名 : nyushaAge 型 : NUMBER
			//備考 :  
			result.setNyushaAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getNyushaAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:役員就任年齢 物理:YAKUIN_SHUNIN_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 役員就任年齢 key名 : yakuinShuninAge 型 : NUMBER
			//備考 :  
			result.setYakuinShuninAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYakuinShuninAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:勇退予測報酬月額 物理:YUTAI_YSHOSHU_GETSUGAKU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 予想報酬月額(勇退時) key名 : hoshuGetugakuYutai 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setHoshuGetugakuYutai((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYutaiYshoshuGetsugaku()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:功績倍率 物理:KOSEKI_BAI_RT 属性:Number 桁数:3 少数: 1
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 功績倍率 key名 : achievementMagnification 型 : NUMBER
			//備考 :  
			result.setAchievementMagnification((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getKosekiBaiRt()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:勇退予測年齢 物理:YUTAI_YOSOKU_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 勇退予定年齢 key名 : yutaiAge 型 : NUMBER
			//備考 :  
			result.setYutaiAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYutaiYosokuAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:希望役員退職慰労金額 物理:KIBO_YAKUIN_TIROKIN 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0010 入力 : 希望退職慰労金額 key名 : kiboTaishokuIrokin 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setKiboTaishokuIrokin((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getKiboYakuinTirokin()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算 : lbsc0003
	 */
	static public Lbsc0003 役員退職慰労金試算_lbsc0003(){
		Lbsc0003 result=new Lbsc0003();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0003 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0003 入力 : 役員在任年数 key名 : officerTenureYears 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setOfficerTenureYears((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル:　データモデルの生成は必要 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0003 入力 : 勇退時の適正額 key名 : yutaiProperAmount 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setYutaiProperAmount((String)ConverterUtility.convert(String.class,　データモデルの生成は必要.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算 : lbsc0004
	 */
	static public Lbsc0004 役員退職慰労金試算_lbsc0004(){
		Lbsc0004 result=new Lbsc0004();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 勤続年数 key名 : workPeriod 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setWorkPeriod((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル:　データモデルの生成は必要 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 退職所得控除額 key名 : allowedRetirementIncomeDeduction 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAllowedRetirementIncomeDeduction((String)ConverterUtility.convert(String.class,　データモデルの生成は必要.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 1/2実施有無 key名 : halfTaxbleIncome 型 : CHAR
			//備考 :  
			//TODO:
			//result.setHalfTaxbleIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 退職慰労金として受け取った場合の課税所得額 key名 : retirementAssessableIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setRetirementAssessableIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 税率 key名 : taxRates 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setTaxRates((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 控除額 key名 : amountDeducted 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAmountDeducted((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 退職慰労金として受け取った場合の所得税・住民税額 key名 : retirementIncomeAndResidentTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setRetirementIncomeAndResidentTax((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 退職慰労金手取額 key名 : retirementNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setRetirementNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 給与所得控除額 key名 : employmentIncomeDeduction 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setEmploymentIncomeDeduction((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 役員報酬として受け取った場合の課税所得額 key名 : officerAssessableIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setOfficerAssessableIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 役員報酬として受け取った場合の所得税・住民税額 key名 : officerIncomeAndResidentTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setOfficerIncomeAndResidentTax((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 役員報酬手取額 key名 : officerNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setOfficerNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 手取差額 key名 : totalNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setTotalNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * キャッシュフロー改善試算 : lbsc00011
	 */
	static public Lbsc00011 キャッシュフロー改善試算_lbsc00011(TCorpKihonInfo tCorpKihonInfo){
		Lbsc00011 result=new Lbsc00011();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人名 物理:CORP_NAME 属性:Varchar2 桁数:32 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 法人名漢字 key名 : hojinmei 型 : CHAR
			//備考 :  
			result.setHojinmei((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpName()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人名カナ 物理:CORP_NAME_KANA 属性:Varchar2 桁数:64 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 法人名カナ key名 : hojinmeiKana 型 : CHAR
			//備考 :  
			result.setHojinmeiKana((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpNameKana()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人実効税率 物理:CORP_JIKKOUZEI_RT 属性:Number 桁数:5 少数: 2
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 法人税実効税率 key名 : houjinzeiJikkouZeiritsu 型 : NUMBER
			//備考 :  
			result.setHoujinzeiJikkouZeiritsu((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpJikkouzeiRt()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 入社年齢 key名 : nyushaAge 型 : NUMBER
			//備考 :  
			result.setNyushaAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getNyushaAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:役員就任年齢 物理:YAKUIN_SHUNIN_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 役員就任年齢 key名 : yakuinShuninAge 型 : NUMBER
			//備考 :  
			result.setYakuinShuninAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYakuinShuninAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:厚生年金加入年齢 物理:EP_KANYU_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 厚生年金加入年齢 key名 : nenkinkanyuAge 型 : NUMBER
			//備考 :  
			result.setNenkinkanyuAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getEpKanyuAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:現在報酬月額 物理:GENZAI_HOSHU_GETSUGAKU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 報酬月額(現在) key名 : hoshuGetugakuCurrent 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setHoshuGetugakuCurrent((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getGenzaiHoshuGetsugaku()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:勇退予測年齢 物理:YUTAI_YOSOKU_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 勇退予定年齢 key名 : yutaiAge 型 : NUMBER
			//備考 :  
			result.setYutaiAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYutaiYosokuAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:希望役員退職慰労金額 物理:KIBO_YAKUIN_TIROKIN 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 希望退職慰労金額 key名 : kiboTaishokuIrokin 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setKiboTaishokuIrokin((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getKiboYakuinTirokin()));
		}
		{
			//FROM:テーブル:※項目セット無し 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 所得控除(住民税) key名 : deductionsResidentTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setDeductionsResidentTax((String)ConverterUtility.convert(String.class,※項目セット無し.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00011 入力 : 所得控除(所得税) key名 : deductionsIncomeTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setDeductionsIncomeTax((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * キャッシュフロー改善試算 : lbsc00005
	 */
	static public Lbsc00005 キャッシュフロー改善試算_lbsc00005(TCorpCashfKaize tCorpCashfKaize){
		Lbsc00005 result=new Lbsc00005();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_CASHF_KAIZE 論理:引下金額 物理:SAGE_KINGAKU 属性:Number 桁数:11 少数: 0
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 役員報酬引下額 key名 : amountOfExecutiveCompensationReduction 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setAmountOfExecutiveCompensationReduction((String)ConverterUtility.convert(String.class,tCorpCashfKaize.getSageKingaku()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 退職慰労金額必要準備額 key名 : amountOfRetirementAllowanceRequiredPreparation 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAmountOfRetirementAllowanceRequiredPreparation((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 勇退までの期間 key名 : periodToVoluntaryRetirement 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setPeriodToVoluntaryRetirement((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 引下げ後の役員報酬月額 key名 : afterReductionAmountOfExecutiveCompensation 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAfterReductionAmountOfExecutiveCompensation((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の総手取額の差額 key名 : individualGrossReceipts 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualGrossReceipts((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の総受給額 key名 : individualBeforeReductionAmountOfReceipt 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionAmountOfReceipt((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 引下げ前の役員報酬 key名 : beforeReductionExecutiveCompensation 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setBeforeReductionExecutiveCompensation((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の在職老齢年金 key名 : individualBeforeReductionPensionForAgedWorkers 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionPensionForAgedWorkers((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の社会保険料 key名 : individualBeforeReductionSocialInsurancePremiums 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionSocialInsurancePremiums((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の住民税・所得税 key名 : individualBeforeReductionResidentAndIncomeTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionResidentAndIncomeTax((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の総手取収入 key名 : individualBeforeReductionTotalNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionTotalNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の総受給額 key名 : individualAfterReductionAmountOfReceipt 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionAmountOfReceipt((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 引下げ後の役員報酬 key名 : afterReductionExecutiveCompensation 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAfterReductionExecutiveCompensation((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の在職老齢年金 key名 : individualAfterReductionPensionForAgedWorkers 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionPensionForAgedWorkers((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の社会保険料 key名 : individualAfterReductionSocialInsurancePremiums 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionSocialInsurancePremiums((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の住民税・所得税 key名 : individualAfterReductionResidentAndIncomeTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionResidentAndIncomeTax((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の総手取収入 key名 : individualAfterReductionTotalNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionTotalNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の総負担額の差額 key名 : corporationDifferenceObligationFees 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationDifferenceObligationFees((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ前の総負担額 key名 : corporationBeforeReductionTotalObligationFees 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationBeforeReductionTotalObligationFees((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ前の社会保険料 key名 : corporationBeforeReductionSocialInsurancePremiums 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationBeforeReductionSocialInsurancePremiums((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ後の総負担額 key名 : corporationAfterReductionTotalObligationFees 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationAfterReductionTotalObligationFees((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ後の社会保険料 key名 : corporationAfterReductionSocialInsurancePremiums 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationAfterReductionSocialInsurancePremiums((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ後の法人税負担上昇額 key名 : corporationAfterReduction 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationAfterReduction((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : キャッシュフロー累計 key名 : totalCashFlow 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setTotalCashFlow((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 在職老齢年金時系列データ key名 : ｒeductionPensionForAgedWorkers 型 : List
			//備考 :  
			//TODO:
			//result.setＲeductionPensionForAgedWorkers((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 　西暦 key名 : year 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setYear((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 　年齢 key名 : age 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAge((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 　引下げ前の年額 key名 : amount_befor 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAmount_befor((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 　引下げ後の年額 key名 : amount_after 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAmount_after((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * キャッシュフロー改善試算 : lbsc00006
	 */
	static public Lbsc00006 キャッシュフロー改善試算_lbsc00006(TCorpCashfKaize tCorpCashfKaize, MConsulting mConsulting){
		Lbsc00006 result=new Lbsc00006();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_CASHF_KAIZE 論理:参考保険 保険種類コード 物理:SKHK_HOKEN_SHURUI_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険種類 key名 : insuranceKind 型 : CODE
			//備考 :  
			result.setInsuranceKind((String)ConverterUtility.convert(String.class,tCorpCashfKaize.getSkhkHokenShuruiCd()));
		}
		{
			//FROM:テーブル:M_CONSULTING 論理:条件[コードID=LR02、コード値=参考保険 保険種類コード]で、[値1]を取得 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険種類名 key名 : insuranceKindName 型 : CHAR
			//備考 :  
			//TODO:
			//result.setInsuranceKindName((String)ConverterUtility.convert(String.class,mConsulting.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 型 key名 : insuranceType 型 : CODE
			//備考 :  
			//TODO:
			//result.setInsuranceType((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 型名 key名 : insuranceTypeName 型 : CHAR
			//備考 :  
			//TODO:
			//result.setInsuranceTypeName((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険期間 key名 : insurancePeriod 型 : CHAR
			//備考 :  
			//TODO:
			//result.setInsurancePeriod((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 払込期間 key名 : paymentPeriod 型 : CHAR
			//備考 :  
			//TODO:
			//result.setPaymentPeriod((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 払方 key名 : paymentKind 型 : CHAR
			//備考 :  
			//TODO:
			//result.setPaymentKind((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険金額 key名 : insuranceAmount 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setInsuranceAmount((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険料累計 key名 : insuranceTotal 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setInsuranceTotal((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 払戻金 key名 : payReturn 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setPayReturn((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 返戻率 key名 : rateMaturity 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setRateMaturity((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 総合改善効果 key名 : improvementEffectAmount 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setImprovementEffectAmount((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : キャッシュ・フロー累計 key名 : cashFlowTotal 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCashFlowTotal((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 生命保険活用後の収支 key名 : incomeAndOutgo 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIncomeAndOutgo((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 法人税負担減少額 key名 : corporationTaxBurdenDecrease 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationTaxBurdenDecrease((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算キャッシュフロー改善試算 : lbsc00013
	 */
	static public Lbsc00013 役員退職慰労金試算キャッシュフロー改善試算_lbsc00013(TCorpKihonInfo tCorpKihonInfo){
		Lbsc00013 result=new Lbsc00013();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人名 物理:CORP_NAME 属性:Varchar2 桁数:32 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 法人名漢字 key名 : hojinmei 型 : CHAR
			//備考 :  
			result.setHojinmei((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpName()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人名カナ 物理:CORP_NAME_KANA 属性:Varchar2 桁数:64 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 法人名カナ key名 : hojinmeiKana 型 : CHAR
			//備考 :  
			result.setHojinmeiKana((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpNameKana()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:法人実効税率 物理:CORP_JIKKOUZEI_RT 属性:Number 桁数:5 少数: 2
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 法人税実効税率 key名 : houjinzeiJikkouZeiritsu 型 : NUMBER
			//備考 :  
			result.setHoujinzeiJikkouZeiritsu((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getCorpJikkouzeiRt()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 入社年齢 key名 : nyushaAge 型 : NUMBER
			//備考 :  
			result.setNyushaAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getNyushaAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:役員就任年齢 物理:YAKUIN_SHUNIN_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 役員就任年齢 key名 : yakuinShuninAge 型 : NUMBER
			//備考 :  
			result.setYakuinShuninAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYakuinShuninAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:厚生年金加入年齢 物理:EP_KANYU_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 厚生年金加入年齢 key名 : nenkinkanyuAge 型 : NUMBER
			//備考 :  
			result.setNenkinkanyuAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getEpKanyuAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:現在報酬月額 物理:GENZAI_HOSHU_GETSUGAKU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 報酬月額(現在) key名 : hoshuGetugakuCurrent 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setHoshuGetugakuCurrent((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getGenzaiHoshuGetsugaku()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:勇退予測報酬月額 物理:YUTAI_YSHOSHU_GETSUGAKU 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 予想報酬月額(勇退時) key名 : hoshuGetugakuYutai 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setHoshuGetugakuYutai((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYutaiYshoshuGetsugaku()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:功績倍率 物理:KOSEKI_BAI_RT 属性:Number 桁数:3 少数: 1
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 功績倍率 key名 : achievementMagnification 型 : NUMBER
			//備考 :  
			result.setAchievementMagnification((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getKosekiBaiRt()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:勇退予測年齢 物理:YUTAI_YOSOKU_AGE 属性:Number 桁数:3 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 勇退予定年齢 key名 : yutaiAge 型 : NUMBER
			//備考 :  
			result.setYutaiAge((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getYutaiYosokuAge()));
		}
		{
			//FROM:テーブル:T_CORP_KIHON_INFO 論理:希望役員退職慰労金額 物理:KIBO_YAKUIN_TIROKIN 属性:Number 桁数:11 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 希望退職慰労金額 key名 : kiboTaishokuIrokin 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setKiboTaishokuIrokin((String)ConverterUtility.convert(String.class,tCorpKihonInfo.getKiboYakuinTirokin()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 所得控除(住民税) key名 : deductionsResidentTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setDeductionsResidentTax((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00013 入力 : 所得控除(所得税) key名 : deductionsIncomeTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setDeductionsIncomeTax((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算キャッシュフロー改善試算 : lbsc0003
	 */
	static public Lbsc0003 役員退職慰労金試算キャッシュフロー改善試算_lbsc0003(){
		Lbsc0003 result=new Lbsc0003();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0003 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0003 入力 : 役員在任年数 key名 : officerTenureYears 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setOfficerTenureYears((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル:　データモデルの生成は必要 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0003 入力 : 勇退時の適正額 key名 : yutaiProperAmount 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setYutaiProperAmount((String)ConverterUtility.convert(String.class,　データモデルの生成は必要.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算キャッシュフロー改善試算 : lbsc0004
	 */
	static public Lbsc0004 役員退職慰労金試算キャッシュフロー改善試算_lbsc0004(){
		Lbsc0004 result=new Lbsc0004();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 勤続年数 key名 : workPeriod 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setWorkPeriod((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル:　データモデルの生成は必要 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 退職所得控除額 key名 : allowedRetirementIncomeDeduction 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAllowedRetirementIncomeDeduction((String)ConverterUtility.convert(String.class,　データモデルの生成は必要.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 1/2実施有無 key名 : halfTaxbleIncome 型 : CHAR
			//備考 :  
			//TODO:
			//result.setHalfTaxbleIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 退職慰労金として受け取った場合の課税所得額 key名 : retirementAssessableIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setRetirementAssessableIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 税率 key名 : taxRates 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setTaxRates((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 控除額 key名 : amountDeducted 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAmountDeducted((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 退職慰労金として受け取った場合の所得税・住民税額 key名 : retirementIncomeAndResidentTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setRetirementIncomeAndResidentTax((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 退職慰労金手取額 key名 : retirementNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setRetirementNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 給与所得控除額 key名 : employmentIncomeDeduction 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setEmploymentIncomeDeduction((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 役員報酬として受け取った場合の課税所得額 key名 : officerAssessableIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setOfficerAssessableIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 役員報酬として受け取った場合の所得税・住民税額 key名 : officerIncomeAndResidentTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setOfficerIncomeAndResidentTax((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 役員報酬手取額 key名 : officerNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setOfficerNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc0004 入力 : 手取差額 key名 : totalNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setTotalNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算キャッシュフロー改善試算 : lbsc00005
	 */
	static public Lbsc00005 役員退職慰労金試算キャッシュフロー改善試算_lbsc00005(TCorpCashfKaize tCorpCashfKaize){
		Lbsc00005 result=new Lbsc00005();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_CASHF_KAIZE 論理:引下金額 物理:SAGE_KINGAKU 属性:Number 桁数:11 少数: 0
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 役員報酬引下額 key名 : amountOfExecutiveCompensationReduction 型 : NUMBER
			//備考 :  ÷10000をセット
			result.setAmountOfExecutiveCompensationReduction((String)ConverterUtility.convert(String.class,tCorpCashfKaize.getSageKingaku()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 退職慰労金額必要準備額 key名 : amountOfRetirementAllowanceRequiredPreparation 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAmountOfRetirementAllowanceRequiredPreparation((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 勇退までの期間 key名 : periodToVoluntaryRetirement 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setPeriodToVoluntaryRetirement((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 引下げ後の役員報酬月額 key名 : afterReductionAmountOfExecutiveCompensation 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAfterReductionAmountOfExecutiveCompensation((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の総手取額の差額 key名 : individualGrossReceipts 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualGrossReceipts((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の総受給額 key名 : individualBeforeReductionAmountOfReceipt 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionAmountOfReceipt((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 引下げ前の役員報酬 key名 : beforeReductionExecutiveCompensation 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setBeforeReductionExecutiveCompensation((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の在職老齢年金 key名 : individualBeforeReductionPensionForAgedWorkers 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionPensionForAgedWorkers((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の社会保険料 key名 : individualBeforeReductionSocialInsurancePremiums 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionSocialInsurancePremiums((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の住民税・所得税 key名 : individualBeforeReductionResidentAndIncomeTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionResidentAndIncomeTax((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ前の総手取収入 key名 : individualBeforeReductionTotalNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualBeforeReductionTotalNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の総受給額 key名 : individualAfterReductionAmountOfReceipt 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionAmountOfReceipt((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 引下げ後の役員報酬 key名 : afterReductionExecutiveCompensation 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAfterReductionExecutiveCompensation((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の在職老齢年金 key名 : individualAfterReductionPensionForAgedWorkers 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionPensionForAgedWorkers((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の社会保険料 key名 : individualAfterReductionSocialInsurancePremiums 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionSocialInsurancePremiums((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の住民税・所得税 key名 : individualAfterReductionResidentAndIncomeTax 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionResidentAndIncomeTax((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 個人の引下げ後の総手取収入 key名 : individualAfterReductionTotalNetIncome 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIndividualAfterReductionTotalNetIncome((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の総負担額の差額 key名 : corporationDifferenceObligationFees 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationDifferenceObligationFees((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ前の総負担額 key名 : corporationBeforeReductionTotalObligationFees 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationBeforeReductionTotalObligationFees((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ前の社会保険料 key名 : corporationBeforeReductionSocialInsurancePremiums 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationBeforeReductionSocialInsurancePremiums((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ後の総負担額 key名 : corporationAfterReductionTotalObligationFees 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationAfterReductionTotalObligationFees((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ後の社会保険料 key名 : corporationAfterReductionSocialInsurancePremiums 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationAfterReductionSocialInsurancePremiums((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 法人の引下げ後の法人税負担上昇額 key名 : corporationAfterReduction 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationAfterReduction((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : キャッシュフロー累計 key名 : totalCashFlow 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setTotalCashFlow((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 在職老齢年金時系列データ key名 : ｒeductionPensionForAgedWorkers 型 : List
			//備考 :  
			//TODO:
			//result.setＲeductionPensionForAgedWorkers((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 　西暦 key名 : year 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setYear((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 　年齢 key名 : age 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAge((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 　引下げ前の年額 key名 : amount_befor 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAmount_befor((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00005 入力 : 　引下げ後の年額 key名 : amount_after 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setAmount_after((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 役員退職慰労金試算キャッシュフロー改善試算 : lbsc00006
	 */
	static public Lbsc00006 役員退職慰労金試算キャッシュフロー改善試算_lbsc00006(TCorpCashfKaize tCorpCashfKaize, MConsulting mConsulting){
		Lbsc00006 result=new Lbsc00006();
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : id key名 : id 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setId((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル:T_CORP_CASHF_KAIZE 論理:参考保険 保険種類コード 物理:SKHK_HOKEN_SHURUI_CD 属性:Char 桁数:1 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険種類 key名 : insuranceKind 型 : CODE
			//備考 :  
			result.setInsuranceKind((String)ConverterUtility.convert(String.class,tCorpCashfKaize.getSkhkHokenShuruiCd()));
		}
		{
			//FROM:テーブル:M_CONSULTING 論理:条件[コードID=LR02、コード値=参考保険 保険種類コード]で、[値1]を取得 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険種類名 key名 : insuranceKindName 型 : CHAR
			//備考 :  
			//TODO:
			//result.setInsuranceKindName((String)ConverterUtility.convert(String.class,mConsulting.get()));
		}
		{
			//FROM:テーブル:※項目セット無し　(画面にて算出) 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 型 key名 : insuranceType 型 : CODE
			//備考 :  
			//TODO:
			//result.setInsuranceType((String)ConverterUtility.convert(String.class,※項目セット無し　(画面にて算出).get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 型名 key名 : insuranceTypeName 型 : CHAR
			//備考 :  
			//TODO:
			//result.setInsuranceTypeName((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険期間 key名 : insurancePeriod 型 : CHAR
			//備考 :  
			//TODO:
			//result.setInsurancePeriod((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 払込期間 key名 : paymentPeriod 型 : CHAR
			//備考 :  
			//TODO:
			//result.setPaymentPeriod((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 払方 key名 : paymentKind 型 : CHAR
			//備考 :  
			//TODO:
			//result.setPaymentKind((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険金額 key名 : insuranceAmount 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setInsuranceAmount((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 保険料累計 key名 : insuranceTotal 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setInsuranceTotal((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 払戻金 key名 : payReturn 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setPayReturn((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 返戻率 key名 : rateMaturity 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setRateMaturity((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 総合改善効果 key名 : improvementEffectAmount 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setImprovementEffectAmount((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : キャッシュ・フロー累計 key名 : cashFlowTotal 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCashFlowTotal((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 生命保険活用後の収支 key名 : incomeAndOutgo 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setIncomeAndOutgo((String)ConverterUtility.convert(String.class,.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数: 
			//備考 : 
			//TO:画面データモデル: lbsc00006 入力 : 法人税負担減少額 key名 : corporationTaxBurdenDecrease 型 : NUMBER
			//備考 :  
			//TODO:
			//result.setCorporationTaxBurdenDecrease((String)ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

}
