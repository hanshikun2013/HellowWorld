package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030502Collection
{
    /**
     * 世帯主配偶者識別フラグ
     */
 	@JsonProperty("personSpouseFlg")
	private String personSpouseFlg;   
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * 収入From年齢入力欄
     */
 	@JsonProperty("incomeStartAge")
	private java.math.BigDecimal incomeStartAge;   
    /**
     * 収入To年齢入力欄
     */
 	@JsonProperty("incomeEndAge")
	private java.math.BigDecimal incomeEndAge;   
    /**
     * 収入金額入力欄
     */
 	@JsonProperty("incomeAmount")
	private java.math.BigDecimal incomeAmount;   

	/**
	 * 世帯主配偶者識別フラグを取得します。
	 * @return 世帯主配偶者識別フラグ
	 */
	public String getPersonSpouseFlg() {
		return personSpouseFlg;
	}
	
	/**
	 * 世帯主配偶者識別フラグを設定します。
	 * @param personSpouseFlg 世帯主配偶者識別フラグ
	 */
	public void setPersonSpouseFlg(String personSpouseFlg) {
		this.personSpouseFlg = personSpouseFlg;
	}

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
	 * 収入From年齢入力欄を取得します。
	 * @return 収入From年齢入力欄
	 */
	public java.math.BigDecimal getIncomeStartAge() {
		return incomeStartAge;
	}
	
	/**
	 * 収入From年齢入力欄を設定します。
	 * @param incomeStartAge 収入From年齢入力欄
	 */
	public void setIncomeStartAge(java.math.BigDecimal incomeStartAge) {
		this.incomeStartAge = incomeStartAge;
	}

	/**
	 * 収入To年齢入力欄を取得します。
	 * @return 収入To年齢入力欄
	 */
	public java.math.BigDecimal getIncomeEndAge() {
		return incomeEndAge;
	}
	
	/**
	 * 収入To年齢入力欄を設定します。
	 * @param incomeEndAge 収入To年齢入力欄
	 */
	public void setIncomeEndAge(java.math.BigDecimal incomeEndAge) {
		this.incomeEndAge = incomeEndAge;
	}

	/**
	 * 収入金額入力欄を取得します。
	 * @return 収入金額入力欄
	 */
	public java.math.BigDecimal getIncomeAmount() {
		return incomeAmount;
	}
	
	/**
	 * 収入金額入力欄を設定します。
	 * @param incomeAmount 収入金額入力欄
	 */
	public void setIncomeAmount(java.math.BigDecimal incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
}	

