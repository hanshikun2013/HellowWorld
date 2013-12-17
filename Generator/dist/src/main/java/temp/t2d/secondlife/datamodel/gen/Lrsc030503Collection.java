package temp.t2d.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030503Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * 行番号
     */
 	@JsonProperty("lineNo")
	private java.math.BigDecimal lineNo;   
    /**
     * その他収入内容
     */
 	@JsonProperty("otherContentName")
	private String otherContentName;   
    /**
     * その他収入受取開始年齢入力欄
     */
 	@JsonProperty("otherStartAge")
	private java.math.BigDecimal otherStartAge;   
    /**
     * その他収入受取終了年齢入力欄
     */
 	@JsonProperty("otherEndAge")
	private java.math.BigDecimal otherEndAge;   
    /**
     * その他収入金額入力欄
     */
 	@JsonProperty("otherAmount")
	private java.math.BigDecimal otherAmount;   
    /**
     * その他収入内容コード
     */
 	@JsonProperty("otherContentCode")
	private String otherContentCode;   

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
	 * 行番号を取得します。
	 * @return 行番号
	 */
	public java.math.BigDecimal getLineNo() {
		return lineNo;
	}
	
	/**
	 * 行番号を設定します。
	 * @param lineNo 行番号
	 */
	public void setLineNo(java.math.BigDecimal lineNo) {
		this.lineNo = lineNo;
	}

	/**
	 * その他収入内容を取得します。
	 * @return その他収入内容
	 */
	public String getOtherContentName() {
		return otherContentName;
	}
	
	/**
	 * その他収入内容を設定します。
	 * @param otherContentName その他収入内容
	 */
	public void setOtherContentName(String otherContentName) {
		this.otherContentName = otherContentName;
	}

	/**
	 * その他収入受取開始年齢入力欄を取得します。
	 * @return その他収入受取開始年齢入力欄
	 */
	public java.math.BigDecimal getOtherStartAge() {
		return otherStartAge;
	}
	
	/**
	 * その他収入受取開始年齢入力欄を設定します。
	 * @param otherStartAge その他収入受取開始年齢入力欄
	 */
	public void setOtherStartAge(java.math.BigDecimal otherStartAge) {
		this.otherStartAge = otherStartAge;
	}

	/**
	 * その他収入受取終了年齢入力欄を取得します。
	 * @return その他収入受取終了年齢入力欄
	 */
	public java.math.BigDecimal getOtherEndAge() {
		return otherEndAge;
	}
	
	/**
	 * その他収入受取終了年齢入力欄を設定します。
	 * @param otherEndAge その他収入受取終了年齢入力欄
	 */
	public void setOtherEndAge(java.math.BigDecimal otherEndAge) {
		this.otherEndAge = otherEndAge;
	}

	/**
	 * その他収入金額入力欄を取得します。
	 * @return その他収入金額入力欄
	 */
	public java.math.BigDecimal getOtherAmount() {
		return otherAmount;
	}
	
	/**
	 * その他収入金額入力欄を設定します。
	 * @param otherAmount その他収入金額入力欄
	 */
	public void setOtherAmount(java.math.BigDecimal otherAmount) {
		this.otherAmount = otherAmount;
	}

	/**
	 * その他収入内容コードを取得します。
	 * @return その他収入内容コード
	 */
	public String getOtherContentCode() {
		return otherContentCode;
	}
	
	/**
	 * その他収入内容コードを設定します。
	 * @param otherContentCode その他収入内容コード
	 */
	public void setOtherContentCode(String otherContentCode) {
		this.otherContentCode = otherContentCode;
	}
}	

