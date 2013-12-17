package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc0304Collection
{
    /**
     * 世帯主退職金
     */
 	@JsonProperty("retirementMoneyHh")
	private String retirementMoneyHh;   
    /**
     * 配偶者退職金
     */
 	@JsonProperty("retirementMoneySp")
	private String retirementMoneySp;   
    /**
     * 預貯金
     */
 	@JsonProperty("deposit")
	private String deposit;   

	/**
	 * 世帯主退職金を取得します。
	 * @return 世帯主退職金
	 */
	public String getRetirementMoneyHh() {
		return retirementMoneyHh;
	}
	
	/**
	 * 世帯主退職金を設定します。
	 * @param retirementMoneyHh 世帯主退職金
	 */
	public void setRetirementMoneyHh(String retirementMoneyHh) {
		this.retirementMoneyHh = retirementMoneyHh;
	}

	/**
	 * 配偶者退職金を取得します。
	 * @return 配偶者退職金
	 */
	public String getRetirementMoneySp() {
		return retirementMoneySp;
	}
	
	/**
	 * 配偶者退職金を設定します。
	 * @param retirementMoneySp 配偶者退職金
	 */
	public void setRetirementMoneySp(String retirementMoneySp) {
		this.retirementMoneySp = retirementMoneySp;
	}

	/**
	 * 預貯金を取得します。
	 * @return 預貯金
	 */
	public String getDeposit() {
		return deposit;
	}
	
	/**
	 * 預貯金を設定します。
	 * @param deposit 預貯金
	 */
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
}	

