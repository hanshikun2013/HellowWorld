package temp.d2t.secondlife.copier.gen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import jp.co.axa.life.fw.exception.SystemException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.d2t.secondlife.datamodel.gen.LtPlanCollection;
import temp.d2t.secondlife.datamodel.gen.Lrsc0304Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030501Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030201Collection;
import temp.d2t.secondlife.datamodel.gen.Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030202Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030203Collection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030204Collection;
import temp.d2t.secondlife.datamodel.gen.LtPensionCollection;
import temp.d2t.secondlife.datamodel.gen.Lrsc030502Collection;
import temp.d2t.secondlife.datamodel.gen.LRSC030503Collection;
import temp.d2t.secondlife.entity.gen.TLrms2lfKihon;
import temp.d2t.secondlife.entity.gen.TLrms2lfHysknLife;
import temp.d2t.secondlife.entity.gen.TLrms2lfHysknJutaku;
import temp.d2t.secondlife.entity.gen.TLrms2lfHysknEvent;
import temp.d2t.secondlife.entity.gen.TLrms2lfHysknOther;
import temp.d2t.secondlife.entity.gen.TLrms2lfJzsknNkjkm;
import temp.d2t.secondlife.entity.gen.TLrms2lfJzsknNkknm;
import temp.d2t.secondlife.entity.gen.TLrms2lfJzsknShunyu;
import temp.d2t.secondlife.entity.gen.TLrms2lfJzsknOther;


