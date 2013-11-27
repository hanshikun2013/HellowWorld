package jp.co.axa.life.app.lt.dao.test.gen;

import org.dbunit.Assertion;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.SortedTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import java.util.List;

import jp.co.axa.life.app.common.dao.BaseDaoTest;
import jp.co.axa.life.app.common.dao.DbUnitUtils;


import jp.co.axa.life.app.lt.dao.gen.RiskDao;
import jp.co.axa.life.app.lt.parameter.gen.RiskCondition;
import jp.co.axa.life.app.lt.result.gen.RiskRecord;

@ContextConfiguration(locations="classpath:jp/co/axa/life/app/lt/dao/resource/gen/RiskDaoTest-context.xml")
public class RiskDaoTest extends BaseDaoTest{

	/** テスト対象のDao */
	@Autowired
	private RiskDao riskDao;
	
    // @Before が付加されたメソッドは、
    // @Test アノテーションが付いたメソッドを実行するたびに事前に実行されることを意味します。
    @Before
    public void setUp() throws Exception {
    	//初期データの投入
    	//super.getDatabaseTester().setDataSet(DbUnitUtils.getExpectedDataSet("jp/co/axa/life/app/lt/dao/resource/gen/RiskDaoTest-setup.xls"));
    	//super.getDatabaseTester().onSetup();
    }

    @Test
    public void testSelectByCondition() throws Exception {
    	//登録データの設定
		//TODO:prepare DB data
		
		//TODO:set condition
		RiskCondition condition = new RiskCondition();
		
		condition.setPlanId("") ;
		
		//call Dao
		List<RiskRecord> result= riskDao.selectByCondition(condition);
		
		//TODO:
		assertEquals(result.size(),1);
		
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // @BeforeClass が付加されたメソッドは、
        // このテストクラスを呼び出す前に実行されます。
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        // @AfterClass が付加されたメソッドは、
        // このテストクラスを呼び出した後に実行されます。
    }

    @After
    public void tearDown() throws Exception {
        // @After が付加されたメソッドは、
        // @Test アノテーションが付いたメソッドを実行するたびに、必ず後から実行されることを意味します。
    }
}
