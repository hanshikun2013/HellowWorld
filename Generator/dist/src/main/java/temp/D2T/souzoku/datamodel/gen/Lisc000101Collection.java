package temp.D2T.souzoku.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lisc000101Collection
{
    /**
     * ID
     */
 	@JsonProperty("id")
	private String id;   
    /**
     * 相続財産
     */
 	@JsonProperty("inheritance")
	private String inheritance;   
    /**
     * 評価額
     */
 	@JsonProperty("appraisedValue")
	private String appraisedValue;   
    /**
     * 相続人
     */
 	@JsonProperty("heir")
	private String heir;   

	/**
	 * IDを取得します。
	 * @return ID
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * IDを設定します。
	 * @param id ID
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 相続財産を取得します。
	 * @return 相続財産
	 */
	public String getInheritance() {
		return inheritance;
	}
	
	/**
	 * 相続財産を設定します。
	 * @param inheritance 相続財産
	 */
	public void setInheritance(String inheritance) {
		this.inheritance = inheritance;
	}

	/**
	 * 評価額を取得します。
	 * @return 評価額
	 */
	public String getAppraisedValue() {
		return appraisedValue;
	}
	
	/**
	 * 評価額を設定します。
	 * @param appraisedValue 評価額
	 */
	public void setAppraisedValue(String appraisedValue) {
		this.appraisedValue = appraisedValue;
	}

	/**
	 * 相続人を取得します。
	 * @return 相続人
	 */
	public String getHeir() {
		return heir;
	}
	
	/**
	 * 相続人を設定します。
	 * @param heir 相続人
	 */
	public void setHeir(String heir) {
		this.heir = heir;
	}
}	