public class Datamodel2TableCopierTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_KIHON
	 */
	@Test
	public void testTransferTLrms2LfKihon_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc0304Collection lrsc0304Collection =new Lrsc0304Collection ();
		{
			//TODO
			lrsc0304Collection.setRetirementMoneyHh(null);
			//TODO
			lrsc0304Collection.setRetirementMoneySp(null);
			//TODO
			lrsc0304Collection.setDeposit(null);
		}
		Lrsc030501Collection lrsc030501Collection =new Lrsc030501Collection ();
		{
			//TODO
			lrsc030501Collection.setInputMethod(null);
			//TODO
			lrsc030501Collection.setPersonSpouseFlg(null);
		}
		
		//call convert method
		TLrms2lfKihon result=Datamodel2TableCopier.transferTLrms2LfKihon(ltPlanCollection,  lrsc0304Collection,  lrsc030501Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getJzsknTaishokukinMain());
			//TODO
			assertEquals(null, result.getJzsknTaishokukinSp());
			//TODO
			assertEquals(null, result.getJzsknYochokin());
			//TODO
			assertEquals(null, result.getNenkinInputCdMain());
			//TODO
			assertEquals(null, result.getNenkinInputCdSp());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_KIHON
	 */
	@Test
	public void testTransferTLrms2LfKihon_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		Lrsc0304Collection lrsc0304Collection = null;
		Lrsc030501Collection lrsc030501Collection = null;
		
		//call convert method
		TLrms2lfKihon result=Datamodel2TableCopier.transferTLrms2LfKihon(ltPlanCollection,  lrsc0304Collection,  lrsc030501Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getJzsknTaishokukinMain());
			//TODO
			assertEquals(null, result.getJzsknTaishokukinSp());
			//TODO
			assertEquals(null, result.getJzsknYochokin());
			//TODO
			assertEquals(null, result.getNenkinInputCdMain());
			//TODO
			assertEquals(null, result.getNenkinInputCdSp());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_KIHON
	 */
	@Test
	public void testTransferTLrms2LfKihon_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc0304Collection lrsc0304Collection =new Lrsc0304Collection ();
		{
			//TODO
			lrsc0304Collection.setRetirementMoneyHh(null);
			//TODO
			lrsc0304Collection.setRetirementMoneySp(null);
			//TODO
			lrsc0304Collection.setDeposit(null);
		}
		Lrsc030501Collection lrsc030501Collection =new Lrsc030501Collection ();
		{
			//TODO
			lrsc030501Collection.setInputMethod(null);
			//TODO
			lrsc030501Collection.setPersonSpouseFlg(null);
		}
		
		//call convert method
		TLrms2lfKihon result=Datamodel2TableCopier.transferTLrms2LfKihon(ltPlanCollection,  lrsc0304Collection,  lrsc030501Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getJzsknTaishokukinMain());
			//TODO
			assertEquals(null, result.getJzsknTaishokukinSp());
			//TODO
			assertEquals(null, result.getJzsknYochokin());
			//TODO
			assertEquals(null, result.getNenkinInputCdMain());
			//TODO
			assertEquals(null, result.getNenkinInputCdSp());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_KIHON
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfKihon_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc0304Collection lrsc0304Collection =new Lrsc0304Collection ();
		{
			//TODO
			lrsc0304Collection.setRetirementMoneyHh(null);
			//TODO
			lrsc0304Collection.setRetirementMoneySp(null);
			//TODO
			lrsc0304Collection.setDeposit(null);
		}
		Lrsc030501Collection lrsc030501Collection =new Lrsc030501Collection ();
		{
			//TODO
			lrsc030501Collection.setInputMethod(null);
			//TODO
			lrsc030501Collection.setPersonSpouseFlg(null);
		}
		
		//call convert method
		TLrms2lfKihon result=Datamodel2TableCopier.transferTLrms2LfKihon(ltPlanCollection,  lrsc0304Collection,  lrsc030501Collection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_LIFE
	 */
	@Test
	public void testTransferTLrms2LfHysknLife_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030201Collection lrsc030201Collection =new Lrsc030201Collection ();
		{
			//TODO
			lrsc030201Collection.set(null);
		}
		Collection collection =new Collection ();
		{
			//TODO
			collection.set(null);
		}
		
		//call convert method
		TLrms2lfHysknLife result=Datamodel2TableCopier.transferTLrms2LfHysknLife(ltPlanCollection,  lrsc030201Collection,  collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getSeikatsuhiItemName());
			//TODO
			assertEquals(null, result.getSeikatsuhiItemKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_LIFE
	 */
	@Test
	public void testTransferTLrms2LfHysknLife_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		Lrsc030201Collection lrsc030201Collection = null;
		Collection collection = null;
		
		//call convert method
		TLrms2lfHysknLife result=Datamodel2TableCopier.transferTLrms2LfHysknLife(ltPlanCollection,  lrsc030201Collection,  collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getSeikatsuhiItemName());
			//TODO
			assertEquals(null, result.getSeikatsuhiItemKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_LIFE
	 */
	@Test
	public void testTransferTLrms2LfHysknLife_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030201Collection lrsc030201Collection =new Lrsc030201Collection ();
		{
			//TODO
			lrsc030201Collection.set(null);
		}
		Collection collection =new Collection ();
		{
			//TODO
			collection.set(null);
		}
		
		//call convert method
		TLrms2lfHysknLife result=Datamodel2TableCopier.transferTLrms2LfHysknLife(ltPlanCollection,  lrsc030201Collection,  collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getSeikatsuhiItemName());
			//TODO
			assertEquals(null, result.getSeikatsuhiItemKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_LIFE
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfHysknLife_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030201Collection lrsc030201Collection =new Lrsc030201Collection ();
		{
			//TODO
			lrsc030201Collection.set(null);
		}
		Collection collection =new Collection ();
		{
			//TODO
			collection.set(null);
		}
		
		//call convert method
		TLrms2lfHysknLife result=Datamodel2TableCopier.transferTLrms2LfHysknLife(ltPlanCollection,  lrsc030201Collection,  collection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_JUTAKU
	 */
	@Test
	public void testTransferTLrms2LfHysknJutaku_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030202Collection lrsc030202Collection =new Lrsc030202Collection ();
		{
			//TODO
			lrsc030202Collection.setRadioHouseKbn(null);
			//TODO
			lrsc030202Collection.setCurrentRent(null);
			//TODO
			lrsc030202Collection.setAmountRepaid(null);
			//TODO
			lrsc030202Collection.setRemainingDuration(null);
		}
		
		//call convert method
		TLrms2lfHysknJutaku result=Datamodel2TableCopier.transferTLrms2LfHysknJutaku(ltPlanCollection,  lrsc030202Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getGenzaiJukyoCd());
			//TODO
			assertEquals(null, result.getGenzaiYachin());
			//TODO
			assertEquals(null, result.getGetsugakuHensaigaku());
			//TODO
			assertEquals(null, result.getHensaiKikan());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_JUTAKU
	 */
	@Test
	public void testTransferTLrms2LfHysknJutaku_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		Lrsc030202Collection lrsc030202Collection = null;
		
		//call convert method
		TLrms2lfHysknJutaku result=Datamodel2TableCopier.transferTLrms2LfHysknJutaku(ltPlanCollection,  lrsc030202Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getGenzaiJukyoCd());
			//TODO
			assertEquals(null, result.getGenzaiYachin());
			//TODO
			assertEquals(null, result.getGetsugakuHensaigaku());
			//TODO
			assertEquals(null, result.getHensaiKikan());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_JUTAKU
	 */
	@Test
	public void testTransferTLrms2LfHysknJutaku_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030202Collection lrsc030202Collection =new Lrsc030202Collection ();
		{
			//TODO
			lrsc030202Collection.setRadioHouseKbn(null);
			//TODO
			lrsc030202Collection.setCurrentRent(null);
			//TODO
			lrsc030202Collection.setAmountRepaid(null);
			//TODO
			lrsc030202Collection.setRemainingDuration(null);
		}
		
		//call convert method
		TLrms2lfHysknJutaku result=Datamodel2TableCopier.transferTLrms2LfHysknJutaku(ltPlanCollection,  lrsc030202Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getGenzaiJukyoCd());
			//TODO
			assertEquals(null, result.getGenzaiYachin());
			//TODO
			assertEquals(null, result.getGetsugakuHensaigaku());
			//TODO
			assertEquals(null, result.getHensaiKikan());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_JUTAKU
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfHysknJutaku_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030202Collection lrsc030202Collection =new Lrsc030202Collection ();
		{
			//TODO
			lrsc030202Collection.setRadioHouseKbn(null);
			//TODO
			lrsc030202Collection.setCurrentRent(null);
			//TODO
			lrsc030202Collection.setAmountRepaid(null);
			//TODO
			lrsc030202Collection.setRemainingDuration(null);
		}
		
		//call convert method
		TLrms2lfHysknJutaku result=Datamodel2TableCopier.transferTLrms2LfHysknJutaku(ltPlanCollection,  lrsc030202Collection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_EVENT
	 */
	@Test
	public void testTransferTLrms2LfHysknEvent_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030203Collection lrsc030203Collection =new Lrsc030203Collection ();
		{
			//TODO
			lrsc030203Collection.setId(null);
			//TODO
			lrsc030203Collection.setHobbyName(null);
			//TODO
			lrsc030203Collection.setHobbyStartAge(null);
			//TODO
			lrsc030203Collection.setHobbyEndAge(null);
			//TODO
			lrsc030203Collection.setHobbyInterval(null);
			//TODO
			lrsc030203Collection.setHobbyCost(null);
		}
		
		//call convert method
		TLrms2lfHysknEvent result=Datamodel2TableCopier.transferTLrms2LfHysknEvent(ltPlanCollection,  lrsc030203Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getHysknEventName());
			//TODO
			assertEquals(null, result.getEventStartAge());
			//TODO
			assertEquals(null, result.getEventEndAge());
			//TODO
			assertEquals(null, result.getEventSyuki());
			//TODO
			assertEquals(null, result.getEventHitsuyoKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_EVENT
	 */
	@Test
	public void testTransferTLrms2LfHysknEvent_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		Lrsc030203Collection lrsc030203Collection = null;
		
		//call convert method
		TLrms2lfHysknEvent result=Datamodel2TableCopier.transferTLrms2LfHysknEvent(ltPlanCollection,  lrsc030203Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getHysknEventName());
			//TODO
			assertEquals(null, result.getEventStartAge());
			//TODO
			assertEquals(null, result.getEventEndAge());
			//TODO
			assertEquals(null, result.getEventSyuki());
			//TODO
			assertEquals(null, result.getEventHitsuyoKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_EVENT
	 */
	@Test
	public void testTransferTLrms2LfHysknEvent_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030203Collection lrsc030203Collection =new Lrsc030203Collection ();
		{
			//TODO
			lrsc030203Collection.setId(null);
			//TODO
			lrsc030203Collection.setHobbyName(null);
			//TODO
			lrsc030203Collection.setHobbyStartAge(null);
			//TODO
			lrsc030203Collection.setHobbyEndAge(null);
			//TODO
			lrsc030203Collection.setHobbyInterval(null);
			//TODO
			lrsc030203Collection.setHobbyCost(null);
		}
		
		//call convert method
		TLrms2lfHysknEvent result=Datamodel2TableCopier.transferTLrms2LfHysknEvent(ltPlanCollection,  lrsc030203Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getHysknEventName());
			//TODO
			assertEquals(null, result.getEventStartAge());
			//TODO
			assertEquals(null, result.getEventEndAge());
			//TODO
			assertEquals(null, result.getEventSyuki());
			//TODO
			assertEquals(null, result.getEventHitsuyoKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_EVENT
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfHysknEvent_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030203Collection lrsc030203Collection =new Lrsc030203Collection ();
		{
			//TODO
			lrsc030203Collection.setId(null);
			//TODO
			lrsc030203Collection.setHobbyName(null);
			//TODO
			lrsc030203Collection.setHobbyStartAge(null);
			//TODO
			lrsc030203Collection.setHobbyEndAge(null);
			//TODO
			lrsc030203Collection.setHobbyInterval(null);
			//TODO
			lrsc030203Collection.setHobbyCost(null);
		}
		
		//call convert method
		TLrms2lfHysknEvent result=Datamodel2TableCopier.transferTLrms2LfHysknEvent(ltPlanCollection,  lrsc030203Collection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_OTHER
	 */
	@Test
	public void testTransferTLrms2LfHysknOther_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030204Collection lrsc030204Collection =new Lrsc030204Collection ();
		{
			//TODO
			lrsc030204Collection.setId(null);
			//TODO
			lrsc030204Collection.setOtherName(null);
			//TODO
			lrsc030204Collection.setOtherStartAge(null);
			//TODO
			lrsc030204Collection.setOtherEndAge(null);
			//TODO
			lrsc030204Collection.setOtherInterval(null);
			//TODO
			lrsc030204Collection.setOtherCost(null);
		}
		
		//call convert method
		TLrms2lfHysknOther result=Datamodel2TableCopier.transferTLrms2LfHysknOther(ltPlanCollection,  lrsc030204Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getHysknOtherName());
			//TODO
			assertEquals(null, result.getOtherHitsuyoStartAge());
			//TODO
			assertEquals(null, result.getOtherHitsuyoEndAge());
			//TODO
			assertEquals(null, result.getOtherHitsuyoSyuki());
			//TODO
			assertEquals(null, result.getOtherHitsuyoKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_OTHER
	 */
	@Test
	public void testTransferTLrms2LfHysknOther_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		Lrsc030204Collection lrsc030204Collection = null;
		
		//call convert method
		TLrms2lfHysknOther result=Datamodel2TableCopier.transferTLrms2LfHysknOther(ltPlanCollection,  lrsc030204Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getHysknOtherName());
			//TODO
			assertEquals(null, result.getOtherHitsuyoStartAge());
			//TODO
			assertEquals(null, result.getOtherHitsuyoEndAge());
			//TODO
			assertEquals(null, result.getOtherHitsuyoSyuki());
			//TODO
			assertEquals(null, result.getOtherHitsuyoKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_OTHER
	 */
	@Test
	public void testTransferTLrms2LfHysknOther_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030204Collection lrsc030204Collection =new Lrsc030204Collection ();
		{
			//TODO
			lrsc030204Collection.setId(null);
			//TODO
			lrsc030204Collection.setOtherName(null);
			//TODO
			lrsc030204Collection.setOtherStartAge(null);
			//TODO
			lrsc030204Collection.setOtherEndAge(null);
			//TODO
			lrsc030204Collection.setOtherInterval(null);
			//TODO
			lrsc030204Collection.setOtherCost(null);
		}
		
		//call convert method
		TLrms2lfHysknOther result=Datamodel2TableCopier.transferTLrms2LfHysknOther(ltPlanCollection,  lrsc030204Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getHysknOtherName());
			//TODO
			assertEquals(null, result.getOtherHitsuyoStartAge());
			//TODO
			assertEquals(null, result.getOtherHitsuyoEndAge());
			//TODO
			assertEquals(null, result.getOtherHitsuyoSyuki());
			//TODO
			assertEquals(null, result.getOtherHitsuyoKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_HYSKN_OTHER
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfHysknOther_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030204Collection lrsc030204Collection =new Lrsc030204Collection ();
		{
			//TODO
			lrsc030204Collection.setId(null);
			//TODO
			lrsc030204Collection.setOtherName(null);
			//TODO
			lrsc030204Collection.setOtherStartAge(null);
			//TODO
			lrsc030204Collection.setOtherEndAge(null);
			//TODO
			lrsc030204Collection.setOtherInterval(null);
			//TODO
			lrsc030204Collection.setOtherCost(null);
		}
		
		//call convert method
		TLrms2lfHysknOther result=Datamodel2TableCopier.transferTLrms2LfHysknOther(ltPlanCollection,  lrsc030204Collection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKJKM
	 */
	@Test
	public void testTransferTLrms2LfJzsknNkjkm_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030501Collection lrsc030501Collection =new Lrsc030501Collection ();
		{
			//TODO
			lrsc030501Collection.setInputMethod(null);
			//TODO
			lrsc030501Collection.setPersonSpouseFlg(null);
		}
		Collection collection =new Collection ();
		{
			//TODO
			collection.setInputMethod(null);
			//TODO
			collection.setPersonSpouseFlg(null);
		}
		
		//call convert method
		TLrms2lfJzsknNkjkm result=Datamodel2TableCopier.transferTLrms2LfJzsknNkjkm(ltPlanCollection,  lrsc030501Collection,  collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenkinStartAge());
			//TODO
			assertEquals(null, result.getNenkinEndAge());
			//TODO
			assertEquals(null, result.getNenkinKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKJKM
	 */
	@Test
	public void testTransferTLrms2LfJzsknNkjkm_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		Lrsc030501Collection lrsc030501Collection = null;
		Collection collection = null;
		
		//call convert method
		TLrms2lfJzsknNkjkm result=Datamodel2TableCopier.transferTLrms2LfJzsknNkjkm(ltPlanCollection,  lrsc030501Collection,  collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenkinStartAge());
			//TODO
			assertEquals(null, result.getNenkinEndAge());
			//TODO
			assertEquals(null, result.getNenkinKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKJKM
	 */
	@Test
	public void testTransferTLrms2LfJzsknNkjkm_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030501Collection lrsc030501Collection =new Lrsc030501Collection ();
		{
			//TODO
			lrsc030501Collection.setInputMethod(null);
			//TODO
			lrsc030501Collection.setPersonSpouseFlg(null);
		}
		Collection collection =new Collection ();
		{
			//TODO
			collection.setInputMethod(null);
			//TODO
			collection.setPersonSpouseFlg(null);
		}
		
		//call convert method
		TLrms2lfJzsknNkjkm result=Datamodel2TableCopier.transferTLrms2LfJzsknNkjkm(ltPlanCollection,  lrsc030501Collection,  collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenkinStartAge());
			//TODO
			assertEquals(null, result.getNenkinEndAge());
			//TODO
			assertEquals(null, result.getNenkinKingaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKJKM
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfJzsknNkjkm_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030501Collection lrsc030501Collection =new Lrsc030501Collection ();
		{
			//TODO
			lrsc030501Collection.setInputMethod(null);
			//TODO
			lrsc030501Collection.setPersonSpouseFlg(null);
		}
		Collection collection =new Collection ();
		{
			//TODO
			collection.setInputMethod(null);
			//TODO
			collection.setPersonSpouseFlg(null);
		}
		
		//call convert method
		TLrms2lfJzsknNkjkm result=Datamodel2TableCopier.transferTLrms2LfJzsknNkjkm(ltPlanCollection,  lrsc030501Collection,  collection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKKNM
	 */
	@Test
	public void testTransferTLrms2LfJzsknNkknm_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		LtPensionCollection ltPensionCollection =new LtPensionCollection ();
		{
			//TODO
			ltPensionCollection.setFamilyNo(null);
			//TODO
			ltPensionCollection.setRowNo(null);
			//TODO
			ltPensionCollection.setPensionType(null);
			//TODO
			ltPensionCollection.setJobStart(null);
			//TODO
			ltPensionCollection.setJobStartAge(null);
			//TODO
			ltPensionCollection.setJobEnd(null);
			//TODO
			ltPensionCollection.setJobEndAge(null);
			//TODO
			ltPensionCollection.setEntryMonth(null);
			//TODO
			ltPensionCollection.setIncome(null);
		}
		
		//call convert method
		TLrms2lfJzsknNkknm result=Datamodel2TableCopier.transferTLrms2LfJzsknNkknm(ltPlanCollection,  ltPensionCollection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenkinTypeCd());
			//TODO
			assertEquals(null, result.getStartNengetsu());
			//TODO
			assertEquals(null, result.getAgeFrom());
			//TODO
			assertEquals(null, result.getEndNengetsu());
			//TODO
			assertEquals(null, result.getAgeTo());
			//TODO
			assertEquals(null, result.getKanyuTsukisu());
			//TODO
			assertEquals(null, result.getNenshu());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKKNM
	 */
	@Test
	public void testTransferTLrms2LfJzsknNkknm_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		LtPensionCollection ltPensionCollection = null;
		
		//call convert method
		TLrms2lfJzsknNkknm result=Datamodel2TableCopier.transferTLrms2LfJzsknNkknm(ltPlanCollection,  ltPensionCollection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenkinTypeCd());
			//TODO
			assertEquals(null, result.getStartNengetsu());
			//TODO
			assertEquals(null, result.getAgeFrom());
			//TODO
			assertEquals(null, result.getEndNengetsu());
			//TODO
			assertEquals(null, result.getAgeTo());
			//TODO
			assertEquals(null, result.getKanyuTsukisu());
			//TODO
			assertEquals(null, result.getNenshu());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKKNM
	 */
	@Test
	public void testTransferTLrms2LfJzsknNkknm_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		LtPensionCollection ltPensionCollection =new LtPensionCollection ();
		{
			//TODO
			ltPensionCollection.setFamilyNo(null);
			//TODO
			ltPensionCollection.setRowNo(null);
			//TODO
			ltPensionCollection.setPensionType(null);
			//TODO
			ltPensionCollection.setJobStart(null);
			//TODO
			ltPensionCollection.setJobStartAge(null);
			//TODO
			ltPensionCollection.setJobEnd(null);
			//TODO
			ltPensionCollection.setJobEndAge(null);
			//TODO
			ltPensionCollection.setEntryMonth(null);
			//TODO
			ltPensionCollection.setIncome(null);
		}
		
		//call convert method
		TLrms2lfJzsknNkknm result=Datamodel2TableCopier.transferTLrms2LfJzsknNkknm(ltPlanCollection,  ltPensionCollection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenkinTypeCd());
			//TODO
			assertEquals(null, result.getStartNengetsu());
			//TODO
			assertEquals(null, result.getAgeFrom());
			//TODO
			assertEquals(null, result.getEndNengetsu());
			//TODO
			assertEquals(null, result.getAgeTo());
			//TODO
			assertEquals(null, result.getKanyuTsukisu());
			//TODO
			assertEquals(null, result.getNenshu());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_NKKNM
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfJzsknNkknm_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		LtPensionCollection ltPensionCollection =new LtPensionCollection ();
		{
			//TODO
			ltPensionCollection.setFamilyNo(null);
			//TODO
			ltPensionCollection.setRowNo(null);
			//TODO
			ltPensionCollection.setPensionType(null);
			//TODO
			ltPensionCollection.setJobStart(null);
			//TODO
			ltPensionCollection.setJobStartAge(null);
			//TODO
			ltPensionCollection.setJobEnd(null);
			//TODO
			ltPensionCollection.setJobEndAge(null);
			//TODO
			ltPensionCollection.setEntryMonth(null);
			//TODO
			ltPensionCollection.setIncome(null);
		}
		
		//call convert method
		TLrms2lfJzsknNkknm result=Datamodel2TableCopier.transferTLrms2LfJzsknNkknm(ltPlanCollection,  ltPensionCollection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_SHUNYU
	 */
	@Test
	public void testTransferTLrms2LfJzsknShunyu_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030502Collection lrsc030502Collection =new Lrsc030502Collection ();
		{
			//TODO
			lrsc030502Collection.setPersonSpouseFlg(null);
			//TODO
			lrsc030502Collection.setId(null);
			//TODO
			lrsc030502Collection.setIncomeStartAge(null);
			//TODO
			lrsc030502Collection.setIncomeEndAge(null);
			//TODO
			lrsc030502Collection.setIncomeAmount(null);
		}
		
		//call convert method
		TLrms2lfJzsknShunyu result=Datamodel2TableCopier.transferTLrms2LfJzsknShunyu(ltPlanCollection,  lrsc030502Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenshuStartAge());
			//TODO
			assertEquals(null, result.getNenshuEndAge());
			//TODO
			assertEquals(null, result.getNenshuGaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_SHUNYU
	 */
	@Test
	public void testTransferTLrms2LfJzsknShunyu_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		Lrsc030502Collection lrsc030502Collection = null;
		
		//call convert method
		TLrms2lfJzsknShunyu result=Datamodel2TableCopier.transferTLrms2LfJzsknShunyu(ltPlanCollection,  lrsc030502Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenshuStartAge());
			//TODO
			assertEquals(null, result.getNenshuEndAge());
			//TODO
			assertEquals(null, result.getNenshuGaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_SHUNYU
	 */
	@Test
	public void testTransferTLrms2LfJzsknShunyu_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030502Collection lrsc030502Collection =new Lrsc030502Collection ();
		{
			//TODO
			lrsc030502Collection.setPersonSpouseFlg(null);
			//TODO
			lrsc030502Collection.setId(null);
			//TODO
			lrsc030502Collection.setIncomeStartAge(null);
			//TODO
			lrsc030502Collection.setIncomeEndAge(null);
			//TODO
			lrsc030502Collection.setIncomeAmount(null);
		}
		
		//call convert method
		TLrms2lfJzsknShunyu result=Datamodel2TableCopier.transferTLrms2LfJzsknShunyu(ltPlanCollection,  lrsc030502Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getFamilyHonspoCd());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getNenshuStartAge());
			//TODO
			assertEquals(null, result.getNenshuEndAge());
			//TODO
			assertEquals(null, result.getNenshuGaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_SHUNYU
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfJzsknShunyu_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		Lrsc030502Collection lrsc030502Collection =new Lrsc030502Collection ();
		{
			//TODO
			lrsc030502Collection.setPersonSpouseFlg(null);
			//TODO
			lrsc030502Collection.setId(null);
			//TODO
			lrsc030502Collection.setIncomeStartAge(null);
			//TODO
			lrsc030502Collection.setIncomeEndAge(null);
			//TODO
			lrsc030502Collection.setIncomeAmount(null);
		}
		
		//call convert method
		TLrms2lfJzsknShunyu result=Datamodel2TableCopier.transferTLrms2LfJzsknShunyu(ltPlanCollection,  lrsc030502Collection);
	}	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_OTHER
	 */
	@Test
	public void testTransferTLrms2LfJzsknOther_OK(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		LRSC030503Collection lRSC030503Collection =new LRSC030503Collection ();
		{
			//TODO
			lRSC030503Collection.setId(null);
			//TODO
			lRSC030503Collection.setOtherContentName(null);
			//TODO
			lRSC030503Collection.setOtherStartAge(null);
			//TODO
			lRSC030503Collection.setOtherEndAge(null);
			//TODO
			lRSC030503Collection.setOtherAmount(null);
		}
		
		//call convert method
		TLrms2lfJzsknOther result=Datamodel2TableCopier.transferTLrms2LfJzsknOther(ltPlanCollection,  lRSC030503Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getOtherShunyuName());
			//TODO
			assertEquals(null, result.getShunyuStartAge());
			//TODO
			assertEquals(null, result.getShunyuEndAge());
			//TODO
			assertEquals(null, result.getShunyuGaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_OTHER
	 */
	@Test
	public void testTransferTLrms2LfJzsknOther_ParamsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection = null;
		LRSC030503Collection lRSC030503Collection = null;
		
		//call convert method
		TLrms2lfJzsknOther result=Datamodel2TableCopier.transferTLrms2LfJzsknOther(ltPlanCollection,  lRSC030503Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getOtherShunyuName());
			//TODO
			assertEquals(null, result.getShunyuStartAge());
			//TODO
			assertEquals(null, result.getShunyuEndAge());
			//TODO
			assertEquals(null, result.getShunyuGaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_OTHER
	 */
	@Test
	public void testTransferTLrms2LfJzsknOther_FieldsAllNull(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		LRSC030503Collection lRSC030503Collection =new LRSC030503Collection ();
		{
			//TODO
			lRSC030503Collection.setId(null);
			//TODO
			lRSC030503Collection.setOtherContentName(null);
			//TODO
			lRSC030503Collection.setOtherStartAge(null);
			//TODO
			lRSC030503Collection.setOtherEndAge(null);
			//TODO
			lRSC030503Collection.setOtherAmount(null);
		}
		
		//call convert method
		TLrms2lfJzsknOther result=Datamodel2TableCopier.transferTLrms2LfJzsknOther(ltPlanCollection,  lRSC030503Collection);
		//assertions
		{
			//TODO
			assertEquals(null, result.getPlanId());
			//TODO
			assertEquals(null, result.getSeq());
			//TODO
			assertEquals(null, result.getOtherShunyuName());
			//TODO
			assertEquals(null, result.getShunyuStartAge());
			//TODO
			assertEquals(null, result.getShunyuEndAge());
			//TODO
			assertEquals(null, result.getShunyuGaku());
			//TODO
			assertEquals(null, result.getSystemCreateDate());
			//TODO
			assertEquals(null, result.getSystemUpdateDate());
		}
	}	
	
	/*
	 * データ変換処理：
	 * Test ＬＲＭＳセカンドライフ:T_LRMS_2LF_JZSKN_OTHER
	 */
	@Test(expected = SystemException.class)
	public void testTransferTLrms2LfJzsknOther_ExceptionExpected(){
		//Initialize parameters
		LtPlanCollection ltPlanCollection =new LtPlanCollection ();
		{
			//TODO
			ltPlanCollection.setPlanId(null);
		}
		LRSC030503Collection lRSC030503Collection =new LRSC030503Collection ();
		{
			//TODO
			lRSC030503Collection.setId(null);
			//TODO
			lRSC030503Collection.setOtherContentName(null);
			//TODO
			lRSC030503Collection.setOtherStartAge(null);
			//TODO
			lRSC030503Collection.setOtherEndAge(null);
			//TODO
			lRSC030503Collection.setOtherAmount(null);
		}
		
		//call convert method
		TLrms2lfJzsknOther result=Datamodel2TableCopier.transferTLrms2LfJzsknOther(ltPlanCollection,  lRSC030503Collection);
	}	

}
