package temp.d2t.secondlife.datamodel.gen;

import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lrsc030501Collection
{
    /**
     * 入力方法
     */
 	@JsonProperty("inputMethod")
	private String inputMethod;   
    /**
     * 世帯主配偶者識別フラグ
     */
 	@JsonProperty("personSpouseFlg")
	private String personSpouseFlg;   

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
	 * 世帯主配偶者識別フラグを取得します。
	 * @return 世帯主配偶者識別フラグ
	 */
	public String getPersonSpouseFlg() {
		return personSpouseFlg;
	}
	
	/**
	 * 世帯主配偶者識別フラグを設定します。
	 * @param personSpouseFlg 世帯主配偶者識別フラグ
	 */
	public void setPersonSpouseFlg(String personSpouseFlg) {
		this.personSpouseFlg = personSpouseFlg;
	}
}	

