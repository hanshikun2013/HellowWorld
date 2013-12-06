package temp.D2T.kaigo.entity.gen;
public class 	TLrmsCareHoshoKihon
{

    /**
     * PLAN_ID : プランID
     */
	private String planId;   

    /**
     * AGENT_ID : 取扱者ID
     */
	private String agentId;   

    /**
     * CUST_ID : 顧客ID
     */
	private String custId;   

    /**
     * BUNSEKI_SB_CD : 分析種別コード
     */
	private String bunsekiSbCd;   

    /**
     * BUNSEKI_COMMENT : 分析一覧コメント
     */
	private String bunsekiComment;   

    /**
     * BUNSEKI_CREATE_DATE : 分析実施日
     */
	private java.util.Date bunsekiCreateDate;   

    /**
     * BUNSEKI_UPDATE_DATE : 分析最終更新日
     */
	private java.util.Date bunsekiUpdateDate;   

    /**
     * SEKKEI_PLAN_NO : 設計プランNO
     */
	private String sekkeiPlanNo;   

    /**
     * INSURED_ID : 被保険者ＩＤ
     */
	private String insuredId;   

    /**
     * CARE_TYPE_CD : 介護タイプコード
     */
	private String careTypeCd;   

    /**
     * ZITK_SSET_CARE_CD : 在宅/施設介護詳細コード
     */
	private String zitkSsetCareCd;   

    /**
     * CARE_HITSUYO_NENSU : 介護必要年数
     */
	private java.math.BigDecimal careHitsuyoNensu;   

    /**
     * JZKGHS_ICHIJIKIN : 準備済介護保障一時金
     */
	private java.math.BigDecimal jzkghsIchijikin;   

    /**
     * JZKGHS_NENKIN : 準備済介護保障年金
     */
	private java.math.BigDecimal jzkghsNenkin;   

    /**
     * JZKGHS_NENKIN_KIKAN : 準備済介護保障年金受取期間
     */
	private java.math.BigDecimal jzkghsNenkinKikan;   

    /**
     * JZKGHS_KIKAN : 準備済介護保障期間
     */
	private java.math.BigDecimal jzkghsKikan;   

    /**
     * JZKGHS_KIKAN_TANI_CD : 準備済介護保障期間単位コード
     */
	private String jzkghsKikanTaniCd;   

    /**
     * JZKGHS_HARAIKOMIKIKAN : 準備済介護保障払込期間
     */
	private java.math.BigDecimal jzkghsHaraikomikikan;   

    /**
     * JZKGHS_HARAIKOMI_TANI_CD : 準備済介護保障払込期間単位コード
     */
	private String jzkghsHaraikomiTaniCd;   

    /**
     * JZKGHS_W_UMU_CD : 準備済介護保障返戻金有無コード
     */
	private String jzkghsWUmuCd;   

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
	 * 取扱者IDを取得します。
	 * @return 取扱者ID
	 */
	public String getAgentId() {
		return agentId;
	}
	
	/**
	 * 取扱者IDを設定します。
	 * @param agentId AGENT_ID
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	/**
	 * 顧客IDを取得します。
	 * @return 顧客ID
	 */
	public String getCustId() {
		return custId;
	}
	
	/**
	 * 顧客IDを設定します。
	 * @param custId CUST_ID
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * 分析種別コードを取得します。
	 * @return 分析種別コード
	 */
	public String getBunsekiSbCd() {
		return bunsekiSbCd;
	}
	
	/**
	 * 分析種別コードを設定します。
	 * @param bunsekiSbCd BUNSEKI_SB_CD
	 */
	public void setBunsekiSbCd(String bunsekiSbCd) {
		this.bunsekiSbCd = bunsekiSbCd;
	}

	/**
	 * 分析一覧コメントを取得します。
	 * @return 分析一覧コメント
	 */
	public String getBunsekiComment() {
		return bunsekiComment;
	}
	
