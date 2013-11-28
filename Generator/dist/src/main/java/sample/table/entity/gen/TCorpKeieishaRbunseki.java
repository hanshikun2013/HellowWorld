package sample.table.entity.gen;
//template:tableModel.vm
public class 	TCorpKeieishaRbunseki
{

    /**
     * PLAN_ID : プランID
     */
	private String planId;   

    /**
     * KARIRE_SOTOGAKU : 借入相当額
     */
	private java.math.BigDecimal karireSotogaku;   

    /**
     * JUGYOIN_KYUYO : 従業員給与(月間)
     */
	private java.math.BigDecimal jugyoinKyuyo;   

    /**
     * JUGYOIN_KYUYO_HYOGETU : 従業員給与必要月数
     */
	private java.math.BigDecimal jugyoinKyuyoHyogetu;   

    /**
     * CHOIKIN_SANSHUTSU_KB_CD : 弔慰金算出係数区分コード
     */
	private String choikinSanshutsuKbCd;   

    /**
     * KENAOSI_SHIKIN_SB_CD : 経営立て直し資金種別コード
     */
	private String kenaosiShikinSbCd;   

    /**
     * KENAOSI_SHIKIN : 経営立て直し資金
     */
	private java.math.BigDecimal kenaosiShikin;   

    /**
     * GYOSHU_CD : 業種コード
     */
	private String gyoshuCd;   

    /**
     * JUGYOINSU : 従業員数
     */
	private java.math.BigDecimal jugyoinsu;   

    /**
     * URIAGEDAKA_YOSOU : 売上高予想
     */
	private java.math.BigDecimal uriagedakaYosou;   

    /**
     * M1NGO_URIYOSO_RT : 万一1年後売上予想比率
     */
	private java.math.BigDecimal m1ngoUriyosoRt;   

    /**
     * M2NGO_URIYOSO_RT : 万一2年後売上予想比率
     */
	private java.math.BigDecimal m2ngoUriyosoRt;   

    /**
     * M3NGO_URIYOSO_RT : 万一3年後売上予想比率
     */
	private java.math.BigDecimal m3ngoUriyosoRt;   

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
	 * 借入相当額を取得します。
	 * @return 借入相当額
	 */
	public java.math.BigDecimal getKarireSotogaku() {
		return karireSotogaku;
	}
	
	/**
	 * 借入相当額を設定します。
	 * @param karireSotogaku KARIRE_SOTOGAKU
	 */
	public void setKarireSotogaku(java.math.BigDecimal karireSotogaku) {
		this.karireSotogaku = karireSotogaku;
	}

	/**
	 * 従業員給与(月間)を取得します。
	 * @return 従業員給与(月間)
	 */
	public java.math.BigDecimal getJugyoinKyuyo() {
		return jugyoinKyuyo;
	}
	
	/**
	 * 従業員給与(月間)を設定します。
	 * @param jugyoinKyuyo JUGYOIN_KYUYO
	 */
	public void setJugyoinKyuyo(java.math.BigDecimal jugyoinKyuyo) {
		this.jugyoinKyuyo = jugyoinKyuyo;
	}

	/**
	 * 従業員給与必要月数を取得します。
	 * @return 従業員給与必要月数
	 */
	public java.math.BigDecimal getJugyoinKyuyoHyogetu() {
		return jugyoinKyuyoHyogetu;
	}
	
	/**
	 * 従業員給与必要月数を設定します。
	 * @param jugyoinKyuyoHyogetu JUGYOIN_KYUYO_HYOGETU
	 */
	public void setJugyoinKyuyoHyogetu(java.math.BigDecimal jugyoinKyuyoHyogetu) {
		this.jugyoinKyuyoHyogetu = jugyoinKyuyoHyogetu;
	}

	/**
	 * 弔慰金算出係数区分コードを取得します。
	 * @return 弔慰金算出係数区分コード
	 */
	public String getChoikinSanshutsuKbCd() {
		return choikinSanshutsuKbCd;
	}
	
	/**
	 * 弔慰金算出係数区分コードを設定します。
	 * @param choikinSanshutsuKbCd CHOIKIN_SANSHUTSU_KB_CD
	 */
	public void setChoikinSanshutsuKbCd(String choikinSanshutsuKbCd) {
		this.choikinSanshutsuKbCd = choikinSanshutsuKbCd;
	}

