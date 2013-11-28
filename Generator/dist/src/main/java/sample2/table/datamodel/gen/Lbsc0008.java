package sample2.table.datamodel.gen;
//template:dataModel.vm
import org.codehaus.jackson.annotate.JsonProperty;

public class 	Lbsc0008
{
    /**
     * id
     */
 	@JsonProperty("id")
	private String id;   
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
     * 業種コード
     */
 	@JsonProperty("gyoshu")
	private String gyoshu;   
    /**
     * 従業員数（人）
     */
 	@JsonProperty("jugyoinsu")
	private String jugyoinsu;   
    /**
     * 業種名
     */
 	@JsonProperty("gyoshuName")
	private String gyoshuName;   
    /**
     * 経営立直し資金
     */
 	@JsonProperty("keieiTatenaosiSikin")
	private String keieiTatenaosiSikin;   
    /**
     * 経営立直し資金の(b)減価償却額
     */
 	@JsonProperty("genkashokyakuhiTotal")
	private String genkashokyakuhiTotal;   
    /**
     * 経営立直し資金の(a)経常利益
     */
 	@JsonProperty("kejoriekiTotal")
	private String kejoriekiTotal;   
    /**
     * 現状の変動費
     */
 	@JsonProperty("hendohiCurrent")
	private String hendohiCurrent;   
    /**
     * 現状の固定費
     */
 	@JsonProperty("koteihiCurrent")
	private String koteihiCurrent;   
    /**
     * 現状の固定費のうち減価償却費
     */
 	@JsonProperty("genkashokyakuhiCurrent")
	private String genkashokyakuhiCurrent;   
    /**
     * 現状の経常利益
     */
 	@JsonProperty("keijoriekiCurrent")
	private String keijoriekiCurrent;   
    /**
     * 万一後の1年後の売上高
     */
 	@JsonProperty("uriagedakaOneYearLater")
	private String uriagedakaOneYearLater;   
    /**
     * 万一後の1年後の変動費
     */
 	@JsonProperty("hendohiOneYearLater")
	private String hendohiOneYearLater;   
    /**
     * 万一後の1年後の固定費
     */
 	@JsonProperty("koteihiOneYearLater")
	private String koteihiOneYearLater;   
    /**
     * 万一後の1年後の固定費のうち減価償却費
     */
 	@JsonProperty("genkashokyakuhiOneYearLater")
	private String genkashokyakuhiOneYearLater;   
    /**
     * 万一後の1年後の経常利益
     */
 	@JsonProperty("keijoriekiOneYearLater")
	private String keijoriekiOneYearLater;   
    /**
     * 万一後の2年後の売上高
     */
 	@JsonProperty("uriagedakaTwoYearLater")
	private String uriagedakaTwoYearLater;   
    /**
     * 万一後の2年後の変動費
     */
 	@JsonProperty("hendohiTwoYearLater")
	private String hendohiTwoYearLater;   
    /**
     * 万一後の2年後の固定費
     */
 	@JsonProperty("koteihiTwoYearLater")
	private String koteihiTwoYearLater;   
    /**
     * 万一後の2年後の固定費のうち減価償却費
     */
 	@JsonProperty("genkashokyakuhiTwoYearLater")
	private String genkashokyakuhiTwoYearLater;   
    /**
     * 万一後の2年後の経常利益
     */
 	@JsonProperty("keijoriekiTwoYearLater")
	private String keijoriekiTwoYearLater;   
    /**
     * 万一後の3年後の売上高
     */
 	@JsonProperty("uriagedakaThreeYearLater")
	private String uriagedakaThreeYearLater;   
    /**
     * 万一後の3年後の変動費
     */
 	@JsonProperty("hendohiThreeYearLater")
	private String hendohiThreeYearLater;   
    /**
     * 万一後の3年後の固定費
     */
 	@JsonProperty("koteihiThreeYearLater")
	private String koteihiThreeYearLater;   
    /**
     * 万一後の3年後の固定費のうち減価償却費
     */
 	@JsonProperty("genkashokyakuhiThreeYearLater")
	private String genkashokyakuhiThreeYearLater;   
    /**
     * 万一後の3年後の経常利益
     */
 	@JsonProperty("keijoriekiThreeYearLater")
	private String keijoriekiThreeYearLater;   

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

