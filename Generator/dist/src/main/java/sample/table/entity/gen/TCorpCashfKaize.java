package sample.table.entity.gen;

public class 	TCorpCashfKaize
{

    /**
     * PLAN_ID : プランID
     */
	private String planId;   

    /**
     * SAGE_KINGAKU : 引下金額
     */
	private java.math.BigDecimal sageKingaku;   

    /**
     * SKHK_HOKEN_SHURUI_CD : 参考保険 保険種類コード
     */
	private String skhkHokenShuruiCd;   

    /**
     * SYSTEM_CREATE_DATE : システム作成日時
     */
	private java.sql.Date systemCreateDate;   

    /**
     * SYSTEM_UPDATE_DATE : システム更新日時
     */
	private java.sql.Date systemUpdateDate;   

	/**
	 * プランIDを取得します。
	 * @return プランID
	 */
	public String getPlanId() {
		return planId;
	}
	
	/**
	 * プランIDを設定します。
	 * @param planId PLAN_ID
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	/**
	 * 引下金額を取得します。
	 * @return 引下金額
	 */
	public java.math.BigDecimal getSageKingaku() {
		return sageKingaku;
	}
	
	/**
	 * 引下金額を設定します。
	 * @param sageKingaku SAGE_KINGAKU
	 */
	public void setSageKingaku(java.math.BigDecimal sageKingaku) {
		this.sageKingaku = sageKingaku;
	}

	/**
	 * 参考保険 保険種類コードを取得します。
	 * @return 参考保険 保険種類コード
	 */
	public String getSkhkHokenShuruiCd() {
		return skhkHokenShuruiCd;
	}
	
	/**
	 * 参考保険 保険種類コードを設定します。
	 * @param skhkHokenShuruiCd SKHK_HOKEN_SHURUI_CD
	 */
	public void setSkhkHokenShuruiCd(String skhkHokenShuruiCd) {
		this.skhkHokenShuruiCd = skhkHokenShuruiCd;
	}

	/**
	 * システム作成日時を取得します。
	 * @return システム作成日時
	 */
	public java.sql.Date getSystemCreateDate() {
		return systemCreateDate;
	}
	
	/**
	 * システム作成日時を設定します。
	 * @param systemCreateDate SYSTEM_CREATE_DATE
	 */
	public void setSystemCreateDate(java.sql.Date systemCreateDate) {
		this.systemCreateDate = systemCreateDate;
	}

	/**
	 * システム更新日時を取得します。
	 * @return システム更新日時
	 */
	public java.sql.Date getSystemUpdateDate() {
		return systemUpdateDate;
	}
	
	/**
	 * システム更新日時を設定します。
	 * @param systemUpdateDate SYSTEM_UPDATE_DATE
	 */
	public void setSystemUpdateDate(java.sql.Date systemUpdateDate) {
		this.systemUpdateDate = systemUpdateDate;
	}
}