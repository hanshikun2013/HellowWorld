package temp.T2D.kaigo.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lcsc0501Collection
{
    /**
     * ID
     */
 	@JsonProperty("id")
	private String id;   
    /**
     * 介護タイプ
     */
 	@JsonProperty("careType")
	private String careType;   
    /**
     * 介護タイプ選択
     */
 	@JsonProperty("radioType")
	private String radioType;   
    /**
     * 介護必要期間入力欄
     */
 	@JsonProperty("careKikan")
	private String careKikan;   
    /**
     * 一時金
     */
 	@JsonProperty("temporaryMoney")
	private String temporaryMoney;   
    /**
     * 介護年金
     */
 	@JsonProperty("careNenkin")
	private String careNenkin;   
    /**
     * 介護年金受取期間
     */
 	@JsonProperty("careNenkinUketorikikan")
	private String careNenkinUketorikikan;   
    /**
     * 保障期間
     */
 	@JsonProperty("hosyoKikan")
	private String hosyoKikan;   
    /**
     * 保障期間単位リスト
     */
 	@JsonProperty("listHosyoKikanTani")
	private String listHosyoKikanTani;   
    /**
     * 払込期間
     */
 	@JsonProperty("haraikomiKikan")
	private String haraikomiKikan;   
    /**
     * 払込期間単位リスト
     */
 	@JsonProperty("listHaraikomiKikanTani")
	private String listHaraikomiKikanTani;   
    /**
     * 解約返戻金有無
     */
 	@JsonProperty("checkModoshikin")
	private String checkModoshikin;   
    /**
     * 家族No
     */
 	@JsonProperty("familyNo")
	private String familyNo;   
    /**
     * 介護タイプ文字
     */
 	@JsonProperty("careTypeString")
	private String careTypeString;   
    /**
     * 介護タイプ選択文字
     */
 	@JsonProperty("radioTypeString")
	private String radioTypeString;   
    /**
     * 要介護度選択リスト
     */
 	@JsonProperty("listCareLevel")
	private String listCareLevel;   
    /**
     * 要介護度選択リスト文字
     */
 	@JsonProperty("listCareLevelString")
	private String listCareLevelString;   
    /**
     * 介護開始時の初期費用
     */
 	@JsonProperty("initialCost")
	private String initialCost;   
    /**
     * 介護期間中の自己負担（月額）
     */
 	@JsonProperty("monthsOwnExpenses")
	private String monthsOwnExpenses;   
    /**
     * 介護期間中の自己負担（年額）
     */
 	@JsonProperty("yearsOwnExpenses")
	private String yearsOwnExpenses;   
    /**
     * 必要費用合計
     */
 	@JsonProperty("totalCost")
	private String totalCost;   
    /**
     * 初期費用（福祉用具費用）
     */
 	@JsonProperty("assistiveDeviceList")
	private String assistiveDeviceList;   
    /**
     * 初期費用（福祉用具費用 介護保険からの給付）
     */
 	@JsonProperty("assistiveDeviceCareAmount")
	private String assistiveDeviceCareAmount;   
    /**
     * 初期費用（福祉用具費用 自己負担）
     */
 	@JsonProperty("assistiveDeviceOwnExpenses")
	private String assistiveDeviceOwnExpenses;   
    /**
     * 初期費用（住宅改修費）
     */
 	@JsonProperty("homeImprovementList")
	private String homeImprovementList;   
    /**
     * 初期費用（住宅改修費用 介護保険からの給付）
     */
 	@JsonProperty("homeImprovementCareAmount")
	private String homeImprovementCareAmount;   
    /**
     * 初期費用（住宅改修費用 自己負担）
     */
 	@JsonProperty("homeImprovementOwnExpenses")
	private String homeImprovementOwnExpenses;   
    /**
     * 初期費用（介護サービス利用額合計）
     */
 	@JsonProperty("initialCostTotalCost")
	private String initialCostTotalCost;   
    /**
     * 初期費用（介護保険からの給付）
     */
 	@JsonProperty("initialCostCareAmount")
	private String initialCostCareAmount;   
    /**
     * 介護期間中(内訳)
     */
 	@JsonProperty("periodCostList")
	private String periodCostList;   
    /**
     * 介護期間中（月額サービスの利用合計額）
     */
 	@JsonProperty("periodCostTotalCost")
	private String periodCostTotalCost;   
    /**
     * 介護期間中（要介護度別の支給限度額）
     */
 	@JsonProperty("periodCostCareAmount")
	private String periodCostCareAmount;   
    /**
     * 介護期間中（支給限度額超過分）
     */
 	@JsonProperty("periodCostCareAmountOutLimit")
	private String periodCostCareAmountOutLimit;   
    /**
     * 介護期間中（支給限度額内のサービス利用1割負担）
     */
 	@JsonProperty("periodCostTenPerExpenses")
	private String periodCostTenPerExpenses;   
    /**
     * 介護期間中（支給限度額超過分のサービス利用）
     */
 	@JsonProperty("periodCostAllExpenses")
	private String periodCostAllExpenses;   
    /**
     * 分析年齢
     */
 	@JsonProperty("simulationAge")
	private String simulationAge;   
    /**
     * 準備済み補償額
     */
 	@JsonProperty("hosyoMoney")
	private String hosyoMoney;   
    /**
     * 過不足額
     */
 	@JsonProperty("excessDeficiency")
	private String excessDeficiency;   
    /**
     * 保障期間単位リスト文字
     */
 	@JsonProperty("listHosyoKikanTaniString")
	private String listHosyoKikanTaniString;   
    /**
     * 払込期間単位リスト文字
     */
 	@JsonProperty("listHaraikomiKikanTaniString")
	private String listHaraikomiKikanTaniString;   
    /**
     * 解約返戻金有無文字
     */
 	@JsonProperty("checkModoshikinString")
	private String checkModoshikinString;   
    /**
     * 平均余命
     */
 	@JsonProperty("lifeSpanAvg")
	private String lifeSpanAvg;   

	/**
	 * IDを取得します。
	 * @return ID
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * IDを設定します。
	 * @param id ID
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 介護タイプを取得します。
	 * @return 介護タイプ
	 */
	public String getCareType() {
		return careType;
	}
	
	/**
	 * 介護タイプを設定します。
	 * @param careType 介護タイプ
	 */
	public void setCareType(String careType) {
		this.careType = careType;
	}

	/**
	 * 介護タイプ選択を取得します。
	 * @return 介護タイプ選択
	 */
	public String getRadioType() {
		return radioType;
	}
	
	/**
	 * 介護タイプ選択を設定します。
	 * @param radioType 介護タイプ選択
	 */
	public void setRadioType(String radioType) {
		this.radioType = radioType;
	}

	/**
	 * 介護必要期間入力欄を取得します。
	 * @return 介護必要期間入力欄
	 */
	public String getCareKikan() {
		return careKikan;
	}
	
	/**
	 * 介護必要期間入力欄を設定します。
	 * @param careKikan 介護必要期間入力欄
	 */
	public void setCareKikan(String careKikan) {
		this.careKikan = careKikan;
	}

	/**
	 * 一時金を取得します。
	 * @return 一時金
	 */
	public String getTemporaryMoney() {
		return temporaryMoney;
	}
	
	/**
	 * 一時金を設定します。
	 * @param temporaryMoney 一時金
	 */
	public void setTemporaryMoney(String temporaryMoney) {
		this.temporaryMoney = temporaryMoney;
	}

	/**
	 * 介護年金を取得します。
	 * @return 介護年金
	 */
	public String getCareNenkin() {
		return careNenkin;
	}
	
	/**
	 * 介護年金を設定します。
	 * @param careNenkin 介護年金
	 */
	public void setCareNenkin(String careNenkin) {
		this.careNenkin = careNenkin;
	}

	/**
	 * 介護年金受取期間を取得します。
	 * @return 介護年金受取期間
	 */
	public String getCareNenkinUketorikikan() {
		return careNenkinUketorikikan;
	}
	
	/**
	 * 介護年金受取期間を設定します。
	 * @param careNenkinUketorikikan 介護年金受取期間
	 */
	public void setCareNenkinUketorikikan(String careNenkinUketorikikan) {
		this.careNenkinUketorikikan = careNenkinUketorikikan;
	}

	/**
	 * 保障期間を取得します。
	 * @return 保障期間
	 */
	public String getHosyoKikan() {
		return hosyoKikan;
	}
	
	/**
	 * 保障期間を設定します。
	 * @param hosyoKikan 保障期間
	 */
	public void setHosyoKikan(String hosyoKikan) {
		this.hosyoKikan = hosyoKikan;
	}

	/**
	 * 保障期間単位リストを取得します。
	 * @return 保障期間単位リスト
	 */
	public String getListHosyoKikanTani() {
		return listHosyoKikanTani;
	}
	
	/**
	 * 保障期間単位リストを設定します。
	 * @param listHosyoKikanTani 保障期間単位リスト
	 */
	public void setListHosyoKikanTani(String listHosyoKikanTani) {
		this.listHosyoKikanTani = listHosyoKikanTani;
	}

	/**
	 * 払込期間を取得します。
	 * @return 払込期間
	 */
	public String getHaraikomiKikan() {
		return haraikomiKikan;
	}
	
	/**
	 * 払込期間を設定します。
	 * @param haraikomiKikan 払込期間
	 */
	public void setHaraikomiKikan(String haraikomiKikan) {
		this.haraikomiKikan = haraikomiKikan;
	}

	/**
	 * 払込期間単位リストを取得します。
	 * @return 払込期間単位リスト
	 */
	public String getListHaraikomiKikanTani() {
		return listHaraikomiKikanTani;
	}
	
	/**
	 * 払込期間単位リストを設定します。
	 * @param listHaraikomiKikanTani 払込期間単位リスト
	 */
	public void setListHaraikomiKikanTani(String listHaraikomiKikanTani) {
		this.listHaraikomiKikanTani = listHaraikomiKikanTani;
	}

	/**
	 * 解約返戻金有無を取得します。
	 * @return 解約返戻金有無
	 */
	public String getCheckModoshikin() {
		return checkModoshikin;
	}
	
	/**
	 * 解約返戻金有無を設定します。
	 * @param checkModoshikin 解約返戻金有無
	 */
	public void setCheckModoshikin(String checkModoshikin) {
		this.checkModoshikin = checkModoshikin;
	}

	/**
	 * 家族Noを取得します。
	 * @return 家族No
	 */
	public String getFamilyNo() {
		return familyNo;
	}
	
	/**
	 * 家族Noを設定します。
	 * @param familyNo 家族No
	 */
	public void setFamilyNo(String familyNo) {
		this.familyNo = familyNo;
	}

	/**
	 * 介護タイプ文字を取得します。
	 * @return 介護タイプ文字
	 */
	public String getCareTypeString() {
		return careTypeString;
	}
	
	/**
	 * 介護タイプ文字を設定します。
	 * @param careTypeString 介護タイプ文字
	 */
	public void setCareTypeString(String careTypeString) {
		this.careTypeString = careTypeString;
	}

	/**
	 * 介護タイプ選択文字を取得します。
	 * @return 介護タイプ選択文字
	 */
	public String getRadioTypeString() {
		return radioTypeString;
	}
	
	/**
	 * 介護タイプ選択文字を設定します。
	 * @param radioTypeString 介護タイプ選択文字
	 */
	public void setRadioTypeString(String radioTypeString) {
		this.radioTypeString = radioTypeString;
	}

	/**
	 * 要介護度選択リストを取得します。
	 * @return 要介護度選択リスト
	 */
	public String getListCareLevel() {
		return listCareLevel;
	}
	
	/**
	 * 要介護度選択リストを設定します。
	 * @param listCareLevel 要介護度選択リスト
	 */
	public void setListCareLevel(String listCareLevel) {
		this.listCareLevel = listCareLevel;
	}

	/**
	 * 要介護度選択リスト文字を取得します。
	 * @return 要介護度選択リスト文字
	 */
	public String getListCareLevelString() {
		return listCareLevelString;
	}
	
	/**
	 * 要介護度選択リスト文字を設定します。
	 * @param listCareLevelString 要介護度選択リスト文字
	 */
	public void setListCareLevelString(String listCareLevelString) {
		this.listCareLevelString = listCareLevelString;
	}

	/**
	 * 介護開始時の初期費用を取得します。
	 * @return 介護開始時の初期費用
	 */
	public String getInitialCost() {
		return initialCost;
	}
	
	/**
	 * 介護開始時の初期費用を設定します。
	 * @param initialCost 介護開始時の初期費用
	 */
	public void setInitialCost(String initialCost) {
		this.initialCost = initialCost;
	}

	/**
	 * 介護期間中の自己負担（月額）を取得します。
	 * @return 介護期間中の自己負担（月額）
	 */
	public String getMonthsOwnExpenses() {
		return monthsOwnExpenses;
	}
	
	/**
	 * 介護期間中の自己負担（月額）を設定します。
	 * @param monthsOwnExpenses 介護期間中の自己負担（月額）
	 */
	public void setMonthsOwnExpenses(String monthsOwnExpenses) {
		this.monthsOwnExpenses = monthsOwnExpenses;
	}

	/**
	 * 介護期間中の自己負担（年額）を取得します。
	 * @return 介護期間中の自己負担（年額）
	 */
	public String getYearsOwnExpenses() {
		return yearsOwnExpenses;
	}
	
	/**
	 * 介護期間中の自己負担（年額）を設定します。
	 * @param yearsOwnExpenses 介護期間中の自己負担（年額）
	 */
	public void setYearsOwnExpenses(String yearsOwnExpenses) {
		this.yearsOwnExpenses = yearsOwnExpenses;
	}

	/**
	 * 必要費用合計を取得します。
	 * @return 必要費用合計
	 */
	public String getTotalCost() {
		return totalCost;
	}
	
	/**
	 * 必要費用合計を設定します。
	 * @param totalCost 必要費用合計
	 */
	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * 初期費用（福祉用具費用）を取得します。
	 * @return 初期費用（福祉用具費用）
	 */
	public String getAssistiveDeviceList() {
		return assistiveDeviceList;
	}
	
	/**
	 * 初期費用（福祉用具費用）を設定します。
	 * @param assistiveDeviceList 初期費用（福祉用具費用）
	 */
	public void setAssistiveDeviceList(String assistiveDeviceList) {
		this.assistiveDeviceList = assistiveDeviceList;
	}

	/**
	 * 初期費用（福祉用具費用 介護保険からの給付）を取得します。
	 * @return 初期費用（福祉用具費用 介護保険からの給付）
	 */
	public String getAssistiveDeviceCareAmount() {
		return assistiveDeviceCareAmount;
	}
	
	/**
	 * 初期費用（福祉用具費用 介護保険からの給付）を設定します。
	 * @param assistiveDeviceCareAmount 初期費用（福祉用具費用 介護保険からの給付）
	 */
	public void setAssistiveDeviceCareAmount(String assistiveDeviceCareAmount) {
		this.assistiveDeviceCareAmount = assistiveDeviceCareAmount;
	}

	/**
	 * 初期費用（福祉用具費用 自己負担）を取得します。
	 * @return 初期費用（福祉用具費用 自己負担）
	 */
	public String getAssistiveDeviceOwnExpenses() {
		return assistiveDeviceOwnExpenses;
	}
	
	/**
	 * 初期費用（福祉用具費用 自己負担）を設定します。
	 * @param assistiveDeviceOwnExpenses 初期費用（福祉用具費用 自己負担）
	 */
	public void setAssistiveDeviceOwnExpenses(String assistiveDeviceOwnExpenses) {
		this.assistiveDeviceOwnExpenses = assistiveDeviceOwnExpenses;
	}

	/**
	 * 初期費用（住宅改修費）を取得します。
	 * @return 初期費用（住宅改修費）
	 */
	public String getHomeImprovementList() {
		return homeImprovementList;
	}
	
	/**
	 * 初期費用（住宅改修費）を設定します。
	 * @param homeImprovementList 初期費用（住宅改修費）
	 */
	public void setHomeImprovementList(String homeImprovementList) {
		this.homeImprovementList = homeImprovementList;
	}

	/**
	 * 初期費用（住宅改修費用 介護保険からの給付）を取得します。
	 * @return 初期費用（住宅改修費用 介護保険からの給付）
	 */
	public String getHomeImprovementCareAmount() {
		return homeImprovementCareAmount;
	}
	
	/**
	 * 初期費用（住宅改修費用 介護保険からの給付）を設定します。
	 * @param homeImprovementCareAmount 初期費用（住宅改修費用 介護保険からの給付）
	 */
	public void setHomeImprovementCareAmount(String homeImprovementCareAmount) {
		this.homeImprovementCareAmount = homeImprovementCareAmount;
	}

	/**
	 * 初期費用（住宅改修費用 自己負担）を取得します。
	 * @return 初期費用（住宅改修費用 自己負担）
	 */
	public String getHomeImprovementOwnExpenses() {
		return homeImprovementOwnExpenses;
	}
	
	/**
	 * 初期費用（住宅改修費用 自己負担）を設定します。
	 * @param homeImprovementOwnExpenses 初期費用（住宅改修費用 自己負担）
	 */
	public void setHomeImprovementOwnExpenses(String homeImprovementOwnExpenses) {
		this.homeImprovementOwnExpenses = homeImprovementOwnExpenses;
	}

	/**
	 * 初期費用（介護サービス利用額合計）を取得します。
	 * @return 初期費用（介護サービス利用額合計）
	 */
	public String getInitialCostTotalCost() {
		return initialCostTotalCost;
	}
	
	/**
	 * 初期費用（介護サービス利用額合計）を設定します。
	 * @param initialCostTotalCost 初期費用（介護サービス利用額合計）
	 */
	public void setInitialCostTotalCost(String initialCostTotalCost) {
		this.initialCostTotalCost = initialCostTotalCost;
	}

	/**
	 * 初期費用（介護保険からの給付）を取得します。
	 * @return 初期費用（介護保険からの給付）
	 */
	public String getInitialCostCareAmount() {
		return initialCostCareAmount;
	}
	
	/**
	 * 初期費用（介護保険からの給付）を設定します。
	 * @param initialCostCareAmount 初期費用（介護保険からの給付）
	 */
	public void setInitialCostCareAmount(String initialCostCareAmount) {
		this.initialCostCareAmount = initialCostCareAmount;
	}

	/**
	 * 介護期間中(内訳)を取得します。
	 * @return 介護期間中(内訳)
	 */
	public String getPeriodCostList() {
		return periodCostList;
	}
	
	/**
	 * 介護期間中(内訳)を設定します。
	 * @param periodCostList 介護期間中(内訳)
	 */
	public void setPeriodCostList(String periodCostList) {
		this.periodCostList = periodCostList;
	}

	/**
	 * 介護期間中（月額サービスの利用合計額）を取得します。
	 * @return 介護期間中（月額サービスの利用合計額）
	 */
	public String getPeriodCostTotalCost() {
		return periodCostTotalCost;
	}
	
	/**
	 * 介護期間中（月額サービスの利用合計額）を設定します。
	 * @param periodCostTotalCost 介護期間中（月額サービスの利用合計額）
	 */
	public void setPeriodCostTotalCost(String periodCostTotalCost) {
		this.periodCostTotalCost = periodCostTotalCost;
	}

	/**
	 * 介護期間中（要介護度別の支給限度額）を取得します。
	 * @return 介護期間中（要介護度別の支給限度額）
	 */
	public String getPeriodCostCareAmount() {
		return periodCostCareAmount;
	}
	
	/**
	 * 介護期間中（要介護度別の支給限度額）を設定します。
	 * @param periodCostCareAmount 介護期間中（要介護度別の支給限度額）
	 */
	public void setPeriodCostCareAmount(String periodCostCareAmount) {
		this.periodCostCareAmount = periodCostCareAmount;
	}

	/**
	 * 介護期間中（支給限度額超過分）を取得します。
	 * @return 介護期間中（支給限度額超過分）
	 */
	public String getPeriodCostCareAmountOutLimit() {
		return periodCostCareAmountOutLimit;
	}
	
	/**
	 * 介護期間中（支給限度額超過分）を設定します。
	 * @param periodCostCareAmountOutLimit 介護期間中（支給限度額超過分）
	 */
	public void setPeriodCostCareAmountOutLimit(String periodCostCareAmountOutLimit) {
		this.periodCostCareAmountOutLimit = periodCostCareAmountOutLimit;
	}

	/**
	 * 介護期間中（支給限度額内のサービス利用1割負担）を取得します。
	 * @return 介護期間中（支給限度額内のサービス利用1割負担）
	 */
	public String getPeriodCostTenPerExpenses() {
		return periodCostTenPerExpenses;
	}
	
	/**
	 * 介護期間中（支給限度額内のサービス利用1割負担）を設定します。
	 * @param periodCostTenPerExpenses 介護期間中（支給限度額内のサービス利用1割負担）
	 */
	public void setPeriodCostTenPerExpenses(String periodCostTenPerExpenses) {
		this.periodCostTenPerExpenses = periodCostTenPerExpenses;
	}

	/**
	 * 介護期間中（支給限度額超過分のサービス利用）を取得します。
	 * @return 介護期間中（支給限度額超過分のサービス利用）
	 */
	public String getPeriodCostAllExpenses() {
		return periodCostAllExpenses;
	}
	
	/**
	 * 介護期間中（支給限度額超過分のサービス利用）を設定します。
	 * @param periodCostAllExpenses 介護期間中（支給限度額超過分のサービス利用）
	 */
	public void setPeriodCostAllExpenses(String periodCostAllExpenses) {
		this.periodCostAllExpenses = periodCostAllExpenses;
	}

	/**
	 * 分析年齢を取得します。
	 * @return 分析年齢
	 */
	public String getSimulationAge() {
		return simulationAge;
	}
	
	/**
	 * 分析年齢を設定します。
	 * @param simulationAge 分析年齢
	 */
	public void setSimulationAge(String simulationAge) {
		this.simulationAge = simulationAge;
	}

	/**
	 * 準備済み補償額を取得します。
	 * @return 準備済み補償額
	 */
	public String getHosyoMoney() {
		return hosyoMoney;
	}
	
	/**
	 * 準備済み補償額を設定します。
	 * @param hosyoMoney 準備済み補償額
	 */
	public void setHosyoMoney(String hosyoMoney) {
		this.hosyoMoney = hosyoMoney;
	}

	/**
	 * 過不足額を取得します。
	 * @return 過不足額
	 */
	public String getExcessDeficiency() {
		return excessDeficiency;
	}
	
	/**
	 * 過不足額を設定します。
	 * @param excessDeficiency 過不足額
	 */
	public void setExcessDeficiency(String excessDeficiency) {
		this.excessDeficiency = excessDeficiency;
	}

	/**
	 * 保障期間単位リスト文字を取得します。
	 * @return 保障期間単位リスト文字
	 */
	public String getListHosyoKikanTaniString() {
		return listHosyoKikanTaniString;
	}
	
	/**
	 * 保障期間単位リスト文字を設定します。
	 * @param listHosyoKikanTaniString 保障期間単位リスト文字
	 */
	public void setListHosyoKikanTaniString(String listHosyoKikanTaniString) {
		this.listHosyoKikanTaniString = listHosyoKikanTaniString;
	}

	/**
	 * 払込期間単位リスト文字を取得します。
	 * @return 払込期間単位リスト文字
	 */
	public String getListHaraikomiKikanTaniString() {
		return listHaraikomiKikanTaniString;
	}
	
	/**
	 * 払込期間単位リスト文字を設定します。
	 * @param listHaraikomiKikanTaniString 払込期間単位リスト文字
	 */
	public void setListHaraikomiKikanTaniString(String listHaraikomiKikanTaniString) {
		this.listHaraikomiKikanTaniString = listHaraikomiKikanTaniString;
	}

	/**
	 * 解約返戻金有無文字を取得します。
	 * @return 解約返戻金有無文字
	 */
	public String getCheckModoshikinString() {
		return checkModoshikinString;
	}
	
	/**
	 * 解約返戻金有無文字を設定します。
	 * @param checkModoshikinString 解約返戻金有無文字
	 */
	public void setCheckModoshikinString(String checkModoshikinString) {
		this.checkModoshikinString = checkModoshikinString;
	}

	/**
	 * 平均余命を取得します。
	 * @return 平均余命
	 */
	public String getLifeSpanAvg() {
		return lifeSpanAvg;
	}
	
	/**
	 * 平均余命を設定します。
	 * @param lifeSpanAvg 平均余命
	 */
	public void setLifeSpanAvg(String lifeSpanAvg) {
		this.lifeSpanAvg = lifeSpanAvg;
	}
}	

