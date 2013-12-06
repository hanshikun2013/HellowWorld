package temp.D2T.souzoku.datamodel.gen;

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
	@JsonProperty("lisc0001Collection")
	private Lisc0001Collection lisc0001Collection ;

	/*
	*
	*/
	@JsonProperty("lisc000101Collection")
	private Lisc000101Collection lisc000101Collection ;


	public LtPlanCollection getLtPlanCollection() {
		return ltPlanCollection;
	}

	public void setLtPlanCollection( LtPlanCollection ltPlanCollection) {
		this.ltPlanCollection = ltPlanCollection;
	}


	public Lisc0001Collection getLisc0001Collection() {
		return lisc0001Collection;
	}

	public void setLisc0001Collection( Lisc0001Collection lisc0001Collection) {
		this.lisc0001Collection = lisc0001Collection;
	}


	public Lisc000101Collection getLisc000101Collection() {
		return lisc000101Collection;
	}

	public void setLisc000101Collection( Lisc000101Collection lisc000101Collection) {
		this.lisc000101Collection = lisc000101Collection;
	}

}