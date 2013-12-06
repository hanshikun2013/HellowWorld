package temp.T2D.kyotsu.copier.gen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import jp.co.axa.life.fw.exception.SystemException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.T2D.kyotsu.datamodel.gen.LtPlanCollection;
import temp.T2D.kyotsu.datamodel.gen.PlanFamilyCollection;
import temp.T2D.kyotsu.entity.gen.VPlanList;
import temp.T2D.kyotsu.entity.gen.MConsulting;
import temp.T2D.kyotsu.entity.gen.TKrnsPlanFamily;


public class Table2DatamodelCopierTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	/*
	 * データ変換処理：
	 * Test 共通部:LtPlanCollection
	 */
	@Test
	public void test共通部_LtPlanCollection_OK(){
		//Initialize parameters
		VPlanList vPlanList =new VPlanList ();
		{
			vPlanList.setAgentId (null);
			vPlanList.setCustId (null);
			vPlanList.setBunsekiSbCd (null);
			vPlanList.setPlanId (null);
			vPlanList.setKeisanKijunDate (null);
			vPlanList.setSekkeiPlanNo (null);
			vPlanList.setSekkeiPlanNoP (null);
			vPlanList.setInsuredId (null);
			vPlanList.setInsuredIdP (null);
			vPlanList.setSozokuPlanNo (null);
			vPlanList.setIryoPlanNo (null);
			vPlanList.setCarePlanNo (null);
			vPlanList.setShokembunsekiPlanNo (null);
			vPlanList.setShokembunsekiPlanNoP (null);
			vPlanList.setLnasCaPlanId (null);
			vPlanList.setAgentSexCd (null);
			vPlanList.setBunsekiComment (null);
			vPlanList.setBunsekiCreateDate (null);
			vPlanList.setBunsekiUpdateDate (null);
		}
		MConsulting mConsulting =new MConsulting ();
		{
			//mConsulting.set (null);
		}
		//call convert method
		LtPlanCollection result=Table2DatamodelCopier.共通部_LtPlanCollection(vPlanList,  mConsulting);
		//assertions
		{
			//TODO
			assertEquals(null, result.getToriatsukaishaId());
			//TODO
			assertEquals(null, result.getKokyakuId());
			//TODO
			assertEquals(null, result.getBunsekiShubetsu());
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getKeisanKijunbi());
			//TODO
			assertEquals(null, result.getSekkeiPlanNo());
			//TODO
			assertEquals(null, result.getSekkeiPlanNoP());
			//TODO
			assertEquals(null, result.getInsuredId());
			//TODO
			assertEquals(null, result.getInsuredIdP());
			//TODO
			assertEquals(null, result.getSozokuPlanNo());
			//TODO
			assertEquals(null, result.getIryoPlanNo());
			//TODO
			assertEquals(null, result.getKaigoPlanNo());
			//TODO
			assertEquals(null, result.getShokenPlanNo());
			//TODO
			assertEquals(null, result.getShokenPlanNoP());
			//TODO
			assertEquals(null, result.getLnasCaPlanId());
			//TODO
			assertEquals(null, result.getFaGender());
			//TODO
			assertEquals(null, result.getComment());
			//TODO
			assertEquals(null, result.getPlanCreated());
			//TODO
			assertEquals(null, result.getPlanUpdated());
			//TODO
			assertEquals(null, result.getBunsekiShubetsuName());
			//TODO
			assertEquals(null, result.getPlanStatus());
		}
	}

	/*
	 * データ変換処理：
	 * Test 共通部:LtPlanCollection
	 */
	@Test(expected = SystemException.class)
	public void test共通部_LtPlanCollection_NG(){
		//Initialize parameters
		VPlanList vPlanList =new VPlanList ();
		{
			//TODO
			vPlanList.setAgentId (null);
			//TODO
			vPlanList.setCustId (null);
			//TODO
			vPlanList.setBunsekiSbCd (null);
			//TODO
			vPlanList.setPlanId (null);
			//TODO
			vPlanList.setKeisanKijunDate (null);
			//TODO
			vPlanList.setSekkeiPlanNo (null);
			//TODO
			vPlanList.setSekkeiPlanNoP (null);
			//TODO
			vPlanList.setInsuredId (null);
			//TODO
			vPlanList.setInsuredIdP (null);
			//TODO
			vPlanList.setSozokuPlanNo (null);
			//TODO
			vPlanList.setIryoPlanNo (null);
			//TODO
			vPlanList.setCarePlanNo (null);
			//TODO
			vPlanList.setShokembunsekiPlanNo (null);
			//TODO
			vPlanList.setShokembunsekiPlanNoP (null);
			//TODO
			vPlanList.setLnasCaPlanId (null);
			//TODO
			vPlanList.setAgentSexCd (null);
			//TODO
			vPlanList.setBunsekiComment (null);
			//TODO
			vPlanList.setBunsekiCreateDate (null);
			//TODO
			vPlanList.setBunsekiUpdateDate (null);
		}
		MConsulting mConsulting =new MConsulting ();
		{
			//TODO
			//mConsulting.set (null);
		}
		//call convert method
		LtPlanCollection result=Table2DatamodelCopier.共通部_LtPlanCollection(vPlanList,  mConsulting);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test 共通部:PlanFamilyCollection
	 */
	@Test
	public void test共通部_PlanFamilyCollection_OK(){
		//Initialize parameters
		TKrnsPlanFamily tKrnsPlanFamily =new TKrnsPlanFamily ();
		{
			tKrnsPlanFamily.setFamilyCd (null);
			tKrnsPlanFamily.setFamilyNameKanji (null);
			tKrnsPlanFamily.setFamilyNameKana (null);
			tKrnsPlanFamily.setBirth (null);
			tKrnsPlanFamily.setAge (null);
			tKrnsPlanFamily.setBirthAgeSelectCd (null);
			tKrnsPlanFamily.setZokugaraCd (null);
			tKrnsPlanFamily.setSexCd (null);
			tKrnsPlanFamily.setJobCd (null);
			tKrnsPlanFamily.setNenshu (null);
			tKrnsPlanFamily.setTaishokuPlanAge (null);
			tKrnsPlanFamily.setHeikinYomei (null);
			tKrnsPlanFamily.setImejiGazouCd (null);
			tKrnsPlanFamily.setNyushaAge (null);
		}
		MConsulting mConsulting =new MConsulting ();
		{
			//mConsulting.set (null);
		}
		//call convert method
		PlanFamilyCollection result=Table2DatamodelCopier.共通部_PlanFamilyCollection(tKrnsPlanFamily,  mConsulting);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getFamilyNo());
			//TODO
			assertEquals(null, result.getKanjiName());
			//TODO
			assertEquals(null, result.getKanaName());
			//TODO
			assertEquals(null, result.getDateOfBirth());
			//TODO
			assertEquals(null, result.getAge());
			//TODO
			assertEquals(null, result.getDateAgeFlg());
			//TODO
			assertEquals(null, result.getZokugara());
			//TODO
			assertEquals(null, result.getGender());
			//TODO
			assertEquals(null, result.getJob());
			//TODO
			assertEquals(null, result.getAnnualIncome());
			//TODO
			assertEquals(null, result.getRetirementAge());
			//TODO
			assertEquals(null, result.getHeikinJumyo());
			//TODO
			assertEquals(null, result.getImage());
			//TODO
			assertEquals(null, result.getEnterCompanyAge());
			//TODO
			assertEquals(null, result.getGenderString());
			//TODO
			assertEquals(null, result.getJobString());
			//TODO
			assertEquals(null, result.getZokugaraName());
		}
	}

	/*
	 * データ変換処理：
	 * Test 共通部:PlanFamilyCollection
	 */
	@Test(expected = SystemException.class)
	public void test共通部_PlanFamilyCollection_NG(){
		//Initialize parameters
		TKrnsPlanFamily tKrnsPlanFamily =new TKrnsPlanFamily ();
		{
			//TODO
			tKrnsPlanFamily.setFamilyCd (null);
			//TODO
			tKrnsPlanFamily.setFamilyNameKanji (null);
			//TODO
			tKrnsPlanFamily.setFamilyNameKana (null);
			//TODO
			tKrnsPlanFamily.setBirth (null);
			//TODO
			tKrnsPlanFamily.setAge (null);
			//TODO
			tKrnsPlanFamily.setBirthAgeSelectCd (null);
			//TODO
			tKrnsPlanFamily.setZokugaraCd (null);
			//TODO
			tKrnsPlanFamily.setSexCd (null);
			//TODO
			tKrnsPlanFamily.setJobCd (null);
			//TODO
			tKrnsPlanFamily.setNenshu (null);
			//TODO
			tKrnsPlanFamily.setTaishokuPlanAge (null);
			//TODO
			tKrnsPlanFamily.setHeikinYomei (null);
			//TODO
			tKrnsPlanFamily.setImejiGazouCd (null);
			//TODO
			tKrnsPlanFamily.setNyushaAge (null);
		}
		MConsulting mConsulting =new MConsulting ();
		{
			//TODO
			//mConsulting.set (null);
		}
		//call convert method
		PlanFamilyCollection result=Table2DatamodelCopier.共通部_PlanFamilyCollection(tKrnsPlanFamily,  mConsulting);
		//assertions
	}
	

}
