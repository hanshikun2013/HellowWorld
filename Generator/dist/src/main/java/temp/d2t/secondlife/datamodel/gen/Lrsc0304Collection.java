package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc0304Collection
{
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
     * その他収入
     */
 	@JsonProperty("otherIncome")
	private java.math.BigDecimal otherIncome;   

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
}	

