package temp.T2D.souzoku.entity.gen;
public class 	TLrmsSogakuKihon
{

    /**
     * SPOUSE_UMU_CD : 配偶者有無コード
     */
	private String spouseUmuCd;   

    /**
     * HTSZN_SB_CD : 法定相続人種別コード
     */
	private String htsznSbCd;   

    /**
     * HTSZN_CNT : 法定相続人数
     */
	private java.math.BigDecimal htsznCnt;   

	/**
	 * 配偶者有無コードを取得します。
	 * @return 配偶者有無コード
	 */
	public String getSpouseUmuCd() {
		return spouseUmuCd;
	}
	
	/**
	 * 配偶者有無コードを設定します。
	 * @param spouseUmuCd SPOUSE_UMU_CD
	 */
	public void setSpouseUmuCd(String spouseUmuCd) {
		this.spouseUmuCd = spouseUmuCd;
	}

	/**
	 * 法定相続人種別コードを取得します。
	 * @return 法定相続人種別コード
	 */
	public String getHtsznSbCd() {
		return htsznSbCd;
	}
	
	/**
	 * 法定相続人種別コードを設定します。
	 * @param htsznSbCd HTSZN_SB_CD
	 */
	public void setHtsznSbCd(String htsznSbCd) {
		this.htsznSbCd = htsznSbCd;
	}

	/**
	 * 法定相続人数を取得します。
	 * @return 法定相続人数
	 */
	public java.math.BigDecimal getHtsznCnt() {
		return htsznCnt;
	}
	
	/**
	 * 法定相続人数を設定します。
	 * @param htsznCnt HTSZN_CNT
	 */
	public void setHtsznCnt(java.math.BigDecimal htsznCnt) {
		this.htsznCnt = htsznCnt;
	}
}


