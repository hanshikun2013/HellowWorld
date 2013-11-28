package sample2.table.datamodel.gen;
//template:dataModel.vm
import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lbsc00005
{
    /**
     * id
     */
 	@JsonProperty("id")
	private String id;   
    /**
     * 役員報酬引下額
     */
 	@JsonProperty("amountOfExecutiveCompensationReduction")
	private String amountOfExecutiveCompensationReduction;   
    /**
     * 退職慰労金額必要準備額
     */
 	@JsonProperty("amountOfRetirementAllowanceRequiredPreparation")
	private String amountOfRetirementAllowanceRequiredPreparation;   
    /**
     * 勇退までの期間
     */
 	@JsonProperty("periodToVoluntaryRetirement")
	private String periodToVoluntaryRetirement;   
    /**
     * 引下げ後の役員報酬月額
     */
 	@JsonProperty("afterReductionAmountOfExecutiveCompensation")
	private String afterReductionAmountOfExecutiveCompensation;   
    /**
     * 個人の総手取額の差額
     */
 	@JsonProperty("individualGrossReceipts")
	private String individualGrossReceipts;   
    /**
     * 個人の引下げ前の総受給額
     */
 	@JsonProperty("individualBeforeReductionAmountOfReceipt")
	private String individualBeforeReductionAmountOfReceipt;   
    /**
     * 引下げ前の役員報酬
     */
 	@JsonProperty("beforeReductionExecutiveCompensation")
	private String beforeReductionExecutiveCompensation;   
    /**
     * 個人の引下げ前の在職老齢年金
     */
 	@JsonProperty("individualBeforeReductionPensionForAgedWorkers")
	private String individualBeforeReductionPensionForAgedWorkers;   
    /**
     * 個人の引下げ前の社会保険料
     */
 	@JsonProperty("individualBeforeReductionSocialInsurancePremiums")
	private String individualBeforeReductionSocialInsurancePremiums;   
    /**
     * 個人の引下げ前の住民税・所得税
     */
 	@JsonProperty("individualBeforeReductionResidentAndIncomeTax")
	private String individualBeforeReductionResidentAndIncomeTax;   
    /**
     * 個人の引下げ前の総手取収入
     */
 	@JsonProperty("individualBeforeReductionTotalNetIncome")
	private String individualBeforeReductionTotalNetIncome;   
    /**
     * 個人の引下げ後の総受給額
     */
 	@JsonProperty("individualAfterReductionAmountOfReceipt")
	private String individualAfterReductionAmountOfReceipt;   
    /**
     * 引下げ後の役員報酬
     */
 	@JsonProperty("afterReductionExecutiveCompensation")
	private String afterReductionExecutiveCompensation;   
    /**
     * 個人の引下げ後の在職老齢年金
     */
 	@JsonProperty("individualAfterReductionPensionForAgedWorkers")
	private String individualAfterReductionPensionForAgedWorkers;   
    /**
     * 個人の引下げ後の社会保険料
     */
 	@JsonProperty("individualAfterReductionSocialInsurancePremiums")
	private String individualAfterReductionSocialInsurancePremiums;   
    /**
     * 個人の引下げ後の住民税・所得税
     */
 	@JsonProperty("individualAfterReductionResidentAndIncomeTax")
	private String individualAfterReductionResidentAndIncomeTax;   
    /**
     * 個人の引下げ後の総手取収入
     */
 	@JsonProperty("individualAfterReductionTotalNetIncome")
	private String individualAfterReductionTotalNetIncome;   
    /**
     * 法人の総負担額の差額
     */
 	@JsonProperty("corporationDifferenceObligationFees")
	private String corporationDifferenceObligationFees;   
    /**
     * 法人の引下げ前の総負担額
     */
 	@JsonProperty("corporationBeforeReductionTotalObligationFees")
	private String corporationBeforeReductionTotalObligationFees;   
    /**
     * 法人の引下げ前の社会保険料
     */
 	@JsonProperty("corporationBeforeReductionSocialInsurancePremiums")
	private String corporationBeforeReductionSocialInsurancePremiums;   
    /**
     * 法人の引下げ後の総負担額
     */
 	@JsonProperty("corporationAfterReductionTotalObligationFees")
	private String corporationAfterReductionTotalObligationFees;   
    /**
     * 法人の引下げ後の社会保険料
     */
 	@JsonProperty("corporationAfterReductionSocialInsurancePremiums")
	private String corporationAfterReductionSocialInsurancePremiums;   
    /**
     * 法人の引下げ後の法人税負担上昇額
     */
 	@JsonProperty("corporationAfterReduction")
	private String corporationAfterReduction;   
    /**
     * キャッシュフロー累計
     */
 	@JsonProperty("totalCashFlow")
	private String totalCashFlow;   
    /**
     * 在職老齢年金時系列データ
     */
 	@JsonProperty("ｒeductionPensionForAgedWorkers")
	private String ｒeductionPensionForAgedWorkers;   
    /**
     * 　西暦
     */
 	@JsonProperty("year")
	private String year;   
    /**
     * 　年齢
     */
 	@JsonProperty("age")
	private String age;   
    /**
     * 　引下げ前の年額
     */
 	@JsonProperty("amount_befor")
	private String amount_befor;   
    /**
     * 　引下げ後の年額
     */
 	@JsonProperty("amount_after")
	private String amount_after;   

	/**
	 * idを取得します。
	 * @return id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 役員報酬引下額を取得します。
	 * @return 役員報酬引下額
	 */
	public String getAmountOfExecutiveCompensationReduction() {
		return amountOfExecutiveCompensationReduction;
	}
	
	/**
	 * 役員報酬引下額を設定します。
	 * @param amountOfExecutiveCompensationReduction 役員報酬引下額
	 */
	public void setAmountOfExecutiveCompensationReduction(String amountOfExecutiveCompensationReduction) {
		this.amountOfExecutiveCompensationReduction = amountOfExecutiveCompensationReduction;
	}

	/**
	 * 退職慰労金額必要準備額を取得します。
	 * @return 退職慰労金額必要準備額
	 */
	public String getAmountOfRetirementAllowanceRequiredPreparation() {
		return amountOfRetirementAllowanceRequiredPreparation;
	}
	
	/**
	 * 退職慰労金額必要準備額を設定します。
	 * @param amountOfRetirementAllowanceRequiredPreparation 退職慰労金額必要準備額
	 */
	public void setAmountOfRetirementAllowanceRequiredPreparation(String amountOfRetirementAllowanceRequiredPreparation) {
		this.amountOfRetirementAllowanceRequiredPreparation = amountOfRetirementAllowanceRequiredPreparation;
	}

	/**
	 * 勇退までの期間を取得します。
	 * @return 勇退までの期間
	 */
	public String getPeriodToVoluntaryRetirement() {
		return periodToVoluntaryRetirement;
	}
	
	/**
	 * 勇退までの期間を設定します。
	 * @param periodToVoluntaryRetirement 勇退までの期間
	 */
	public void setPeriodToVoluntaryRetirement(String periodToVoluntaryRetirement) {
		this.periodToVoluntaryRetirement = periodToVoluntaryRetirement;
	}

	/**
	 * 引下げ後の役員報酬月額を取得します。
	 * @return 引下げ後の役員報酬月額
	 */
	public String getAfterReductionAmountOfExecutiveCompensation() {
		return afterReductionAmountOfExecutiveCompensation;
	}
	
	/**
	 * 引下げ後の役員報酬月額を設定します。
	 * @param afterReductionAmountOfExecutiveCompensation 引下げ後の役員報酬月額
	 */
	public void setAfterReductionAmountOfExecutiveCompensation(String afterReductionAmountOfExecutiveCompensation) {
		this.afterReductionAmountOfExecutiveCompensation = afterReductionAmountOfExecutiveCompensation;
	}

	/**
	 * 個人の総手取額の差額を取得します。
	 * @return 個人の総手取額の差額
	 */
	public String getIndividualGrossReceipts() {
		return individualGrossReceipts;
	}
	
	/**
	 * 個人の総手取額の差額を設定します。
	 * @param individualGrossReceipts 個人の総手取額の差額
	 */
	public void setIndividualGrossReceipts(String individualGrossReceipts) {
		this.individualGrossReceipts = individualGrossReceipts;
	}

	/**
	 * 個人の引下げ前の総受給額を取得します。
	 * @return 個人の引下げ前の総受給額
	 */
	public String getIndividualBeforeReductionAmountOfReceipt() {
		return individualBeforeReductionAmountOfReceipt;
	}
	
	/**
	 * 個人の引下げ前の総受給額を設定します。
	 * @param individualBeforeReductionAmountOfReceipt 個人の引下げ前の総受給額
	 */
	public void setIndividualBeforeReductionAmountOfReceipt(String individualBeforeReductionAmountOfReceipt) {
		this.individualBeforeReductionAmountOfReceipt = individualBeforeReductionAmountOfReceipt;
	}

	/**
	 * 引下げ前の役員報酬を取得します。
	 * @return 引下げ前の役員報酬
	 */
	public String getBeforeReductionExecutiveCompensation() {
		return beforeReductionExecutiveCompensation;
	}
	
	/**
	 * 引下げ前の役員報酬を設定します。
	 * @param beforeReductionExecutiveCompensation 引下げ前の役員報酬
	 */
	public void setBeforeReductionExecutiveCompensation(String beforeReductionExecutiveCompensation) {
		this.beforeReductionExecutiveCompensation = beforeReductionExecutiveCompensation;
	}

	/**
	 * 個人の引下げ前の在職老齢年金を取得します。
	 * @return 個人の引下げ前の在職老齢年金
	 */
	public String getIndividualBeforeReductionPensionForAgedWorkers() {
		return individualBeforeReductionPensionForAgedWorkers;
	}
	
	/**
	 * 個人の引下げ前の在職老齢年金を設定します。
	 * @param individualBeforeReductionPensionForAgedWorkers 個人の引下げ前の在職老齢年金
	 */
	public void setIndividualBeforeReductionPensionForAgedWorkers(String individualBeforeReductionPensionForAgedWorkers) {
		this.individualBeforeReductionPensionForAgedWorkers = individualBeforeReductionPensionForAgedWorkers;
	}

	/**
	 * 個人の引下げ前の社会保険料を取得します。
	 * @return 個人の引下げ前の社会保険料
	 */
	public String getIndividualBeforeReductionSocialInsurancePremiums() {
		return individualBeforeReductionSocialInsurancePremiums;
	}
	
	/**
	 * 個人の引下げ前の社会保険料を設定します。
	 * @param individualBeforeReductionSocialInsurancePremiums 個人の引下げ前の社会保険料
	 */
	public void setIndividualBeforeReductionSocialInsurancePremiums(String individualBeforeReductionSocialInsurancePremiums) {
		this.individualBeforeReductionSocialInsurancePremiums = individualBeforeReductionSocialInsurancePremiums;
	}

	/**
	 * 個人の引下げ前の住民税・所得税を取得します。
	 * @return 個人の引下げ前の住民税・所得税
	 */
	public String getIndividualBeforeReductionResidentAndIncomeTax() {
		return individualBeforeReductionResidentAndIncomeTax;
	}
	
	/**
	 * 個人の引下げ前の住民税・所得税を設定します。
	 * @param individualBeforeReductionResidentAndIncomeTax 個人の引下げ前の住民税・所得税
	 */
	public void setIndividualBeforeReductionResidentAndIncomeTax(String individualBeforeReductionResidentAndIncomeTax) {
		this.individualBeforeReductionResidentAndIncomeTax = individualBeforeReductionResidentAndIncomeTax;
	}

	/**
	 * 個人の引下げ前の総手取収入を取得します。
	 * @return 個人の引下げ前の総手取収入
	 */
	public String getIndividualBeforeReductionTotalNetIncome() {
		return individualBeforeReductionTotalNetIncome;
	}
	
	/**
	 * 個人の引下げ前の総手取収入を設定します。
	 * @param individualBeforeReductionTotalNetIncome 個人の引下げ前の総手取収入
	 */
	public void setIndividualBeforeReductionTotalNetIncome(String individualBeforeReductionTotalNetIncome) {
		this.individualBeforeReductionTotalNetIncome = individualBeforeReductionTotalNetIncome;
	}

	/**
	 * 個人の引下げ後の総受給額を取得します。
	 * @return 個人の引下げ後の総受給額
	 */
	public String getIndividualAfterReductionAmountOfReceipt() {
		return individualAfterReductionAmountOfReceipt;
	}
	
	/**
	 * 個人の引下げ後の総受給額を設定します。
	 * @param individualAfterReductionAmountOfReceipt 個人の引下げ後の総受給額
	 */
	public void setIndividualAfterReductionAmountOfReceipt(String individualAfterReductionAmountOfReceipt) {
		this.individualAfterReductionAmountOfReceipt = individualAfterReductionAmountOfReceipt;
	}

	/**
	 * 引下げ後の役員報酬を取得します。
	 * @return 引下げ後の役員報酬
	 */
	public String getAfterReductionExecutiveCompensation() {
		return afterReductionExecutiveCompensation;
	}
	
	/**
	 * 引下げ後の役員報酬を設定します。
	 * @param afterReductionExecutiveCompensation 引下げ後の役員報酬
	 */
	public void setAfterReductionExecutiveCompensation(String afterReductionExecutiveCompensation) {
		this.afterReductionExecutiveCompensation = afterReductionExecutiveCompensation;
	}

	/**
	 * 個人の引下げ後の在職老齢年金を取得します。
	 * @return 個人の引下げ後の在職老齢年金
	 */
	public String getIndividualAfterReductionPensionForAgedWorkers() {
		return individualAfterReductionPensionForAgedWorkers;
	}
	
	/**
	 * 個人の引下げ後の在職老齢年金を設定します。
	 * @param individualAfterReductionPensionForAgedWorkers 個人の引下げ後の在職老齢年金
	 */
	public void setIndividualAfterReductionPensionForAgedWorkers(String individualAfterReductionPensionForAgedWorkers) {
		this.individualAfterReductionPensionForAgedWorkers = individualAfterReductionPensionForAgedWorkers;
	}

	/**
	 * 個人の引下げ後の社会保険料を取得します。
	 * @return 個人の引下げ後の社会保険料
	 */
	public String getIndividualAfterReductionSocialInsurancePremiums() {
		return individualAfterReductionSocialInsurancePremiums;
	}
	
	/**
	 * 個人の引下げ後の社会保険料を設定します。
	 * @param individualAfterReductionSocialInsurancePremiums 個人の引下げ後の社会保険料
	 */
	public void setIndividualAfterReductionSocialInsurancePremiums(String individualAfterReductionSocialInsurancePremiums) {
		this.individualAfterReductionSocialInsurancePremiums = individualAfterReductionSocialInsurancePremiums;
	}

	/**
	 * 個人の引下げ後の住民税・所得税を取得します。
	 * @return 個人の引下げ後の住民税・所得税
	 */
	public String getIndividualAfterReductionResidentAndIncomeTax() {
		return individualAfterReductionResidentAndIncomeTax;
	}
	
	/**
	 * 個人の引下げ後の住民税・所得税を設定します。
	 * @param individualAfterReductionResidentAndIncomeTax 個人の引下げ後の住民税・所得税
	 */
	public void setIndividualAfterReductionResidentAndIncomeTax(String individualAfterReductionResidentAndIncomeTax) {
		this.individualAfterReductionResidentAndIncomeTax = individualAfterReductionResidentAndIncomeTax;
	}

	/**
	 * 個人の引下げ後の総手取収入を取得します。
	 * @return 個人の引下げ後の総手取収入
	 */
	public String getIndividualAfterReductionTotalNetIncome() {
		return individualAfterReductionTotalNetIncome;
	}
	
	/**
	 * 個人の引下げ後の総手取収入を設定します。
	 * @param individualAfterReductionTotalNetIncome 個人の引下げ後の総手取収入
	 */
	public void setIndividualAfterReductionTotalNetIncome(String individualAfterReductionTotalNetIncome) {
		this.individualAfterReductionTotalNetIncome = individualAfterReductionTotalNetIncome;
	}

	/**
	 * 法人の総負担額の差額を取得します。
	 * @return 法人の総負担額の差額
	 */
	public String getCorporationDifferenceObligationFees() {
		return corporationDifferenceObligationFees;
	}
	
	/**
	 * 法人の総負担額の差額を設定します。
	 * @param corporationDifferenceObligationFees 法人の総負担額の差額
	 */
	public void setCorporationDifferenceObligationFees(String corporationDifferenceObligationFees) {
		this.corporationDifferenceObligationFees = corporationDifferenceObligationFees;
	}

	/**
	 * 法人の引下げ前の総負担額を取得します。
	 * @return 法人の引下げ前の総負担額
	 */
	public String getCorporationBeforeReductionTotalObligationFees() {
		return corporationBeforeReductionTotalObligationFees;
	}
	
	/**
	 * 法人の引下げ前の総負担額を設定します。
	 * @param corporationBeforeReductionTotalObligationFees 法人の引下げ前の総負担額
	 */
	public void setCorporationBeforeReductionTotalObligationFees(String corporationBeforeReductionTotalObligationFees) {
		this.corporationBeforeReductionTotalObligationFees = corporationBeforeReductionTotalObligationFees;
	}

	/**
	 * 法人の引下げ前の社会保険料を取得します。
	 * @return 法人の引下げ前の社会保険料
	 */
	public String getCorporationBeforeReductionSocialInsurancePremiums() {
		return corporationBeforeReductionSocialInsurancePremiums;
	}
	
	/**
	 * 法人の引下げ前の社会保険料を設定します。
	 * @param corporationBeforeReductionSocialInsurancePremiums 法人の引下げ前の社会保険料
	 */
	public void setCorporationBeforeReductionSocialInsurancePremiums(String corporationBeforeReductionSocialInsurancePremiums) {
		this.corporationBeforeReductionSocialInsurancePremiums = corporationBeforeReductionSocialInsurancePremiums;
	}

	/**
	 * 法人の引下げ後の総負担額を取得します。
	 * @return 法人の引下げ後の総負担額
	 */
	public String getCorporationAfterReductionTotalObligationFees() {
		return corporationAfterReductionTotalObligationFees;
	}
	
	/**
	 * 法人の引下げ後の総負担額を設定します。
	 * @param corporationAfterReductionTotalObligationFees 法人の引下げ後の総負担額
	 */
	public void setCorporationAfterReductionTotalObligationFees(String corporationAfterReductionTotalObligationFees) {
		this.corporationAfterReductionTotalObligationFees = corporationAfterReductionTotalObligationFees;
	}

	/**
	 * 法人の引下げ後の社会保険料を取得します。
	 * @return 法人の引下げ後の社会保険料
	 */
	public String getCorporationAfterReductionSocialInsurancePremiums() {
		return corporationAfterReductionSocialInsurancePremiums;
	}
	
	/**
	 * 法人の引下げ後の社会保険料を設定します。
	 * @param corporationAfterReductionSocialInsurancePremiums 法人の引下げ後の社会保険料
	 */
	public void setCorporationAfterReductionSocialInsurancePremiums(String corporationAfterReductionSocialInsurancePremiums) {
		this.corporationAfterReductionSocialInsurancePremiums = corporationAfterReductionSocialInsurancePremiums;
	}

	/**
	 * 法人の引下げ後の法人税負担上昇額を取得します。
	 * @return 法人の引下げ後の法人税負担上昇額
	 */
	public String getCorporationAfterReduction() {
		return corporationAfterReduction;
	}
	
	/**
	 * 法人の引下げ後の法人税負担上昇額を設定します。
	 * @param corporationAfterReduction 法人の引下げ後の法人税負担上昇額
	 */
	public void setCorporationAfterReduction(String corporationAfterReduction) {
		this.corporationAfterReduction = corporationAfterReduction;
	}

	/**
	 * キャッシュフロー累計を取得します。
	 * @return キャッシュフロー累計
	 */
	public String getTotalCashFlow() {
		return totalCashFlow;
	}
	
	/**
	 * キャッシュフロー累計を設定します。
	 * @param totalCashFlow キャッシュフロー累計
	 */
	public void setTotalCashFlow(String totalCashFlow) {
		this.totalCashFlow = totalCashFlow;
	}

	/**
	 * 在職老齢年金時系列データを取得します。
	 * @return 在職老齢年金時系列データ
	 */
	public String getＲeductionPensionForAgedWorkers() {
		return ｒeductionPensionForAgedWorkers;
	}
	
	/**
	 * 在職老齢年金時系列データを設定します。
	 * @param ｒeductionPensionForAgedWorkers 在職老齢年金時系列データ
	 */
	public void setＲeductionPensionForAgedWorkers(String ｒeductionPensionForAgedWorkers) {
		this.ｒeductionPensionForAgedWorkers = ｒeductionPensionForAgedWorkers;
	}

	/**
	 * 　西暦を取得します。
	 * @return 　西暦
	 */
	public String getYear() {
		return year;
	}
	
	/**
	 * 　西暦を設定します。
	 * @param year 　西暦
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * 　年齢を取得します。
	 * @return 　年齢
	 */
	public String getAge() {
		return age;
	}
	
	/**
	 * 　年齢を設定します。
	 * @param age 　年齢
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * 　引下げ前の年額を取得します。
	 * @return 　引下げ前の年額
	 */
	public String getAmount_befor() {
		return amount_befor;
	}
	
	/**
	 * 　引下げ前の年額を設定します。
	 * @param amount_befor 　引下げ前の年額
	 */
	public void setAmount_befor(String amount_befor) {
		this.amount_befor = amount_befor;
	}

	/**
	 * 　引下げ後の年額を取得します。
	 * @return 　引下げ後の年額
	 */
	public String getAmount_after() {
		return amount_after;
	}
	
	/**
	 * 　引下げ後の年額を設定します。
	 * @param amount_after 　引下げ後の年額
	 */
	public void setAmount_after(String amount_after) {
		this.amount_after = amount_after;
	}
}	

