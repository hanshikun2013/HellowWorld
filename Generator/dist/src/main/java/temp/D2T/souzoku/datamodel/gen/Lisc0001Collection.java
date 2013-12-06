package temp.D2T.souzoku.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lisc0001Collection
{
    /**
     * 配偶者有無
     */
 	@JsonProperty("maritalStatus")
	private String maritalStatus;   
    /**
     * 法定相続人設定
     */
 	@JsonProperty("settingOfHeir")
	private String settingOfHeir;   
    /**
     * 相続人数
     */
 	@JsonProperty("heirNumber")
	private String heirNumber;   

	/**
	 * 配偶者有無を取得します。
	 * @return 配偶者有無
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	
	/**
	 * 配偶者有無を設定します。
	 * @param maritalStatus 配偶者有無
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	 * 法定相続人設定を取得します。
	 * @return 法定相続人設定
	 */
	public String getSettingOfHeir() {
		return settingOfHeir;
	}
	
	/**
	 * 法定相続人設定を設定します。
	 * @param settingOfHeir 法定相続人設定
	 */
	public void setSettingOfHeir(String settingOfHeir) {
		this.settingOfHeir = settingOfHeir;
	}

	/**
	 * 相続人数を取得します。
	 * @return 相続人数
	 */
	public String getHeirNumber() {
		return heirNumber;
	}
	
	/**
	 * 相続人数を設定します。
	 * @param heirNumber 相続人数
	 */
	public void setHeirNumber(String heirNumber) {
		this.heirNumber = heirNumber;
	}
}	

