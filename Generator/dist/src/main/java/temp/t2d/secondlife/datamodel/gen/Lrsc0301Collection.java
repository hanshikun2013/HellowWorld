package temp.t2d.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc0301Collection
{
    /**
     * id
     */
 	@JsonProperty("id")
	private java.math.BigDecimal id;   
    /**
     * 生活費（月額・円）
     */
 	@JsonProperty("livingCost")
	private java.math.BigDecimal livingCost;   
    /**
     * 住宅費（月額・円）
     */
 	@JsonProperty("house")
	private java.math.BigDecimal house;   
    /**
     * 趣味イベント（円）
     */
 	@JsonProperty("hobby")
	private java.math.BigDecimal hobby;   
    /**
     * その他必要資金（円）
     */
 	@JsonProperty("other")
	private java.math.BigDecimal other;   
    /**
     * 必要資金総額（万円）
     */
 	@JsonProperty("needFunds")
	private java.math.BigDecimal needFunds;   
    /**
     * 累計の年次データ
     */
 	@JsonProperty("")
	private String ;   
    /**
     * 　生活費
     */
 	@JsonProperty("annualTotalLivingCostList")
	private java.math.BigDecimal[] annualTotalLivingCostList;   
    /**
     * 　住宅費
     */
 	@JsonProperty("annualTotalHouseList")
	private java.math.BigDecimal[] annualTotalHouseList;   
    /**
     * 　趣味イベント
     */
 	@JsonProperty("annualTotalHobbyList")
	private java.math.BigDecimal[] annualTotalHobbyList;   
    /**
     * 　その他必要資金
     */
 	@JsonProperty("annualTotalOtherList")
	private java.math.BigDecimal[] annualTotalOtherList;   
    /**
     * 　総額
     */
 	@JsonProperty("annualTotalTotalList")
	private java.math.BigDecimal[] annualTotalTotalList;   
    /**
     * 　生活費
     */
 	@JsonProperty("annualYearLivingCostList")
	private java.math.BigDecimal[] annualYearLivingCostList;   
    /**
     * 　住宅費
     */
 	@JsonProperty("annualYearHouseList")
	private java.math.BigDecimal[] annualYearHouseList;   
    /**
     * 　趣味イベント
     */
 	@JsonProperty("annualYearHobbyList")
	private java.math.BigDecimal[] annualYearHobbyList;   
    /**
     * 　その他必要資金
     */
 	@JsonProperty("annualYearOtherList")
	private java.math.BigDecimal[] annualYearOtherList;   
    /**
     * 　総額
     */
 	@JsonProperty("annualYearTotalList")
	private java.math.BigDecimal[] annualYearTotalList;   
    /**
     * 配偶者有無
     */
 	@JsonProperty("dummySpFlg")
	private String dummySpFlg;   
    /**
     * 世帯主年齢
     */
 	@JsonProperty("dummyHhAge")
	private java.math.BigDecimal dummyHhAge;   
    /**
     * 世帯主性別
     */
 	@JsonProperty("dummyHhSex")
	private java.math.BigDecimal dummyHhSex;   
    /**
     * 世帯主生年月日
     */
 	@JsonProperty("dummyHhBirth")
	private java.math.BigDecimal dummyHhBirth;   
    /**
     * 世帯主年金種別
     */
 	@JsonProperty("dummyHhPensionType")
	private java.math.BigDecimal dummyHhPensionType;   
    /**
     * 世帯主退職予定年齢
     */
 	@JsonProperty("dummyHhRetirementAge")
	private java.math.BigDecimal dummyHhRetirementAge;   
    /**
     * 世帯主仕事開始年月
     */
 	@JsonProperty("dummyHhJobStartYM")
	private java.math.BigDecimal dummyHhJobStartYM;   
    /**
     * 世帯主仕事終了年月
     */
 	@JsonProperty("dummyHhJobEndYM")
	private java.math.BigDecimal dummyHhJobEndYM;   
    /**
     * 世帯主年収
     */
 	@JsonProperty("dummyHhIncome")
	private java.math.BigDecimal dummyHhIncome;   
    /**
     * 世帯主平均寿命
     */
 	@JsonProperty("dummyHhAverageLengthOfLife")
	private java.math.BigDecimal dummyHhAverageLengthOfLife;   
    /**
     * 配偶者年齢
     */
 	@JsonProperty("dummySpAge")
	private java.math.BigDecimal dummySpAge;   
    /**
     * 配偶者性別
     */
 	@JsonProperty("dummySpSex")
	private java.math.BigDecimal dummySpSex;   
    /**
     * 配偶者生年月日
     */
 	@JsonProperty("dummySpBirth")
	private java.math.BigDecimal dummySpBirth;   
    /**
     * 配偶者年金種別
     */
 	@JsonProperty("dummySpPensionType")
	private java.math.BigDecimal dummySpPensionType;   
    /**
     * 配偶者退職予定年齢
     */
 	@JsonProperty("dummySpRetirementAge")
	private java.math.BigDecimal dummySpRetirementAge;   
    /**
     * 配偶者仕事開始年月
     */
 	@JsonProperty("dummySpJobStartYM")
	private java.math.BigDecimal dummySpJobStartYM;   
    /**
     * 配偶者仕事終了年月
     */
 	@JsonProperty("dummySpJobEndYM")
	private java.math.BigDecimal dummySpJobEndYM;   
    /**
     * 配偶者年収
     */
 	@JsonProperty("dummySpIncome")
	private java.math.BigDecimal dummySpIncome;   
    /**
     * 配偶者平均寿命
     */
 	@JsonProperty("dummySpAverageLengthOfLife")
	private java.math.BigDecimal dummySpAverageLengthOfLife;   
    /**
     * セカンドライフ開始年齢
     */
 	@JsonProperty("dummySecondLifeFromAge")
	private java.math.BigDecimal dummySecondLifeFromAge;   
    /**
     * セカンドライフ終了年齢
     */
 	@JsonProperty("dummySecondLifeToAge")
	private java.math.BigDecimal dummySecondLifeToAge;   

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
	 * 生活費（月額・円）を取得します。
	 * @return 生活費（月額・円）
	 */
	public java.math.BigDecimal getLivingCost() {
		return livingCost;
	}
	
	/**
	 * 生活費（月額・円）を設定します。
	 * @param livingCost 生活費（月額・円）
	 */
	public void setLivingCost(java.math.BigDecimal livingCost) {
		this.livingCost = livingCost;
	}

	/**
	 * 住宅費（月額・円）を取得します。
	 * @return 住宅費（月額・円）
	 */
	public java.math.BigDecimal getHouse() {
		return house;
	}
	
	/**
	 * 住宅費（月額・円）を設定します。
	 * @param house 住宅費（月額・円）
	 */
	public void setHouse(java.math.BigDecimal house) {
		this.house = house;
	}

	/**
	 * 趣味イベント（円）を取得します。
	 * @return 趣味イベント（円）
	 */
	public java.math.BigDecimal getHobby() {
		return hobby;
	}
	
	/**
	 * 趣味イベント（円）を設定します。
	 * @param hobby 趣味イベント（円）
	 */
	public void setHobby(java.math.BigDecimal hobby) {
		this.hobby = hobby;
	}

	/**
	 * その他必要資金（円）を取得します。
	 * @return その他必要資金（円）
	 */
	public java.math.BigDecimal getOther() {
		return other;
	}
	
	/**
	 * その他必要資金（円）を設定します。
	 * @param other その他必要資金（円）
	 */
	public void setOther(java.math.BigDecimal other) {
		this.other = other;
	}

	/**
	 * 必要資金総額（万円）を取得します。
	 * @return 必要資金総額（万円）
	 */
	public java.math.BigDecimal getNeedFunds() {
		return needFunds;
	}
	
	/**
	 * 必要資金総額（万円）を設定します。
	 * @param needFunds 必要資金総額（万円）
	 */
	public void setNeedFunds(java.math.BigDecimal needFunds) {
		this.needFunds = needFunds;
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
	 * 　生活費を取得します。
	 * @return 　生活費
	 */
	public java.math.BigDecimal[] getAnnualTotalLivingCostList() {
		return annualTotalLivingCostList;
	}
	
	/**
	 * 　生活費を設定します。
	 * @param annualTotalLivingCostList 　生活費
	 */
	public void setAnnualTotalLivingCostList(java.math.BigDecimal[] annualTotalLivingCostList) {
		this.annualTotalLivingCostList = annualTotalLivingCostList;
	}

	/**
	 * 　住宅費を取得します。
	 * @return 　住宅費
	 */
	public java.math.BigDecimal[] getAnnualTotalHouseList() {
		return annualTotalHouseList;
	}
	
	/**
	 * 　住宅費を設定します。
	 * @param annualTotalHouseList 　住宅費
	 */
	public void setAnnualTotalHouseList(java.math.BigDecimal[] annualTotalHouseList) {
		this.annualTotalHouseList = annualTotalHouseList;
	}

	/**
	 * 　趣味イベントを取得します。
	 * @return 　趣味イベント
	 */
	public java.math.BigDecimal[] getAnnualTotalHobbyList() {
		return annualTotalHobbyList;
	}
	
	/**
	 * 　趣味イベントを設定します。
	 * @param annualTotalHobbyList 　趣味イベント
	 */
	public void setAnnualTotalHobbyList(java.math.BigDecimal[] annualTotalHobbyList) {
		this.annualTotalHobbyList = annualTotalHobbyList;
	}

	/**
	 * 　その他必要資金を取得します。
	 * @return 　その他必要資金
	 */
	public java.math.BigDecimal[] getAnnualTotalOtherList() {
		return annualTotalOtherList;
	}
	
	/**
	 * 　その他必要資金を設定します。
	 * @param annualTotalOtherList 　その他必要資金
	 */
	public void setAnnualTotalOtherList(java.math.BigDecimal[] annualTotalOtherList) {
		this.annualTotalOtherList = annualTotalOtherList;
	}

	/**
	 * 　総額を取得します。
	 * @return 　総額
	 */
	public java.math.BigDecimal[] getAnnualTotalTotalList() {
		return annualTotalTotalList;
	}
	
	/**
	 * 　総額を設定します。
	 * @param annualTotalTotalList 　総額
	 */
	public void setAnnualTotalTotalList(java.math.BigDecimal[] annualTotalTotalList) {
		this.annualTotalTotalList = annualTotalTotalList;
	}

	/**
	 * 　生活費を取得します。
	 * @return 　生活費
	 */
	public java.math.BigDecimal[] getAnnualYearLivingCostList() {
		return annualYearLivingCostList;
	}
	
	/**
	 * 　生活費を設定します。
	 * @param annualYearLivingCostList 　生活費
	 */
	public void setAnnualYearLivingCostList(java.math.BigDecimal[] annualYearLivingCostList) {
		this.annualYearLivingCostList = annualYearLivingCostList;
	}

	/**
	 * 　住宅費を取得します。
	 * @return 　住宅費
	 */
	public java.math.BigDecimal[] getAnnualYearHouseList() {
		return annualYearHouseList;
	}
	
	/**
	 * 　住宅費を設定します。
	 * @param annualYearHouseList 　住宅費
	 */
	public void setAnnualYearHouseList(java.math.BigDecimal[] annualYearHouseList) {
		this.annualYearHouseList = annualYearHouseList;
	}

	/**
	 * 　趣味イベントを取得します。
	 * @return 　趣味イベント
	 */
	public java.math.BigDecimal[] getAnnualYearHobbyList() {
		return annualYearHobbyList;
	}
	
	/**
	 * 　趣味イベントを設定します。
	 * @param annualYearHobbyList 　趣味イベント
	 */
	public void setAnnualYearHobbyList(java.math.BigDecimal[] annualYearHobbyList) {
		this.annualYearHobbyList = annualYearHobbyList;
	}

	/**
	 * 　その他必要資金を取得します。
	 * @return 　その他必要資金
	 */
	public java.math.BigDecimal[] getAnnualYearOtherList() {
		return annualYearOtherList;
	}
	
	/**
	 * 　その他必要資金を設定します。
	 * @param annualYearOtherList 　その他必要資金
	 */
	public void setAnnualYearOtherList(java.math.BigDecimal[] annualYearOtherList) {
		this.annualYearOtherList = annualYearOtherList;
	}

	/**
	 * 　総額を取得します。
	 * @return 　総額
	 */
	public java.math.BigDecimal[] getAnnualYearTotalList() {
		return annualYearTotalList;
	}
	
	/**
	 * 　総額を設定します。
	 * @param annualYearTotalList 　総額
	 */
	public void setAnnualYearTotalList(java.math.BigDecimal[] annualYearTotalList) {
		this.annualYearTotalList = annualYearTotalList;
	}

	/**
	 * 配偶者有無を取得します。
	 * @return 配偶者有無
	 */
	public String getDummySpFlg() {
		return dummySpFlg;
	}
	
	/**
	 * 配偶者有無を設定します。
	 * @param dummySpFlg 配偶者有無
	 */
	public void setDummySpFlg(String dummySpFlg) {
		this.dummySpFlg = dummySpFlg;
	}

	/**
	 * 世帯主年齢を取得します。
	 * @return 世帯主年齢
	 */
	public java.math.BigDecimal getDummyHhAge() {
		return dummyHhAge;
	}
	
	/**
	 * 世帯主年齢を設定します。
	 * @param dummyHhAge 世帯主年齢
	 */
	public void setDummyHhAge(java.math.BigDecimal dummyHhAge) {
		this.dummyHhAge = dummyHhAge;
	}

	/**
	 * 世帯主性別を取得します。
	 * @return 世帯主性別
	 */
	public java.math.BigDecimal getDummyHhSex() {
		return dummyHhSex;
	}
	
	/**
	 * 世帯主性別を設定します。
	 * @param dummyHhSex 世帯主性別
	 */
	public void setDummyHhSex(java.math.BigDecimal dummyHhSex) {
		this.dummyHhSex = dummyHhSex;
	}

	/**
	 * 世帯主生年月日を取得します。
	 * @return 世帯主生年月日
	 */
	public java.math.BigDecimal getDummyHhBirth() {
		return dummyHhBirth;
	}
	
	/**
	 * 世帯主生年月日を設定します。
	 * @param dummyHhBirth 世帯主生年月日
	 */
	public void setDummyHhBirth(java.math.BigDecimal dummyHhBirth) {
		this.dummyHhBirth = dummyHhBirth;
	}

	/**
	 * 世帯主年金種別を取得します。
	 * @return 世帯主年金種別
	 */
	public java.math.BigDecimal getDummyHhPensionType() {
		return dummyHhPensionType;
	}
	
	/**
	 * 世帯主年金種別を設定します。
	 * @param dummyHhPensionType 世帯主年金種別
	 */
	public void setDummyHhPensionType(java.math.BigDecimal dummyHhPensionType) {
		this.dummyHhPensionType = dummyHhPensionType;
	}

	/**
	 * 世帯主退職予定年齢を取得します。
	 * @return 世帯主退職予定年齢
	 */
	public java.math.BigDecimal getDummyHhRetirementAge() {
		return dummyHhRetirementAge;
	}
	
	/**
	 * 世帯主退職予定年齢を設定します。
	 * @param dummyHhRetirementAge 世帯主退職予定年齢
	 */
	public void setDummyHhRetirementAge(java.math.BigDecimal dummyHhRetirementAge) {
		this.dummyHhRetirementAge = dummyHhRetirementAge;
	}

	/**
	 * 世帯主仕事開始年月を取得します。
	 * @return 世帯主仕事開始年月
	 */
	public java.math.BigDecimal getDummyHhJobStartYM() {
		return dummyHhJobStartYM;
	}
	
	/**
	 * 世帯主仕事開始年月を設定します。
	 * @param dummyHhJobStartYM 世帯主仕事開始年月
	 */
	public void setDummyHhJobStartYM(java.math.BigDecimal dummyHhJobStartYM) {
		this.dummyHhJobStartYM = dummyHhJobStartYM;
	}

	/**
	 * 世帯主仕事終了年月を取得します。
	 * @return 世帯主仕事終了年月
	 */
	public java.math.BigDecimal getDummyHhJobEndYM() {
		return dummyHhJobEndYM;
	}
	
	/**
	 * 世帯主仕事終了年月を設定します。
	 * @param dummyHhJobEndYM 世帯主仕事終了年月
	 */
	public void setDummyHhJobEndYM(java.math.BigDecimal dummyHhJobEndYM) {
		this.dummyHhJobEndYM = dummyHhJobEndYM;
	}

	/**
	 * 世帯主年収を取得します。
	 * @return 世帯主年収
	 */
	public java.math.BigDecimal getDummyHhIncome() {
		return dummyHhIncome;
	}
	
	/**
	 * 世帯主年収を設定します。
	 * @param dummyHhIncome 世帯主年収
	 */
	public void setDummyHhIncome(java.math.BigDecimal dummyHhIncome) {
		this.dummyHhIncome = dummyHhIncome;
	}

	/**
	 * 世帯主平均寿命を取得します。
	 * @return 世帯主平均寿命
	 */
	public java.math.BigDecimal getDummyHhAverageLengthOfLife() {
		return dummyHhAverageLengthOfLife;
	}
	
	/**
	 * 世帯主平均寿命を設定します。
	 * @param dummyHhAverageLengthOfLife 世帯主平均寿命
	 */
	public void setDummyHhAverageLengthOfLife(java.math.BigDecimal dummyHhAverageLengthOfLife) {
		this.dummyHhAverageLengthOfLife = dummyHhAverageLengthOfLife;
	}

	/**
	 * 配偶者年齢を取得します。
	 * @return 配偶者年齢
	 */
	public java.math.BigDecimal getDummySpAge() {
		return dummySpAge;
	}
	
	/**
	 * 配偶者年齢を設定します。
	 * @param dummySpAge 配偶者年齢
	 */
	public void setDummySpAge(java.math.BigDecimal dummySpAge) {
		this.dummySpAge = dummySpAge;
	}

	/**
	 * 配偶者性別を取得します。
	 * @return 配偶者性別
	 */
	public java.math.BigDecimal getDummySpSex() {
		return dummySpSex;
	}
	
	/**
	 * 配偶者性別を設定します。
	 * @param dummySpSex 配偶者性別
	 */
	public void setDummySpSex(java.math.BigDecimal dummySpSex) {
		this.dummySpSex = dummySpSex;
	}

	/**
	 * 配偶者生年月日を取得します。
	 * @return 配偶者生年月日
	 */
	public java.math.BigDecimal getDummySpBirth() {
		return dummySpBirth;
	}
	
	/**
	 * 配偶者生年月日を設定します。
	 * @param dummySpBirth 配偶者生年月日
	 */
	public void setDummySpBirth(java.math.BigDecimal dummySpBirth) {
		this.dummySpBirth = dummySpBirth;
	}

	/**
	 * 配偶者年金種別を取得します。
	 * @return 配偶者年金種別
	 */
	public java.math.BigDecimal getDummySpPensionType() {
		return dummySpPensionType;
	}
	
	/**
	 * 配偶者年金種別を設定します。
	 * @param dummySpPensionType 配偶者年金種別
	 */
	public void setDummySpPensionType(java.math.BigDecimal dummySpPensionType) {
		this.dummySpPensionType = dummySpPensionType;
	}

	/**
	 * 配偶者退職予定年齢を取得します。
	 * @return 配偶者退職予定年齢
	 */
	public java.math.BigDecimal getDummySpRetirementAge() {
		return dummySpRetirementAge;
	}
	
	/**
	 * 配偶者退職予定年齢を設定します。
	 * @param dummySpRetirementAge 配偶者退職予定年齢
	 */
	public void setDummySpRetirementAge(java.math.BigDecimal dummySpRetirementAge) {
		this.dummySpRetirementAge = dummySpRetirementAge;
	}

	/**
	 * 配偶者仕事開始年月を取得します。
	 * @return 配偶者仕事開始年月
	 */
	public java.math.BigDecimal getDummySpJobStartYM() {
		return dummySpJobStartYM;
	}
	
	/**
	 * 配偶者仕事開始年月を設定します。
	 * @param dummySpJobStartYM 配偶者仕事開始年月
	 */
	public void setDummySpJobStartYM(java.math.BigDecimal dummySpJobStartYM) {
		this.dummySpJobStartYM = dummySpJobStartYM;
	}

	/**
	 * 配偶者仕事終了年月を取得します。
	 * @return 配偶者仕事終了年月
	 */
	public java.math.BigDecimal getDummySpJobEndYM() {
		return dummySpJobEndYM;
	}
	
	/**
	 * 配偶者仕事終了年月を設定します。
	 * @param dummySpJobEndYM 配偶者仕事終了年月
	 */
	public void setDummySpJobEndYM(java.math.BigDecimal dummySpJobEndYM) {
		this.dummySpJobEndYM = dummySpJobEndYM;
	}

	/**
	 * 配偶者年収を取得します。
	 * @return 配偶者年収
	 */
	public java.math.BigDecimal getDummySpIncome() {
		return dummySpIncome;
	}
	
	/**
	 * 配偶者年収を設定します。
	 * @param dummySpIncome 配偶者年収
	 */
	public void setDummySpIncome(java.math.BigDecimal dummySpIncome) {
		this.dummySpIncome = dummySpIncome;
	}

	/**
	 * 配偶者平均寿命を取得します。
	 * @return 配偶者平均寿命
	 */
	public java.math.BigDecimal getDummySpAverageLengthOfLife() {
		return dummySpAverageLengthOfLife;
	}
	
	/**
	 * 配偶者平均寿命を設定します。
	 * @param dummySpAverageLengthOfLife 配偶者平均寿命
	 */
	public void setDummySpAverageLengthOfLife(java.math.BigDecimal dummySpAverageLengthOfLife) {
		this.dummySpAverageLengthOfLife = dummySpAverageLengthOfLife;
	}

	/**
	 * セカンドライフ開始年齢を取得します。
	 * @return セカンドライフ開始年齢
	 */
	public java.math.BigDecimal getDummySecondLifeFromAge() {
		return dummySecondLifeFromAge;
	}
	
	/**
	 * セカンドライフ開始年齢を設定します。
	 * @param dummySecondLifeFromAge セカンドライフ開始年齢
	 */
	public void setDummySecondLifeFromAge(java.math.BigDecimal dummySecondLifeFromAge) {
		this.dummySecondLifeFromAge = dummySecondLifeFromAge;
	}

	/**
	 * セカンドライフ終了年齢を取得します。
	 * @return セカンドライフ終了年齢
	 */
	public java.math.BigDecimal getDummySecondLifeToAge() {
		return dummySecondLifeToAge;
	}
	
	/**
	 * セカンドライフ終了年齢を設定します。
	 * @param dummySecondLifeToAge セカンドライフ終了年齢
	 */
	public void setDummySecondLifeToAge(java.math.BigDecimal dummySecondLifeToAge) {
		this.dummySecondLifeToAge = dummySecondLifeToAge;
	}
}	

