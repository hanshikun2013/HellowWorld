package sample2.table.entity.gen;
//template:tableModel.vm
public class 	TCorpKihonInfo
{

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
     * GENZAI_HOSHU_GETSUGAKU : 現在報酬月額
     */
	private java.math.BigDecimal genzaiHoshuGetsugaku;   

    /**
     * KOSEKI_BAI_RT : 功績倍率
     */
	private java.math.BigDecimal kosekiBaiRt;   

    /**
     * NYUSHA_AGE : 入社年齢
     */
	private java.math.BigDecimal nyushaAge;   

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
     * EP_KANYU_AGE : 厚生年金加入年齢
     */
	private java.math.BigDecimal epKanyuAge;   

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
}


