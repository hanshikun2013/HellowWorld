package temp.t2d.secondlife.copier.gen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import jp.co.axa.life.fw.exception.SystemException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.t2d.secondlife.datamodel.gen.Lrsc0301Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030201Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030202Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030203Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030204Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc0304Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030501Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030502Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030503Collection;
import temp.t2d.secondlife.datamodel.gen.Lrsc030701Collection;
import temp.t2d.secondlife.entity.gen.TLrms2lfKihon;
import temp.t2d.secondlife.entity.gen.TLrms2lfHysknLife;
import temp.t2d.secondlife.entity.gen.TLrms2lfHysknJutaku;
import temp.t2d.secondlife.entity.gen.TLrms2lfHysknEvent;
import temp.t2d.secondlife.entity.gen.TLrms2lfHysknOther;
import temp.t2d.secondlife.entity.gen.TLrms2lfJzsknNkjkm;
import temp.t2d.secondlife.entity.gen.TLrms2lfJzsknShunyu;
import temp.t2d.secondlife.entity.gen.TLrms2lfJzsknOther;


public class Table2DatamodelCopierTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc0301Collection
	 */
	@Test
	public void testTransferLrsc0301Collection_OK(){
		//Initialize parameters
		TLrms2lfKihon tLrms2lfKihon =new TLrms2lfKihon ();
		{
			tLrms2lfKihon.setHysknLife (null);
			tLrms2lfKihon.setJzsknTaishokukinMain (null);
			tLrms2lfKihon.setJzsknTaishokukinSp (null);
			tLrms2lfKihon.setJzsknYochokin (null);
			tLrms2lfKihon.setJzsknShunyuMain (null);
			tLrms2lfKihon.setJzsknShunyuSp (null);
			tLrms2lfKihon.setJzsknOther (null);
		}
		//call convert method
		Lrsc0301Collection result=Table2DatamodelCopier.transferLrsc0301Collection(tLrms2lfKihon);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getLivingCost());
			//TODO
			assertEquals(null, result.getHouse());
			//TODO
			assertEquals(null, result.getHobby());
			//TODO
			assertEquals(null, result.getOther());
			//TODO
			assertEquals(null, result.getNeedFunds());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualTotalLivingCostList());
			//TODO
			assertEquals(null, result.getAnnualTotalHouseList());
			//TODO
			assertEquals(null, result.getAnnualTotalHobbyList());
			//TODO
			assertEquals(null, result.getAnnualTotalOtherList());
			//TODO
			assertEquals(null, result.getAnnualTotalTotalList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualYearLivingCostList());
			//TODO
			assertEquals(null, result.getAnnualYearHouseList());
			//TODO
			assertEquals(null, result.getAnnualYearHobbyList());
			//TODO
			assertEquals(null, result.getAnnualYearOtherList());
			//TODO
			assertEquals(null, result.getAnnualYearTotalList());
			//TODO
			assertEquals(null, result.getDummySpFlg());
			//TODO
			assertEquals(null, result.getDummyHhAge());
			//TODO
			assertEquals(null, result.getDummyHhSex());
			//TODO
			assertEquals(null, result.getDummyHhBirth());
			//TODO
			assertEquals(null, result.getDummyHhPensionType());
			//TODO
			assertEquals(null, result.getDummyHhRetirementAge());
			//TODO
			assertEquals(null, result.getDummyHhJobStartYM());
			//TODO
			assertEquals(null, result.getDummyHhJobEndYM());
			//TODO
			assertEquals(null, result.getDummyHhIncome());
			//TODO
			assertEquals(null, result.getDummyHhAverageLengthOfLife());
			//TODO
			assertEquals(null, result.getDummySpAge());
			//TODO
			assertEquals(null, result.getDummySpSex());
			//TODO
			assertEquals(null, result.getDummySpBirth());
			//TODO
			assertEquals(null, result.getDummySpPensionType());
			//TODO
			assertEquals(null, result.getDummySpRetirementAge());
			//TODO
			assertEquals(null, result.getDummySpJobStartYM());
			//TODO
			assertEquals(null, result.getDummySpJobEndYM());
			//TODO
			assertEquals(null, result.getDummySpIncome());
			//TODO
			assertEquals(null, result.getDummySpAverageLengthOfLife());
			//TODO
			assertEquals(null, result.getDummySecondLifeFromAge());
			//TODO
			assertEquals(null, result.getDummySecondLifeToAge());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc0301Collection
	 */
	@Test
	public void testTransferLrsc0301Collection_AllNull(){
		//Initialize parameters
		TLrms2lfKihon tLrms2lfKihon =new TLrms2lfKihon ();
		{
			tLrms2lfKihon.setHysknLife (null);
			tLrms2lfKihon.setJzsknTaishokukinMain (null);
			tLrms2lfKihon.setJzsknTaishokukinSp (null);
			tLrms2lfKihon.setJzsknYochokin (null);
			tLrms2lfKihon.setJzsknShunyuMain (null);
			tLrms2lfKihon.setJzsknShunyuSp (null);
			tLrms2lfKihon.setJzsknOther (null);
		}
		//call convert method
		Lrsc0301Collection result=Table2DatamodelCopier.transferLrsc0301Collection(tLrms2lfKihon);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getLivingCost());
			//TODO
			assertEquals(null, result.getHouse());
			//TODO
			assertEquals(null, result.getHobby());
			//TODO
			assertEquals(null, result.getOther());
			//TODO
			assertEquals(null, result.getNeedFunds());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualTotalLivingCostList());
			//TODO
			assertEquals(null, result.getAnnualTotalHouseList());
			//TODO
			assertEquals(null, result.getAnnualTotalHobbyList());
			//TODO
			assertEquals(null, result.getAnnualTotalOtherList());
			//TODO
			assertEquals(null, result.getAnnualTotalTotalList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualYearLivingCostList());
			//TODO
			assertEquals(null, result.getAnnualYearHouseList());
			//TODO
			assertEquals(null, result.getAnnualYearHobbyList());
			//TODO
			assertEquals(null, result.getAnnualYearOtherList());
			//TODO
			assertEquals(null, result.getAnnualYearTotalList());
			//TODO
			assertEquals(null, result.getDummySpFlg());
			//TODO
			assertEquals(null, result.getDummyHhAge());
			//TODO
			assertEquals(null, result.getDummyHhSex());
			//TODO
			assertEquals(null, result.getDummyHhBirth());
			//TODO
			assertEquals(null, result.getDummyHhPensionType());
			//TODO
			assertEquals(null, result.getDummyHhRetirementAge());
			//TODO
			assertEquals(null, result.getDummyHhJobStartYM());
			//TODO
			assertEquals(null, result.getDummyHhJobEndYM());
			//TODO
			assertEquals(null, result.getDummyHhIncome());
			//TODO
			assertEquals(null, result.getDummyHhAverageLengthOfLife());
			//TODO
			assertEquals(null, result.getDummySpAge());
			//TODO
			assertEquals(null, result.getDummySpSex());
			//TODO
			assertEquals(null, result.getDummySpBirth());
			//TODO
			assertEquals(null, result.getDummySpPensionType());
			//TODO
			assertEquals(null, result.getDummySpRetirementAge());
			//TODO
			assertEquals(null, result.getDummySpJobStartYM());
			//TODO
			assertEquals(null, result.getDummySpJobEndYM());
			//TODO
			assertEquals(null, result.getDummySpIncome());
			//TODO
			assertEquals(null, result.getDummySpAverageLengthOfLife());
			//TODO
			assertEquals(null, result.getDummySecondLifeFromAge());
			//TODO
			assertEquals(null, result.getDummySecondLifeToAge());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc0301Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc0301Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfKihon tLrms2lfKihon =new TLrms2lfKihon ();
		{
			//TODO
			tLrms2lfKihon.setHysknLife (null);
			//TODO
			tLrms2lfKihon.setJzsknTaishokukinMain (null);
			//TODO
			tLrms2lfKihon.setJzsknTaishokukinSp (null);
			//TODO
			tLrms2lfKihon.setJzsknYochokin (null);
			//TODO
			tLrms2lfKihon.setJzsknShunyuMain (null);
			//TODO
			tLrms2lfKihon.setJzsknShunyuSp (null);
			//TODO
			tLrms2lfKihon.setJzsknOther (null);
		}
		//call convert method
		Lrsc0301Collection result=Table2DatamodelCopier.transferLrsc0301Collection(tLrms2lfKihon);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc030201Collection
	 */
	@Test
	public void testTransferLrsc030201Collection_OK(){
		//Initialize parameters
		TLrms2lfHysknLife tLrms2lfHysknLife =new TLrms2lfHysknLife ();
		{
			//tLrms2lfHysknLife.set (null);
		}
		//call convert method
		Lrsc030201Collection result=Table2DatamodelCopier.transferLrsc030201Collection(tLrms2lfHysknLife);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getInputMethod());
			//TODO
			assertEquals(null, result.getLivingCostTotal());
			//TODO
			assertEquals(null, result.getLivingCostCodeList());
			//TODO
			assertEquals(null, result.getLivingCostNameList());
			//TODO
			assertEquals(null, result.getLivingCostList());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc030201Collection
	 */
	@Test
	public void testTransferLrsc030201Collection_AllNull(){
		//Initialize parameters
		TLrms2lfHysknLife tLrms2lfHysknLife =new TLrms2lfHysknLife ();
		{
			//tLrms2lfHysknLife.set (null);
		}
		//call convert method
		Lrsc030201Collection result=Table2DatamodelCopier.transferLrsc030201Collection(tLrms2lfHysknLife);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getInputMethod());
			//TODO
			assertEquals(null, result.getLivingCostTotal());
			//TODO
			assertEquals(null, result.getLivingCostCodeList());
			//TODO
			assertEquals(null, result.getLivingCostNameList());
			//TODO
			assertEquals(null, result.getLivingCostList());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc030201Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc030201Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfHysknLife tLrms2lfHysknLife =new TLrms2lfHysknLife ();
		{
			//TODO
			//tLrms2lfHysknLife.set (null);
		}
		//call convert method
		Lrsc030201Collection result=Table2DatamodelCopier.transferLrsc030201Collection(tLrms2lfHysknLife);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc030202Collection
	 */
	@Test
	public void testTransferLrsc030202Collection_OK(){
		//Initialize parameters
		TLrms2lfHysknJutaku tLrms2lfHysknJutaku =new TLrms2lfHysknJutaku ();
		{
			tLrms2lfHysknJutaku.setGenzaiJukyoCd (null);
			tLrms2lfHysknJutaku.setGenzaiYachin (null);
			tLrms2lfHysknJutaku.setGetsugakuHensaigaku (null);
			tLrms2lfHysknJutaku.setHensaiKikan (null);
		}
		//call convert method
		Lrsc030202Collection result=Table2DatamodelCopier.transferLrsc030202Collection(tLrms2lfHysknJutaku);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getRadioHouseKbn());
			//TODO
			assertEquals(null, result.getCurrentRent());
			//TODO
			assertEquals(null, result.getAmountRepaid());
			//TODO
			assertEquals(null, result.getRemainingDuration());
			//TODO
			assertEquals(null, result.getRadioHouseKbnName());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc030202Collection
	 */
	@Test
	public void testTransferLrsc030202Collection_AllNull(){
		//Initialize parameters
		TLrms2lfHysknJutaku tLrms2lfHysknJutaku =new TLrms2lfHysknJutaku ();
		{
			tLrms2lfHysknJutaku.setGenzaiJukyoCd (null);
			tLrms2lfHysknJutaku.setGenzaiYachin (null);
			tLrms2lfHysknJutaku.setGetsugakuHensaigaku (null);
			tLrms2lfHysknJutaku.setHensaiKikan (null);
		}
		//call convert method
		Lrsc030202Collection result=Table2DatamodelCopier.transferLrsc030202Collection(tLrms2lfHysknJutaku);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getRadioHouseKbn());
			//TODO
			assertEquals(null, result.getCurrentRent());
			//TODO
			assertEquals(null, result.getAmountRepaid());
			//TODO
			assertEquals(null, result.getRemainingDuration());
			//TODO
			assertEquals(null, result.getRadioHouseKbnName());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc030202Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc030202Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfHysknJutaku tLrms2lfHysknJutaku =new TLrms2lfHysknJutaku ();
		{
			//TODO
			tLrms2lfHysknJutaku.setGenzaiJukyoCd (null);
			//TODO
			tLrms2lfHysknJutaku.setGenzaiYachin (null);
			//TODO
			tLrms2lfHysknJutaku.setGetsugakuHensaigaku (null);
			//TODO
			tLrms2lfHysknJutaku.setHensaiKikan (null);
		}
		//call convert method
		Lrsc030202Collection result=Table2DatamodelCopier.transferLrsc030202Collection(tLrms2lfHysknJutaku);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc030203Collection
	 */
	@Test
	public void testTransferLrsc030203Collection_OK(){
		//Initialize parameters
		TLrms2lfHysknEvent tLrms2lfHysknEvent =new TLrms2lfHysknEvent ();
		{
			tLrms2lfHysknEvent.setSeq (null);
			tLrms2lfHysknEvent.setHysknEventName (null);
			tLrms2lfHysknEvent.setEventStartAge (null);
			tLrms2lfHysknEvent.setEventEndAge (null);
			tLrms2lfHysknEvent.setEventSyuki (null);
			tLrms2lfHysknEvent.setEventHitsuyoKingaku (null);
		}
		//call convert method
		Lrsc030203Collection result=Table2DatamodelCopier.transferLrsc030203Collection(tLrms2lfHysknEvent);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getHobbyName());
			//TODO
			assertEquals(null, result.getHobbyStartAge());
			//TODO
			assertEquals(null, result.getHobbyEndAge());
			//TODO
			assertEquals(null, result.getHobbyInterval());
			//TODO
			assertEquals(null, result.getHobbyCost());
			//TODO
			assertEquals(null, result.getHobbyCode());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc030203Collection
	 */
	@Test
	public void testTransferLrsc030203Collection_AllNull(){
		//Initialize parameters
		TLrms2lfHysknEvent tLrms2lfHysknEvent =new TLrms2lfHysknEvent ();
		{
			tLrms2lfHysknEvent.setSeq (null);
			tLrms2lfHysknEvent.setHysknEventName (null);
			tLrms2lfHysknEvent.setEventStartAge (null);
			tLrms2lfHysknEvent.setEventEndAge (null);
			tLrms2lfHysknEvent.setEventSyuki (null);
			tLrms2lfHysknEvent.setEventHitsuyoKingaku (null);
		}
		//call convert method
		Lrsc030203Collection result=Table2DatamodelCopier.transferLrsc030203Collection(tLrms2lfHysknEvent);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getHobbyName());
			//TODO
			assertEquals(null, result.getHobbyStartAge());
			//TODO
			assertEquals(null, result.getHobbyEndAge());
			//TODO
			assertEquals(null, result.getHobbyInterval());
			//TODO
			assertEquals(null, result.getHobbyCost());
			//TODO
			assertEquals(null, result.getHobbyCode());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc030203Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc030203Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfHysknEvent tLrms2lfHysknEvent =new TLrms2lfHysknEvent ();
		{
			//TODO
			tLrms2lfHysknEvent.setSeq (null);
			//TODO
			tLrms2lfHysknEvent.setHysknEventName (null);
			//TODO
			tLrms2lfHysknEvent.setEventStartAge (null);
			//TODO
			tLrms2lfHysknEvent.setEventEndAge (null);
			//TODO
			tLrms2lfHysknEvent.setEventSyuki (null);
			//TODO
			tLrms2lfHysknEvent.setEventHitsuyoKingaku (null);
		}
		//call convert method
		Lrsc030203Collection result=Table2DatamodelCopier.transferLrsc030203Collection(tLrms2lfHysknEvent);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc030204Collection
	 */
	@Test
	public void testTransferLrsc030204Collection_OK(){
		//Initialize parameters
		TLrms2lfHysknOther tLrms2lfHysknOther =new TLrms2lfHysknOther ();
		{
			tLrms2lfHysknOther.setSeq (null);
			tLrms2lfHysknOther.setHysknOtherName (null);
			tLrms2lfHysknOther.setOtherHitsuyoStartAge (null);
			tLrms2lfHysknOther.setOtherHitsuyoEndAge (null);
			tLrms2lfHysknOther.setOtherHitsuyoSyuki (null);
			tLrms2lfHysknOther.setOtherHitsuyoKingaku (null);
		}
		//call convert method
		Lrsc030204Collection result=Table2DatamodelCopier.transferLrsc030204Collection(tLrms2lfHysknOther);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getOtherName());
			//TODO
			assertEquals(null, result.getOtherStartAge());
			//TODO
			assertEquals(null, result.getOtherEndAge());
			//TODO
			assertEquals(null, result.getOtherInterval());
			//TODO
			assertEquals(null, result.getOtherCost());
			//TODO
			assertEquals(null, result.getOtherCode());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc030204Collection
	 */
	@Test
	public void testTransferLrsc030204Collection_AllNull(){
		//Initialize parameters
		TLrms2lfHysknOther tLrms2lfHysknOther =new TLrms2lfHysknOther ();
		{
			tLrms2lfHysknOther.setSeq (null);
			tLrms2lfHysknOther.setHysknOtherName (null);
			tLrms2lfHysknOther.setOtherHitsuyoStartAge (null);
			tLrms2lfHysknOther.setOtherHitsuyoEndAge (null);
			tLrms2lfHysknOther.setOtherHitsuyoSyuki (null);
			tLrms2lfHysknOther.setOtherHitsuyoKingaku (null);
		}
		//call convert method
		Lrsc030204Collection result=Table2DatamodelCopier.transferLrsc030204Collection(tLrms2lfHysknOther);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getOtherName());
			//TODO
			assertEquals(null, result.getOtherStartAge());
			//TODO
			assertEquals(null, result.getOtherEndAge());
			//TODO
			assertEquals(null, result.getOtherInterval());
			//TODO
			assertEquals(null, result.getOtherCost());
			//TODO
			assertEquals(null, result.getOtherCode());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc030204Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc030204Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfHysknOther tLrms2lfHysknOther =new TLrms2lfHysknOther ();
		{
			//TODO
			tLrms2lfHysknOther.setSeq (null);
			//TODO
			tLrms2lfHysknOther.setHysknOtherName (null);
			//TODO
			tLrms2lfHysknOther.setOtherHitsuyoStartAge (null);
			//TODO
			tLrms2lfHysknOther.setOtherHitsuyoEndAge (null);
			//TODO
			tLrms2lfHysknOther.setOtherHitsuyoSyuki (null);
			//TODO
			tLrms2lfHysknOther.setOtherHitsuyoKingaku (null);
		}
		//call convert method
		Lrsc030204Collection result=Table2DatamodelCopier.transferLrsc030204Collection(tLrms2lfHysknOther);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc0304Collection
	 */
	@Test
	public void testTransferLrsc0304Collection_OK(){
		//Initialize parameters
		TLrms2lfKihon tLrms2lfKihon =new TLrms2lfKihon ();
		{
			tLrms2lfKihon.setHysknLife (null);
			tLrms2lfKihon.setJzsknTaishokukinMain (null);
			tLrms2lfKihon.setJzsknTaishokukinSp (null);
			tLrms2lfKihon.setJzsknYochokin (null);
			tLrms2lfKihon.setJzsknShunyuMain (null);
			tLrms2lfKihon.setJzsknShunyuSp (null);
			tLrms2lfKihon.setJzsknOther (null);
		}
		//call convert method
		Lrsc0304Collection result=Table2DatamodelCopier.transferLrsc0304Collection(tLrms2lfKihon);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getRetirementMoneyHh());
			//TODO
			assertEquals(null, result.getRetirementMoneySp());
			//TODO
			assertEquals(null, result.getDeposit());
			//TODO
			assertEquals(null, result.getIncomeHh());
			//TODO
			assertEquals(null, result.getIncomeSp());
			//TODO
			assertEquals(null, result.getOtherIncome());
			//TODO
			assertEquals(null, result.getPensionHh());
			//TODO
			assertEquals(null, result.getPensionSp());
			//TODO
			assertEquals(null, result.getPreparedFunds());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualTotalPensionList());
			//TODO
			assertEquals(null, result.getAnnualTotalIncomeList());
			//TODO
			assertEquals(null, result.getAnnualTotalOtherIncomeList());
			//TODO
			assertEquals(null, result.getAnnualTotalIncomeAndOtherIncomeList());
			//TODO
			assertEquals(null, result.getAnnualTotalTotalList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualYearPensionList());
			//TODO
			assertEquals(null, result.getAnnualYearIncomeList());
			//TODO
			assertEquals(null, result.getAnnualYearOtherIncomeList());
			//TODO
			assertEquals(null, result.getAnnualYearIncomeAndOtherIncomeList());
			//TODO
			assertEquals(null, result.getAnnualYearTotalList());
			//TODO
			assertEquals(null, result.getHhAgeList());
			//TODO
			assertEquals(null, result.getHhAdList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getHhAnnualTotalPensionList());
			//TODO
			assertEquals(null, result.getHhAnnualTotalIncomeList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getHhAnnualYearPensionList());
			//TODO
			assertEquals(null, result.getHhAnnualYearIncomeList());
			//TODO
			assertEquals(null, result.getSpAgeList());
			//TODO
			assertEquals(null, result.getSpAdList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getSpAnnualTotalPensionList());
			//TODO
			assertEquals(null, result.getSpAnnualTotalIncomeList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getSpAnnualYearPensionList());
			//TODO
			assertEquals(null, result.getSpAnnualYearIncomeList());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc0304Collection
	 */
	@Test
	public void testTransferLrsc0304Collection_AllNull(){
		//Initialize parameters
		TLrms2lfKihon tLrms2lfKihon =new TLrms2lfKihon ();
		{
			tLrms2lfKihon.setHysknLife (null);
			tLrms2lfKihon.setJzsknTaishokukinMain (null);
			tLrms2lfKihon.setJzsknTaishokukinSp (null);
			tLrms2lfKihon.setJzsknYochokin (null);
			tLrms2lfKihon.setJzsknShunyuMain (null);
			tLrms2lfKihon.setJzsknShunyuSp (null);
			tLrms2lfKihon.setJzsknOther (null);
		}
		//call convert method
		Lrsc0304Collection result=Table2DatamodelCopier.transferLrsc0304Collection(tLrms2lfKihon);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getRetirementMoneyHh());
			//TODO
			assertEquals(null, result.getRetirementMoneySp());
			//TODO
			assertEquals(null, result.getDeposit());
			//TODO
			assertEquals(null, result.getIncomeHh());
			//TODO
			assertEquals(null, result.getIncomeSp());
			//TODO
			assertEquals(null, result.getOtherIncome());
			//TODO
			assertEquals(null, result.getPensionHh());
			//TODO
			assertEquals(null, result.getPensionSp());
			//TODO
			assertEquals(null, result.getPreparedFunds());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualTotalPensionList());
			//TODO
			assertEquals(null, result.getAnnualTotalIncomeList());
			//TODO
			assertEquals(null, result.getAnnualTotalOtherIncomeList());
			//TODO
			assertEquals(null, result.getAnnualTotalIncomeAndOtherIncomeList());
			//TODO
			assertEquals(null, result.getAnnualTotalTotalList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualYearPensionList());
			//TODO
			assertEquals(null, result.getAnnualYearIncomeList());
			//TODO
			assertEquals(null, result.getAnnualYearOtherIncomeList());
			//TODO
			assertEquals(null, result.getAnnualYearIncomeAndOtherIncomeList());
			//TODO
			assertEquals(null, result.getAnnualYearTotalList());
			//TODO
			assertEquals(null, result.getHhAgeList());
			//TODO
			assertEquals(null, result.getHhAdList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getHhAnnualTotalPensionList());
			//TODO
			assertEquals(null, result.getHhAnnualTotalIncomeList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getHhAnnualYearPensionList());
			//TODO
			assertEquals(null, result.getHhAnnualYearIncomeList());
			//TODO
			assertEquals(null, result.getSpAgeList());
			//TODO
			assertEquals(null, result.getSpAdList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getSpAnnualTotalPensionList());
			//TODO
			assertEquals(null, result.getSpAnnualTotalIncomeList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getSpAnnualYearPensionList());
			//TODO
			assertEquals(null, result.getSpAnnualYearIncomeList());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc0304Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc0304Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfKihon tLrms2lfKihon =new TLrms2lfKihon ();
		{
			//TODO
			tLrms2lfKihon.setHysknLife (null);
			//TODO
			tLrms2lfKihon.setJzsknTaishokukinMain (null);
			//TODO
			tLrms2lfKihon.setJzsknTaishokukinSp (null);
			//TODO
			tLrms2lfKihon.setJzsknYochokin (null);
			//TODO
			tLrms2lfKihon.setJzsknShunyuMain (null);
			//TODO
			tLrms2lfKihon.setJzsknShunyuSp (null);
			//TODO
			tLrms2lfKihon.setJzsknOther (null);
		}
		//call convert method
		Lrsc0304Collection result=Table2DatamodelCopier.transferLrsc0304Collection(tLrms2lfKihon);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc030501Collection
	 */
	@Test
	public void testTransferLrsc030501Collection_OK(){
		//Initialize parameters
		TLrms2lfJzsknNkjkm tLrms2lfJzsknNkjkm =new TLrms2lfJzsknNkjkm ();
		{
			//tLrms2lfJzsknNkjkm.set (null);
		}
		//call convert method
		Lrsc030501Collection result=Table2DatamodelCopier.transferLrsc030501Collection(tLrms2lfJzsknNkjkm);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getInputMethod());
			//TODO
			assertEquals(null, result.getPersonSpouseFlg());
			//TODO
			assertEquals(null, result.getPensionStartAgeList());
			//TODO
			assertEquals(null, result.getPensionEndAgeList());
			//TODO
			assertEquals(null, result.getPensionAmountList());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc030501Collection
	 */
	@Test
	public void testTransferLrsc030501Collection_AllNull(){
		//Initialize parameters
		TLrms2lfJzsknNkjkm tLrms2lfJzsknNkjkm =new TLrms2lfJzsknNkjkm ();
		{
			//tLrms2lfJzsknNkjkm.set (null);
		}
		//call convert method
		Lrsc030501Collection result=Table2DatamodelCopier.transferLrsc030501Collection(tLrms2lfJzsknNkjkm);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getInputMethod());
			//TODO
			assertEquals(null, result.getPersonSpouseFlg());
			//TODO
			assertEquals(null, result.getPensionStartAgeList());
			//TODO
			assertEquals(null, result.getPensionEndAgeList());
			//TODO
			assertEquals(null, result.getPensionAmountList());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc030501Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc030501Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfJzsknNkjkm tLrms2lfJzsknNkjkm =new TLrms2lfJzsknNkjkm ();
		{
			//TODO
			//tLrms2lfJzsknNkjkm.set (null);
		}
		//call convert method
		Lrsc030501Collection result=Table2DatamodelCopier.transferLrsc030501Collection(tLrms2lfJzsknNkjkm);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc030502Collection
	 */
	@Test
	public void testTransferLrsc030502Collection_OK(){
		//Initialize parameters
		TLrms2lfJzsknShunyu tLrms2lfJzsknShunyu =new TLrms2lfJzsknShunyu ();
		{
			tLrms2lfJzsknShunyu.setSeq (null);
			tLrms2lfJzsknShunyu.setFamilyHonspoCd (null);
			tLrms2lfJzsknShunyu.setNenshuStartAge (null);
			tLrms2lfJzsknShunyu.setNenshuEndAge (null);
			tLrms2lfJzsknShunyu.setNenshuGaku (null);
		}
		//call convert method
		Lrsc030502Collection result=Table2DatamodelCopier.transferLrsc030502Collection(tLrms2lfJzsknShunyu);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getLineNo());
			//TODO
			assertEquals(null, result.getPersonSpouseFlg());
			//TODO
			assertEquals(null, result.getIncomeStartAge());
			//TODO
			assertEquals(null, result.getIncomeEndAge());
			//TODO
			assertEquals(null, result.getIncomeAmount());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc030502Collection
	 */
	@Test
	public void testTransferLrsc030502Collection_AllNull(){
		//Initialize parameters
		TLrms2lfJzsknShunyu tLrms2lfJzsknShunyu =new TLrms2lfJzsknShunyu ();
		{
			tLrms2lfJzsknShunyu.setSeq (null);
			tLrms2lfJzsknShunyu.setFamilyHonspoCd (null);
			tLrms2lfJzsknShunyu.setNenshuStartAge (null);
			tLrms2lfJzsknShunyu.setNenshuEndAge (null);
			tLrms2lfJzsknShunyu.setNenshuGaku (null);
		}
		//call convert method
		Lrsc030502Collection result=Table2DatamodelCopier.transferLrsc030502Collection(tLrms2lfJzsknShunyu);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getLineNo());
			//TODO
			assertEquals(null, result.getPersonSpouseFlg());
			//TODO
			assertEquals(null, result.getIncomeStartAge());
			//TODO
			assertEquals(null, result.getIncomeEndAge());
			//TODO
			assertEquals(null, result.getIncomeAmount());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc030502Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc030502Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfJzsknShunyu tLrms2lfJzsknShunyu =new TLrms2lfJzsknShunyu ();
		{
			//TODO
			tLrms2lfJzsknShunyu.setSeq (null);
			//TODO
			tLrms2lfJzsknShunyu.setFamilyHonspoCd (null);
			//TODO
			tLrms2lfJzsknShunyu.setNenshuStartAge (null);
			//TODO
			tLrms2lfJzsknShunyu.setNenshuEndAge (null);
			//TODO
			tLrms2lfJzsknShunyu.setNenshuGaku (null);
		}
		//call convert method
		Lrsc030502Collection result=Table2DatamodelCopier.transferLrsc030502Collection(tLrms2lfJzsknShunyu);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc030503Collection
	 */
	@Test
	public void testTransferLrsc030503Collection_OK(){
		//Initialize parameters
		TLrms2lfJzsknOther tLrms2lfJzsknOther =new TLrms2lfJzsknOther ();
		{
			tLrms2lfJzsknOther.setSeq (null);
			tLrms2lfJzsknOther.setOtherShunyuName (null);
			tLrms2lfJzsknOther.setShunyuStartAge (null);
			tLrms2lfJzsknOther.setShunyuEndAge (null);
			tLrms2lfJzsknOther.setShunyuGaku (null);
		}
		//call convert method
		Lrsc030503Collection result=Table2DatamodelCopier.transferLrsc030503Collection(tLrms2lfJzsknOther);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getLineNo());
			//TODO
			assertEquals(null, result.getOtherContentName());
			//TODO
			assertEquals(null, result.getOtherStartAge());
			//TODO
			assertEquals(null, result.getOtherEndAge());
			//TODO
			assertEquals(null, result.getOtherAmount());
			//TODO
			assertEquals(null, result.getOtherContentCode());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc030503Collection
	 */
	@Test
	public void testTransferLrsc030503Collection_AllNull(){
		//Initialize parameters
		TLrms2lfJzsknOther tLrms2lfJzsknOther =new TLrms2lfJzsknOther ();
		{
			tLrms2lfJzsknOther.setSeq (null);
			tLrms2lfJzsknOther.setOtherShunyuName (null);
			tLrms2lfJzsknOther.setShunyuStartAge (null);
			tLrms2lfJzsknOther.setShunyuEndAge (null);
			tLrms2lfJzsknOther.setShunyuGaku (null);
		}
		//call convert method
		Lrsc030503Collection result=Table2DatamodelCopier.transferLrsc030503Collection(tLrms2lfJzsknOther);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getLineNo());
			//TODO
			assertEquals(null, result.getOtherContentName());
			//TODO
			assertEquals(null, result.getOtherStartAge());
			//TODO
			assertEquals(null, result.getOtherEndAge());
			//TODO
			assertEquals(null, result.getOtherAmount());
			//TODO
			assertEquals(null, result.getOtherContentCode());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc030503Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc030503Collection_ExceptionExpected(){
		//Initialize parameters
		TLrms2lfJzsknOther tLrms2lfJzsknOther =new TLrms2lfJzsknOther ();
		{
			//TODO
			tLrms2lfJzsknOther.setSeq (null);
			//TODO
			tLrms2lfJzsknOther.setOtherShunyuName (null);
			//TODO
			tLrms2lfJzsknOther.setShunyuStartAge (null);
			//TODO
			tLrms2lfJzsknOther.setShunyuEndAge (null);
			//TODO
			tLrms2lfJzsknOther.setShunyuGaku (null);
		}
		//call convert method
		Lrsc030503Collection result=Table2DatamodelCopier.transferLrsc030503Collection(tLrms2lfJzsknOther);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test :Lrsc030701Collection
	 */
	@Test
	public void testTransferLrsc030701Collection_OK(){
		//Initialize parameters
		//call convert method
		Lrsc030701Collection result=Table2DatamodelCopier.transferLrsc030701Collection();
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualTotalListShortageList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualYearListShortageList());
			//TODO
			assertEquals(null, result.getAnnualYearListOtherList());
		}
	}

	
	/*
	 * データ変換処理：
	 * Test :Lrsc030701Collection
	 */
	@Test
	public void testTransferLrsc030701Collection_AllNull(){
		//Initialize parameters
		//call convert method
		Lrsc030701Collection result=Table2DatamodelCopier.transferLrsc030701Collection();
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualTotalListShortageList());
			//TODO
			assertEquals(null, result.get());
			//TODO
			assertEquals(null, result.getAnnualYearListShortageList());
			//TODO
			assertEquals(null, result.getAnnualYearListOtherList());
		}
	}

	/*
	 * データ変換処理：
	 * Test :Lrsc030701Collection
	 */
	@Test(expected = SystemException.class)
	public void testTransferLrsc030701Collection_ExceptionExpected(){
		//Initialize parameters
		//call convert method
		Lrsc030701Collection result=Table2DatamodelCopier.transferLrsc030701Collection();
		//assertions
	}
	

}
