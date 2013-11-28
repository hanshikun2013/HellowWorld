package sample.table.datamodel.gen;
//template:dataModel.vm
import org.codehaus.jackson.annotate.JsonProperty;

public class 	LtPlan
{
    /**
     * プランID
     */
 	@JsonProperty("planId")
	private String planId;   
    /**
     * 取扱者ID
     */
 	@JsonProperty("toriatsukaishaId")
	private String toriatsukaishaId;   
    /**
     * 顧客ID
     */
 	@JsonProperty("kokyakuId")
	private String kokyakuId;   
    /**
     * 分析種別
     */
 	@JsonProperty("bunsekiShubetsu")
	private String bunsekiShubetsu;   
    /**
     * コメント
     */
 	@JsonProperty("comment")
	private String comment;   
    /**
     * プラン作成日時
     */
 	@JsonProperty("planCreated")
	private String planCreated;   
    /**
     * プラン更新日時
     */
 	@JsonProperty("planUpdated")
	private String planUpdated;   
    /**
     * 役員報酬引下額
     */
 	@JsonProperty("amountOfExecutiveCompensationReduction")
	private String amountOfExecutiveCompensationReduction;   
    /**
     * 保険種類
     */
 	@JsonProperty("insuranceKind")
	private String insuranceKind;   

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

	/**
	 * 取扱者IDを取得します。
	 * @return 取扱者ID
	 */
	public String getToriatsukaishaId() {
		return toriatsukaishaId;
	}
	
	/**
	 * 取扱者IDを設定します。
	 * @param toriatsukaishaId 取扱者ID
	 */
	public void setToriatsukaishaId(String toriatsukaishaId) {
		this.toriatsukaishaId = toriatsukaishaId;
	}

	/**
	 * 顧客IDを取得します。
	 * @return 顧客ID
	 */
	public String getKokyakuId() {
		return kokyakuId;
	}
	
	/**
	 * 顧客IDを設定します。
	 * @param kokyakuId 顧客ID
	 */
	public void setKokyakuId(String kokyakuId) {
		this.kokyakuId = kokyakuId;
	}

	/**
	 * 分析種別を取得します。
	 * @return 分析種別
	 */
	public String getBunsekiShubetsu() {
		return bunsekiShubetsu;
	}
	
	/**
	 * 分析種別を設定します。
	 * @param bunsekiShubetsu 分析種別
	 */
	public void setBunsekiShubetsu(String bunsekiShubetsu) {
		this.bunsekiShubetsu = bunsekiShubetsu;
	}

	/**
	 * コメントを取得します。
	 * @return コメント
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * コメントを設定します。
	 * @param comment コメント
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * プラン作成日時を取得します。
	 * @return プラン作成日時
	 */
	public String getPlanCreated() {
		return planCreated;
	}
	
	/**
	 * プラン作成日時を設定します。
	 * @param planCreated プラン作成日時
	 */
	public void setPlanCreated(String planCreated) {
		this.planCreated = planCreated;
	}

	/**
	 * プラン更新日時を取得します。
	 * @return プラン更新日時
	 */
	public String getPlanUpdated() {
		return planUpdated;
	}
	
	/**
	 * プラン更新日時を設定します。
	 * @param planUpdated プラン更新日時
	 */
	public void setPlanUpdated(String planUpdated) {
		this.planUpdated = planUpdated;
	}

	/**
	 * 役員報酬引下額を取得します。
	 * @return 役員報酬引下額
	 */
	public String getAmountOfExecutiveCompensationReduction() {
		return amountOfExecutiveCompensationReduction;
	}
	
	/**
	 * 役員報酬引下額を設定します。
	 * @param amountOfExecutiveCompensationReduction 役員報酬引下額
	 */
	public void setAmountOfExecutiveCompensationReduction(String amountOfExecutiveCompensationReduction) {
		this.amountOfExecutiveCompensationReduction = amountOfExecutiveCompensationReduction;
	}

	/**
	 * 保険種類を取得します。
	 * @return 保険種類
	 */
	public String getInsuranceKind() {
		return insuranceKind;
	}
	
	/**
	 * 保険種類を設定します。
	 * @param insuranceKind 保険種類
	 */
	public void setInsuranceKind(String insuranceKind) {
		this.insuranceKind = insuranceKind;
	}
}	

