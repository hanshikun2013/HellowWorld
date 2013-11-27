package jp.co.axa.life.app.lt.service.test.gen;

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


import jp.co.axa.life.app.lt.dao.gen.KihonDao;
import jp.co.axa.life.app.lt.parameter.gen.KihonCondition;
import jp.co.axa.life.app.lt.result.gen.KihonRecord;
import jp.co.axa.life.app.lt.model.gen.KihonJsonCondition;
import jp.co.axa.life.app.lt.model.gen.KihonJsonRecord;
import jp.co.axa.life.app.lt.service.gen.KihonService;

@ContextConfiguration(locations="classpath:jp/co/axa/life/app/lt/service/resource/gen/KihonServiceTest-context.xml")
public class KihonServiceTest extends BaseDaoTest{

	/** テスト対象のDao */
	@Autowired
	private KihonService kihonService;
	
    // @Before が付加されたメソッドは、
    // @Test アノテーションが付いたメソッドを実行するたびに事前に実行されることを意味します。
    @Before
    public void setUp() throws Exception {
    	//初期データの投入
    	//super.getDatabaseTester().setDataSet(DbUnitUtils.getExpectedDataSet("jp/co/axa/life/app/lt/dao/resource/gen/KihonDaoTest-setup.xls"));
    	//super.getDatabaseTester().onSetup();
    }

    @Test
    public void testSelectByCondition() throws Exception {
    	//登録データの設定
		//TODO:prepare DB data
		
		//TODO:set condition
		KihonJsonCondition condition = new KihonJsonCondition();
		
		condition.setPlanId("") ;
		
		//call Dao
		List<KihonJsonRecord> result= kihonService.selectByCondition(condition);
		
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
