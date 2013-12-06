package temp.D2T.kaigo.datamodel.gen;

import jp.co.axa.life.fw.model.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "dataModelRoot")
@JsonIgnoreProperties(ignoreUnknown = true)
public class  DataModelRoot implements Entity {


	/*
	*
	*/
	@JsonProperty("ltPlanCollection")
	private LtPlanCollection ltPlanCollection ;

	/*
	*
	*/
	@JsonProperty("lcsc0501Collection")
	private Lcsc0501Collection lcsc0501Collection ;


	public LtPlanCollection getLtPlanCollection() {
		return ltPlanCollection;
	}

	public void setLtPlanCollection( LtPlanCollection ltPlanCollection) {
		this.ltPlanCollection = ltPlanCollection;
	}


	public Lcsc0501Collection getLcsc0501Collection() {
		return lcsc0501Collection;
	}

	public void setLcsc0501Collection( Lcsc0501Collection lcsc0501Collection) {
		this.lcsc0501Collection = lcsc0501Collection;
	}

}