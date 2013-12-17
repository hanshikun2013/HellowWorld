package temp.t2d.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030203Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * 趣味イベント名
     */
 	@JsonProperty("hobbyName")
	private String hobbyName;   
    /**
     * 趣味イベント利用開始年齢
     */
 	@JsonProperty("hobbyStartAge")
	private java.math.BigDecimal hobbyStartAge;   
    /**
     * 趣味イベント利用終了年齢
     */
 	@JsonProperty("hobbyEndAge")
	private java.math.BigDecimal hobbyEndAge;   
    /**
     * 趣味イベント利用頻度
     */
 	@JsonProperty("hobbyInterval")
	private java.math.BigDecimal hobbyInterval;   
    /**
     * 趣味イベント費用
     */
 	@JsonProperty("hobbyCost")
	private java.math.BigDecimal hobbyCost;   
    /**
     * 趣味イベントコード
     */
 	@JsonProperty("hobbyCode")
	private String hobbyCode;   

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
	 * 趣味イベント名を取得します。
	 * @return 趣味イベント名
	 */
	public String getHobbyName() {
		return hobbyName;
	}
	
	/**
	 * 趣味イベント名を設定します。
	 * @param hobbyName 趣味イベント名
	 */
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}

	/**
	 * 趣味イベント利用開始年齢を取得します。
	 * @return 趣味イベント利用開始年齢
	 */
	public java.math.BigDecimal getHobbyStartAge() {
		return hobbyStartAge;
	}
	
	/**
	 * 趣味イベント利用開始年齢を設定します。
	 * @param hobbyStartAge 趣味イベント利用開始年齢
	 */
	public void setHobbyStartAge(java.math.BigDecimal hobbyStartAge) {
		this.hobbyStartAge = hobbyStartAge;
	}

	/**
	 * 趣味イベント利用終了年齢を取得します。
	 * @return 趣味イベント利用終了年齢
	 */
	public java.math.BigDecimal getHobbyEndAge() {
		return hobbyEndAge;
	}
	
	/**
	 * 趣味イベント利用終了年齢を設定します。
	 * @param hobbyEndAge 趣味イベント利用終了年齢
	 */
	public void setHobbyEndAge(java.math.BigDecimal hobbyEndAge) {
		this.hobbyEndAge = hobbyEndAge;
	}

	/**
	 * 趣味イベント利用頻度を取得します。
	 * @return 趣味イベント利用頻度
	 */
	public java.math.BigDecimal getHobbyInterval() {
		return hobbyInterval;
	}
	
	/**
	 * 趣味イベント利用頻度を設定します。
	 * @param hobbyInterval 趣味イベント利用頻度
	 */
	public void setHobbyInterval(java.math.BigDecimal hobbyInterval) {
		this.hobbyInterval = hobbyInterval;
	}

	/**
	 * 趣味イベント費用を取得します。
	 * @return 趣味イベント費用
	 */
	public java.math.BigDecimal getHobbyCost() {
		return hobbyCost;
	}
	
	/**
	 * 趣味イベント費用を設定します。
	 * @param hobbyCost 趣味イベント費用
	 */
	public void setHobbyCost(java.math.BigDecimal hobbyCost) {
		this.hobbyCost = hobbyCost;
	}

	/**
	 * 趣味イベントコードを取得します。
	 * @return 趣味イベントコード
	 */
	public String getHobbyCode() {
		return hobbyCode;
	}
	
	/**
	 * 趣味イベントコードを設定します。
	 * @param hobbyCode 趣味イベントコード
	 */
	public void setHobbyCode(String hobbyCode) {
		this.hobbyCode = hobbyCode;
	}
}	

