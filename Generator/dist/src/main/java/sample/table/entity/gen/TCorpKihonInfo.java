package sample.table.entity.gen;

public class 	TCorpKihonInfo
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
	private java.sql.Date bunsekiCreateDate;   

    /**
     * BUNSEKI_UPDATE_DATE : 分析最終更新日
     */
	private java.sql.Date bunsekiUpdateDate;   

    /**
     * CORP_NAME : 法人名
     */
	private String corpName;   

    /**
     * CORP_NAME_KANA : 法人名カナ
     */
	private String corpNameKana;   

    /**
     * CORP_JIKKOUZEI_RT : 法人実効税率
     */
	private java.math.BigDecimal corpJikkouzeiRt;   

    /**
     * YAKUIN_SHUNIN_AGE : 役員就任年齢
     */
	private java.math.BigDecimal yakuinShuninAge;   

    /**
     * KOSEKI_BAI_RT : 功績倍率
     */
	private java.math.BigDecimal kosekiBaiRt;   

    /**
     * GENZAI_HOSHU_GETSUGAKU : 現在報酬月額
     */
	private java.math.BigDecimal genzaiHoshuGetsugaku;   

    /**
     * NYUSHA_AGE : 入社年齢
     */
	private java.math.BigDecimal nyushaAge;   

    /**
     * EP_KANYU_AGE : 厚生年金加入年齢
     */
	private java.math.BigDecimal epKanyuAge;   

    /**
     * YUTAI_YSHOSHU_GETSUGAKU : 勇退予測報酬月額
     */
	private java.math.BigDecimal yutaiYshoshuGetsugaku;   

    /**
     * YUTAI_YOSOKU_AGE : 勇退予測年齢
     */
	private java.math.BigDecimal yutaiYosokuAge;   

    /**
     * KIBO_YAKUIN_TIROKIN : 希望役員退職慰労金額
     */
	private java.math.BigDecimal kiboYakuinTirokin;   

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
	public java.sql.Date getBunsekiCreateDate() {
		return bunsekiCreateDate;
	}
	
	/**
	 * 分析実施日を設定します。
	 * @param bunsekiCreateDate BUNSEKI_CREATE_DATE
	 */
	public void setBunsekiCreateDate(java.sql.Date bunsekiCreateDate) {
		this.bunsekiCreateDate = bunsekiCreateDate;
	}

	/**
	 * 分析最終更新日を取得します。
	 * @return 分析最終更新日
	 */
	public java.sql.Date getBunsekiUpdateDate() {
		return bunsekiUpdateDate;
	}
	
	/**
	 * 分析最終更新日を設定します。
	 * @param bunsekiUpdateDate BUNSEKI_UPDATE_DATE
	 */
	public void setBunsekiUpdateDate(java.sql.Date bunsekiUpdateDate) {
		this.bunsekiUpdateDate = bunsekiUpdateDate;
	}

	/**
	 * 法人名を取得します。
	 * @return 法人名
	 */
	public String getCorpName() {
		return corpName;
	}
	
	/**
	 * 法人名を設定します。
	 * @param corpName CORP_NAME
	 */
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	/**
	 * 法人名カナを取得します。
	 * @return 法人名カナ
	 */
	public String getCorpNameKana() {
		return corpNameKana;
	}
	
	/**
	 * 法人名カナを設定します。
	 * @param corpNameKana CORP_NAME_KANA
	 */
	public void setCorpNameKana(String corpNameKana) {
		this.corpNameKana = corpNameKana;
	}

	/**
	 * 法人実効税率を取得します。
	 * @return 法人実効税率
	 */
	public java.math.BigDecimal getCorpJikkouzeiRt() {
		return corpJikkouzeiRt;
	}
	
	/**
	 * 法人実効税率を設定します。
	 * @param corpJikkouzeiRt CORP_JIKKOUZEI_RT
	 */
	public void setCorpJikkouzeiRt(java.math.BigDecimal corpJikkouzeiRt) {
		this.corpJikkouzeiRt = corpJikkouzeiRt;
	}

	/**
	 * 役員就任年齢を取得します。
	 * @return 役員就任年齢
	 */
	public java.math.BigDecimal getYakuinShuninAge() {
		return yakuinShuninAge;
	}
	
	/**
	 * 役員就任年齢を設定します。
	 * @param yakuinShuninAge YAKUIN_SHUNIN_AGE
	 */
	public void setYakuinShuninAge(java.math.BigDecimal yakuinShuninAge) {
		this.yakuinShuninAge = yakuinShuninAge;
	}

	/**
	 * 功績倍率を取得します。
	 * @return 功績倍率
	 */
	public java.math.BigDecimal getKosekiBaiRt() {
		return kosekiBaiRt;
	}
	
	/**
	 * 功績倍率を設定します。
	 * @param kosekiBaiRt KOSEKI_BAI_RT
	 */
	public void setKosekiBaiRt(java.math.BigDecimal kosekiBaiRt) {
		this.kosekiBaiRt = kosekiBaiRt;
	}

	/**
	 * 現在報酬月額を取得します。
	 * @return 現在報酬月額
	 */
	public java.math.BigDecimal getGenzaiHoshuGetsugaku() {
		return genzaiHoshuGetsugaku;
	}
	
	/**
	 * 現在報酬月額を設定します。
	 * @param genzaiHoshuGetsugaku GENZAI_HOSHU_GETSUGAKU
	 */
	public void setGenzaiHoshuGetsugaku(java.math.BigDecimal genzaiHoshuGetsugaku) {
		this.genzaiHoshuGetsugaku = genzaiHoshuGetsugaku;
	}

	/**
	 * 入社年齢を取得します。
	 * @return 入社年齢
	 */
	public java.math.BigDecimal getNyushaAge() {
		return nyushaAge;
	}
	
	/**
	 * 入社年齢を設定します。
	 * @param nyushaAge NYUSHA_AGE
	 */
	public void setNyushaAge(java.math.BigDecimal nyushaAge) {
		this.nyushaAge = nyushaAge;
	}

	/**
	 * 厚生年金加入年齢を取得します。
	 * @return 厚生年金加入年齢
	 */
	public java.math.BigDecimal getEpKanyuAge() {
		return epKanyuAge;
	}
	
	/**
	 * 厚生年金加入年齢を設定します。
	 * @param epKanyuAge EP_KANYU_AGE
	 */
	public void setEpKanyuAge(java.math.BigDecimal epKanyuAge) {
		this.epKanyuAge = epKanyuAge;
	}

	/**
	 * 勇退予測報酬月額を取得します。
	 * @return 勇退予測報酬月額
	 */
	public java.math.BigDecimal getYutaiYshoshuGetsugaku() {
		return yutaiYshoshuGetsugaku;
	}
	
	/**
	 * 勇退予測報酬月額を設定します。
	 * @param yutaiYshoshuGetsugaku YUTAI_YSHOSHU_GETSUGAKU
	 */
	public void setYutaiYshoshuGetsugaku(java.math.BigDecimal yutaiYshoshuGetsugaku) {
		this.yutaiYshoshuGetsugaku = yutaiYshoshuGetsugaku;
	}

	/**
	 * 勇退予測年齢を取得します。
	 * @return 勇退予測年齢
	 */
	public java.math.BigDecimal getYutaiYosokuAge() {
		return yutaiYosokuAge;
	}
	
	/**
	 * 勇退予測年齢を設定します。
	 * @param yutaiYosokuAge YUTAI_YOSOKU_AGE
	 */
	public void setYutaiYosokuAge(java.math.BigDecimal yutaiYosokuAge) {
		this.yutaiYosokuAge = yutaiYosokuAge;
	}

	/**
	 * 希望役員退職慰労金額を取得します。
	 * @return 希望役員退職慰労金額
	 */
	public java.math.BigDecimal getKiboYakuinTirokin() {
		return kiboYakuinTirokin;
	}
	
	/**
	 * 希望役員退職慰労金額を設定します。
	 * @param kiboYakuinTirokin KIBO_YAKUIN_TIROKIN
	 */
	public void setKiboYakuinTirokin(java.math.BigDecimal kiboYakuinTirokin) {
		this.kiboYakuinTirokin = kiboYakuinTirokin;
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