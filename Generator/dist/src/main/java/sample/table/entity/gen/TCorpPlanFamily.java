package sample.table.entity.gen;

public class 	TCorpPlanFamily
{

    /**
     * PLAN_ID : プランID
     */
	private String planId;   

    /**
     * FAMILY_CD : 家族コード
     */
	private String familyCd;   

    /**
     * FAMILY_NAME_KANJI : 家族氏名（漢字）
     */
	private String familyNameKanji;   

    /**
     * FAMILY_NAME_KANA : 家族氏名（カナ）
     */
	private String familyNameKana;   

    /**
     * BIRTH : 生年月日
     */
	private java.sql.Date birth;   

    /**
     * AGE : 年齢
     */
	private java.math.BigDecimal age;   

    /**
     * BIRTH_AGE_SELECT_CD : 生年月日・年齢選択コード
     */
	private String birthAgeSelectCd;   

    /**
     * ZOKUGARA_CD : 続柄コード
     */
	private String zokugaraCd;   

    /**
     * SEX_CD : 性別コード
     */
	private String sexCd;   

    /**
     * JOB_CD : 職業コード
     */
	private String jobCd;   

    /**
     * NENSHU : 年収
     */
	private java.math.BigDecimal nenshu;   

    /**
     * TAISHOKU_PLAN_AGE : 退職予定年齢
     */
	private java.math.BigDecimal taishokuPlanAge;   

    /**
     * HEIKIN_YOMEI : 平均余命
     */
	private java.math.BigDecimal heikinYomei;   

    /**
     * IMEJI_GAZOU_CD : イメージ画像コード
     */
	private String imejiGazouCd;   

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
	 * 家族コードを取得します。
	 * @return 家族コード
	 */
	public String getFamilyCd() {
		return familyCd;
	}
	
	/**
	 * 家族コードを設定します。
	 * @param familyCd FAMILY_CD
	 */
	public void setFamilyCd(String familyCd) {
		this.familyCd = familyCd;
	}

	/**
	 * 家族氏名（漢字）を取得します。
	 * @return 家族氏名（漢字）
	 */
	public String getFamilyNameKanji() {
		return familyNameKanji;
	}
	
	/**
	 * 家族氏名（漢字）を設定します。
	 * @param familyNameKanji FAMILY_NAME_KANJI
	 */
	public void setFamilyNameKanji(String familyNameKanji) {
		this.familyNameKanji = familyNameKanji;
	}

	/**
	 * 家族氏名（カナ）を取得します。
	 * @return 家族氏名（カナ）
	 */
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	
	/**
	 * 家族氏名（カナ）を設定します。
	 * @param familyNameKana FAMILY_NAME_KANA
	 */
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	/**
	 * 生年月日を取得します。
	 * @return 生年月日
	 */
	public java.sql.Date getBirth() {
		return birth;
	}
	
	/**
	 * 生年月日を設定します。
	 * @param birth BIRTH
	 */
	public void setBirth(java.sql.Date birth) {
		this.birth = birth;
	}

	/**
	 * 年齢を取得します。
	 * @return 年齢
	 */
	public java.math.BigDecimal getAge() {
		return age;
	}
	
	/**
	 * 年齢を設定します。
	 * @param age AGE
	 */
	public void setAge(java.math.BigDecimal age) {
		this.age = age;
	}

	/**
	 * 生年月日・年齢選択コードを取得します。
	 * @return 生年月日・年齢選択コード
	 */
	public String getBirthAgeSelectCd() {
		return birthAgeSelectCd;
	}
	
	/**
	 * 生年月日・年齢選択コードを設定します。
	 * @param birthAgeSelectCd BIRTH_AGE_SELECT_CD
	 */
	public void setBirthAgeSelectCd(String birthAgeSelectCd) {
		this.birthAgeSelectCd = birthAgeSelectCd;
	}

	/**
	 * 続柄コードを取得します。
	 * @return 続柄コード
	 */
	public String getZokugaraCd() {
		return zokugaraCd;
	}
	
	/**
	 * 続柄コードを設定します。
	 * @param zokugaraCd ZOKUGARA_CD
	 */
	public void setZokugaraCd(String zokugaraCd) {
		this.zokugaraCd = zokugaraCd;
	}

	/**
	 * 性別コードを取得します。
	 * @return 性別コード
	 */
	public String getSexCd() {
		return sexCd;
	}
	
	/**
	 * 性別コードを設定します。
	 * @param sexCd SEX_CD
	 */
	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}

	/**
	 * 職業コードを取得します。
	 * @return 職業コード
	 */
	public String getJobCd() {
		return jobCd;
	}
	
	/**
	 * 職業コードを設定します。
	 * @param jobCd JOB_CD
	 */
	public void setJobCd(String jobCd) {
		this.jobCd = jobCd;
	}

	/**
	 * 年収を取得します。
	 * @return 年収
	 */
	public java.math.BigDecimal getNenshu() {
		return nenshu;
	}
	
	/**
	 * 年収を設定します。
	 * @param nenshu NENSHU
	 */
	public void setNenshu(java.math.BigDecimal nenshu) {
		this.nenshu = nenshu;
	}

	/**
	 * 退職予定年齢を取得します。
	 * @return 退職予定年齢
	 */
	public java.math.BigDecimal getTaishokuPlanAge() {
		return taishokuPlanAge;
	}
	
	/**
	 * 退職予定年齢を設定します。
	 * @param taishokuPlanAge TAISHOKU_PLAN_AGE
	 */
	public void setTaishokuPlanAge(java.math.BigDecimal taishokuPlanAge) {
		this.taishokuPlanAge = taishokuPlanAge;
	}

	/**
	 * 平均余命を取得します。
	 * @return 平均余命
	 */
	public java.math.BigDecimal getHeikinYomei() {
		return heikinYomei;
	}
	
	/**
	 * 平均余命を設定します。
	 * @param heikinYomei HEIKIN_YOMEI
	 */
	public void setHeikinYomei(java.math.BigDecimal heikinYomei) {
		this.heikinYomei = heikinYomei;
	}

	/**
	 * イメージ画像コードを取得します。
	 * @return イメージ画像コード
	 */
	public String getImejiGazouCd() {
		return imejiGazouCd;
	}
	
	/**
	 * イメージ画像コードを設定します。
	 * @param imejiGazouCd IMEJI_GAZOU_CD
	 */
	public void setImejiGazouCd(String imejiGazouCd) {
		this.imejiGazouCd = imejiGazouCd;
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