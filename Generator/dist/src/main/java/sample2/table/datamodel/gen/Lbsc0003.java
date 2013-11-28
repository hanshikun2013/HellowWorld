package sample2.table.datamodel.gen;
//template:dataModel.vm
import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lbsc0003
{
    /**
     * id
     */
 	@JsonProperty("id")
	private String id;   
    /**
     * 役員在任年数
     */
 	@JsonProperty("officerTenureYears")
	private String officerTenureYears;   
    /**
     * 勇退時の適正額
     */
 	@JsonProperty("yutaiProperAmount")
	private String yutaiProperAmount;   

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
	 * 役員在任年数を取得します。
	 * @return 役員在任年数
	 */
	public String getOfficerTenureYears() {
		return officerTenureYears;
	}
	
	/**
	 * 役員在任年数を設定します。
	 * @param officerTenureYears 役員在任年数
	 */
	public void setOfficerTenureYears(String officerTenureYears) {
		this.officerTenureYears = officerTenureYears;
	}

	/**
	 * 勇退時の適正額を取得します。
	 * @return 勇退時の適正額
	 */
	public String getYutaiProperAmount() {
		return yutaiProperAmount;
	}
	
	/**
	 * 勇退時の適正額を設定します。
	 * @param yutaiProperAmount 勇退時の適正額
	 */
	public void setYutaiProperAmount(String yutaiProperAmount) {
		this.yutaiProperAmount = yutaiProperAmount;
	}
}	