	/**
	 * 業種コードを取得します。
	 * @return 業種コード
	 */
	public String getGyoshu() {
		return gyoshu;
	}
	
	/**
	 * 業種コードを設定します。
	 * @param gyoshu 業種コード
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
	 * 業種名を取得します。
	 * @return 業種名
	 */
	public String getGyoshuName() {
		return gyoshuName;
	}
	
	/**
	 * 業種名を設定します。
	 * @param gyoshuName 業種名
	 */
	public void setGyoshuName(String gyoshuName) {
		this.gyoshuName = gyoshuName;
	}

	/**
	 * 経営立直し資金を取得します。
	 * @return 経営立直し資金
	 */
	public String getKeieiTatenaosiSikin() {
		return keieiTatenaosiSikin;
	}
	
	/**
	 * 経営立直し資金を設定します。
	 * @param keieiTatenaosiSikin 経営立直し資金
	 */
	public void setKeieiTatenaosiSikin(String keieiTatenaosiSikin) {
		this.keieiTatenaosiSikin = keieiTatenaosiSikin;
	}

	/**
	 * 経営立直し資金の(b)減価償却額を取得します。
	 * @return 経営立直し資金の(b)減価償却額
	 */
	public String getGenkashokyakuhiTotal() {
		return genkashokyakuhiTotal;
	}
	
	/**
	 * 経営立直し資金の(b)減価償却額を設定します。
	 * @param genkashokyakuhiTotal 経営立直し資金の(b)減価償却額
	 */
	public void setGenkashokyakuhiTotal(String genkashokyakuhiTotal) {
		this.genkashokyakuhiTotal = genkashokyakuhiTotal;
	}

	/**
	 * 経営立直し資金の(a)経常利益を取得します。
	 * @return 経営立直し資金の(a)経常利益
	 */
	public String getKejoriekiTotal() {
		return kejoriekiTotal;
	}
	
	/**
	 * 経営立直し資金の(a)経常利益を設定します。
	 * @param kejoriekiTotal 経営立直し資金の(a)経常利益
	 */
	public void setKejoriekiTotal(String kejoriekiTotal) {
		this.kejoriekiTotal = kejoriekiTotal;
	}

	/**
	 * 現状の変動費を取得します。
	 * @return 現状の変動費
	 */
	public String getHendohiCurrent() {
		return hendohiCurrent;
	}
	
	/**
	 * 現状の変動費を設定します。
	 * @param hendohiCurrent 現状の変動費
	 */
	public void setHendohiCurrent(String hendohiCurrent) {
		this.hendohiCurrent = hendohiCurrent;
	}

	/**
	 * 現状の固定費を取得します。
	 * @return 現状の固定費
	 */
	public String getKoteihiCurrent() {
		return koteihiCurrent;
	}
	
	/**
	 * 現状の固定費を設定します。
	 * @param koteihiCurrent 現状の固定費
	 */
	public void setKoteihiCurrent(String koteihiCurrent) {
		this.koteihiCurrent = koteihiCurrent;
	}

	/**
	 * 現状の固定費のうち減価償却費を取得します。
	 * @return 現状の固定費のうち減価償却費
	 */
	public String getGenkashokyakuhiCurrent() {
		return genkashokyakuhiCurrent;
	}
	
	/**
	 * 現状の固定費のうち減価償却費を設定します。
	 * @param genkashokyakuhiCurrent 現状の固定費のうち減価償却費
	 */
	public void setGenkashokyakuhiCurrent(String genkashokyakuhiCurrent) {
		this.genkashokyakuhiCurrent = genkashokyakuhiCurrent;
	}

	/**
	 * 現状の経常利益を取得します。
	 * @return 現状の経常利益
	 */
	public String getKeijoriekiCurrent() {
		return keijoriekiCurrent;
	}
	
	/**
	 * 現状の経常利益を設定します。
	 * @param keijoriekiCurrent 現状の経常利益
	 */
	public void setKeijoriekiCurrent(String keijoriekiCurrent) {
		this.keijoriekiCurrent = keijoriekiCurrent;
	}

