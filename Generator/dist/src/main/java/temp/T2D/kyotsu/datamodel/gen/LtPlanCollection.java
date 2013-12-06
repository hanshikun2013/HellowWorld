package temp.T2D.kyotsu.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	LtPlanCollection
{
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
     * 分析種別コード
     */
 	@JsonProperty("bunsekiShubetsu")
	private String bunsekiShubetsu;   
    /**
     * プランID
     */
 	@JsonProperty("planId")
	private String planId;   
    /**
     * 計算基準日
     */
 	@JsonProperty("keisanKijunbi")
	private String keisanKijunbi;   
    /**
     * 設計プランNo
     */
 	@JsonProperty("sekkeiPlanNo")
	private String sekkeiPlanNo;   
    /**
     * 設計プランNo（配）
     */
 	@JsonProperty("sekkeiPlanNoP")
	private String sekkeiPlanNoP;   
    /**
     * 被保険者ID
     */
 	@JsonProperty("insuredId")
	private String insuredId;   
    /**
     * 被保険者ID（配）
     */
 	@JsonProperty("insuredIdP")
	private String insuredIdP;   
    /**
     * 相続プランNo
     */
 	@JsonProperty("sozokuPlanNo")
	private String sozokuPlanNo;   
    /**
     * 医療プランNo
     */
 	@JsonProperty("iryoPlanNo")
	private String iryoPlanNo;   
    /**
     * 介護プランNo
     */
 	@JsonProperty("kaigoPlanNo")
	private String kaigoPlanNo;   
    /**
     * 証券分析プランNo
     */
 	@JsonProperty("shokenPlanNo")
	private String shokenPlanNo;   
    /**
     * 証券分析プランNo（配）
     */
 	@JsonProperty("shokenPlanNoP")
	private String shokenPlanNoP;   
    /**
     * LNAS CA プランID
     */
 	@JsonProperty("lnasCaPlanId")
	private String lnasCaPlanId;   
    /**
     * 性別コード
     */
 	@JsonProperty("faGender")
	private String faGender;   
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
     * 分析種別名
     */
 	@JsonProperty("bunsekiShubetsuName")
	private String bunsekiShubetsuName;   
    /**
     * プランステータスコード
     */
 	@JsonProperty("planStatus")
	private String planStatus;   

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
	 * 分析種別コードを取得します。
	 * @return 分析種別コード
	 */
	public String getBunsekiShubetsu() {
		return bunsekiShubetsu;
	}
	
	/**
	 * 分析種別コードを設定します。
	 * @param bunsekiShubetsu 分析種別コード
	 */
	public void setBunsekiShubetsu(String bunsekiShubetsu) {
		this.bunsekiShubetsu = bunsekiShubetsu;
	}

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
	 * 計算基準日を取得します。
	 * @return 計算基準日
	 */
	public String getKeisanKijunbi() {
		return keisanKijunbi;
	}
	
	/**
	 * 計算基準日を設定します。
	 * @param keisanKijunbi 計算基準日
	 */
	public void setKeisanKijunbi(String keisanKijunbi) {
		this.keisanKijunbi = keisanKijunbi;
	}

	/**
	 * 設計プランNoを取得します。
	 * @return 設計プランNo
	 */
	public String getSekkeiPlanNo() {
		return sekkeiPlanNo;
	}
	
	/**
	 * 設計プランNoを設定します。
	 * @param sekkeiPlanNo 設計プランNo
	 */
	public void setSekkeiPlanNo(String sekkeiPlanNo) {
		this.sekkeiPlanNo = sekkeiPlanNo;
	}

	/**
	 * 設計プランNo（配）を取得します。
	 * @return 設計プランNo（配）
	 */
	public String getSekkeiPlanNoP() {
		return sekkeiPlanNoP;
	}
	
	/**
	 * 設計プランNo（配）を設定します。
	 * @param sekkeiPlanNoP 設計プランNo（配）
	 */
	public void setSekkeiPlanNoP(String sekkeiPlanNoP) {
		this.sekkeiPlanNoP = sekkeiPlanNoP;
	}

	/**
	 * 被保険者IDを取得します。
	 * @return 被保険者ID
	 */
	public String getInsuredId() {
		return insuredId;
	}
	
	/**
	 * 被保険者IDを設定します。
	 * @param insuredId 被保険者ID
	 */
	public void setInsuredId(String insuredId) {
		this.insuredId = insuredId;
	}

	/**
	 * 被保険者ID（配）を取得します。
	 * @return 被保険者ID（配）
	 */
	public String getInsuredIdP() {
		return insuredIdP;
	}
	
	/**
	 * 被保険者ID（配）を設定します。
	 * @param insuredIdP 被保険者ID（配）
	 */
	public void setInsuredIdP(String insuredIdP) {
		this.insuredIdP = insuredIdP;
	}

	/**
	 * 相続プランNoを取得します。
	 * @return 相続プランNo
	 */
	public String getSozokuPlanNo() {
		return sozokuPlanNo;
	}
	
	/**
	 * 相続プランNoを設定します。
	 * @param sozokuPlanNo 相続プランNo
	 */
	public void setSozokuPlanNo(String sozokuPlanNo) {
		this.sozokuPlanNo = sozokuPlanNo;
	}

	/**
	 * 医療プランNoを取得します。
	 * @return 医療プランNo
	 */
	public String getIryoPlanNo() {
		return iryoPlanNo;
	}
	
	/**
	 * 医療プランNoを設定します。
	 * @param iryoPlanNo 医療プランNo
	 */
	public void setIryoPlanNo(String iryoPlanNo) {
		this.iryoPlanNo = iryoPlanNo;
	}

	/**
	 * 介護プランNoを取得します。
	 * @return 介護プランNo
	 */
	public String getKaigoPlanNo() {
		return kaigoPlanNo;
	}
	
	/**
	 * 介護プランNoを設定します。
	 * @param kaigoPlanNo 介護プランNo
	 */
	public void setKaigoPlanNo(String kaigoPlanNo) {
		this.kaigoPlanNo = kaigoPlanNo;
	}

	/**
	 * 証券分析プランNoを取得します。
	 * @return 証券分析プランNo
	 */
	public String getShokenPlanNo() {
		return shokenPlanNo;
	}
	
	/**
	 * 証券分析プランNoを設定します。
	 * @param shokenPlanNo 証券分析プランNo
	 */
	public void setShokenPlanNo(String shokenPlanNo) {
		this.shokenPlanNo = shokenPlanNo;
	}

	/**
	 * 証券分析プランNo（配）を取得します。
	 * @return 証券分析プランNo（配）
	 */
	public String getShokenPlanNoP() {
		return shokenPlanNoP;
	}
	
	/**
	 * 証券分析プランNo（配）を設定します。
	 * @param shokenPlanNoP 証券分析プランNo（配）
	 */
	public void setShokenPlanNoP(String shokenPlanNoP) {
		this.shokenPlanNoP = shokenPlanNoP;
	}

	/**
	 * LNAS CA プランIDを取得します。
	 * @return LNAS CA プランID
	 */
	public String getLnasCaPlanId() {
		return lnasCaPlanId;
	}
	
	/**
	 * LNAS CA プランIDを設定します。
	 * @param lnasCaPlanId LNAS CA プランID
	 */
	public void setLnasCaPlanId(String lnasCaPlanId) {
		this.lnasCaPlanId = lnasCaPlanId;
	}

	/**
	 * 性別コードを取得します。
	 * @return 性別コード
	 */
	public String getFaGender() {
		return faGender;
	}
	
	/**
	 * 性別コードを設定します。
	 * @param faGender 性別コード
	 */
	public void setFaGender(String faGender) {
		this.faGender = faGender;
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
	 * 分析種別名を取得します。
	 * @return 分析種別名
	 */
	public String getBunsekiShubetsuName() {
		return bunsekiShubetsuName;
	}
	
	/**
	 * 分析種別名を設定します。
	 * @param bunsekiShubetsuName 分析種別名
	 */
	public void setBunsekiShubetsuName(String bunsekiShubetsuName) {
		this.bunsekiShubetsuName = bunsekiShubetsuName;
	}

	/**
	 * プランステータスコードを取得します。
	 * @return プランステータスコード
	 */
	public String getPlanStatus() {
		return planStatus;
	}
	
	/**
	 * プランステータスコードを設定します。
	 * @param planStatus プランステータスコード
	 */
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
}	

