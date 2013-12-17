package temp.t2d.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030201Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * 入力方法
     */
 	@JsonProperty("inputMethod")
	private String inputMethod;   
    /**
     * 生活費総額
     */
 	@JsonProperty("livingCostTotal")
	private java.math.BigDecimal livingCostTotal;   
    /**
     * 生活費コードリスト
     */
 	@JsonProperty("livingCostCodeList")
	private String[] livingCostCodeList;   
    /**
     * 生活費名リスト
     */
 	@JsonProperty("livingCostNameList")
	private String[] livingCostNameList;   
    /**
     * 生活費
     */
 	@JsonProperty("livingCostList")
	private java.math.BigDecimal[] livingCostList;   

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
	 * 入力方法を取得します。
	 * @return 入力方法
	 */
	public String getInputMethod() {
		return inputMethod;
	}
	
	/**
	 * 入力方法を設定します。
	 * @param inputMethod 入力方法
	 */
	public void setInputMethod(String inputMethod) {
		this.inputMethod = inputMethod;
	}

	/**
	 * 生活費総額を取得します。
	 * @return 生活費総額
	 */
	public java.math.BigDecimal getLivingCostTotal() {
		return livingCostTotal;
	}
	
	/**
	 * 生活費総額を設定します。
	 * @param livingCostTotal 生活費総額
	 */
	public void setLivingCostTotal(java.math.BigDecimal livingCostTotal) {
		this.livingCostTotal = livingCostTotal;
	}

	/**
	 * 生活費コードリストを取得します。
	 * @return 生活費コードリスト
	 */
	public String[] getLivingCostCodeList() {
		return livingCostCodeList;
	}
	
	/**
	 * 生活費コードリストを設定します。
	 * @param livingCostCodeList 生活費コードリスト
	 */
	public void setLivingCostCodeList(String[] livingCostCodeList) {
		this.livingCostCodeList = livingCostCodeList;
	}

	/**
	 * 生活費名リストを取得します。
	 * @return 生活費名リスト
	 */
	public String[] getLivingCostNameList() {
		return livingCostNameList;
	}
	
	/**
	 * 生活費名リストを設定します。
	 * @param livingCostNameList 生活費名リスト
	 */
	public void setLivingCostNameList(String[] livingCostNameList) {
		this.livingCostNameList = livingCostNameList;
	}

	/**
	 * 生活費を取得します。
	 * @return 生活費
	 */
	public java.math.BigDecimal[] getLivingCostList() {
		return livingCostList;
	}
	
	/**
	 * 生活費を設定します。
	 * @param livingCostList 生活費
	 */
	public void setLivingCostList(java.math.BigDecimal[] livingCostList) {
		this.livingCostList = livingCostList;
	}
}	

