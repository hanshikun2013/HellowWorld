package sample2.table.datamodel.gen;

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
	@JsonProperty("planFamily")
	private PlanFamily planFamily ;

	/*
	*
	*/
	@JsonProperty("ltPension")
	private LtPension ltPension ;

	/*
	*
	*/
	@JsonProperty("lbsc0009")
	private Lbsc0009 lbsc0009 ;

	/*
	*
	*/
	@JsonProperty("lbsc0008")
	private Lbsc0008 lbsc0008 ;

	/*
	*
	*/
	@JsonProperty("lbsc0002")
	private Lbsc0002 lbsc0002 ;

	/*
	*
	*/
	@JsonProperty("lbsc0010")
	private Lbsc0010 lbsc0010 ;

	/*
	*
	*/
	@JsonProperty("lbsc0003")
	private Lbsc0003 lbsc0003 ;

	/*
	*
	*/
	@JsonProperty("lbsc0004")
	private Lbsc0004 lbsc0004 ;

	/*
	*
	*/
	@JsonProperty("lbsc00011")
	private Lbsc00011 lbsc00011 ;

	/*
	*
	*/
	@JsonProperty("lbsc00005")
	private Lbsc00005 lbsc00005 ;

	/*
	*
	*/
	@JsonProperty("lbsc00006")
	private Lbsc00006 lbsc00006 ;

	/*
	*
	*/
	@JsonProperty("lbsc00013")
	private Lbsc00013 lbsc00013 ;


	public PlanFamily getPlanFamily() {
		return planFamily;
	}

	public void setPlanFamily( PlanFamily planFamily) {
		this.planFamily = planFamily;
	}


	public LtPension getLtPension() {
		return ltPension;
	}

	public void setLtPension( LtPension ltPension) {
		this.ltPension = ltPension;
	}


	public Lbsc0009 getLbsc0009() {
		return lbsc0009;
	}

	public void setLbsc0009( Lbsc0009 lbsc0009) {
		this.lbsc0009 = lbsc0009;
	}


	public Lbsc0008 getLbsc0008() {
		return lbsc0008;
	}

	public void setLbsc0008( Lbsc0008 lbsc0008) {
		this.lbsc0008 = lbsc0008;
	}


	public Lbsc0002 getLbsc0002() {
		return lbsc0002;
	}

	public void setLbsc0002( Lbsc0002 lbsc0002) {
		this.lbsc0002 = lbsc0002;
	}


	public Lbsc0010 getLbsc0010() {
		return lbsc0010;
	}

	public void setLbsc0010( Lbsc0010 lbsc0010) {
		this.lbsc0010 = lbsc0010;
	}


	public Lbsc0003 getLbsc0003() {
		return lbsc0003;
	}

	public void setLbsc0003( Lbsc0003 lbsc0003) {
		this.lbsc0003 = lbsc0003;
	}


	public Lbsc0004 getLbsc0004() {
		return lbsc0004;
	}

	public void setLbsc0004( Lbsc0004 lbsc0004) {
		this.lbsc0004 = lbsc0004;
	}


	public Lbsc00011 getLbsc00011() {
		return lbsc00011;
	}

	public void setLbsc00011( Lbsc00011 lbsc00011) {
		this.lbsc00011 = lbsc00011;
	}


	public Lbsc00005 getLbsc00005() {
		return lbsc00005;
	}

	public void setLbsc00005( Lbsc00005 lbsc00005) {
		this.lbsc00005 = lbsc00005;
	}


	public Lbsc00006 getLbsc00006() {
		return lbsc00006;
	}

	public void setLbsc00006( Lbsc00006 lbsc00006) {
		this.lbsc00006 = lbsc00006;
	}


	public Lbsc00013 getLbsc00013() {
		return lbsc00013;
	}

	public void setLbsc00013( Lbsc00013 lbsc00013) {
		this.lbsc00013 = lbsc00013;
	}

}