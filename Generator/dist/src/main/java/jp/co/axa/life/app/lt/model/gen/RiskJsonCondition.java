package jp.co.axa.life.app.lt.model.gen;

import jp.co.axa.life.fw.model.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "riskJsonCondition")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RiskJsonCondition  implements Entity 
{


    @JsonProperty("PLANID")
	private String planId;   

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
