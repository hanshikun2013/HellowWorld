package temp.t2d.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030701Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * 累計の年次データ
     */
 	@JsonProperty("")
	private String ;   
    /**
     * 　不足額
     */
 	@JsonProperty("annualTotalListShortageList")
	private java.math.BigDecimal annualTotalListShortageList;   
    /**
     * 　不足額
     */
 	@JsonProperty("annualYearListShortageList")
	private java.math.BigDecimal annualYearListShortageList;   
    /**
     * 　その他必要資金(趣味イベント、その他)
     */
 	@JsonProperty("annualYearListOtherList")
	private java.math.BigDecimal annualYearListOtherList;   

	/**
	 * idを取得します。
	 * @return id
	 */
	public java.math.BigDecimal getId() {
		return id;
	}
	
	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(java.math.BigDecimal id) {
		this.id = id;
	}

	/**
	 * 累計の年次データを取得します。
	 * @return 累計の年次データ
	 */
	public String get() {
		return ;
	}
	
	/**
	 * 累計の年次データを設定します。
	 * @param  累計の年次データ
	 */
	public void set(String ) {
		this. = ;
	}

	/**
	 * 　不足額を取得します。
	 * @return 　不足額
	 */
	public java.math.BigDecimal getAnnualTotalListShortageList() {
		return annualTotalListShortageList;
	}
	
	/**
	 * 　不足額を設定します。
	 * @param annualTotalListShortageList 　不足額
	 */
	public void setAnnualTotalListShortageList(java.math.BigDecimal annualTotalListShortageList) {
		this.annualTotalListShortageList = annualTotalListShortageList;
	}

	/**
	 * 　不足額を取得します。
	 * @return 　不足額
	 */
	public java.math.BigDecimal getAnnualYearListShortageList() {
		return annualYearListShortageList;
	}
	
	/**
	 * 　不足額を設定します。
	 * @param annualYearListShortageList 　不足額
	 */
	public void setAnnualYearListShortageList(java.math.BigDecimal annualYearListShortageList) {
		this.annualYearListShortageList = annualYearListShortageList;
	}

	/**
	 * 　その他必要資金(趣味イベント、その他)を取得します。
	 * @return 　その他必要資金(趣味イベント、その他)
	 */
	public java.math.BigDecimal getAnnualYearListOtherList() {
		return annualYearListOtherList;
	}
	
	/**
	 * 　その他必要資金(趣味イベント、その他)を設定します。
	 * @param annualYearListOtherList 　その他必要資金(趣味イベント、その他)
	 */
	public void setAnnualYearListOtherList(java.math.BigDecimal annualYearListOtherList) {
		this.annualYearListOtherList = annualYearListOtherList;
	}
}	