	/**
	 * 分析一覧コメントを設定します。
	 * @param bunsekiComment BUNSEKI_COMMENT
	 */
	public void setBunsekiComment(String bunsekiComment) {
		this.bunsekiComment = bunsekiComment;
	}

	/**
	 * 分析実施日を取得します。
	 * @return 分析実施日
	 */
	public java.util.Date getBunsekiCreateDate() {
		return bunsekiCreateDate;
	}
	
	/**
	 * 分析実施日を設定します。
	 * @param bunsekiCreateDate BUNSEKI_CREATE_DATE
	 */
	public void setBunsekiCreateDate(java.util.Date bunsekiCreateDate) {
		this.bunsekiCreateDate = bunsekiCreateDate;
	}

	/**
	 * 分析最終更新日を取得します。
	 * @return 分析最終更新日
	 */
	public java.util.Date getBunsekiUpdateDate() {
		return bunsekiUpdateDate;
	}
	
	/**
	 * 分析最終更新日を設定します。
	 * @param bunsekiUpdateDate BUNSEKI_UPDATE_DATE
	 */
	public void setBunsekiUpdateDate(java.util.Date bunsekiUpdateDate) {
		this.bunsekiUpdateDate = bunsekiUpdateDate;
	}

	/**
	 * 設計プランNOを取得します。
	 * @return 設計プランNO
	 */
	public String getSekkeiPlanNo() {
		return sekkeiPlanNo;
	}
	
	/**
	 * 設計プランNOを設定します。
	 * @param sekkeiPlanNo SEKKEI_PLAN_NO
	 */
	public void setSekkeiPlanNo(String sekkeiPlanNo) {
		this.sekkeiPlanNo = sekkeiPlanNo;
	}

	/**
	 * 被保険者ＩＤを取得します。
	 * @return 被保険者ＩＤ
	 */
	public String getInsuredId() {
		return insuredId;
	}
	
	/**
	 * 被保険者ＩＤを設定します。
	 * @param insuredId INSURED_ID
	 */
	public void setInsuredId(String insuredId) {
		this.insuredId = insuredId;
	}

	/**
	 * 介護タイプコードを取得します。
	 * @return 介護タイプコード
	 */
	public String getCareTypeCd() {
		return careTypeCd;
	}
	
	/**
	 * 介護タイプコードを設定します。
	 * @param careTypeCd CARE_TYPE_CD
	 */
	public void setCareTypeCd(String careTypeCd) {
		this.careTypeCd = careTypeCd;
	}

	/**
	 * 在宅/施設介護詳細コードを取得します。
	 * @return 在宅/施設介護詳細コード
	 */
	public String getZitkSsetCareCd() {
		return zitkSsetCareCd;
	}
	
	/**
	 * 在宅/施設介護詳細コードを設定します。
	 * @param zitkSsetCareCd ZITK_SSET_CARE_CD
	 */
	public void setZitkSsetCareCd(String zitkSsetCareCd) {
		this.zitkSsetCareCd = zitkSsetCareCd;
	}

	/**
	 * 介護必要年数を取得します。
	 * @return 介護必要年数
	 */
	public java.math.BigDecimal getCareHitsuyoNensu() {
		return careHitsuyoNensu;
	}
	
	/**
	 * 介護必要年数を設定します。
	 * @param careHitsuyoNensu CARE_HITSUYO_NENSU
	 */
	public void setCareHitsuyoNensu(java.math.BigDecimal careHitsuyoNensu) {
		this.careHitsuyoNensu = careHitsuyoNensu;
	}

	/**
	 * 準備済介護保障一時金を取得します。
	 * @return 準備済介護保障一時金
	 */
	public java.math.BigDecimal getJzkghsIchijikin() {
		return jzkghsIchijikin;
	}
	
	/**
	 * 準備済介護保障一時金を設定します。
	 * @param jzkghsIchijikin JZKGHS_ICHIJIKIN
	 */
	public void setJzkghsIchijikin(java.math.BigDecimal jzkghsIchijikin) {
		this.jzkghsIchijikin = jzkghsIchijikin;
	}

