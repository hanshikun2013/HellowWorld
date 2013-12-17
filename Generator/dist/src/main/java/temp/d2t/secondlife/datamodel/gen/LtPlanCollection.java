package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	LtPlanCollection
{
    /**
     * プランID
     */
 	@JsonProperty("planId")
	private String planId;   

	/**
	 * プランIDを取得します。
	 * @return プランID
	 */
	public String getPlanId() {
		return planId;
	}
	
	/**
	 * プランIDを設定します。
	 * @param planId プランID
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}
}	

