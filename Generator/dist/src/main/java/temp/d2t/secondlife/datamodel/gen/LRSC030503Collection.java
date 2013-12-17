package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	LRSC030503Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private String id;   
    /**
     * その他収入内容
     */
 	@JsonProperty("otherContentName")
	private String otherContentName;   
    /**
     * その他収入受取開始年齢入力欄
     */
 	@JsonProperty("otherStartAge")
	private String otherStartAge;   
    /**
     * その他収入受取終了年齢入力欄
     */
 	@JsonProperty("otherEndAge")
	private String otherEndAge;   
    /**
     * その他収入金額入力欄
     */
 	@JsonProperty("otherAmount")
	private String otherAmount;   

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
	public String getOtherStartAge() {
		return otherStartAge;
	}
	
	/**
	 * その他収入受取開始年齢入力欄を設定します。
	 * @param otherStartAge その他収入受取開始年齢入力欄
	 */
	public void setOtherStartAge(String otherStartAge) {
		this.otherStartAge = otherStartAge;
	}

	/**
	 * その他収入受取終了年齢入力欄を取得します。
	 * @return その他収入受取終了年齢入力欄
	 */
	public String getOtherEndAge() {
		return otherEndAge;
	}
	
	/**
	 * その他収入受取終了年齢入力欄を設定します。
	 * @param otherEndAge その他収入受取終了年齢入力欄
	 */
	public void setOtherEndAge(String otherEndAge) {
		this.otherEndAge = otherEndAge;
	}

	/**
	 * その他収入金額入力欄を取得します。
	 * @return その他収入金額入力欄
	 */
	public String getOtherAmount() {
		return otherAmount;
	}
	
	/**
	 * その他収入金額入力欄を設定します。
	 * @param otherAmount その他収入金額入力欄
	 */
	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}
}	

