package jp.co.axa.life.app.lt.model.gen;

import jp.co.axa.life.fw.model.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "riskJsonRecord")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RiskJsonRecord  implements Entity 
{


    @JsonProperty("BSK_PLAN_ID")
	private String bskPlanId;   

    @JsonProperty("BSK_KARIRE_SOTOGAKU")
	private java.math.BigDecimal bskKarireSotogaku;   

    @JsonProperty("BSK_CHOIKIN_SANSHUTSU_KB_CD")
	private String bskChoikinSanshutsuKbCd;   

    @JsonProperty("BSK_KENAOSI_SHIKIN_SB_CD")
	private String bskKenaosiShikinSbCd;   

    @JsonProperty("BSK_JUGYOIN_KYUYO")
	private java.math.BigDecimal bskJugyoinKyuyo;   

    @JsonProperty("BSK_JUGYOIN_KYUYO_HYOGETU")
	private java.math.BigDecimal bskJugyoinKyuyoHyogetu;   

    @JsonProperty("BSK_KENAOSI_SHIKIN")
	private java.math.BigDecimal bskKenaosiShikin;   

    @JsonProperty("BSK_URIAGEDAKA_YOSOU")
	private java.math.BigDecimal bskUriagedakaYosou;   

    @JsonProperty("BSK_M1NGO_URIYOSO_RT")
	private java.math.BigDecimal bskM1ngoUriyosoRt;   

    @JsonProperty("BSK_M2NGO_URIYOSO_RT")
	private java.math.BigDecimal bskM2ngoUriyosoRt;   

    @JsonProperty("BSK_M3NGO_URIYOSO_RT")
	private java.math.BigDecimal bskM3ngoUriyosoRt;   

    @JsonProperty("BSK_GYOSHU_CD")
	private String bskGyoshuCd;   

    @JsonProperty("BSK_JUGYOINSU")
	private java.math.BigDecimal bskJugyoinsu;   

    @JsonProperty("BSK_SYSTEM_CREATE_DATE")
	private java.sql.Timestamp bskSystemCreateDate;   

    @JsonProperty("BSK_SYSTEM_UPDATE_DATE")
	private java.sql.Timestamp bskSystemUpdateDate;   

	public String getBskPlanId() {
		return bskPlanId;
	}

	public void setBskPlanId(String bskPlanId) {
		this.bskPlanId = bskPlanId;
	}


	public java.math.BigDecimal getBskKarireSotogaku() {
		return bskKarireSotogaku;
	}

	public void setBskKarireSotogaku(java.math.BigDecimal bskKarireSotogaku) {
		this.bskKarireSotogaku = bskKarireSotogaku;
	}


	public String getBskChoikinSanshutsuKbCd() {
		return bskChoikinSanshutsuKbCd;
	}

	public void setBskChoikinSanshutsuKbCd(String bskChoikinSanshutsuKbCd) {
		this.bskChoikinSanshutsuKbCd = bskChoikinSanshutsuKbCd;
	}


	public String getBskKenaosiShikinSbCd() {
		return bskKenaosiShikinSbCd;
	}

	public void setBskKenaosiShikinSbCd(String bskKenaosiShikinSbCd) {
		this.bskKenaosiShikinSbCd = bskKenaosiShikinSbCd;
	}


	public java.math.BigDecimal getBskJugyoinKyuyo() {
		return bskJugyoinKyuyo;
	}

	public void setBskJugyoinKyuyo(java.math.BigDecimal bskJugyoinKyuyo) {
		this.bskJugyoinKyuyo = bskJugyoinKyuyo;
	}


	public java.math.BigDecimal getBskJugyoinKyuyoHyogetu() {
		return bskJugyoinKyuyoHyogetu;
	}

	public void setBskJugyoinKyuyoHyogetu(java.math.BigDecimal bskJugyoinKyuyoHyogetu) {
		this.bskJugyoinKyuyoHyogetu = bskJugyoinKyuyoHyogetu;
	}


	public java.math.BigDecimal getBskKenaosiShikin() {
		return bskKenaosiShikin;
	}

	public void setBskKenaosiShikin(java.math.BigDecimal bskKenaosiShikin) {
		this.bskKenaosiShikin = bskKenaosiShikin;
	}


	public java.math.BigDecimal getBskUriagedakaYosou() {
		return bskUriagedakaYosou;
	}

	public void setBskUriagedakaYosou(java.math.BigDecimal bskUriagedakaYosou) {
		this.bskUriagedakaYosou = bskUriagedakaYosou;
	}


	public java.math.BigDecimal getBskM1ngoUriyosoRt() {
		return bskM1ngoUriyosoRt;
	}

	public void setBskM1ngoUriyosoRt(java.math.BigDecimal bskM1ngoUriyosoRt) {
		this.bskM1ngoUriyosoRt = bskM1ngoUriyosoRt;
	}


	public java.math.BigDecimal getBskM2ngoUriyosoRt() {
		return bskM2ngoUriyosoRt;
	}

	public void setBskM2ngoUriyosoRt(java.math.BigDecimal bskM2ngoUriyosoRt) {
		this.bskM2ngoUriyosoRt = bskM2ngoUriyosoRt;
	}


	public java.math.BigDecimal getBskM3ngoUriyosoRt() {
		return bskM3ngoUriyosoRt;
	}

	public void setBskM3ngoUriyosoRt(java.math.BigDecimal bskM3ngoUriyosoRt) {
		this.bskM3ngoUriyosoRt = bskM3ngoUriyosoRt;
	}


	public String getBskGyoshuCd() {
		return bskGyoshuCd;
	}

	public void setBskGyoshuCd(String bskGyoshuCd) {
		this.bskGyoshuCd = bskGyoshuCd;
	}


	public java.math.BigDecimal getBskJugyoinsu() {
		return bskJugyoinsu;
	}

	public void setBskJugyoinsu(java.math.BigDecimal bskJugyoinsu) {
		this.bskJugyoinsu = bskJugyoinsu;
	}


	public java.sql.Timestamp getBskSystemCreateDate() {
		return bskSystemCreateDate;
	}

	public void setBskSystemCreateDate(java.sql.Timestamp bskSystemCreateDate) {
		this.bskSystemCreateDate = bskSystemCreateDate;
	}


	public java.sql.Timestamp getBskSystemUpdateDate() {
		return bskSystemUpdateDate;
	}

	public void setBskSystemUpdateDate(java.sql.Timestamp bskSystemUpdateDate) {
		this.bskSystemUpdateDate = bskSystemUpdateDate;
	}

}