	/**
	 * 準備済介護保障年金を取得します。
	 * @return 準備済介護保障年金
	 */
	public java.math.BigDecimal getJzkghsNenkin() {
		return jzkghsNenkin;
	}
	
	/**
	 * 準備済介護保障年金を設定します。
	 * @param jzkghsNenkin JZKGHS_NENKIN
	 */
	public void setJzkghsNenkin(java.math.BigDecimal jzkghsNenkin) {
		this.jzkghsNenkin = jzkghsNenkin;
	}

	/**
	 * 準備済介護保障年金受取期間を取得します。
	 * @return 準備済介護保障年金受取期間
	 */
	public java.math.BigDecimal getJzkghsNenkinKikan() {
		return jzkghsNenkinKikan;
	}
	
	/**
	 * 準備済介護保障年金受取期間を設定します。
	 * @param jzkghsNenkinKikan JZKGHS_NENKIN_KIKAN
	 */
	public void setJzkghsNenkinKikan(java.math.BigDecimal jzkghsNenkinKikan) {
		this.jzkghsNenkinKikan = jzkghsNenkinKikan;
	}

	/**
	 * 準備済介護保障期間を取得します。
	 * @return 準備済介護保障期間
	 */
	public java.math.BigDecimal getJzkghsKikan() {
		return jzkghsKikan;
	}
	
	/**
	 * 準備済介護保障期間を設定します。
	 * @param jzkghsKikan JZKGHS_KIKAN
	 */
	public void setJzkghsKikan(java.math.BigDecimal jzkghsKikan) {
		this.jzkghsKikan = jzkghsKikan;
	}

	/**
	 * 準備済介護保障期間単位コードを取得します。
	 * @return 準備済介護保障期間単位コード
	 */
	public String getJzkghsKikanTaniCd() {
		return jzkghsKikanTaniCd;
	}
	
	/**
	 * 準備済介護保障期間単位コードを設定します。
	 * @param jzkghsKikanTaniCd JZKGHS_KIKAN_TANI_CD
	 */
	public void setJzkghsKikanTaniCd(String jzkghsKikanTaniCd) {
		this.jzkghsKikanTaniCd = jzkghsKikanTaniCd;
	}

	/**
	 * 準備済介護保障払込期間を取得します。
	 * @return 準備済介護保障払込期間
	 */
	public java.math.BigDecimal getJzkghsHaraikomikikan() {
		return jzkghsHaraikomikikan;
	}
	
	/**
	 * 準備済介護保障払込期間を設定します。
	 * @param jzkghsHaraikomikikan JZKGHS_HARAIKOMIKIKAN
	 */
	public void setJzkghsHaraikomikikan(java.math.BigDecimal jzkghsHaraikomikikan) {
		this.jzkghsHaraikomikikan = jzkghsHaraikomikikan;
	}

	/**
	 * 準備済介護保障払込期間単位コードを取得します。
	 * @return 準備済介護保障払込期間単位コード
	 */
	public String getJzkghsHaraikomiTaniCd() {
		return jzkghsHaraikomiTaniCd;
	}
	
	/**
	 * 準備済介護保障払込期間単位コードを設定します。
	 * @param jzkghsHaraikomiTaniCd JZKGHS_HARAIKOMI_TANI_CD
	 */
	public void setJzkghsHaraikomiTaniCd(String jzkghsHaraikomiTaniCd) {
		this.jzkghsHaraikomiTaniCd = jzkghsHaraikomiTaniCd;
	}

	/**
	 * 準備済介護保障返戻金有無コードを取得します。
	 * @return 準備済介護保障返戻金有無コード
	 */
	public String getJzkghsWUmuCd() {
		return jzkghsWUmuCd;
	}
	
	/**
	 * 準備済介護保障返戻金有無コードを設定します。
	 * @param jzkghsWUmuCd JZKGHS_W_UMU_CD
	 */
	public void setJzkghsWUmuCd(String jzkghsWUmuCd) {
		this.jzkghsWUmuCd = jzkghsWUmuCd;
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


