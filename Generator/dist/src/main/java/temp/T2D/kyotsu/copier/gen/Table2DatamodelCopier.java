package temp.T2D.kyotsu.copier.gen;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.T2D.kyotsu.datamodel.gen.LtPlanCollection;
import temp.T2D.kyotsu.datamodel.gen.PlanFamilyCollection;
import temp.T2D.kyotsu.entity.gen.VPlanList;
import temp.T2D.kyotsu.entity.gen.MConsulting;
import temp.T2D.kyotsu.entity.gen.TKrnsPlanFamily;


class Table2DatamodelCopier{


	/*
	 * データ変換処理：
	 * 共通部:LtPlanCollection
	 */
	static public LtPlanCollection 共通部_LtPlanCollection(VPlanList vPlanList, MConsulting mConsulting){
		LtPlanCollection result=new LtPlanCollection();
		{
			//FROM:テーブル:V_PLAN_LIST 論理:取扱者ID 物理:AGENT_ID 属性:Varchar2 桁数:4 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:取扱者ID key名:toriatsukaishaId 型: 備考: 
			//TODO:
			result.setToriatsukaishaId(ConverterUtility.convert(String.class,vPlanList.getAgentId()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:顧客ID 物理:CUST_ID 属性:Varchar2 桁数:8 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:顧客ID key名:kokyakuId 型: 備考: 
			//TODO:
			result.setKokyakuId(ConverterUtility.convert(String.class,vPlanList.getCustId()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:分析種別コード 物理:BUNSEKI_SB_CD 属性:Varchar2 桁数:30 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:分析種別コード key名:bunsekiShubetsu 型: 備考: 
			//TODO:
			result.setBunsekiShubetsu(ConverterUtility.convert(String.class,vPlanList.getBunsekiSbCd()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:プランID 物理:PLAN_ID 属性:Varchar2 桁数:36 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:プランID key名:planId 型: 備考: 
			//TODO:
			result.setPlanId(ConverterUtility.convert(String.class,vPlanList.getPlanId()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:計算基準日 物理:KEISAN_KIJUN_DATE 属性:Date 桁数:　 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:計算基準日 key名:keisanKijunbi 型: 備考: 
			//TODO:
			result.setKeisanKijunbi(ConverterUtility.convert(String.class,vPlanList.getKeisanKijunDate()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:設計プランNo 物理:SEKKEI_PLAN_NO 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:設計プランNo key名:sekkeiPlanNo 型: 備考: 
			//TODO:
			result.setSekkeiPlanNo(ConverterUtility.convert(String.class,vPlanList.getSekkeiPlanNo()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:設計プランNo（配） 物理:SEKKEI_PLAN_NO_P 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:設計プランNo（配） key名:sekkeiPlanNoP 型: 備考: 
			//TODO:
			result.setSekkeiPlanNoP(ConverterUtility.convert(String.class,vPlanList.getSekkeiPlanNoP()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:被保険者ID 物理:INSURED_ID 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:被保険者ID key名:insuredId 型: 備考: 
			//TODO:
			result.setInsuredId(ConverterUtility.convert(String.class,vPlanList.getInsuredId()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:被保険者ID（配） 物理:INSURED_ID_P 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:被保険者ID（配） key名:insuredIdP 型: 備考: 
			//TODO:
			result.setInsuredIdP(ConverterUtility.convert(String.class,vPlanList.getInsuredIdP()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:相続プランNo 物理:SOZOKU_PLAN_NO 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:相続プランNo key名:sozokuPlanNo 型: 備考: 
			//TODO:
			result.setSozokuPlanNo(ConverterUtility.convert(String.class,vPlanList.getSozokuPlanNo()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:医療プランNo 物理:IRYO_PLAN_NO 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:医療プランNo key名:iryoPlanNo 型: 備考: 
			//TODO:
			result.setIryoPlanNo(ConverterUtility.convert(String.class,vPlanList.getIryoPlanNo()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:介護プランNo 物理:CARE_PLAN_NO 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:介護プランNo key名:kaigoPlanNo 型: 備考: 
			//TODO:
			result.setKaigoPlanNo(ConverterUtility.convert(String.class,vPlanList.getCarePlanNo()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:証券分析プランNo 物理:SHOKEMBUNSEKI_PLAN_NO 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:証券分析プランNo key名:shokenPlanNo 型: 備考: 
			//TODO:
			result.setShokenPlanNo(ConverterUtility.convert(String.class,vPlanList.getShokembunsekiPlanNo()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:証券分析プランNo（配） 物理:SHOKEMBUNSEKI_PLAN_NO_P 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:証券分析プランNo（配） key名:shokenPlanNoP 型: 備考: 
			//TODO:
			result.setShokenPlanNoP(ConverterUtility.convert(String.class,vPlanList.getShokembunsekiPlanNoP()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:LNAS CA プランID 物理:LNAS_CA_PLAN_ID 属性:Varchar2 桁数:17 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:LNAS CA プランID key名:lnasCaPlanId 型: 備考: 
			//TODO:
			result.setLnasCaPlanId(ConverterUtility.convert(String.class,vPlanList.getLnasCaPlanId()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:取扱者性別コード 物理:AGENT_SEX_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:性別コード key名:faGender 型: 備考: 
			//TODO:
			result.setFaGender(ConverterUtility.convert(String.class,vPlanList.getAgentSexCd()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:分析一覧コメント 物理:BUNSEKI_COMMENT 属性:Varchar2 桁数:30 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:コメント key名:comment 型: 備考: 
			//TODO:
			result.setComment(ConverterUtility.convert(String.class,vPlanList.getBunsekiComment()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:分析実施日 物理:BUNSEKI_CREATE_DATE 属性:Date 桁数:　 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:プラン作成日時 key名:planCreated 型: 備考: 
			//TODO:
			result.setPlanCreated(ConverterUtility.convert(String.class,vPlanList.getBunsekiCreateDate()));
		}
		{
			//FROM:テーブル:V_PLAN_LIST 論理:分析最終更新日 物理:BUNSEKI_UPDATE_DATE 属性:Date 桁数:　 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:プラン更新日時 key名:planUpdated 型: 備考: 
			//TODO:
			result.setPlanUpdated(ConverterUtility.convert(String.class,vPlanList.getBunsekiUpdateDate()));
		}
		{
			//FROM:テーブル:M_CONSULTING 論理:条件[コードID=CM06、コード値=分析種別コード]で、[値2]を取得 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:分析種別名 key名:bunsekiShubetsuName 型: 備考: 
			//TODO:
			//result.setBunsekiShubetsuName(ConverterUtility.convert(String.class,mConsulting.get()));
		}
		{
			//FROM:テーブル: 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: LtPlan 入力:プランステータスコード key名:planStatus 型: 備考: 
			//TODO:
			//result.setPlanStatus(ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

	/*
	 * データ変換処理：
	 * 共通部:PlanFamilyCollection
	 */
	static public PlanFamilyCollection 共通部_PlanFamilyCollection(TKrnsPlanFamily tKrnsPlanFamily, MConsulting mConsulting){
		PlanFamilyCollection result=new PlanFamilyCollection();
		{
			//FROM:テーブル:０から順にカウントアップしてセット。順序は、マスタ情報より条件[コードID=CM07、コード値=続柄コード]で取得 論理: 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:ID key名:id 型:NUMBER 備考: 
			//TODO:
			//result.setId(ConverterUtility.convert(String.class,０から順にカウントアップしてセット。順序は、マスタ情報より条件[コードid=cm07、コード値=続柄コード]で取得.get()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:家族コード 物理:FAMILY_CD 属性:Char 桁数:2 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:家族No key名:familyNo 型: 備考: 
			//TODO:
			result.setFamilyNo(ConverterUtility.convert(String.class,tKrnsPlanFamily.getFamilyCd()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:家族氏名（漢字） 物理:FAMILY_NAME_KANJI 属性:Varchar2 桁数:32 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:名前（漢字） key名:kanjiName 型: 備考: 
			//TODO:
			result.setKanjiName(ConverterUtility.convert(String.class,tKrnsPlanFamily.getFamilyNameKanji()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:家族氏名（カナ） 物理:FAMILY_NAME_KANA 属性:Varchar2 桁数:32 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:名前（カナ） key名:kanaName 型: 備考: 
			//TODO:
			result.setKanaName(ConverterUtility.convert(String.class,tKrnsPlanFamily.getFamilyNameKana()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:生年月日 物理:BIRTH 属性:Date 桁数:　 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:生年月日 key名:dateOfBirth 型: 備考: 
			//TODO:
			result.setDateOfBirth(ConverterUtility.convert(String.class,tKrnsPlanFamily.getBirth()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:年齢 物理:AGE 属性:Number 桁数:3 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:年齢 key名:age 型: 備考: 
			//TODO:
			result.setAge(ConverterUtility.convert(String.class,tKrnsPlanFamily.getAge()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:生年月日・年齢選択コード 物理:BIRTH_AGE_SELECT_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:生年月日・年齢選択フラグ key名:dateAgeFlg 型: 備考: 
			//TODO:
			result.setDateAgeFlg(ConverterUtility.convert(String.class,tKrnsPlanFamily.getBirthAgeSelectCd()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:続柄コード 物理:ZOKUGARA_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:続柄 key名:zokugara 型: 備考: 
			//TODO:
			result.setZokugara(ConverterUtility.convert(String.class,tKrnsPlanFamily.getZokugaraCd()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:性別コード 物理:SEX_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:性別 key名:gender 型: 備考: 
			//TODO:
			result.setGender(ConverterUtility.convert(String.class,tKrnsPlanFamily.getSexCd()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:職業コード 物理:JOB_CD 属性:Char 桁数:1 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:仕事 key名:job 型: 備考: 
			//TODO:
			result.setJob(ConverterUtility.convert(String.class,tKrnsPlanFamily.getJobCd()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:年収 物理:NENSHU 属性:Number 桁数:11 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:年収 key名:annualIncome 型: 備考: ÷10000をセット
			//TODO:
			result.setAnnualIncome(ConverterUtility.convert(String.class,tKrnsPlanFamily.getNenshu()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:退職予定年齢 物理:TAISHOKU_PLAN_AGE 属性:Number 桁数:3 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:退職予定年齢 key名:retirementAge 型: 備考: 
			//TODO:
			result.setRetirementAge(ConverterUtility.convert(String.class,tKrnsPlanFamily.getTaishokuPlanAge()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:平均余命 物理:HEIKIN_YOMEI 属性:Number 桁数:3 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:平均寿命 key名:heikinJumyo 型: 備考: 
			//TODO:
			result.setHeikinJumyo(ConverterUtility.convert(String.class,tKrnsPlanFamily.getHeikinYomei()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:イメージ画像コード 物理:IMEJI_GAZOU_CD 属性:Char 桁数:8 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:イメージ画像 key名:image 型: 備考: 
			//TODO:
			result.setImage(ConverterUtility.convert(String.class,tKrnsPlanFamily.getImejiGazouCd()));
		}
		{
			//FROM:テーブル:T_KRNS_PLAN_FAMILY 論理:入社年齢 物理:NYUSHA_AGE 属性:Number 桁数:3 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:入社年齢 key名:enterCompanyAge 型: 備考: 
			//TODO:
			result.setEnterCompanyAge(ConverterUtility.convert(String.class,tKrnsPlanFamily.getNyushaAge()));
		}
		{
			//FROM:テーブル:M_CONSULTING 論理:条件[コードID=CM03、コード値=性別コード]で、[値1]を取得 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:性別名 key名:genderString 型: 備考: 
			//TODO:
			//result.setGenderString(ConverterUtility.convert(String.class,mConsulting.get()));
		}
		{
			//FROM:テーブル:マスタ情報 論理:条件[コードID=CM08、コード値=職業コード]で、[値1]を取得 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:仕事名 key名:jobString 型: 備考: 
			//TODO:
			//result.setJobString(ConverterUtility.convert(String.class,マスタ情報.get()));
		}
		{
			//FROM:テーブル: 論理:条件[コードID=CM07、コード値=続柄コード]で、[値1]を取得 物理: 属性: 桁数: 少数:  備考:
			//TO:画面データモデル: PlanFamily 入力:続柄名 key名:zokugaraName 型: 備考: 
			//TODO:
			//result.setZokugaraName(ConverterUtility.convert(String.class,.get()));
		}

		return result;

	}

}
