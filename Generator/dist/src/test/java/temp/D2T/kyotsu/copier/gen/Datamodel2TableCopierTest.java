package temp.D2T.kyotsu.copier.gen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import jp.co.axa.life.fw.exception.SystemException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.D2T.kyotsu.datamodel.gen.LtPlanCollection;
import temp.D2T.kyotsu.datamodel.gen.PlanFamilyCollection;
import temp.D2T.kyotsu.entity.gen.TKrnsPlanFamily;


public class Datamodel2TableCopierTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	/*
	 * データ変換処理：
	 * Test 共通部:T_KRNS_PLAN_FAMILY
	 */
	@Test
	public void test共通部_T_KRNS_PLAN_FAMILY_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		PlanFamilyCollection planFamilyCollection =new PlanFamilyCollection ();
		{
			//TODO
			planFamilyCollection.setFamilyNo(null);
			//TODO
			planFamilyCollection.setKanjiName(null);
			//TODO
			planFamilyCollection.setKanaName(null);
			//TODO
			planFamilyCollection.setDateOfBirth(null);
			//TODO
			planFamilyCollection.setAge(null);
			//TODO
			planFamilyCollection.setDateAgeFlg(null);
			//TODO
			planFamilyCollection.setZokugara(null);
			//TODO
			planFamilyCollection.setGender(null);
			//TODO
			planFamilyCollection.setJob(null);
			//TODO
			planFamilyCollection.setAnnualIncome(null);
			//TODO
			planFamilyCollection.setRetirementAge(null);
			//TODO
			planFamilyCollection.setHeikinJumyo(null);
			//TODO
			planFamilyCollection.setEnterCompanyAge(null);
			//TODO
			planFamilyCollection.setImage(null);
		}
		
		//call convert method
		TKrnsPlanFamily result=Datamodel2TableCopier.共通部_T_KRNS_PLAN_FAMILY(ltPlanCollection,  planFamilyCollection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyCd());
			//TODO
			assertEquals(null, result.getFamilyNameKanji());
			//TODO
			assertEquals(null, result.getFamilyNameKana());
			//TODO
			assertEquals(null, result.getBirth());
			//TODO
			assertEquals(null, result.getAge());
			//TODO
			assertEquals(null, result.getBirthAgeSelectCd());
			//TODO
			assertEquals(null, result.getZokugaraCd());
			//TODO
			assertEquals(null, result.getSexCd());
			//TODO
			assertEquals(null, result.getJobCd());
			//TODO
			assertEquals(null, result.getNenshu());
			//TODO
			assertEquals(null, result.getTaishokuPlanAge());
			//TODO
			assertEquals(null, result.getHeikinYomei());
			//TODO
			assertEquals(null, result.getNyushaAge());
			//TODO
			assertEquals(null, result.getImejiGazouCd());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	/*
	 * データ変換処理：
	 * Test 共通部:T_KRNS_PLAN_FAMILY
	 */
	@Test(expected = SystemException.class)
	public void test共通部_T_KRNS_PLAN_FAMILY_NG(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		PlanFamilyCollection planFamilyCollection =new PlanFamilyCollection ();
		{
			//TODO
			planFamilyCollection.setFamilyNo(null);
			//TODO
			planFamilyCollection.setKanjiName(null);
			//TODO
			planFamilyCollection.setKanaName(null);
			//TODO
			planFamilyCollection.setDateOfBirth(null);
			//TODO
			planFamilyCollection.setAge(null);
			//TODO
			planFamilyCollection.setDateAgeFlg(null);
			//TODO
			planFamilyCollection.setZokugara(null);
			//TODO
			planFamilyCollection.setGender(null);
			//TODO
			planFamilyCollection.setJob(null);
			//TODO
			planFamilyCollection.setAnnualIncome(null);
			//TODO
			planFamilyCollection.setRetirementAge(null);
			//TODO
			planFamilyCollection.setHeikinJumyo(null);
			//TODO
			planFamilyCollection.setEnterCompanyAge(null);
			//TODO
			planFamilyCollection.setImage(null);
		}
		
		//call convert method
		TKrnsPlanFamily result=Datamodel2TableCopier.共通部_T_KRNS_PLAN_FAMILY(ltPlanCollection,  planFamilyCollection);
	}	

}
