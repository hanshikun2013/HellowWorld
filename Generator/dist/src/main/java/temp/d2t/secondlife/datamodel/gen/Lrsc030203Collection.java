package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030203Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private String id;   
    /**
     * 趣味イベント名
     */
 	@JsonProperty("hobbyName")
	private String hobbyName;   
    /**
     * 趣味イベント利用開始年齢
     */
 	@JsonProperty("hobbyStartAge")
	private String hobbyStartAge;   
    /**
     * 趣味イベント利用終了年齢
     */
 	@JsonProperty("hobbyEndAge")
	private String hobbyEndAge;   
    /**
     * 趣味イベント利用頻度
     */
 	@JsonProperty("hobbyInterval")
	private String hobbyInterval;   
    /**
     * 趣味イベント費用
     */
 	@JsonProperty("hobbyCost")
	private String hobbyCost;   

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
	public String getHobbyStartAge() {
		return hobbyStartAge;
	}
	
	/**
	 * 趣味イベント利用開始年齢を設定します。
	 * @param hobbyStartAge 趣味イベント利用開始年齢
	 */
	public void setHobbyStartAge(String hobbyStartAge) {
		this.hobbyStartAge = hobbyStartAge;
	}

	/**
	 * 趣味イベント利用終了年齢を取得します。
	 * @return 趣味イベント利用終了年齢
	 */
	public String getHobbyEndAge() {
		return hobbyEndAge;
	}
	
	/**
	 * 趣味イベント利用終了年齢を設定します。
	 * @param hobbyEndAge 趣味イベント利用終了年齢
	 */
	public void setHobbyEndAge(String hobbyEndAge) {
		this.hobbyEndAge = hobbyEndAge;
	}

	/**
	 * 趣味イベント利用頻度を取得します。
	 * @return 趣味イベント利用頻度
	 */
	public String getHobbyInterval() {
		return hobbyInterval;
	}
	
	/**
	 * 趣味イベント利用頻度を設定します。
	 * @param hobbyInterval 趣味イベント利用頻度
	 */
	public void setHobbyInterval(String hobbyInterval) {
		this.hobbyInterval = hobbyInterval;
	}

	/**
	 * 趣味イベント費用を取得します。
	 * @return 趣味イベント費用
	 */
	public String getHobbyCost() {
		return hobbyCost;
	}
	
	/**
	 * 趣味イベント費用を設定します。
	 * @param hobbyCost 趣味イベント費用
	 */
	public void setHobbyCost(String hobbyCost) {
		this.hobbyCost = hobbyCost;
	}
}	