	/**
	 * 万一後の1年後の売上高を取得します。
	 * @return 万一後の1年後の売上高
	 */
	public String getUriagedakaOneYearLater() {
		return uriagedakaOneYearLater;
	}
	
	/**
	 * 万一後の1年後の売上高を設定します。
	 * @param uriagedakaOneYearLater 万一後の1年後の売上高
	 */
	public void setUriagedakaOneYearLater(String uriagedakaOneYearLater) {
		this.uriagedakaOneYearLater = uriagedakaOneYearLater;
	}

	/**
	 * 万一後の1年後の変動費を取得します。
	 * @return 万一後の1年後の変動費
	 */
	public String getHendohiOneYearLater() {
		return hendohiOneYearLater;
	}
	
	/**
	 * 万一後の1年後の変動費を設定します。
	 * @param hendohiOneYearLater 万一後の1年後の変動費
	 */
	public void setHendohiOneYearLater(String hendohiOneYearLater) {
		this.hendohiOneYearLater = hendohiOneYearLater;
	}

	/**
	 * 万一後の1年後の固定費を取得します。
	 * @return 万一後の1年後の固定費
	 */
	public String getKoteihiOneYearLater() {
		return koteihiOneYearLater;
	}
	
	/**
	 * 万一後の1年後の固定費を設定します。
	 * @param koteihiOneYearLater 万一後の1年後の固定費
	 */
	public void setKoteihiOneYearLater(String koteihiOneYearLater) {
		this.koteihiOneYearLater = koteihiOneYearLater;
	}

	/**
	 * 万一後の1年後の固定費のうち減価償却費を取得します。
	 * @return 万一後の1年後の固定費のうち減価償却費
	 */
	public String getGenkashokyakuhiOneYearLater() {
		return genkashokyakuhiOneYearLater;
	}
	
	/**
	 * 万一後の1年後の固定費のうち減価償却費を設定します。
	 * @param genkashokyakuhiOneYearLater 万一後の1年後の固定費のうち減価償却費
	 */
	public void setGenkashokyakuhiOneYearLater(String genkashokyakuhiOneYearLater) {
		this.genkashokyakuhiOneYearLater = genkashokyakuhiOneYearLater;
	}

	/**
	 * 万一後の1年後の経常利益を取得します。
	 * @return 万一後の1年後の経常利益
	 */
	public String getKeijoriekiOneYearLater() {
		return keijoriekiOneYearLater;
	}
	
	/**
	 * 万一後の1年後の経常利益を設定します。
	 * @param keijoriekiOneYearLater 万一後の1年後の経常利益
	 */
	public void setKeijoriekiOneYearLater(String keijoriekiOneYearLater) {
		this.keijoriekiOneYearLater = keijoriekiOneYearLater;
	}

	/**
	 * 万一後の2年後の売上高を取得します。
	 * @return 万一後の2年後の売上高
	 */
	public String getUriagedakaTwoYearLater() {
		return uriagedakaTwoYearLater;
	}
	
	/**
	 * 万一後の2年後の売上高を設定します。
	 * @param uriagedakaTwoYearLater 万一後の2年後の売上高
	 */
	public void setUriagedakaTwoYearLater(String uriagedakaTwoYearLater) {
		this.uriagedakaTwoYearLater = uriagedakaTwoYearLater;
	}

	/**
	 * 万一後の2年後の変動費を取得します。
	 * @return 万一後の2年後の変動費
	 */
	public String getHendohiTwoYearLater() {
		return hendohiTwoYearLater;
	}
	
	/**
	 * 万一後の2年後の変動費を設定します。
	 * @param hendohiTwoYearLater 万一後の2年後の変動費
	 */
	public void setHendohiTwoYearLater(String hendohiTwoYearLater) {
		this.hendohiTwoYearLater = hendohiTwoYearLater;
	}

	/**
	 * 万一後の2年後の固定費を取得します。
	 * @return 万一後の2年後の固定費
	 */
	public String getKoteihiTwoYearLater() {
		return koteihiTwoYearLater;
	}
	
	/**
	 * 万一後の2年後の固定費を設定します。
	 * @param koteihiTwoYearLater 万一後の2年後の固定費
	 */
	public void setKoteihiTwoYearLater(String koteihiTwoYearLater) {
		this.koteihiTwoYearLater = koteihiTwoYearLater;
	}

