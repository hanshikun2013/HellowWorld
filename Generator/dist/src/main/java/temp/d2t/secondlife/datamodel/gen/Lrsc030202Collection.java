package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030202Collection
{
    /**
     * 住宅区分
     */
 	@JsonProperty("radioHouseKbn")
	private String radioHouseKbn;   
    /**
     * 現在家賃
     */
 	@JsonProperty("currentRent")
	private String currentRent;   
    /**
     * 返済額
     */
 	@JsonProperty("amountRepaid")
	private String amountRepaid;   
    /**
     * 残返済期間
     */
 	@JsonProperty("remainingDuration")
	private String remainingDuration;   

	/**
	 * 住宅区分を取得します。
	 * @return 住宅区分
	 */
	public String getRadioHouseKbn() {
		return radioHouseKbn;
	}
	
	/**
	 * 住宅区分を設定します。
	 * @param radioHouseKbn 住宅区分
	 */
	public void setRadioHouseKbn(String radioHouseKbn) {
		this.radioHouseKbn = radioHouseKbn;
	}

	/**
	 * 現在家賃を取得します。
	 * @return 現在家賃
	 */
	public String getCurrentRent() {
		return currentRent;
	}
	
	/**
	 * 現在家賃を設定します。
	 * @param currentRent 現在家賃
	 */
	public void setCurrentRent(String currentRent) {
		this.currentRent = currentRent;
	}

	/**
	 * 返済額を取得します。
	 * @return 返済額
	 */
	public String getAmountRepaid() {
		return amountRepaid;
	}
	
	/**
	 * 返済額を設定します。
	 * @param amountRepaid 返済額
	 */
	public void setAmountRepaid(String amountRepaid) {
		this.amountRepaid = amountRepaid;
	}

	/**
	 * 残返済期間を取得します。
	 * @return 残返済期間
	 */
	public String getRemainingDuration() {
		return remainingDuration;
	}
	
	/**
	 * 残返済期間を設定します。
	 * @param remainingDuration 残返済期間
	 */
	public void setRemainingDuration(String remainingDuration) {
		this.remainingDuration = remainingDuration;
	}
}	

