package jp.co.axa.life.app.lt.dao.gen;

import java.util.List;
import org.springframework.stereotype.Repository;

import jp.co.axa.life.fw.dao.BaseDao;

import jp.co.axa.life.app.lt.mapper.gen.RiskMapper;
import jp.co.axa.life.app.lt.parameter.gen.RiskCondition;
import jp.co.axa.life.app.lt.result.gen.RiskRecord;

@Repository
public class RiskDao extends BaseDao 
{
	/**
	 * 
	 * @param condition
	 * @return
	 */
	public List<RiskRecord> selectByCondition(RiskCondition condition) {
		return getSqlSession().getMapper(RiskMapper.class).selectByCondition(condition);
	}
	
}
