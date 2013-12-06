package temp.D2T.kaigo.copier.gen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import jp.co.axa.life.fw.exception.SystemException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.D2T.kaigo.datamodel.gen.LtPlanCollection;
import temp.D2T.kaigo.datamodel.gen.Lcsc0501Collection;
import temp.D2T.kaigo.entity.gen.TLrmsCareHoshoKihon;


public class Datamodel2TableCopierTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ介護:T_LRMS_CARE_HOSHO_KIHON
	 */
	@Test
	public void testＬＲＭＳ介護_T_LRMS_CARE_HOSHO_KIHON_OK(){
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
			ltPlanCollection.setComment(null);
			//TODO
			ltPlanCollection.setPlanCreated(null);
			//TODO
			ltPlanCollection.setPlanUpdated(null);
			//TODO
			ltPlanCollection.setSekkeiPlanNo(null);
			//TODO
			ltPlanCollection.setInsuredId(null);
		}
		Lcsc0501Collection lcsc0501Collection =new Lcsc0501Collection ();
		{
			//TODO
			lcsc0501Collection.setCareType(null);
			//TODO
			lcsc0501Collection.setRadioType(null);
			//TODO
			lcsc0501Collection.setCareKikan(null);
			//TODO
			lcsc0501Collection.setTemporaryMoney(null);
			//TODO
			lcsc0501Collection.setCareNenkin(null);
			//TODO
			lcsc0501Collection.setCareNenkinUketorikikan(null);
			//TODO
			lcsc0501Collection.setHosyoKikan(null);
			//TODO
			lcsc0501Collection.setListHosyoKikanTani(null);
			//TODO
			lcsc0501Collection.setHaraikomiKikan(null);
			//TODO
			lcsc0501Collection.setListHaraikomiKikanTani(null);
			//TODO
			lcsc0501Collection.setCheckModoshikin(null);
		}
		
		//call convert method
		TLrmsCareHoshoKihon result=Datamodel2TableCopier.ＬＲＭＳ介護_T_LRMS_CARE_HOSHO_KIHON(ltPlanCollection,  lcsc0501Collection);
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
			assertEquals(null, result.getBunsekiComment());
			//TODO
			assertEquals(null, result.getBunsekiCreateDate());
			//TODO
			assertEquals(null, result.getBunsekiUpdateDate());
			//TODO
			assertEquals(null, result.getSekkeiPlanNo());
			//TODO
			assertEquals(null, result.getInsuredId());
			//TODO
			assertEquals(null, result.getCareTypeCd());
			//TODO
			assertEquals(null, result.getZitkSsetCareCd());
			//TODO
			assertEquals(null, result.getCareHitsuyoNensu());
			//TODO
			assertEquals(null, result.getJzkghsIchijikin());
			//TODO
			assertEquals(null, result.getJzkghsNenkin());
			//TODO
			assertEquals(null, result.getJzkghsNenkinKikan());
			//TODO
			assertEquals(null, result.getJzkghsKikan());
			//TODO
			assertEquals(null, result.getJzkghsKikanTaniCd());
			//TODO
			assertEquals(null, result.getJzkghsHaraikomikikan());
			//TODO
			assertEquals(null, result.getJzkghsHaraikomiTaniCd());
			//TODO
			assertEquals(null, result.getJzkghsWUmuCd());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ介護:T_LRMS_CARE_HOSHO_KIHON
	 */
	@Test(expected = SystemException.class)
	public void testＬＲＭＳ介護_T_LRMS_CARE_HOSHO_KIHON_NG(){
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
			ltPlanCollection.setComment(null);
			//TODO
			ltPlanCollection.setPlanCreated(null);
			//TODO
			ltPlanCollection.setPlanUpdated(null);
			//TODO
			ltPlanCollection.setSekkeiPlanNo(null);
			//TODO
			ltPlanCollection.setInsuredId(null);
		}
		Lcsc0501Collection lcsc0501Collection =new Lcsc0501Collection ();
		{
			//TODO
			lcsc0501Collection.setCareType(null);
			//TODO
			lcsc0501Collection.setRadioType(null);
			//TODO
			lcsc0501Collection.setCareKikan(null);
			//TODO
			lcsc0501Collection.setTemporaryMoney(null);
			//TODO
			lcsc0501Collection.setCareNenkin(null);
			//TODO
			lcsc0501Collection.setCareNenkinUketorikikan(null);
			//TODO
			lcsc0501Collection.setHosyoKikan(null);
			//TODO
			lcsc0501Collection.setListHosyoKikanTani(null);
			//TODO
			lcsc0501Collection.setHaraikomiKikan(null);
			//TODO
			lcsc0501Collection.setListHaraikomiKikanTani(null);
			//TODO
			lcsc0501Collection.setCheckModoshikin(null);
		}
		
		//call convert method
		TLrmsCareHoshoKihon result=Datamodel2TableCopier.ＬＲＭＳ介護_T_LRMS_CARE_HOSHO_KIHON(ltPlanCollection,  lcsc0501Collection);
	}	

}
