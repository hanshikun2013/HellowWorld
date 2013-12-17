package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030204Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * その他必要資金購入品名
     */
 	@JsonProperty("otherName")
	private String otherName;   
    /**
     * その他必要資金利用開始年齢
     */
 	@JsonProperty("otherStartAge")
	private java.math.BigDecimal otherStartAge;   
    /**
     * その他必要資金利用終了年齢
     */
 	@JsonProperty("otherEndAge")
	private java.math.BigDecimal otherEndAge;   
    /**
     * その他必要資金利用頻度
     */
 	@JsonProperty("otherInterval")
	private java.math.BigDecimal otherInterval;   
    /**
     * その他必要資金購入予定金額
     */
 	@JsonProperty("otherCost")
	private java.math.BigDecimal otherCost;   

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
	 * その他必要資金購入品名を取得します。
	 * @return その他必要資金購入品名
	 */
	public String getOtherName() {
		return otherName;
	}
	
	/**
	 * その他必要資金購入品名を設定します。
	 * @param otherName その他必要資金購入品名
	 */
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	/**
	 * その他必要資金利用開始年齢を取得します。
	 * @return その他必要資金利用開始年齢
	 */
	public java.math.BigDecimal getOtherStartAge() {
		return otherStartAge;
	}
	
	/**
	 * その他必要資金利用開始年齢を設定します。
	 * @param otherStartAge その他必要資金利用開始年齢
	 */
	public void setOtherStartAge(java.math.BigDecimal otherStartAge) {
		this.otherStartAge = otherStartAge;
	}

	/**
	 * その他必要資金利用終了年齢を取得します。
	 * @return その他必要資金利用終了年齢
	 */
	public java.math.BigDecimal getOtherEndAge() {
		return otherEndAge;
	}
	
	/**
	 * その他必要資金利用終了年齢を設定します。
	 * @param otherEndAge その他必要資金利用終了年齢
	 */
	public void setOtherEndAge(java.math.BigDecimal otherEndAge) {
		this.otherEndAge = otherEndAge;
	}

	/**
	 * その他必要資金利用頻度を取得します。
	 * @return その他必要資金利用頻度
	 */
	public java.math.BigDecimal getOtherInterval() {
		return otherInterval;
	}
	
	/**
	 * その他必要資金利用頻度を設定します。
	 * @param otherInterval その他必要資金利用頻度
	 */
	public void setOtherInterval(java.math.BigDecimal otherInterval) {
		this.otherInterval = otherInterval;
	}

	/**
	 * その他必要資金購入予定金額を取得します。
	 * @return その他必要資金購入予定金額
	 */
	public java.math.BigDecimal getOtherCost() {
		return otherCost;
	}
	
	/**
	 * その他必要資金購入予定金額を設定します。
	 * @param otherCost その他必要資金購入予定金額
	 */
	public void setOtherCost(java.math.BigDecimal otherCost) {
		this.otherCost = otherCost;
	}
}	

