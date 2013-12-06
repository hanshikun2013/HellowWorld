package temp.D2T.souzoku.copier.gen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import jp.co.axa.life.fw.exception.SystemException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.D2T.souzoku.datamodel.gen.LtPlanCollection;
import temp.D2T.souzoku.datamodel.gen.Lisc0001Collection;
import temp.D2T.souzoku.datamodel.gen.Lisc000101Collection;
import temp.D2T.souzoku.entity.gen.TLrmsSogakuKihon;
import temp.D2T.souzoku.entity.gen.TLrmsSogakuZisn;


public class Datamodel2TableCopierTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:T_LRMS_SOGAKU_KIHON
	 */
	@Test
	public void testＬＲＭＳ相続_T_LRMS_SOGAKU_KIHON_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
			//TODO
			ltPlanCollection.setToriatsukaishaId(null);
			//TODO
			ltPlanCollection.setKokyakuId(null);
			//TODO
			ltPlanCollection.setBunsekiShubetsu(null);
			//TODO
			ltPlanCollection.setPlanCreated(null);
			//TODO
			ltPlanCollection.setPlanUpdated(null);
			//TODO
			ltPlanCollection.setComment(null);
			//TODO
			ltPlanCollection.setSekkeiPlanNo(null);
			//TODO
			ltPlanCollection.setInsuredId(null);
		}
		Lisc0001Collection lisc0001Collection =new Lisc0001Collection ();
		{
			//TODO
			lisc0001Collection.setMaritalStatus(null);
			//TODO
			lisc0001Collection.setSettingOfHeir(null);
			//TODO
			lisc0001Collection.setHeirNumber(null);
		}
		
		//call convert method
		TLrmsSogakuKihon result=Datamodel2TableCopier.ＬＲＭＳ相続_T_LRMS_SOGAKU_KIHON(ltPlanCollection,  lisc0001Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getAgentId());
			//TODO
			assertEquals(null, result.getCustId());
			//TODO
			assertEquals(null, result.getBunsekiSbCd());
			//TODO
			assertEquals(null, result.getBunsekiCreateDate());
			//TODO
			assertEquals(null, result.getBunsekiUpdateDate());
			//TODO
			assertEquals(null, result.getBunsekiComment());
			//TODO
			assertEquals(null, result.getSekkeiPlanNo());
			//TODO
			assertEquals(null, result.getInsuredId());
			//TODO
			assertEquals(null, result.getSpouseUmuCd());
			//TODO
			assertEquals(null, result.getHtsznSbCd());
			//TODO
			assertEquals(null, result.getHtsznCnt());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:T_LRMS_SOGAKU_KIHON
	 */
	@Test(expected = SystemException.class)
	public void testＬＲＭＳ相続_T_LRMS_SOGAKU_KIHON_NG(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
			//TODO
			ltPlanCollection.setToriatsukaishaId(null);
			//TODO
			ltPlanCollection.setKokyakuId(null);
			//TODO
			ltPlanCollection.setBunsekiShubetsu(null);
			//TODO
			ltPlanCollection.setPlanCreated(null);
			//TODO
			ltPlanCollection.setPlanUpdated(null);
			//TODO
			ltPlanCollection.setComment(null);
			//TODO
			ltPlanCollection.setSekkeiPlanNo(null);
			//TODO
			ltPlanCollection.setInsuredId(null);
		}
		Lisc0001Collection lisc0001Collection =new Lisc0001Collection ();
		{
			//TODO
			lisc0001Collection.setMaritalStatus(null);
			//TODO
			lisc0001Collection.setSettingOfHeir(null);
			//TODO
			lisc0001Collection.setHeirNumber(null);
		}
		
		//call convert method
		TLrmsSogakuKihon result=Datamodel2TableCopier.ＬＲＭＳ相続_T_LRMS_SOGAKU_KIHON(ltPlanCollection,  lisc0001Collection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:T_LRMS_SOGAKU_ZISN
	 */
	@Test
	public void testＬＲＭＳ相続_T_LRMS_SOGAKU_ZISN_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
			//TODO
			ltPlanCollection.setToriatsukaishaId(null);
			//TODO
			ltPlanCollection.setKokyakuId(null);
			//TODO
			ltPlanCollection.setBunsekiShubetsu(null);
			//TODO
			ltPlanCollection.setPlanCreated(null);
			//TODO
			ltPlanCollection.setPlanUpdated(null);
			//TODO
			ltPlanCollection.setComment(null);
			//TODO
			ltPlanCollection.setSekkeiPlanNo(null);
			//TODO
			ltPlanCollection.setInsuredId(null);
		}
		Lisc000101Collection lisc000101Collection =new Lisc000101Collection ();
		{
			//TODO
			lisc000101Collection.setId(null);
			//TODO
			lisc000101Collection.setInheritance(null);
			//TODO
			lisc000101Collection.setAppraisedValue(null);
			//TODO
			lisc000101Collection.setHeir(null);
		}
		
		//call convert method
		TLrmsSogakuZisn result=Datamodel2TableCopier.ＬＲＭＳ相続_T_LRMS_SOGAKU_ZISN(ltPlanCollection,  lisc000101Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getSozokuZisnCd());
			//TODO
			assertEquals(null, result.getSozokuGaku());
			//TODO
			assertEquals(null, result.getHtsznSbKobetsuCd());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:T_LRMS_SOGAKU_ZISN
	 */
	@Test(expected = SystemException.class)
	public void testＬＲＭＳ相続_T_LRMS_SOGAKU_ZISN_NG(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
			//TODO
			ltPlanCollection.setToriatsukaishaId(null);
			//TODO
			ltPlanCollection.setKokyakuId(null);
			//TODO
			ltPlanCollection.setBunsekiShubetsu(null);
			//TODO
			ltPlanCollection.setPlanCreated(null);
			//TODO
			ltPlanCollection.setPlanUpdated(null);
			//TODO
			ltPlanCollection.setComment(null);
			//TODO
			ltPlanCollection.setSekkeiPlanNo(null);
			//TODO
			ltPlanCollection.setInsuredId(null);
		}
		Lisc000101Collection lisc000101Collection =new Lisc000101Collection ();
		{
			//TODO
			lisc000101Collection.setId(null);
			//TODO
			lisc000101Collection.setInheritance(null);
			//TODO
			lisc000101Collection.setAppraisedValue(null);
			//TODO
			lisc000101Collection.setHeir(null);
		}
		
		//call convert method
		TLrmsSogakuZisn result=Datamodel2TableCopier.ＬＲＭＳ相続_T_LRMS_SOGAKU_ZISN(ltPlanCollection,  lisc000101Collection);
	}	

}
