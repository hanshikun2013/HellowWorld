package temp.T2D.kyotsu.datamodel.gen;

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
	@JsonProperty("planFamilyCollection")
	private PlanFamilyCollection planFamilyCollection ;


	public LtPlanCollection getLtPlanCollection() {
		return ltPlanCollection;
	}

	public void setLtPlanCollection( LtPlanCollection ltPlanCollection) {
		this.ltPlanCollection = ltPlanCollection;
	}


	public PlanFamilyCollection getPlanFamilyCollection() {
		return planFamilyCollection;
	}

	public void setPlanFamilyCollection( PlanFamilyCollection planFamilyCollection) {
		this.planFamilyCollection = planFamilyCollection;
	}

}