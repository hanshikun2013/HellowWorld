package temp.t2d.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030501Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * 入力方法
     */
 	@JsonProperty("inputMethod")
	private String inputMethod;   
    /**
     * 世帯主配偶者識別フラグ
     */
 	@JsonProperty("personSpouseFlg")
	private String personSpouseFlg;   
    /**
     * 公的年金受取開始年齢入力欄
     */
 	@JsonProperty("pensionStartAgeList")
	private java.math.BigDecimal[] pensionStartAgeList;   
    /**
     * 公的年金受取終了年齢入力欄
     */
 	@JsonProperty("pensionEndAgeList")
	private java.math.BigDecimal[] pensionEndAgeList;   
    /**
     * 公的年金受取金額入力欄
     */
 	@JsonProperty("pensionAmountList")
	private java.math.BigDecimal[] pensionAmountList;   

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
	 * 入力方法を取得します。
	 * @return 入力方法
	 */
	public String getInputMethod() {
		return inputMethod;
	}
	
	/**
	 * 入力方法を設定します。
	 * @param inputMethod 入力方法
	 */
	public void setInputMethod(String inputMethod) {
		this.inputMethod = inputMethod;
	}

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
	 * 公的年金受取開始年齢入力欄を取得します。
	 * @return 公的年金受取開始年齢入力欄
	 */
	public java.math.BigDecimal[] getPensionStartAgeList() {
		return pensionStartAgeList;
	}
	
	/**
	 * 公的年金受取開始年齢入力欄を設定します。
	 * @param pensionStartAgeList 公的年金受取開始年齢入力欄
	 */
	public void setPensionStartAgeList(java.math.BigDecimal[] pensionStartAgeList) {
		this.pensionStartAgeList = pensionStartAgeList;
	}

	/**
	 * 公的年金受取終了年齢入力欄を取得します。
	 * @return 公的年金受取終了年齢入力欄
	 */
	public java.math.BigDecimal[] getPensionEndAgeList() {
		return pensionEndAgeList;
	}
	
	/**
	 * 公的年金受取終了年齢入力欄を設定します。
	 * @param pensionEndAgeList 公的年金受取終了年齢入力欄
	 */
	public void setPensionEndAgeList(java.math.BigDecimal[] pensionEndAgeList) {
		this.pensionEndAgeList = pensionEndAgeList;
	}

	/**
	 * 公的年金受取金額入力欄を取得します。
	 * @return 公的年金受取金額入力欄
	 */
	public java.math.BigDecimal[] getPensionAmountList() {
		return pensionAmountList;
	}
	
	/**
	 * 公的年金受取金額入力欄を設定します。
	 * @param pensionAmountList 公的年金受取金額入力欄
	 */
	public void setPensionAmountList(java.math.BigDecimal[] pensionAmountList) {
		this.pensionAmountList = pensionAmountList;
	}
}	