	/**
	 * 万一後の2年後の固定費のうち減価償却費を取得します。
	 * @return 万一後の2年後の固定費のうち減価償却費
	 */
	public String getGenkashokyakuhiTwoYearLater() {
		return genkashokyakuhiTwoYearLater;
	}
	
	/**
	 * 万一後の2年後の固定費のうち減価償却費を設定します。
	 * @param genkashokyakuhiTwoYearLater 万一後の2年後の固定費のうち減価償却費
	 */
	public void setGenkashokyakuhiTwoYearLater(String genkashokyakuhiTwoYearLater) {
		this.genkashokyakuhiTwoYearLater = genkashokyakuhiTwoYearLater;
	}

	/**
	 * 万一後の2年後の経常利益を取得します。
	 * @return 万一後の2年後の経常利益
	 */
	public String getKeijoriekiTwoYearLater() {
		return keijoriekiTwoYearLater;
	}
	
	/**
	 * 万一後の2年後の経常利益を設定します。
	 * @param keijoriekiTwoYearLater 万一後の2年後の経常利益
	 */
	public void setKeijoriekiTwoYearLater(String keijoriekiTwoYearLater) {
		this.keijoriekiTwoYearLater = keijoriekiTwoYearLater;
	}

	/**
	 * 万一後の3年後の売上高を取得します。
	 * @return 万一後の3年後の売上高
	 */
	public String getUriagedakaThreeYearLater() {
		return uriagedakaThreeYearLater;
	}
	
	/**
	 * 万一後の3年後の売上高を設定します。
	 * @param uriagedakaThreeYearLater 万一後の3年後の売上高
	 */
	public void setUriagedakaThreeYearLater(String uriagedakaThreeYearLater) {
		this.uriagedakaThreeYearLater = uriagedakaThreeYearLater;
	}

	/**
	 * 万一後の3年後の変動費を取得します。
	 * @return 万一後の3年後の変動費
	 */
	public String getHendohiThreeYearLater() {
		return hendohiThreeYearLater;
	}
	
	/**
	 * 万一後の3年後の変動費を設定します。
	 * @param hendohiThreeYearLater 万一後の3年後の変動費
	 */
	public void setHendohiThreeYearLater(String hendohiThreeYearLater) {
		this.hendohiThreeYearLater = hendohiThreeYearLater;
	}

	/**
	 * 万一後の3年後の固定費を取得します。
	 * @return 万一後の3年後の固定費
	 */
	public String getKoteihiThreeYearLater() {
		return koteihiThreeYearLater;
	}
	
	/**
	 * 万一後の3年後の固定費を設定します。
	 * @param koteihiThreeYearLater 万一後の3年後の固定費
	 */
	public void setKoteihiThreeYearLater(String koteihiThreeYearLater) {
		this.koteihiThreeYearLater = koteihiThreeYearLater;
	}

	/**
	 * 万一後の3年後の固定費のうち減価償却費を取得します。
	 * @return 万一後の3年後の固定費のうち減価償却費
	 */
	public String getGenkashokyakuhiThreeYearLater() {
		return genkashokyakuhiThreeYearLater;
	}
	
	/**
	 * 万一後の3年後の固定費のうち減価償却費を設定します。
	 * @param genkashokyakuhiThreeYearLater 万一後の3年後の固定費のうち減価償却費
	 */
	public void setGenkashokyakuhiThreeYearLater(String genkashokyakuhiThreeYearLater) {
		this.genkashokyakuhiThreeYearLater = genkashokyakuhiThreeYearLater;
	}

	/**
	 * 万一後の3年後の経常利益を取得します。
	 * @return 万一後の3年後の経常利益
	 */
	public String getKeijoriekiThreeYearLater() {
		return keijoriekiThreeYearLater;
	}
	
	/**
	 * 万一後の3年後の経常利益を設定します。
	 * @param keijoriekiThreeYearLater 万一後の3年後の経常利益
	 */
	public void setKeijoriekiThreeYearLater(String keijoriekiThreeYearLater) {
		this.keijoriekiThreeYearLater = keijoriekiThreeYearLater;
	}
}	