	/**
	 * 経営立て直し資金種別コードを取得します。
	 * @return 経営立て直し資金種別コード
	 */
	public String getKenaosiShikinSbCd() {
		return kenaosiShikinSbCd;
	}
	
	/**
	 * 経営立て直し資金種別コードを設定します。
	 * @param kenaosiShikinSbCd KENAOSI_SHIKIN_SB_CD
	 */
	public void setKenaosiShikinSbCd(String kenaosiShikinSbCd) {
		this.kenaosiShikinSbCd = kenaosiShikinSbCd;
	}

	/**
	 * 経営立て直し資金を取得します。
	 * @return 経営立て直し資金
	 */
	public java.math.BigDecimal getKenaosiShikin() {
		return kenaosiShikin;
	}
	
	/**
	 * 経営立て直し資金を設定します。
	 * @param kenaosiShikin KENAOSI_SHIKIN
	 */
	public void setKenaosiShikin(java.math.BigDecimal kenaosiShikin) {
		this.kenaosiShikin = kenaosiShikin;
	}

	/**
	 * 業種コードを取得します。
	 * @return 業種コード
	 */
	public String getGyoshuCd() {
		return gyoshuCd;
	}
	
	/**
	 * 業種コードを設定します。
	 * @param gyoshuCd GYOSHU_CD
	 */
	public void setGyoshuCd(String gyoshuCd) {
		this.gyoshuCd = gyoshuCd;
	}

	/**
	 * 従業員数を取得します。
	 * @return 従業員数
	 */
	public java.math.BigDecimal getJugyoinsu() {
		return jugyoinsu;
	}
	
	/**
	 * 従業員数を設定します。
	 * @param jugyoinsu JUGYOINSU
	 */
	public void setJugyoinsu(java.math.BigDecimal jugyoinsu) {
		this.jugyoinsu = jugyoinsu;
	}

	/**
	 * 売上高予想を取得します。
	 * @return 売上高予想
	 */
	public java.math.BigDecimal getUriagedakaYosou() {
		return uriagedakaYosou;
	}
	
	/**
	 * 売上高予想を設定します。
	 * @param uriagedakaYosou URIAGEDAKA_YOSOU
	 */
	public void setUriagedakaYosou(java.math.BigDecimal uriagedakaYosou) {
		this.uriagedakaYosou = uriagedakaYosou;
	}

	/**
	 * 万一1年後売上予想比率を取得します。
	 * @return 万一1年後売上予想比率
	 */
	public java.math.BigDecimal getM1ngoUriyosoRt() {
		return m1ngoUriyosoRt;
	}
	
	/**
	 * 万一1年後売上予想比率を設定します。
	 * @param m1ngoUriyosoRt M1NGO_URIYOSO_RT
	 */
	public void setM1ngoUriyosoRt(java.math.BigDecimal m1ngoUriyosoRt) {
		this.m1ngoUriyosoRt = m1ngoUriyosoRt;
	}

	/**
	 * 万一2年後売上予想比率を取得します。
	 * @return 万一2年後売上予想比率
	 */
	public java.math.BigDecimal getM2ngoUriyosoRt() {
		return m2ngoUriyosoRt;
	}
	
	/**
	 * 万一2年後売上予想比率を設定します。
	 * @param m2ngoUriyosoRt M2NGO_URIYOSO_RT
	 */
	public void setM2ngoUriyosoRt(java.math.BigDecimal m2ngoUriyosoRt) {
		this.m2ngoUriyosoRt = m2ngoUriyosoRt;
	}

	/**
	 * 万一3年後売上予想比率を取得します。
	 * @return 万一3年後売上予想比率
	 */
	public java.math.BigDecimal getM3ngoUriyosoRt() {
		return m3ngoUriyosoRt;
	}
	
	/**
	 * 万一3年後売上予想比率を設定します。
	 * @param m3ngoUriyosoRt M3NGO_URIYOSO_RT
	 */
	public void setM3ngoUriyosoRt(java.math.BigDecimal m3ngoUriyosoRt) {
		this.m3ngoUriyosoRt = m3ngoUriyosoRt;
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


