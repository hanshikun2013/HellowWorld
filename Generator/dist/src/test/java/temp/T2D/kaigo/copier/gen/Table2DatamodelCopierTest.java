package temp.T2D.kaigo.copier.gen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import jp.co.axa.life.fw.exception.SystemException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.T2D.kaigo.datamodel.gen.Lcsc0501Collection;
import temp.T2D.kaigo.entity.gen.TLrmsCareHoshoKihon;


public class Table2DatamodelCopierTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ介護:Lcsc0501Collection
	 */
	@Test
	public void testＬＲＭＳ介護_Lcsc0501Collection_OK(){
		//Initialize parameters
		TLrmsCareHoshoKihon tLrmsCareHoshoKihon =new TLrmsCareHoshoKihon ();
		{
			tLrmsCareHoshoKihon.setCareTypeCd (null);
			tLrmsCareHoshoKihon.setZitkSsetCareCd (null);
			tLrmsCareHoshoKihon.setCareHitsuyoNensu (null);
			tLrmsCareHoshoKihon.setJzkghsIchijikin (null);
			tLrmsCareHoshoKihon.setJzkghsNenkin (null);
			tLrmsCareHoshoKihon.setJzkghsNenkinKikan (null);
			tLrmsCareHoshoKihon.setJzkghsKikan (null);
			tLrmsCareHoshoKihon.setJzkghsKikanTaniCd (null);
			tLrmsCareHoshoKihon.setJzkghsHaraikomikikan (null);
			tLrmsCareHoshoKihon.setJzkghsHaraikomiTaniCd (null);
			tLrmsCareHoshoKihon.setJzkghsWUmuCd (null);
		}
		//call convert method
		Lcsc0501Collection result=Table2DatamodelCopier.ＬＲＭＳ介護_Lcsc0501Collection(tLrmsCareHoshoKihon);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getCareType());
			//TODO
			assertEquals(null, result.getRadioType());
			//TODO
			assertEquals(null, result.getCareKikan());
			//TODO
			assertEquals(null, result.getTemporaryMoney());
			//TODO
			assertEquals(null, result.getCareNenkin());
			//TODO
			assertEquals(null, result.getCareNenkinUketorikikan());
			//TODO
			assertEquals(null, result.getHosyoKikan());
			//TODO
			assertEquals(null, result.getListHosyoKikanTani());
			//TODO
			assertEquals(null, result.getHaraikomiKikan());
			//TODO
			assertEquals(null, result.getListHaraikomiKikanTani());
			//TODO
			assertEquals(null, result.getCheckModoshikin());
			//TODO
			assertEquals(null, result.getFamilyNo());
			//TODO
			assertEquals(null, result.getCareTypeString());
			//TODO
			assertEquals(null, result.getRadioTypeString());
			//TODO
			assertEquals(null, result.getListCareLevel());
			//TODO
			assertEquals(null, result.getListCareLevelString());
			//TODO
			assertEquals(null, result.getInitialCost());
			//TODO
			assertEquals(null, result.getMonthsOwnExpenses());
			//TODO
			assertEquals(null, result.getYearsOwnExpenses());
			//TODO
			assertEquals(null, result.getTotalCost());
			//TODO
			assertEquals(null, result.getAssistiveDeviceList());
			//TODO
			assertEquals(null, result.getAssistiveDeviceCareAmount());
			//TODO
			assertEquals(null, result.getAssistiveDeviceOwnExpenses());
			//TODO
			assertEquals(null, result.getHomeImprovementList());
			//TODO
			assertEquals(null, result.getHomeImprovementCareAmount());
			//TODO
			assertEquals(null, result.getHomeImprovementOwnExpenses());
			//TODO
			assertEquals(null, result.getInitialCostTotalCost());
			//TODO
			assertEquals(null, result.getInitialCostCareAmount());
			//TODO
			assertEquals(null, result.getPeriodCostList());
			//TODO
			assertEquals(null, result.getPeriodCostTotalCost());
			//TODO
			assertEquals(null, result.getPeriodCostCareAmount());
			//TODO
			assertEquals(null, result.getPeriodCostCareAmountOutLimit());
			//TODO
			assertEquals(null, result.getPeriodCostTenPerExpenses());
			//TODO
			assertEquals(null, result.getPeriodCostAllExpenses());
			//TODO
			assertEquals(null, result.getSimulationAge());
			//TODO
			assertEquals(null, result.getHosyoMoney());
			//TODO
			assertEquals(null, result.getExcessDeficiency());
			//TODO
			assertEquals(null, result.getListHosyoKikanTaniString());
			//TODO
			assertEquals(null, result.getListHaraikomiKikanTaniString());
			//TODO
			assertEquals(null, result.getCheckModoshikinString());
			//TODO
			assertEquals(null, result.getLifeSpanAvg());
		}
	}

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ介護:Lcsc0501Collection
	 */
	@Test(expected = SystemException.class)
	public void testＬＲＭＳ介護_Lcsc0501Collection_NG(){
		//Initialize parameters
		TLrmsCareHoshoKihon tLrmsCareHoshoKihon =new TLrmsCareHoshoKihon ();
		{
			//TODO
			tLrmsCareHoshoKihon.setCareTypeCd (null);
			//TODO
			tLrmsCareHoshoKihon.setZitkSsetCareCd (null);
			//TODO
			tLrmsCareHoshoKihon.setCareHitsuyoNensu (null);
			//TODO
			tLrmsCareHoshoKihon.setJzkghsIchijikin (null);
			//TODO
			tLrmsCareHoshoKihon.setJzkghsNenkin (null);
			//TODO
			tLrmsCareHoshoKihon.setJzkghsNenkinKikan (null);
			//TODO
			tLrmsCareHoshoKihon.setJzkghsKikan (null);
			//TODO
			tLrmsCareHoshoKihon.setJzkghsKikanTaniCd (null);
			//TODO
			tLrmsCareHoshoKihon.setJzkghsHaraikomikikan (null);
			//TODO
			tLrmsCareHoshoKihon.setJzkghsHaraikomiTaniCd (null);
			//TODO
			tLrmsCareHoshoKihon.setJzkghsWUmuCd (null);
		}
		//call convert method
		Lcsc0501Collection result=Table2DatamodelCopier.ＬＲＭＳ介護_Lcsc0501Collection(tLrmsCareHoshoKihon);
		//assertions
	}
	

}
