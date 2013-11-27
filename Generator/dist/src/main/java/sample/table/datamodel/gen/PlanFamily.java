package sample.table.datamodel.gen;
import org.codehaus.jackson.annotate.JsonProperty;

public class 	PlanFamily
{
    /**
     * プランID
     */
 	@JsonProperty("planId")
	private String planId;   
    /**
     * 家族No
     */
 	@JsonProperty("familyNo")
	private String familyNo;   
    /**
     * 名前（漢字）
     */
 	@JsonProperty("kanjiName")
	private String kanjiName;   
    /**
     * 名前（カナ）
     */
 	@JsonProperty("kanaName")
	private String kanaName;   
    /**
     * 生年月日
     */
 	@JsonProperty("dateOfBirth")
	private String dateOfBirth;   
    /**
     * 年齢
     */
 	@JsonProperty("age")
	private String age;   
    /**
     * 生年月日・年齢選択フラグ
     */
 	@JsonProperty("dateAgeFlg")
	private String dateAgeFlg;   
    /**
     * 続柄
     */
 	@JsonProperty("zokugara")
	private String zokugara;   
    /**
     * 性別
     */
 	@JsonProperty("gender")
	private String gender;   
    /**
     * 仕事
     */
 	@JsonProperty("job")
	private String job;   
    /**
     * 年収
     */
 	@JsonProperty("annualIncome")
	private String annualIncome;   
    /**
     * 退職予定年齢
     */
 	@JsonProperty("retirementAge")
	private String retirementAge;   
    /**
     * 平均寿命
     */
 	@JsonProperty("heikinJumyo")
	private String heikinJumyo;   
    /**
     * イメージ画像
     */
 	@JsonProperty("image")
	private String image;   

	/**
	 * プランIDを取得します。
	 * @return プランID
	 */
	public String getPlanId() {
		return planId;
	}
	
	/**
	 * プランIDを設定します。
	 * @param planId プランID
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	/**
	 * 家族Noを取得します。
	 * @return 家族No
	 */
	public String getFamilyNo() {
		return familyNo;
	}
	
	/**
	 * 家族Noを設定します。
	 * @param familyNo 家族No
	 */
	public void setFamilyNo(String familyNo) {
		this.familyNo = familyNo;
	}

	/**
	 * 名前（漢字）を取得します。
	 * @return 名前（漢字）
	 */
	public String getKanjiName() {
		return kanjiName;
	}
	
	/**
	 * 名前（漢字）を設定します。
	 * @param kanjiName 名前（漢字）
	 */
	public void setKanjiName(String kanjiName) {
		this.kanjiName = kanjiName;
	}

	/**
	 * 名前（カナ）を取得します。
	 * @return 名前（カナ）
	 */
	public String getKanaName() {
		return kanaName;
	}
	
	/**
	 * 名前（カナ）を設定します。
	 * @param kanaName 名前（カナ）
	 */
	public void setKanaName(String kanaName) {
		this.kanaName = kanaName;
	}

	/**
	 * 生年月日を取得します。
	 * @return 生年月日
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	/**
	 * 生年月日を設定します。
	 * @param dateOfBirth 生年月日
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * 年齢を取得します。
	 * @return 年齢
	 */
	public String getAge() {
		return age;
	}
	
	/**
	 * 年齢を設定します。
	 * @param age 年齢
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * 生年月日・年齢選択フラグを取得します。
	 * @return 生年月日・年齢選択フラグ
	 */
	public String getDateAgeFlg() {
		return dateAgeFlg;
	}
	
	/**
	 * 生年月日・年齢選択フラグを設定します。
	 * @param dateAgeFlg 生年月日・年齢選択フラグ
	 */
	public void setDateAgeFlg(String dateAgeFlg) {
		this.dateAgeFlg = dateAgeFlg;
	}

	/**
	 * 続柄を取得します。
	 * @return 続柄
	 */
	public String getZokugara() {
		return zokugara;
	}
	
	/**
	 * 続柄を設定します。
	 * @param zokugara 続柄
	 */
	public void setZokugara(String zokugara) {
		this.zokugara = zokugara;
	}

	/**
	 * 性別を取得します。
	 * @return 性別
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * 性別を設定します。
	 * @param gender 性別
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 仕事を取得します。
	 * @return 仕事
	 */
	public String getJob() {
		return job;
	}
	
	/**
	 * 仕事を設定します。
	 * @param job 仕事
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * 年収を取得します。
	 * @return 年収
	 */
	public String getAnnualIncome() {
		return annualIncome;
	}
	
	/**
	 * 年収を設定します。
	 * @param annualIncome 年収
	 */
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	/**
	 * 退職予定年齢を取得します。
	 * @return 退職予定年齢
	 */
	public String getRetirementAge() {
		return retirementAge;
	}
	
	/**
	 * 退職予定年齢を設定します。
	 * @param retirementAge 退職予定年齢
	 */
	public void setRetirementAge(String retirementAge) {
		this.retirementAge = retirementAge;
	}

	/**
	 * 平均寿命を取得します。
	 * @return 平均寿命
	 */
	public String getHeikinJumyo() {
		return heikinJumyo;
	}
	
	/**
	 * 平均寿命を設定します。
	 * @param heikinJumyo 平均寿命
	 */
	public void setHeikinJumyo(String heikinJumyo) {
		this.heikinJumyo = heikinJumyo;
	}

	/**
	 * イメージ画像を取得します。
	 * @return イメージ画像
	 */
	public String getImage() {
		return image;
	}
	
	/**
	 * イメージ画像を設定します。
	 * @param image イメージ画像
	 */
	public void setImage(String image) {
		this.image = image;
	}
}	

