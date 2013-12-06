package temp.D2T.kaigo.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lcsc0501Collection
{
    /**
     * 介護タイプ
     */
 	@JsonProperty("careType")
	private String careType;   
    /**
     * 介護タイプ選択
     */
 	@JsonProperty("radioType")
	private String radioType;   
    /**
     * 介護必要期間入力欄
     */
 	@JsonProperty("careKikan")
	private String careKikan;   
    /**
     * 一時金
     */
 	@JsonProperty("temporaryMoney")
	private String temporaryMoney;   
    /**
     * 介護年金
     */
 	@JsonProperty("careNenkin")
	private String careNenkin;   
    /**
     * 介護年金受取期間
     */
 	@JsonProperty("careNenkinUketorikikan")
	private String careNenkinUketorikikan;   
    /**
     * 保障期間
     */
 	@JsonProperty("hosyoKikan")
	private String hosyoKikan;   
    /**
     * 保障期間単位リスト
     */
 	@JsonProperty("listHosyoKikanTani")
	private String listHosyoKikanTani;   
    /**
     * 払込期間
     */
 	@JsonProperty("haraikomiKikan")
	private String haraikomiKikan;   
    /**
     * 払込期間単位リスト
     */
 	@JsonProperty("listHaraikomiKikanTani")
	private String listHaraikomiKikanTani;   
    /**
     * 解約返戻金有無
     */
 	@JsonProperty("checkModoshikin")
	private String checkModoshikin;   

	/**
	 * 介護タイプを取得します。
	 * @return 介護タイプ
	 */
	public String getCareType() {
		return careType;
	}
	
	/**
	 * 介護タイプを設定します。
	 * @param careType 介護タイプ
	 */
	public void setCareType(String careType) {
		this.careType = careType;
	}

	/**
	 * 介護タイプ選択を取得します。
	 * @return 介護タイプ選択
	 */
	public String getRadioType() {
		return radioType;
	}
	
	/**
	 * 介護タイプ選択を設定します。
	 * @param radioType 介護タイプ選択
	 */
	public void setRadioType(String radioType) {
		this.radioType = radioType;
	}

	/**
	 * 介護必要期間入力欄を取得します。
	 * @return 介護必要期間入力欄
	 */
	public String getCareKikan() {
		return careKikan;
	}
	
	/**
	 * 介護必要期間入力欄を設定します。
	 * @param careKikan 介護必要期間入力欄
	 */
	public void setCareKikan(String careKikan) {
		this.careKikan = careKikan;
	}

	/**
	 * 一時金を取得します。
	 * @return 一時金
	 */
	public String getTemporaryMoney() {
		return temporaryMoney;
	}
	
	/**
	 * 一時金を設定します。
	 * @param temporaryMoney 一時金
	 */
	public void setTemporaryMoney(String temporaryMoney) {
		this.temporaryMoney = temporaryMoney;
	}

	/**
	 * 介護年金を取得します。
	 * @return 介護年金
	 */
	public String getCareNenkin() {
		return careNenkin;
	}
	
	/**
	 * 介護年金を設定します。
	 * @param careNenkin 介護年金
	 */
	public void setCareNenkin(String careNenkin) {
		this.careNenkin = careNenkin;
	}

	/**
	 * 介護年金受取期間を取得します。
	 * @return 介護年金受取期間
	 */
	public String getCareNenkinUketorikikan() {
		return careNenkinUketorikikan;
	}
	
	/**
	 * 介護年金受取期間を設定します。
	 * @param careNenkinUketorikikan 介護年金受取期間
	 */
	public void setCareNenkinUketorikikan(String careNenkinUketorikikan) {
		this.careNenkinUketorikikan = careNenkinUketorikikan;
	}

	/**
	 * 保障期間を取得します。
	 * @return 保障期間
	 */
	public String getHosyoKikan() {
		return hosyoKikan;
	}
	
	/**
	 * 保障期間を設定します。
	 * @param hosyoKikan 保障期間
	 */
	public void setHosyoKikan(String hosyoKikan) {
		this.hosyoKikan = hosyoKikan;
	}

	/**
	 * 保障期間単位リストを取得します。
	 * @return 保障期間単位リスト
	 */
	public String getListHosyoKikanTani() {
		return listHosyoKikanTani;
	}
	
	/**
	 * 保障期間単位リストを設定します。
	 * @param listHosyoKikanTani 保障期間単位リスト
	 */
	public void setListHosyoKikanTani(String listHosyoKikanTani) {
		this.listHosyoKikanTani = listHosyoKikanTani;
	}

	/**
	 * 払込期間を取得します。
	 * @return 払込期間
	 */
	public String getHaraikomiKikan() {
		return haraikomiKikan;
	}
	
	/**
	 * 払込期間を設定します。
	 * @param haraikomiKikan 払込期間
	 */
	public void setHaraikomiKikan(String haraikomiKikan) {
		this.haraikomiKikan = haraikomiKikan;
	}

	/**
	 * 払込期間単位リストを取得します。
	 * @return 払込期間単位リスト
	 */
	public String getListHaraikomiKikanTani() {
		return listHaraikomiKikanTani;
	}
	
	/**
	 * 払込期間単位リストを設定します。
	 * @param listHaraikomiKikanTani 払込期間単位リスト
	 */
	public void setListHaraikomiKikanTani(String listHaraikomiKikanTani) {
		this.listHaraikomiKikanTani = listHaraikomiKikanTani;
	}

	/**
	 * 解約返戻金有無を取得します。
	 * @return 解約返戻金有無
	 */
	public String getCheckModoshikin() {
		return checkModoshikin;
	}
	
	/**
	 * 解約返戻金有無を設定します。
	 * @param checkModoshikin 解約返戻金有無
	 */
	public void setCheckModoshikin(String checkModoshikin) {
		this.checkModoshikin = checkModoshikin;
	}
}	

