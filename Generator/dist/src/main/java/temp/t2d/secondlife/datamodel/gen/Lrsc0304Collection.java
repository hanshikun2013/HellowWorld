package temp.t2d.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc0304Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * 世帯主退職金
     */
 	@JsonProperty("retirementMoneyHh")
	private java.math.BigDecimal retirementMoneyHh;   
    /**
     * 配偶者退職金
     */
 	@JsonProperty("retirementMoneySp")
	private java.math.BigDecimal retirementMoneySp;   
    /**
     * 預貯金
     */
 	@JsonProperty("deposit")
	private java.math.BigDecimal deposit;   
    /**
     * 世帯主収入
     */
 	@JsonProperty("incomeHh")
	private java.math.BigDecimal incomeHh;   
    /**
     * 配偶者収入
     */
 	@JsonProperty("incomeSp")
	private java.math.BigDecimal incomeSp;   
    /**
     * その他収入
     */
 	@JsonProperty("otherIncome")
	private java.math.BigDecimal otherIncome;   
    /**
     * 世帯主公的年金
     */
 	@JsonProperty("pensionHh")
	private java.math.BigDecimal pensionHh;   
    /**
     * 配偶者公的年金
     */
 	@JsonProperty("pensionSp")
	private java.math.BigDecimal pensionSp;   
    /**
     * 準備済資金総額
     */
 	@JsonProperty("preparedFunds")
	private java.math.BigDecimal preparedFunds;   
    /**
     * 世帯主・配偶者共通の累計の年次データ
     */
 	@JsonProperty("")
	private String ;   
    /**
     * 　公的年金
     */
 	@JsonProperty("annualTotalPensionList")
	private java.math.BigDecimal[] annualTotalPensionList;   
    /**
     * 　収入
     */
 	@JsonProperty("annualTotalIncomeList")
	private java.math.BigDecimal[] annualTotalIncomeList;   
    /**
     * 　その他収入
     */
 	@JsonProperty("annualTotalOtherIncomeList")
	private java.math.BigDecimal[] annualTotalOtherIncomeList;   
    /**
     * 　収入・その他収入
     */
 	@JsonProperty("annualTotalIncomeAndOtherIncomeList")
	private java.math.BigDecimal[] annualTotalIncomeAndOtherIncomeList;   
    /**
     * 　総額
     */
 	@JsonProperty("annualTotalTotalList")
	private java.math.BigDecimal[] annualTotalTotalList;   
    /**
     * 　公的年金
     */
 	@JsonProperty("annualYearPensionList")
	private java.math.BigDecimal[] annualYearPensionList;   
    /**
     * 　収入
     */
 	@JsonProperty("annualYearIncomeList")
	private java.math.BigDecimal[] annualYearIncomeList;   
    /**
     * 　その他収入
     */
 	@JsonProperty("annualYearOtherIncomeList")
	private java.math.BigDecimal[] annualYearOtherIncomeList;   
    /**
     * 　収入・その他収入
     */
 	@JsonProperty("annualYearIncomeAndOtherIncomeList")
	private java.math.BigDecimal[] annualYearIncomeAndOtherIncomeList;   
    /**
     * 　総額
     */
 	@JsonProperty("annualYearTotalList")
	private java.math.BigDecimal[] annualYearTotalList;   
    /**
     * 世帯主の年齢リスト
     */
 	@JsonProperty("hhAgeList")
	private java.math.BigDecimal[] hhAgeList;   
    /**
     * 世帯主の西暦リスト
     */
 	@JsonProperty("hhAdList")
	private java.math.BigDecimal[] hhAdList;   
    /**
     * 　公的年金
     */
 	@JsonProperty("hhAnnualTotalPensionList")
	private java.math.BigDecimal[] hhAnnualTotalPensionList;   
    /**
     * 　世帯主収入
     */
 	@JsonProperty("hhAnnualTotalIncomeList")
	private java.math.BigDecimal[] hhAnnualTotalIncomeList;   
    /**
     * 　公的年金
     */
 	@JsonProperty("hhAnnualYearPensionList")
	private java.math.BigDecimal[] hhAnnualYearPensionList;   
    /**
     * 　世帯主収入
     */
 	@JsonProperty("hhAnnualYearIncomeList")
	private java.math.BigDecimal[] hhAnnualYearIncomeList;   
    /**
     * 配偶者の年齢リスト
     */
 	@JsonProperty("spAgeList")
	private java.math.BigDecimal[] spAgeList;   
    /**
     * 配偶者の西暦リスト
     */
 	@JsonProperty("spAdList")
	private java.math.BigDecimal[] spAdList;   
    /**
     * 　公的年金
     */
 	@JsonProperty("spAnnualTotalPensionList")
	private java.math.BigDecimal[] spAnnualTotalPensionList;   
    /**
     * 　配偶者収入
     */
 	@JsonProperty("spAnnualTotalIncomeList")
	private java.math.BigDecimal[] spAnnualTotalIncomeList;   
    /**
     * 　公的年金
     */
 	@JsonProperty("spAnnualYearPensionList")
	private java.math.BigDecimal[] spAnnualYearPensionList;   
    /**
     * 　配偶者収入
     */
 	@JsonProperty("spAnnualYearIncomeList")
	private java.math.BigDecimal[] spAnnualYearIncomeList;   

	/**
	 * idを取得します。
	 * @return id
	 */
	public java.math.BigDecimal getId() {
		return id;
	}
	
	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(java.math.BigDecimal id) {
		this.id = id;
	}

	/**
	 * 世帯主退職金を取得します。
	 * @return 世帯主退職金
	 */
	public java.math.BigDecimal getRetirementMoneyHh() {
		return retirementMoneyHh;
	}
	
	/**
	 * 世帯主退職金を設定します。
	 * @param retirementMoneyHh 世帯主退職金
	 */
	public void setRetirementMoneyHh(java.math.BigDecimal retirementMoneyHh) {
		this.retirementMoneyHh = retirementMoneyHh;
	}

	/**
	 * 配偶者退職金を取得します。
	 * @return 配偶者退職金
	 */
	public java.math.BigDecimal getRetirementMoneySp() {
		return retirementMoneySp;
	}
	
	/**
	 * 配偶者退職金を設定します。
	 * @param retirementMoneySp 配偶者退職金
	 */
	public void setRetirementMoneySp(java.math.BigDecimal retirementMoneySp) {
		this.retirementMoneySp = retirementMoneySp;
	}

	/**
	 * 預貯金を取得します。
	 * @return 預貯金
	 */
	public java.math.BigDecimal getDeposit() {
		return deposit;
	}
	
	/**
	 * 預貯金を設定します。
	 * @param deposit 預貯金
	 */
	public void setDeposit(java.math.BigDecimal deposit) {
		this.deposit = deposit;
	}

	/**
	 * 世帯主収入を取得します。
	 * @return 世帯主収入
	 */
	public java.math.BigDecimal getIncomeHh() {
		return incomeHh;
	}
	
	/**
	 * 世帯主収入を設定します。
	 * @param incomeHh 世帯主収入
	 */
	public void setIncomeHh(java.math.BigDecimal incomeHh) {
		this.incomeHh = incomeHh;
	}

	/**
	 * 配偶者収入を取得します。
	 * @return 配偶者収入
	 */
	public java.math.BigDecimal getIncomeSp() {
		return incomeSp;
	}
	
	/**
	 * 配偶者収入を設定します。
	 * @param incomeSp 配偶者収入
	 */
	public void setIncomeSp(java.math.BigDecimal incomeSp) {
		this.incomeSp = incomeSp;
	}

	/**
	 * その他収入を取得します。
	 * @return その他収入
	 */
	public java.math.BigDecimal getOtherIncome() {
		return otherIncome;
	}
	
	/**
	 * その他収入を設定します。
	 * @param otherIncome その他収入
	 */
	public void setOtherIncome(java.math.BigDecimal otherIncome) {
		this.otherIncome = otherIncome;
	}

	/**
	 * 世帯主公的年金を取得します。
	 * @return 世帯主公的年金
	 */
	public java.math.BigDecimal getPensionHh() {
		return pensionHh;
	}
	
	/**
	 * 世帯主公的年金を設定します。
	 * @param pensionHh 世帯主公的年金
	 */
	public void setPensionHh(java.math.BigDecimal pensionHh) {
		this.pensionHh = pensionHh;
	}

	/**
	 * 配偶者公的年金を取得します。
	 * @return 配偶者公的年金
	 */
	public java.math.BigDecimal getPensionSp() {
		return pensionSp;
	}
	
	/**
	 * 配偶者公的年金を設定します。
	 * @param pensionSp 配偶者公的年金
	 */
	public void setPensionSp(java.math.BigDecimal pensionSp) {
		this.pensionSp = pensionSp;
	}

	/**
	 * 準備済資金総額を取得します。
	 * @return 準備済資金総額
	 */
	public java.math.BigDecimal getPreparedFunds() {
		return preparedFunds;
	}
	
	/**
	 * 準備済資金総額を設定します。
	 * @param preparedFunds 準備済資金総額
	 */
	public void setPreparedFunds(java.math.BigDecimal preparedFunds) {
		this.preparedFunds = preparedFunds;
	}

	/**
	 * 世帯主・配偶者共通の累計の年次データを取得します。
	 * @return 世帯主・配偶者共通の累計の年次データ
	 */
	public String get() {
		return ;
	}
	
	/**
	 * 世帯主・配偶者共通の累計の年次データを設定します。
	 * @param  世帯主・配偶者共通の累計の年次データ
	 */
	public void set(String ) {
		this. = ;
	}

	/**
	 * 　公的年金を取得します。
	 * @return 　公的年金
	 */
	public java.math.BigDecimal[] getAnnualTotalPensionList() {
		return annualTotalPensionList;
	}
	
	/**
	 * 　公的年金を設定します。
	 * @param annualTotalPensionList 　公的年金
	 */
	public void setAnnualTotalPensionList(java.math.BigDecimal[] annualTotalPensionList) {
		this.annualTotalPensionList = annualTotalPensionList;
	}

	/**
	 * 　収入を取得します。
	 * @return 　収入
	 */
	public java.math.BigDecimal[] getAnnualTotalIncomeList() {
		return annualTotalIncomeList;
	}
	
	/**
	 * 　収入を設定します。
	 * @param annualTotalIncomeList 　収入
	 */
	public void setAnnualTotalIncomeList(java.math.BigDecimal[] annualTotalIncomeList) {
		this.annualTotalIncomeList = annualTotalIncomeList;
	}

	/**
	 * 　その他収入を取得します。
	 * @return 　その他収入
	 */
	public java.math.BigDecimal[] getAnnualTotalOtherIncomeList() {
		return annualTotalOtherIncomeList;
	}
	
	/**
	 * 　その他収入を設定します。
	 * @param annualTotalOtherIncomeList 　その他収入
	 */
	public void setAnnualTotalOtherIncomeList(java.math.BigDecimal[] annualTotalOtherIncomeList) {
		this.annualTotalOtherIncomeList = annualTotalOtherIncomeList;
	}

	/**
	 * 　収入・その他収入を取得します。
	 * @return 　収入・その他収入
	 */
	public java.math.BigDecimal[] getAnnualTotalIncomeAndOtherIncomeList() {
		return annualTotalIncomeAndOtherIncomeList;
	}
	
	/**
	 * 　収入・その他収入を設定します。
	 * @param annualTotalIncomeAndOtherIncomeList 　収入・その他収入
	 */
	public void setAnnualTotalIncomeAndOtherIncomeList(java.math.BigDecimal[] annualTotalIncomeAndOtherIncomeList) {
		this.annualTotalIncomeAndOtherIncomeList = annualTotalIncomeAndOtherIncomeList;
	}

	/**
	 * 　総額を取得します。
	 * @return 　総額
	 */
	public java.math.BigDecimal[] getAnnualTotalTotalList() {
		return annualTotalTotalList;
	}
	
	/**
	 * 　総額を設定します。
	 * @param annualTotalTotalList 　総額
	 */
	public void setAnnualTotalTotalList(java.math.BigDecimal[] annualTotalTotalList) {
		this.annualTotalTotalList = annualTotalTotalList;
	}

	/**
	 * 　公的年金を取得します。
	 * @return 　公的年金
	 */
	public java.math.BigDecimal[] getAnnualYearPensionList() {
		return annualYearPensionList;
	}
	
	/**
	 * 　公的年金を設定します。
	 * @param annualYearPensionList 　公的年金
	 */
	public void setAnnualYearPensionList(java.math.BigDecimal[] annualYearPensionList) {
		this.annualYearPensionList = annualYearPensionList;
	}

	/**
	 * 　収入を取得します。
	 * @return 　収入
	 */
	public java.math.BigDecimal[] getAnnualYearIncomeList() {
		return annualYearIncomeList;
	}
	
	/**
	 * 　収入を設定します。
	 * @param annualYearIncomeList 　収入
	 */
	public void setAnnualYearIncomeList(java.math.BigDecimal[] annualYearIncomeList) {
		this.annualYearIncomeList = annualYearIncomeList;
	}

	/**
	 * 　その他収入を取得します。
	 * @return 　その他収入
	 */
	public java.math.BigDecimal[] getAnnualYearOtherIncomeList() {
		return annualYearOtherIncomeList;
	}
	
	/**
	 * 　その他収入を設定します。
	 * @param annualYearOtherIncomeList 　その他収入
	 */
	public void setAnnualYearOtherIncomeList(java.math.BigDecimal[] annualYearOtherIncomeList) {
		this.annualYearOtherIncomeList = annualYearOtherIncomeList;
	}

	/**
	 * 　収入・その他収入を取得します。
	 * @return 　収入・その他収入
	 */
	public java.math.BigDecimal[] getAnnualYearIncomeAndOtherIncomeList() {
		return annualYearIncomeAndOtherIncomeList;
	}
	
	/**
	 * 　収入・その他収入を設定します。
	 * @param annualYearIncomeAndOtherIncomeList 　収入・その他収入
	 */
	public void setAnnualYearIncomeAndOtherIncomeList(java.math.BigDecimal[] annualYearIncomeAndOtherIncomeList) {
		this.annualYearIncomeAndOtherIncomeList = annualYearIncomeAndOtherIncomeList;
	}

	/**
	 * 　総額を取得します。
	 * @return 　総額
	 */
	public java.math.BigDecimal[] getAnnualYearTotalList() {
		return annualYearTotalList;
	}
	
	/**
	 * 　総額を設定します。
	 * @param annualYearTotalList 　総額
	 */
	public void setAnnualYearTotalList(java.math.BigDecimal[] annualYearTotalList) {
		this.annualYearTotalList = annualYearTotalList;
	}

	/**
	 * 世帯主の年齢リストを取得します。
	 * @return 世帯主の年齢リスト
	 */
	public java.math.BigDecimal[] getHhAgeList() {
		return hhAgeList;
	}
	
	/**
	 * 世帯主の年齢リストを設定します。
	 * @param hhAgeList 世帯主の年齢リスト
	 */
	public void setHhAgeList(java.math.BigDecimal[] hhAgeList) {
		this.hhAgeList = hhAgeList;
	}

	/**
	 * 世帯主の西暦リストを取得します。
	 * @return 世帯主の西暦リスト
	 */
	public java.math.BigDecimal[] getHhAdList() {
		return hhAdList;
	}
	
	/**
	 * 世帯主の西暦リストを設定します。
	 * @param hhAdList 世帯主の西暦リスト
	 */
	public void setHhAdList(java.math.BigDecimal[] hhAdList) {
		this.hhAdList = hhAdList;
	}

	/**
	 * 　公的年金を取得します。
	 * @return 　公的年金
	 */
	public java.math.BigDecimal[] getHhAnnualTotalPensionList() {
		return hhAnnualTotalPensionList;
	}
	
	/**
	 * 　公的年金を設定します。
	 * @param hhAnnualTotalPensionList 　公的年金
	 */
	public void setHhAnnualTotalPensionList(java.math.BigDecimal[] hhAnnualTotalPensionList) {
		this.hhAnnualTotalPensionList = hhAnnualTotalPensionList;
	}

	/**
	 * 　世帯主収入を取得します。
	 * @return 　世帯主収入
	 */
	public java.math.BigDecimal[] getHhAnnualTotalIncomeList() {
		return hhAnnualTotalIncomeList;
	}
	
	/**
	 * 　世帯主収入を設定します。
	 * @param hhAnnualTotalIncomeList 　世帯主収入
	 */
	public void setHhAnnualTotalIncomeList(java.math.BigDecimal[] hhAnnualTotalIncomeList) {
		this.hhAnnualTotalIncomeList = hhAnnualTotalIncomeList;
	}

	/**
	 * 　公的年金を取得します。
	 * @return 　公的年金
	 */
	public java.math.BigDecimal[] getHhAnnualYearPensionList() {
		return hhAnnualYearPensionList;
	}
	
	/**
	 * 　公的年金を設定します。
	 * @param hhAnnualYearPensionList 　公的年金
	 */
	public void setHhAnnualYearPensionList(java.math.BigDecimal[] hhAnnualYearPensionList) {
		this.hhAnnualYearPensionList = hhAnnualYearPensionList;
	}

	/**
	 * 　世帯主収入を取得します。
	 * @return 　世帯主収入
	 */
	public java.math.BigDecimal[] getHhAnnualYearIncomeList() {
		return hhAnnualYearIncomeList;
	}
	
	/**
	 * 　世帯主収入を設定します。
	 * @param hhAnnualYearIncomeList 　世帯主収入
	 */
	public void setHhAnnualYearIncomeList(java.math.BigDecimal[] hhAnnualYearIncomeList) {
		this.hhAnnualYearIncomeList = hhAnnualYearIncomeList;
	}

	/**
	 * 配偶者の年齢リストを取得します。
	 * @return 配偶者の年齢リスト
	 */
	public java.math.BigDecimal[] getSpAgeList() {
		return spAgeList;
	}
	
	/**
	 * 配偶者の年齢リストを設定します。
	 * @param spAgeList 配偶者の年齢リスト
	 */
	public void setSpAgeList(java.math.BigDecimal[] spAgeList) {
		this.spAgeList = spAgeList;
	}

	/**
	 * 配偶者の西暦リストを取得します。
	 * @return 配偶者の西暦リスト
	 */
	public java.math.BigDecimal[] getSpAdList() {
		return spAdList;
	}
	
	/**
	 * 配偶者の西暦リストを設定します。
	 * @param spAdList 配偶者の西暦リスト
	 */
	public void setSpAdList(java.math.BigDecimal[] spAdList) {
		this.spAdList = spAdList;
	}

	/**
	 * 　公的年金を取得します。
	 * @return 　公的年金
	 */
	public java.math.BigDecimal[] getSpAnnualTotalPensionList() {
		return spAnnualTotalPensionList;
	}
	
	/**
	 * 　公的年金を設定します。
	 * @param spAnnualTotalPensionList 　公的年金
	 */
	public void setSpAnnualTotalPensionList(java.math.BigDecimal[] spAnnualTotalPensionList) {
		this.spAnnualTotalPensionList = spAnnualTotalPensionList;
	}

	/**
	 * 　配偶者収入を取得します。
	 * @return 　配偶者収入
	 */
	public java.math.BigDecimal[] getSpAnnualTotalIncomeList() {
		return spAnnualTotalIncomeList;
	}
	
	/**
	 * 　配偶者収入を設定します。
	 * @param spAnnualTotalIncomeList 　配偶者収入
	 */
	public void setSpAnnualTotalIncomeList(java.math.BigDecimal[] spAnnualTotalIncomeList) {
		this.spAnnualTotalIncomeList = spAnnualTotalIncomeList;
	}

	/**
	 * 　公的年金を取得します。
	 * @return 　公的年金
	 */
	public java.math.BigDecimal[] getSpAnnualYearPensionList() {
		return spAnnualYearPensionList;
	}
	
	/**
	 * 　公的年金を設定します。
	 * @param spAnnualYearPensionList 　公的年金
	 */
	public void setSpAnnualYearPensionList(java.math.BigDecimal[] spAnnualYearPensionList) {
		this.spAnnualYearPensionList = spAnnualYearPensionList;
	}

	/**
	 * 　配偶者収入を取得します。
	 * @return 　配偶者収入
	 */
	public java.math.BigDecimal[] getSpAnnualYearIncomeList() {
		return spAnnualYearIncomeList;
	}
	
	/**
	 * 　配偶者収入を設定します。
	 * @param spAnnualYearIncomeList 　配偶者収入
	 */
	public void setSpAnnualYearIncomeList(java.math.BigDecimal[] spAnnualYearIncomeList) {
		this.spAnnualYearIncomeList = spAnnualYearIncomeList;
	}
}	

