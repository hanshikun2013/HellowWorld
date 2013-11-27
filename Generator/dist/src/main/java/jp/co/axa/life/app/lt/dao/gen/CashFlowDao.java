package jp.co.axa.life.app.lt.dao.gen;

import java.util.List;
import org.springframework.stereotype.Repository;

import jp.co.axa.life.fw.dao.BaseDao;

import jp.co.axa.life.app.lt.mapper.gen.CashFlowMapper;
import jp.co.axa.life.app.lt.parameter.gen.CashFlowCondition;
import jp.co.axa.life.app.lt.result.gen.CashFlowRecord;

@Repository
public class CashFlowDao extends BaseDao 
{
	/**
	 * 
	 * @param condition
	 * @return
	 */
	public List<CashFlowRecord> selectByCondition(CashFlowCondition condition) {
		return getSqlSession().getMapper(CashFlowMapper.class).selectByCondition(condition);
	}
	
}
