package sample.table.datamodel.gen;
import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lbsc0008
{
    /**
     * 業種　（業種コード）
     */
 	@JsonProperty("gyoshu")
	private String gyoshu;   
    /**
     * 従業員数（人）
     */
 	@JsonProperty("jugyoinsu")
	private String jugyoinsu;   
    /**
     * 現在の売上高
     */
 	@JsonProperty("uriagedakaCurrent")
	private String uriagedakaCurrent;   
    /**
     * 売上高予想の1年後(％)
     */
 	@JsonProperty("uriagedakayosoOneYearLater")
	private String uriagedakayosoOneYearLater;   
    /**
     * 売上高予想の2年後(％)
     */
 	@JsonProperty("uriagedakayosoTwoYearLater")
	private String uriagedakayosoTwoYearLater;   
    /**
     * 売上高予想の3年後(％)
     */
 	@JsonProperty("uriagedakayosoThreeYearLater")
	private String uriagedakayosoThreeYearLater;   

	/**
	 * 業種　（業種コード）を取得します。
	 * @return 業種　（業種コード）
	 */
	public String getGyoshu() {
		return gyoshu;
	}
	
	/**
	 * 業種　（業種コード）を設定します。
	 * @param gyoshu 業種　（業種コード）
	 */
	public void setGyoshu(String gyoshu) {
		this.gyoshu = gyoshu;
	}

	/**
	 * 従業員数（人）を取得します。
	 * @return 従業員数（人）
	 */
	public String getJugyoinsu() {
		return jugyoinsu;
	}
	
	/**
	 * 従業員数（人）を設定します。
	 * @param jugyoinsu 従業員数（人）
	 */
	public void setJugyoinsu(String jugyoinsu) {
		this.jugyoinsu = jugyoinsu;
	}

	/**
	 * 現在の売上高を取得します。
	 * @return 現在の売上高
	 */
	public String getUriagedakaCurrent() {
		return uriagedakaCurrent;
	}
	
	/**
	 * 現在の売上高を設定します。
	 * @param uriagedakaCurrent 現在の売上高
	 */
	public void setUriagedakaCurrent(String uriagedakaCurrent) {
		this.uriagedakaCurrent = uriagedakaCurrent;
	}

	/**
	 * 売上高予想の1年後(％)を取得します。
	 * @return 売上高予想の1年後(％)
	 */
	public String getUriagedakayosoOneYearLater() {
		return uriagedakayosoOneYearLater;
	}
	
	/**
	 * 売上高予想の1年後(％)を設定します。
	 * @param uriagedakayosoOneYearLater 売上高予想の1年後(％)
	 */
	public void setUriagedakayosoOneYearLater(String uriagedakayosoOneYearLater) {
		this.uriagedakayosoOneYearLater = uriagedakayosoOneYearLater;
	}

	/**
	 * 売上高予想の2年後(％)を取得します。
	 * @return 売上高予想の2年後(％)
	 */
	public String getUriagedakayosoTwoYearLater() {
		return uriagedakayosoTwoYearLater;
	}
	
	/**
	 * 売上高予想の2年後(％)を設定します。
	 * @param uriagedakayosoTwoYearLater 売上高予想の2年後(％)
	 */
	public void setUriagedakayosoTwoYearLater(String uriagedakayosoTwoYearLater) {
		this.uriagedakayosoTwoYearLater = uriagedakayosoTwoYearLater;
	}

	/**
	 * 売上高予想の3年後(％)を取得します。
	 * @return 売上高予想の3年後(％)
	 */
	public String getUriagedakayosoThreeYearLater() {
		return uriagedakayosoThreeYearLater;
	}
	
	/**
	 * 売上高予想の3年後(％)を設定します。
	 * @param uriagedakayosoThreeYearLater 売上高予想の3年後(％)
	 */
	public void setUriagedakayosoThreeYearLater(String uriagedakayosoThreeYearLater) {
		this.uriagedakayosoThreeYearLater = uriagedakayosoThreeYearLater;
	}
}	

