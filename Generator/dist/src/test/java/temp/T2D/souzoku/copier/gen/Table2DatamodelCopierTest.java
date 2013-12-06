package temp.T2D.souzoku.copier.gen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import jp.co.axa.life.fw.exception.SystemException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jp.co.axa.life.app.lt.util.ConverterUtility;
import temp.T2D.souzoku.datamodel.gen.Lisc0001Collection;
import temp.T2D.souzoku.datamodel.gen.Lisc000101Collection;
import temp.T2D.souzoku.datamodel.gen.Lbsc0002Collection;
import temp.T2D.souzoku.entity.gen.TLrmsSogakuKihon;
import temp.T2D.souzoku.entity.gen.TLrmsSogakuZisn;


public class Table2DatamodelCopierTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:Lisc0001Collection
	 */
	@Test
	public void testＬＲＭＳ相続_Lisc0001Collection_OK(){
		//Initialize parameters
		TLrmsSogakuKihon tLrmsSogakuKihon =new TLrmsSogakuKihon ();
		{
			tLrmsSogakuKihon.setSpouseUmuCd (null);
			tLrmsSogakuKihon.setHtsznSbCd (null);
			tLrmsSogakuKihon.setHtsznCnt (null);
		}
		//call convert method
		Lisc0001Collection result=Table2DatamodelCopier.ＬＲＭＳ相続_Lisc0001Collection(tLrmsSogakuKihon);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getMaritalStatus());
			//TODO
			assertEquals(null, result.getSettingOfHeir());
			//TODO
			assertEquals(null, result.getHeirNumber());
			//TODO
			assertEquals(null, result.getFamilyNo());
			//TODO
			assertEquals(null, result.getMaritalStatusString());
			//TODO
			assertEquals(null, result.getSettingOfHeirString());
			//TODO
			assertEquals(null, result.getHeirNumberString());
			//TODO
			assertEquals(null, result.getHeir1());
			//TODO
			assertEquals(null, result.getHeir1String());
			//TODO
			assertEquals(null, result.getHeir2());
			//TODO
			assertEquals(null, result.getHeir2String());
			//TODO
			assertEquals(null, result.getHeir3());
			//TODO
			assertEquals(null, result.getHeir3String());
			//TODO
			assertEquals(null, result.getHeir4());
			//TODO
			assertEquals(null, result.getHeir4String());
			//TODO
			assertEquals(null, result.getHeir5());
			//TODO
			assertEquals(null, result.getHeir5String());
			//TODO
			assertEquals(null, result.getAppraisedTotalValue());
			//TODO
			assertEquals(null, result.getHeirTotalValue1());
			//TODO
			assertEquals(null, result.getHeirTotalValue2());
			//TODO
			assertEquals(null, result.getHeirTotalValue3());
			//TODO
			assertEquals(null, result.getHeirTotalValue4());
			//TODO
			assertEquals(null, result.getHeirTotalValue5());
			//TODO
			assertEquals(null, result.getHeirTaxTotalValue());
			//TODO
			assertEquals(null, result.getDefenceValue());
		}
	}

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:Lisc0001Collection
	 */
	@Test(expected = SystemException.class)
	public void testＬＲＭＳ相続_Lisc0001Collection_NG(){
		//Initialize parameters
		TLrmsSogakuKihon tLrmsSogakuKihon =new TLrmsSogakuKihon ();
		{
			//TODO
			tLrmsSogakuKihon.setSpouseUmuCd (null);
			//TODO
			tLrmsSogakuKihon.setHtsznSbCd (null);
			//TODO
			tLrmsSogakuKihon.setHtsznCnt (null);
		}
		//call convert method
		Lisc0001Collection result=Table2DatamodelCopier.ＬＲＭＳ相続_Lisc0001Collection(tLrmsSogakuKihon);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:Lisc000101Collection
	 */
	@Test
	public void testＬＲＭＳ相続_Lisc000101Collection_OK(){
		//Initialize parameters
		TLrmsSogakuZisn tLrmsSogakuZisn =new TLrmsSogakuZisn ();
		{
			tLrmsSogakuZisn.setSeq (null);
			tLrmsSogakuZisn.setSozokuZisnCd (null);
			tLrmsSogakuZisn.setSozokuGaku (null);
			tLrmsSogakuZisn.setHtsznSbKobetsuCd (null);
		}
		//call convert method
		Lisc000101Collection result=Table2DatamodelCopier.ＬＲＭＳ相続_Lisc000101Collection(tLrmsSogakuZisn);
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getInheritance());
			//TODO
			assertEquals(null, result.getAppraisedValue());
			//TODO
			assertEquals(null, result.getHeir());
			//TODO
			assertEquals(null, result.getInheritanceString());
			//TODO
			assertEquals(null, result.getHeirString());
			//TODO
			assertEquals(null, result.getHeirValue1());
			//TODO
			assertEquals(null, result.getHeirValue2());
			//TODO
			assertEquals(null, result.getHeirValue3());
			//TODO
			assertEquals(null, result.getHeirValue4());
			//TODO
			assertEquals(null, result.getHeirValue5());
		}
	}

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:Lisc000101Collection
	 */
	@Test(expected = SystemException.class)
	public void testＬＲＭＳ相続_Lisc000101Collection_NG(){
		//Initialize parameters
		TLrmsSogakuZisn tLrmsSogakuZisn =new TLrmsSogakuZisn ();
		{
			//TODO
			tLrmsSogakuZisn.setSeq (null);
			//TODO
			tLrmsSogakuZisn.setSozokuZisnCd (null);
			//TODO
			tLrmsSogakuZisn.setSozokuGaku (null);
			//TODO
			tLrmsSogakuZisn.setHtsznSbKobetsuCd (null);
		}
		//call convert method
		Lisc000101Collection result=Table2DatamodelCopier.ＬＲＭＳ相続_Lisc000101Collection(tLrmsSogakuZisn);
		//assertions
	}
	

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:lbsc0002Collection
	 */
	@Test
	public void testＬＲＭＳ相続_lbsc0002Collection_OK(){
		//Initialize parameters
		//call convert method
		Lbsc0002Collection result=Table2DatamodelCopier.ＬＲＭＳ相続_lbsc0002Collection();
		//assertions
		{
			//TODO
			assertEquals(null, result.getId());
			//TODO
			assertEquals(null, result.getHeirValue1());
			//TODO
			assertEquals(null, result.getHeirValue2());
			//TODO
			assertEquals(null, result.getHeirValue3());
			//TODO
			assertEquals(null, result.getHeirValue4());
			//TODO
			assertEquals(null, result.getHeirValue5());
		}
	}

	/*
	 * データ変換処理：
	 * Test ＬＲＭＳ相続:lbsc0002Collection
	 */
	@Test(expected = SystemException.class)
	public void testＬＲＭＳ相続_lbsc0002Collection_NG(){
		//Initialize parameters
		//call convert method
		Lbsc0002Collection result=Table2DatamodelCopier.ＬＲＭＳ相続_lbsc0002Collection();
		//assertions
	}
	

}
