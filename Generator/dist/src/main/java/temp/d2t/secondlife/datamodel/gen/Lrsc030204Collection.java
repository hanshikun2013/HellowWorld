package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030204Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private String id;   
    /**
     * その他必要資金購入品名
     */
 	@JsonProperty("otherName")
	private String otherName;   
    /**
     * その他必要資金利用開始年齢
     */
 	@JsonProperty("otherStartAge")
	private String otherStartAge;   
    /**
     * その他必要資金利用終了年齢
     */
 	@JsonProperty("otherEndAge")
	private String otherEndAge;   
    /**
     * その他必要資金利用頻度
     */
 	@JsonProperty("otherInterval")
	private String otherInterval;   
    /**
     * その他必要資金購入予定金額
     */
 	@JsonProperty("otherCost")
	private String otherCost;   

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
	public String getOtherStartAge() {
		return otherStartAge;
	}
	
	/**
	 * その他必要資金利用開始年齢を設定します。
	 * @param otherStartAge その他必要資金利用開始年齢
	 */
	public void setOtherStartAge(String otherStartAge) {
		this.otherStartAge = otherStartAge;
	}

	/**
	 * その他必要資金利用終了年齢を取得します。
	 * @return その他必要資金利用終了年齢
	 */
	public String getOtherEndAge() {
		return otherEndAge;
	}
	
	/**
	 * その他必要資金利用終了年齢を設定します。
	 * @param otherEndAge その他必要資金利用終了年齢
	 */
	public void setOtherEndAge(String otherEndAge) {
		this.otherEndAge = otherEndAge;
	}

	/**
	 * その他必要資金利用頻度を取得します。
	 * @return その他必要資金利用頻度
	 */
	public String getOtherInterval() {
		return otherInterval;
	}
	
	/**
	 * その他必要資金利用頻度を設定します。
	 * @param otherInterval その他必要資金利用頻度
	 */
	public void setOtherInterval(String otherInterval) {
		this.otherInterval = otherInterval;
	}

	/**
	 * その他必要資金購入予定金額を取得します。
	 * @return その他必要資金購入予定金額
	 */
	public String getOtherCost() {
		return otherCost;
	}
	
	/**
	 * その他必要資金購入予定金額を設定します。
	 * @param otherCost その他必要資金購入予定金額
	 */
	public void setOtherCost(String otherCost) {
		this.otherCost = otherCost;
	}
}	

