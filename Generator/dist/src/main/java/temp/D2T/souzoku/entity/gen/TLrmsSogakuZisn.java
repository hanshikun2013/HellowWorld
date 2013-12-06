package temp.D2T.souzoku.entity.gen;
public class 	TLrmsSogakuZisn
{

    /**
     * PLAN_ID : プランID
     */
	private String planId;   

    /**
     * SEQ : SEQ
     */
	private java.math.BigDecimal seq;   

    /**
     * SOZOKU_ZISN_CD : 相続財産コード
     */
	private String sozokuZisnCd;   

    /**
     * SOZOKU_GAKU : 相続財産評価額
     */
	private java.math.BigDecimal sozokuGaku;   

    /**
     * HTSZN_SB_KOBETSU_CD : 法定相続人種別（個別）コード
     */
	private String htsznSbKobetsuCd;   

    /**
     * SYSTEM_CREATE_DATE : システム作成日時
     */
	private java.util.Date systemCreateDate;   

    /**
     * SYSTEM_UPDATE_DATE : システム更新日時
     */
	private java.util.Date systemUpdateDate;   

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
	 * SEQを取得します。
	 * @return SEQ
	 */
	public java.math.BigDecimal getSeq() {
		return seq;
	}
	
	/**
	 * SEQを設定します。
	 * @param seq SEQ
	 */
	public void setSeq(java.math.BigDecimal seq) {
		this.seq = seq;
	}

	/**
	 * 相続財産コードを取得します。
	 * @return 相続財産コード
	 */
	public String getSozokuZisnCd() {
		return sozokuZisnCd;
	}
	
	/**
	 * 相続財産コードを設定します。
	 * @param sozokuZisnCd SOZOKU_ZISN_CD
	 */
	public void setSozokuZisnCd(String sozokuZisnCd) {
		this.sozokuZisnCd = sozokuZisnCd;
	}

	/**
	 * 相続財産評価額を取得します。
	 * @return 相続財産評価額
	 */
	public java.math.BigDecimal getSozokuGaku() {
		return sozokuGaku;
	}
	
	/**
	 * 相続財産評価額を設定します。
	 * @param sozokuGaku SOZOKU_GAKU
	 */
	public void setSozokuGaku(java.math.BigDecimal sozokuGaku) {
		this.sozokuGaku = sozokuGaku;
	}

	/**
	 * 法定相続人種別（個別）コードを取得します。
	 * @return 法定相続人種別（個別）コード
	 */
	public String getHtsznSbKobetsuCd() {
		return htsznSbKobetsuCd;
	}
	
	/**
	 * 法定相続人種別（個別）コードを設定します。
	 * @param htsznSbKobetsuCd HTSZN_SB_KOBETSU_CD
	 */
	public void setHtsznSbKobetsuCd(String htsznSbKobetsuCd) {
		this.htsznSbKobetsuCd = htsznSbKobetsuCd;
	}

	/**
	 * システム作成日時を取得します。
	 * @return システム作成日時
	 */
	public java.util.Date getSystemCreateDate() {
		return systemCreateDate;
	}
	
	/**
	 * システム作成日時を設定します。
	 * @param systemCreateDate SYSTEM_CREATE_DATE
	 */
	public void setSystemCreateDate(java.util.Date systemCreateDate) {
		this.systemCreateDate = systemCreateDate;
	}

	/**
	 * システム更新日時を取得します。
	 * @return システム更新日時
	 */
	public java.util.Date getSystemUpdateDate() {
		return systemUpdateDate;
	}
	
	/**
	 * システム更新日時を設定します。
	 * @param systemUpdateDate SYSTEM_UPDATE_DATE
	 */
	public void setSystemUpdateDate(java.util.Date systemUpdateDate) {
		this.systemUpdateDate = systemUpdateDate;
	}
}

