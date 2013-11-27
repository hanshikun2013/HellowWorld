package jp.co.axa.life.app.lt.model.gen;

import jp.co.axa.life.fw.model.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "cashFlowJsonRecord")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlowJsonRecord  implements Entity 
{


    @JsonProperty("KAI_PLAN_ID")
	private String kaiPlanId;   

    @JsonProperty("KAI_SAGE_KINGAKU")
	private java.math.BigDecimal kaiSageKingaku;   

    @JsonProperty("KAI_SKHK_HOKEN_SHURUI_CD")
	private String kaiSkhkHokenShuruiCd;   

    @JsonProperty("KAI_SYSTEM_CREATE_DATE")
	private java.sql.Timestamp kaiSystemCreateDate;   

    @JsonProperty("KAI_SYSTEM_UPDATE_DATE")
	private java.sql.Timestamp kaiSystemUpdateDate;   

	public String getKaiPlanId() {
		return kaiPlanId;
	}

	public void setKaiPlanId(String kaiPlanId) {
		this.kaiPlanId = kaiPlanId;
	}


	public java.math.BigDecimal getKaiSageKingaku() {
		return kaiSageKingaku;
	}

	public void setKaiSageKingaku(java.math.BigDecimal kaiSageKingaku) {
		this.kaiSageKingaku = kaiSageKingaku;
	}


	public String getKaiSkhkHokenShuruiCd() {
		return kaiSkhkHokenShuruiCd;
	}

	public void setKaiSkhkHokenShuruiCd(String kaiSkhkHokenShuruiCd) {
		this.kaiSkhkHokenShuruiCd = kaiSkhkHokenShuruiCd;
	}


	public java.sql.Timestamp getKaiSystemCreateDate() {
		return kaiSystemCreateDate;
	}

	public void setKaiSystemCreateDate(java.sql.Timestamp kaiSystemCreateDate) {
		this.kaiSystemCreateDate = kaiSystemCreateDate;
	}


	public java.sql.Timestamp getKaiSystemUpdateDate() {
		return kaiSystemUpdateDate;
	}

	public void setKaiSystemUpdateDate(java.sql.Timestamp kaiSystemUpdateDate) {
		this.kaiSystemUpdateDate = kaiSystemUpdateDate;
	}

}
