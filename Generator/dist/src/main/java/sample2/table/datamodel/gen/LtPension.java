package sample2.table.datamodel.gen;
//template:dataModel.vm
import org.codehaus.jackson.annotate.JsonProperty;

public class 	LtPension
{
    /**
     * id
     */
 	@JsonProperty("id")
	private String id;   
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
     * 行番号
     */
 	@JsonProperty("rowNo")
	private String rowNo;   
    /**
     * 収入
     */
 	@JsonProperty("income")
	private String income;   
    /**
     * 年金タイプ
     */
 	@JsonProperty("pensionType")
	private String pensionType;   
    /**
     * 開始年月
     */
 	@JsonProperty("jobStart")
	private String jobStart;   
    /**
     * 終了年月
     */
 	@JsonProperty("jobEnd")
	private String jobEnd;   
    /**
     * 開始年齢
     */
 	@JsonProperty("jobStartAge")
	private String jobStartAge;   
    /**
     * 終了年齢
     */
 	@JsonProperty("jobEndAge")
	private String jobEndAge;   
    /**
     * 加入月数
     */
 	@JsonProperty("entryMonth")
	private String entryMonth;   
    /**
     * 年金名称
     */
 	@JsonProperty("pensionName")
	private String pensionName;   

	/**
	 * idを取得します。
	 * @return id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(String id) {
		this.id = id;
	}

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
	 * 行番号を取得します。
	 * @return 行番号
	 */
	public String getRowNo() {
		return rowNo;
	}
	
	/**
	 * 行番号を設定します。
	 * @param rowNo 行番号
	 */
	public void setRowNo(String rowNo) {
		this.rowNo = rowNo;
	}

	/**
	 * 収入を取得します。
	 * @return 収入
	 */
	public String getIncome() {
		return income;
	}
	
	/**
	 * 収入を設定します。
	 * @param income 収入
	 */
	public void setIncome(String income) {
		this.income = income;
	}

	/**
	 * 年金タイプを取得します。
	 * @return 年金タイプ
	 */
	public String getPensionType() {
		return pensionType;
	}
	
	/**
	 * 年金タイプを設定します。
	 * @param pensionType 年金タイプ
	 */
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}

	/**
	 * 開始年月を取得します。
	 * @return 開始年月
	 */
	public String getJobStart() {
		return jobStart;
	}
	
	/**
	 * 開始年月を設定します。
	 * @param jobStart 開始年月
	 */
	public void setJobStart(String jobStart) {
		this.jobStart = jobStart;
	}

	/**
	 * 終了年月を取得します。
	 * @return 終了年月
	 */
	public String getJobEnd() {
		return jobEnd;
	}
	
	/**
	 * 終了年月を設定します。
	 * @param jobEnd 終了年月
	 */
	public void setJobEnd(String jobEnd) {
		this.jobEnd = jobEnd;
	}

	/**
	 * 開始年齢を取得します。
	 * @return 開始年齢
	 */
	public String getJobStartAge() {
		return jobStartAge;
	}
	
	/**
	 * 開始年齢を設定します。
	 * @param jobStartAge 開始年齢
	 */
	public void setJobStartAge(String jobStartAge) {
		this.jobStartAge = jobStartAge;
	}

	/**
	 * 終了年齢を取得します。
	 * @return 終了年齢
	 */
	public String getJobEndAge() {
		return jobEndAge;
	}
	
	/**
	 * 終了年齢を設定します。
	 * @param jobEndAge 終了年齢
	 */
	public void setJobEndAge(String jobEndAge) {
		this.jobEndAge = jobEndAge;
	}

	/**
	 * 加入月数を取得します。
	 * @return 加入月数
	 */
	public String getEntryMonth() {
		return entryMonth;
	}
	
	/**
	 * 加入月数を設定します。
	 * @param entryMonth 加入月数
	 */
	public void setEntryMonth(String entryMonth) {
		this.entryMonth = entryMonth;
	}

	/**
	 * 年金名称を取得します。
	 * @return 年金名称
	 */
	public String getPensionName() {
		return pensionName;
	}
	
	/**
	 * 年金名称を設定します。
	 * @param pensionName 年金名称
	 */
	public void setPensionName(String pensionName) {
		this.pensionName = pensionName;
	}
}	

