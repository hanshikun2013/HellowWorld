package sample2.table.datamodel.gen;
//template:dataModel.vm
import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lbsc0004
{
    /**
     * id
     */
 	@JsonProperty("id")
	private String id;   
    /**
     * 勤続年数
     */
 	@JsonProperty("workPeriod")
	private String workPeriod;   
    /**
     * 退職所得控除額
     */
 	@JsonProperty("allowedRetirementIncomeDeduction")
	private String allowedRetirementIncomeDeduction;   
    /**
     * 1/2実施有無
     */
 	@JsonProperty("halfTaxbleIncome")
	private String halfTaxbleIncome;   
    /**
     * 退職慰労金として受け取った場合の課税所得額
     */
 	@JsonProperty("retirementAssessableIncome")
	private String retirementAssessableIncome;   
    /**
     * 税率
     */
 	@JsonProperty("taxRates")
	private String taxRates;   
    /**
     * 控除額
     */
 	@JsonProperty("amountDeducted")
	private String amountDeducted;   
    /**
     * 退職慰労金として受け取った場合の所得税・住民税額
     */
 	@JsonProperty("retirementIncomeAndResidentTax")
	private String retirementIncomeAndResidentTax;   
    /**
     * 退職慰労金手取額
     */
 	@JsonProperty("retirementNetIncome")
	private String retirementNetIncome;   
    /**
     * 給与所得控除額
     */
 	@JsonProperty("employmentIncomeDeduction")
	private String employmentIncomeDeduction;   
    /**
     * 役員報酬として受け取った場合の課税所得額
     */
 	@JsonProperty("officerAssessableIncome")
	private String officerAssessableIncome;   
    /**
     * 役員報酬として受け取った場合の所得税・住民税額
     */
 	@JsonProperty("officerIncomeAndResidentTax")
	private String officerIncomeAndResidentTax;   
    /**
     * 役員報酬手取額
     */
 	@JsonProperty("officerNetIncome")
	private String officerNetIncome;   
    /**
     * 手取差額
     */
 	@JsonProperty("totalNetIncome")
	private String totalNetIncome;   

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
	 * 勤続年数を取得します。
	 * @return 勤続年数
	 */
	public String getWorkPeriod() {
		return workPeriod;
	}
	
	/**
	 * 勤続年数を設定します。
	 * @param workPeriod 勤続年数
	 */
	public void setWorkPeriod(String workPeriod) {
		this.workPeriod = workPeriod;
	}

	/**
	 * 退職所得控除額を取得します。
	 * @return 退職所得控除額
	 */
	public String getAllowedRetirementIncomeDeduction() {
		return allowedRetirementIncomeDeduction;
	}
	
	/**
	 * 退職所得控除額を設定します。
	 * @param allowedRetirementIncomeDeduction 退職所得控除額
	 */
	public void setAllowedRetirementIncomeDeduction(String allowedRetirementIncomeDeduction) {
		this.allowedRetirementIncomeDeduction = allowedRetirementIncomeDeduction;
	}

	/**
	 * 1/2実施有無を取得します。
	 * @return 1/2実施有無
	 */
	public String getHalfTaxbleIncome() {
		return halfTaxbleIncome;
	}
	
	/**
	 * 1/2実施有無を設定します。
	 * @param halfTaxbleIncome 1/2実施有無
	 */
	public void setHalfTaxbleIncome(String halfTaxbleIncome) {
		this.halfTaxbleIncome = halfTaxbleIncome;
	}

	/**
	 * 退職慰労金として受け取った場合の課税所得額を取得します。
	 * @return 退職慰労金として受け取った場合の課税所得額
	 */
	public String getRetirementAssessableIncome() {
		return retirementAssessableIncome;
	}
	
	/**
	 * 退職慰労金として受け取った場合の課税所得額を設定します。
	 * @param retirementAssessableIncome 退職慰労金として受け取った場合の課税所得額
	 */
	public void setRetirementAssessableIncome(String retirementAssessableIncome) {
		this.retirementAssessableIncome = retirementAssessableIncome;
	}

	/**
	 * 税率を取得します。
	 * @return 税率
	 */
	public String getTaxRates() {
		return taxRates;
	}
	
	/**
	 * 税率を設定します。
	 * @param taxRates 税率
	 */
	public void setTaxRates(String taxRates) {
		this.taxRates = taxRates;
	}

	/**
	 * 控除額を取得します。
	 * @return 控除額
	 */
	public String getAmountDeducted() {
		return amountDeducted;
	}
	
	/**
	 * 控除額を設定します。
	 * @param amountDeducted 控除額
	 */
	public void setAmountDeducted(String amountDeducted) {
		this.amountDeducted = amountDeducted;
	}

	/**
	 * 退職慰労金として受け取った場合の所得税・住民税額を取得します。
	 * @return 退職慰労金として受け取った場合の所得税・住民税額
	 */
	public String getRetirementIncomeAndResidentTax() {
		return retirementIncomeAndResidentTax;
	}
	
	/**
	 * 退職慰労金として受け取った場合の所得税・住民税額を設定します。
	 * @param retirementIncomeAndResidentTax 退職慰労金として受け取った場合の所得税・住民税額
	 */
	public void setRetirementIncomeAndResidentTax(String retirementIncomeAndResidentTax) {
		this.retirementIncomeAndResidentTax = retirementIncomeAndResidentTax;
	}

	/**
	 * 退職慰労金手取額を取得します。
	 * @return 退職慰労金手取額
	 */
	public String getRetirementNetIncome() {
		return retirementNetIncome;
	}
	
	/**
	 * 退職慰労金手取額を設定します。
	 * @param retirementNetIncome 退職慰労金手取額
	 */
	public void setRetirementNetIncome(String retirementNetIncome) {
		this.retirementNetIncome = retirementNetIncome;
	}

	/**
	 * 給与所得控除額を取得します。
	 * @return 給与所得控除額
	 */
	public String getEmploymentIncomeDeduction() {
		return employmentIncomeDeduction;
	}
	
	/**
	 * 給与所得控除額を設定します。
	 * @param employmentIncomeDeduction 給与所得控除額
	 */
	public void setEmploymentIncomeDeduction(String employmentIncomeDeduction) {
		this.employmentIncomeDeduction = employmentIncomeDeduction;
	}

	/**
	 * 役員報酬として受け取った場合の課税所得額を取得します。
	 * @return 役員報酬として受け取った場合の課税所得額
	 */
	public String getOfficerAssessableIncome() {
		return officerAssessableIncome;
	}
	
	/**
	 * 役員報酬として受け取った場合の課税所得額を設定します。
	 * @param officerAssessableIncome 役員報酬として受け取った場合の課税所得額
	 */
	public void setOfficerAssessableIncome(String officerAssessableIncome) {
		this.officerAssessableIncome = officerAssessableIncome;
	}

	/**
	 * 役員報酬として受け取った場合の所得税・住民税額を取得します。
	 * @return 役員報酬として受け取った場合の所得税・住民税額
	 */
	public String getOfficerIncomeAndResidentTax() {
		return officerIncomeAndResidentTax;
	}
	
	/**
	 * 役員報酬として受け取った場合の所得税・住民税額を設定します。
	 * @param officerIncomeAndResidentTax 役員報酬として受け取った場合の所得税・住民税額
	 */
	public void setOfficerIncomeAndResidentTax(String officerIncomeAndResidentTax) {
		this.officerIncomeAndResidentTax = officerIncomeAndResidentTax;
	}

	/**
	 * 役員報酬手取額を取得します。
	 * @return 役員報酬手取額
	 */
	public String getOfficerNetIncome() {
		return officerNetIncome;
	}
	
	/**
	 * 役員報酬手取額を設定します。
	 * @param officerNetIncome 役員報酬手取額
	 */
	public void setOfficerNetIncome(String officerNetIncome) {
		this.officerNetIncome = officerNetIncome;
	}

	/**
	 * 手取差額を取得します。
	 * @return 手取差額
	 */
	public String getTotalNetIncome() {
		return totalNetIncome;
	}
	
	/**
	 * 手取差額を設定します。
	 * @param totalNetIncome 手取差額
	 */
	public void setTotalNetIncome(String totalNetIncome) {
		this.totalNetIncome = totalNetIncome;
	}
}	

