package sample2.table.entity.gen;
//template:tableModel.vm
public class 	TCorpCashfKaize
{

    /**
     * SAGE_KINGAKU : 引下金額
     */
	private java.math.BigDecimal sageKingaku;   

    /**
     * SKHK_HOKEN_SHURUI_CD : 参考保険 保険種類コード
     */
	private String skhkHokenShuruiCd;   

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
}


