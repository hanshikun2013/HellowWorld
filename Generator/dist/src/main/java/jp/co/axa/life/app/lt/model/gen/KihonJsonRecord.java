package jp.co.axa.life.app.lt.model.gen;

import jp.co.axa.life.fw.model.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "kihonJsonRecord")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KihonJsonRecord  implements Entity 
{


    @JsonProperty("KIHON_PLAN_ID")
	private String kihonPlanId;   

    @JsonProperty("KIHON_AGENT_ID")
	private String kihonAgentId;   

    @JsonProperty("KIHON_CUST_ID")
	private String kihonCustId;   

    @JsonProperty("KIHON_BUNSEKI_SB_CD")
	private String kihonBunsekiSbCd;   

    @JsonProperty("KIHON_BUNSEKI_CREATE_DATE")
	private java.sql.Timestamp kihonBunsekiCreateDate;   

    @JsonProperty("KIHON_BUNSEKI_UPDATE_DATE")
	private java.sql.Timestamp kihonBunsekiUpdateDate;   

    @JsonProperty("KIHON_CORP_NAME")
	private String kihonCorpName;   

    @JsonProperty("KIHON_CORP_NAME_KANA")
	private String kihonCorpNameKana;   

    @JsonProperty("KIHON_CORP_JIKKOUZEI_RT")
	private java.math.BigDecimal kihonCorpJikkouzeiRt;   

    @JsonProperty("KIHON_NYUSHA_AGE")
	private java.math.BigDecimal kihonNyushaAge;   

    @JsonProperty("KIHON_YAKUIN_SHUNIN_AGE")
	private java.math.BigDecimal kihonYakuinShuninAge;   

    @JsonProperty("KIHON_EP_KANYU_AGE")
	private java.math.BigDecimal kihonEpKanyuAge;   

    @JsonProperty("KIHON_GENZAI_HOSHU_GETSUGAKU")
	private java.math.BigDecimal kihonGenzaiHoshuGetsugaku;   

    @JsonProperty("KIHON_YUTAI_YSHOSHU_GETSUGAKU")
	private java.math.BigDecimal kihonYutaiYshoshuGetsugaku;   

    @JsonProperty("KIHON_KOSEKI_BAI_RT")
	private java.math.BigDecimal kihonKosekiBaiRt;   

    @JsonProperty("KIHON_YUTAI_YOSOKU_AGE")
	private java.math.BigDecimal kihonYutaiYosokuAge;   

    @JsonProperty("KIHON_KIBO_YAKUIN_TIROKIN")
	private java.math.BigDecimal kihonKiboYakuinTirokin;   

    @JsonProperty("KIHON_BUNSEKI_COMMENT")
	private String kihonBunsekiComment;   

    @JsonProperty("KIHON_SYSTEM_CREATE_DATE")
	private java.sql.Timestamp kihonSystemCreateDate;   

    @JsonProperty("KIHON_SYSTEM_UPDATE_DATE")
	private java.sql.Timestamp kihonSystemUpdateDate;   

    @JsonProperty("FAM_PLAN_ID")
	private String famPlanId;   

    @JsonProperty("FAM_FAMILY_CD")
	private String famFamilyCd;   

    @JsonProperty("FAM_FAMILY_NAME_KANJI")
	private String famFamilyNameKanji;   

    @JsonProperty("FAM_FAMILY_NAME_KANA")
	private String famFamilyNameKana;   

    @JsonProperty("FAM_BIRTH")
	private java.sql.Timestamp famBirth;   

    @JsonProperty("FAM_AGE")
	private java.math.BigDecimal famAge;   

    @JsonProperty("FAM_BIRTH_AGE_SELECT_CD")
	private String famBirthAgeSelectCd;   

    @JsonProperty("FAM_ZOKUGARA_CD")
	private String famZokugaraCd;   

    @JsonProperty("FAM_SEX_CD")
	private String famSexCd;   

    @JsonProperty("FAM_JOB_CD")
	private String famJobCd;   

    @JsonProperty("FAM_NENSHU")
	private java.math.BigDecimal famNenshu;   

    @JsonProperty("FAM_TAISHOKU_PLAN_AGE")
	private java.math.BigDecimal famTaishokuPlanAge;   

    @JsonProperty("FAM_HEIKIN_YOMEI")
	private java.math.BigDecimal famHeikinYomei;   

    @JsonProperty("FAM_IMEJI_GAZOU_CD")
	private String famImejiGazouCd;   

    @JsonProperty("FAM_SYSTEM_CREATE_DATE")
	private java.sql.Timestamp famSystemCreateDate;   

    @JsonProperty("FAM_SYSTEM_UPDATE_DATE")
	private java.sql.Timestamp famSystemUpdateDate;   

    @JsonProperty("DET_PLAN_ID")
	private String detPlanId;   

    @JsonProperty("DET_FAMILY_CD")
	private String detFamilyCd;   

    @JsonProperty("DET_GYO_NO")
	private java.math.BigDecimal detGyoNo;   

    @JsonProperty("DET_NENKIN_TYPE_CD")
	private String detNenkinTypeCd;   

    @JsonProperty("DET_START_NENGETSU")
	private String detStartNengetsu;   

    @JsonProperty("DET_AGE_FROM")
	private java.math.BigDecimal detAgeFrom;   

    @JsonProperty("DET_END_NENGETSU")
	private String detEndNengetsu;   

    @JsonProperty("DET_AGE_TO")
	private java.math.BigDecimal detAgeTo;   

    @JsonProperty("DET_KANYU_TSUKISU")
	private java.math.BigDecimal detKanyuTsukisu;   

    @JsonProperty("DET_NENSHU")
	private java.math.BigDecimal detNenshu;   

    @JsonProperty("DET_SYSTEM_CREATE_DATE")
	private java.sql.Timestamp detSystemCreateDate;   

    @JsonProperty("DET_SYSTEM_UPDATE_DATE")
	private java.sql.Timestamp detSystemUpdateDate;   

	public String getKihonPlanId() {
		return kihonPlanId;
	}

	public void setKihonPlanId(String kihonPlanId) {
		this.kihonPlanId = kihonPlanId;
	}


	public String getKihonAgentId() {
		return kihonAgentId;
	}

	public void setKihonAgentId(String kihonAgentId) {
		this.kihonAgentId = kihonAgentId;
	}


	public String getKihonCustId() {
		return kihonCustId;
	}

	public void setKihonCustId(String kihonCustId) {
		this.kihonCustId = kihonCustId;
	}


	public String getKihonBunsekiSbCd() {
		return kihonBunsekiSbCd;
	}

	public void setKihonBunsekiSbCd(String kihonBunsekiSbCd) {
		this.kihonBunsekiSbCd = kihonBunsekiSbCd;
	}


	public java.sql.Timestamp getKihonBunsekiCreateDate() {
		return kihonBunsekiCreateDate;
	}

	public void setKihonBunsekiCreateDate(java.sql.Timestamp kihonBunsekiCreateDate) {
		this.kihonBunsekiCreateDate = kihonBunsekiCreateDate;
	}


	public java.sql.Timestamp getKihonBunsekiUpdateDate() {
		return kihonBunsekiUpdateDate;
	}

	public void setKihonBunsekiUpdateDate(java.sql.Timestamp kihonBunsekiUpdateDate) {
		this.kihonBunsekiUpdateDate = kihonBunsekiUpdateDate;
	}


	public String getKihonCorpName() {
		return kihonCorpName;
	}

	public void setKihonCorpName(String kihonCorpName) {
		this.kihonCorpName = kihonCorpName;
	}


	public String getKihonCorpNameKana() {
		return kihonCorpNameKana;
	}

	public void setKihonCorpNameKana(String kihonCorpNameKana) {
		this.kihonCorpNameKana = kihonCorpNameKana;
	}


	public java.math.BigDecimal getKihonCorpJikkouzeiRt() {
		return kihonCorpJikkouzeiRt;
	}

	public void setKihonCorpJikkouzeiRt(java.math.BigDecimal kihonCorpJikkouzeiRt) {
		this.kihonCorpJikkouzeiRt = kihonCorpJikkouzeiRt;
	}


	public java.math.BigDecimal getKihonNyushaAge() {
		return kihonNyushaAge;
	}

	public void setKihonNyushaAge(java.math.BigDecimal kihonNyushaAge) {
		this.kihonNyushaAge = kihonNyushaAge;
	}


	public java.math.BigDecimal getKihonYakuinShuninAge() {
		return kihonYakuinShuninAge;
	}

	public void setKihonYakuinShuninAge(java.math.BigDecimal kihonYakuinShuninAge) {
		this.kihonYakuinShuninAge = kihonYakuinShuninAge;
	}


	public java.math.BigDecimal getKihonEpKanyuAge() {
		return kihonEpKanyuAge;
	}

	public void setKihonEpKanyuAge(java.math.BigDecimal kihonEpKanyuAge) {
		this.kihonEpKanyuAge = kihonEpKanyuAge;
	}


	public java.math.BigDecimal getKihonGenzaiHoshuGetsugaku() {
		return kihonGenzaiHoshuGetsugaku;
	}

	public void setKihonGenzaiHoshuGetsugaku(java.math.BigDecimal kihonGenzaiHoshuGetsugaku) {
		this.kihonGenzaiHoshuGetsugaku = kihonGenzaiHoshuGetsugaku;
	}


	public java.math.BigDecimal getKihonYutaiYshoshuGetsugaku() {
		return kihonYutaiYshoshuGetsugaku;
	}

	public void setKihonYutaiYshoshuGetsugaku(java.math.BigDecimal kihonYutaiYshoshuGetsugaku) {
		this.kihonYutaiYshoshuGetsugaku = kihonYutaiYshoshuGetsugaku;
	}


	public java.math.BigDecimal getKihonKosekiBaiRt() {
		return kihonKosekiBaiRt;
	}

	public void setKihonKosekiBaiRt(java.math.BigDecimal kihonKosekiBaiRt) {
		this.kihonKosekiBaiRt = kihonKosekiBaiRt;
	}


	public java.math.BigDecimal getKihonYutaiYosokuAge() {
		return kihonYutaiYosokuAge;
	}

	public void setKihonYutaiYosokuAge(java.math.BigDecimal kihonYutaiYosokuAge) {
		this.kihonYutaiYosokuAge = kihonYutaiYosokuAge;
	}


	public java.math.BigDecimal getKihonKiboYakuinTirokin() {
		return kihonKiboYakuinTirokin;
	}

	public void setKihonKiboYakuinTirokin(java.math.BigDecimal kihonKiboYakuinTirokin) {
		this.kihonKiboYakuinTirokin = kihonKiboYakuinTirokin;
	}


	public String getKihonBunsekiComment() {
		return kihonBunsekiComment;
	}

	public void setKihonBunsekiComment(String kihonBunsekiComment) {
		this.kihonBunsekiComment = kihonBunsekiComment;
	}


	public java.sql.Timestamp getKihonSystemCreateDate() {
		return kihonSystemCreateDate;
	}

	public void setKihonSystemCreateDate(java.sql.Timestamp kihonSystemCreateDate) {
		this.kihonSystemCreateDate = kihonSystemCreateDate;
	}


	public java.sql.Timestamp getKihonSystemUpdateDate() {
		return kihonSystemUpdateDate;
	}

	public void setKihonSystemUpdateDate(java.sql.Timestamp kihonSystemUpdateDate) {
		this.kihonSystemUpdateDate = kihonSystemUpdateDate;
	}


	public String getFamPlanId() {
		return famPlanId;
	}

	public void setFamPlanId(String famPlanId) {
		this.famPlanId = famPlanId;
	}


	public String getFamFamilyCd() {
		return famFamilyCd;
	}

	public void setFamFamilyCd(String famFamilyCd) {
		this.famFamilyCd = famFamilyCd;
	}


	public String getFamFamilyNameKanji() {
		return famFamilyNameKanji;
	}

	public void setFamFamilyNameKanji(String famFamilyNameKanji) {
		this.famFamilyNameKanji = famFamilyNameKanji;
	}


	public String getFamFamilyNameKana() {
		return famFamilyNameKana;
	}

	public void setFamFamilyNameKana(String famFamilyNameKana) {
		this.famFamilyNameKana = famFamilyNameKana;
	}


	public java.sql.Timestamp getFamBirth() {
		return famBirth;
	}

	public void setFamBirth(java.sql.Timestamp famBirth) {
		this.famBirth = famBirth;
	}


	public java.math.BigDecimal getFamAge() {
		return famAge;
	}

	public void setFamAge(java.math.BigDecimal famAge) {
		this.famAge = famAge;
	}


	public String getFamBirthAgeSelectCd() {
		return famBirthAgeSelectCd;
	}

	public void setFamBirthAgeSelectCd(String famBirthAgeSelectCd) {
		this.famBirthAgeSelectCd = famBirthAgeSelectCd;
	}


	public String getFamZokugaraCd() {
		return famZokugaraCd;
	}

	public void setFamZokugaraCd(String famZokugaraCd) {
		this.famZokugaraCd = famZokugaraCd;
	}


	public String getFamSexCd() {
		return famSexCd;
	}

	public void setFamSexCd(String famSexCd) {
		this.famSexCd = famSexCd;
	}


	public String getFamJobCd() {
		return famJobCd;
	}

	public void setFamJobCd(String famJobCd) {
		this.famJobCd = famJobCd;
	}


	public java.math.BigDecimal getFamNenshu() {
		return famNenshu;
	}

	public void setFamNenshu(java.math.BigDecimal famNenshu) {
		this.famNenshu = famNenshu;
	}


	public java.math.BigDecimal getFamTaishokuPlanAge() {
		return famTaishokuPlanAge;
	}

	public void setFamTaishokuPlanAge(java.math.BigDecimal famTaishokuPlanAge) {
		this.famTaishokuPlanAge = famTaishokuPlanAge;
	}


	public java.math.BigDecimal getFamHeikinYomei() {
		return famHeikinYomei;
	}

	public void setFamHeikinYomei(java.math.BigDecimal famHeikinYomei) {
		this.famHeikinYomei = famHeikinYomei;
	}


	public String getFamImejiGazouCd() {
		return famImejiGazouCd;
	}

	public void setFamImejiGazouCd(String famImejiGazouCd) {
		this.famImejiGazouCd = famImejiGazouCd;
	}


	public java.sql.Timestamp getFamSystemCreateDate() {
		return famSystemCreateDate;
	}

	public void setFamSystemCreateDate(java.sql.Timestamp famSystemCreateDate) {
		this.famSystemCreateDate = famSystemCreateDate;
	}


	public java.sql.Timestamp getFamSystemUpdateDate() {
		return famSystemUpdateDate;
	}

	public void setFamSystemUpdateDate(java.sql.Timestamp famSystemUpdateDate) {
		this.famSystemUpdateDate = famSystemUpdateDate;
	}


	public String getDetPlanId() {
		return detPlanId;
	}

	public void setDetPlanId(String detPlanId) {
		this.detPlanId = detPlanId;
	}


	public String getDetFamilyCd() {
		return detFamilyCd;
	}

	public void setDetFamilyCd(String detFamilyCd) {
		this.detFamilyCd = detFamilyCd;
	}


	public java.math.BigDecimal getDetGyoNo() {
		return detGyoNo;
	}

	public void setDetGyoNo(java.math.BigDecimal detGyoNo) {
		this.detGyoNo = detGyoNo;
	}


	public String getDetNenkinTypeCd() {
		return detNenkinTypeCd;
	}

	public void setDetNenkinTypeCd(String detNenkinTypeCd) {
		this.detNenkinTypeCd = detNenkinTypeCd;
	}


	public String getDetStartNengetsu() {
		return detStartNengetsu;
	}

	public void setDetStartNengetsu(String detStartNengetsu) {
		this.detStartNengetsu = detStartNengetsu;
	}


	public java.math.BigDecimal getDetAgeFrom() {
		return detAgeFrom;
	}

	public void setDetAgeFrom(java.math.BigDecimal detAgeFrom) {
		this.detAgeFrom = detAgeFrom;
	}


	public String getDetEndNengetsu() {
		return detEndNengetsu;
	}

	public void setDetEndNengetsu(String detEndNengetsu) {
		this.detEndNengetsu = detEndNengetsu;
	}


	public java.math.BigDecimal getDetAgeTo() {
		return detAgeTo;
	}

	public void setDetAgeTo(java.math.BigDecimal detAgeTo) {
		this.detAgeTo = detAgeTo;
	}


	public java.math.BigDecimal getDetKanyuTsukisu() {
		return detKanyuTsukisu;
	}

	public void setDetKanyuTsukisu(java.math.BigDecimal detKanyuTsukisu) {
		this.detKanyuTsukisu = detKanyuTsukisu;
	}


	public java.math.BigDecimal getDetNenshu() {
		return detNenshu;
	}

	public void setDetNenshu(java.math.BigDecimal detNenshu) {
		this.detNenshu = detNenshu;
	}


	public java.sql.Timestamp getDetSystemCreateDate() {
		return detSystemCreateDate;
	}

	public void setDetSystemCreateDate(java.sql.Timestamp detSystemCreateDate) {
		this.detSystemCreateDate = detSystemCreateDate;
	}


	public java.sql.Timestamp getDetSystemUpdateDate() {
		return detSystemUpdateDate;
	}

	public void setDetSystemUpdateDate(java.sql.Timestamp detSystemUpdateDate) {
		this.detSystemUpdateDate = detSystemUpdateDate;
	}

}
