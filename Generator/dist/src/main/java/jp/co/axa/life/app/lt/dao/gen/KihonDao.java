package jp.co.axa.life.app.lt.dao.gen;

import java.util.List;
import org.springframework.stereotype.Repository;

import jp.co.axa.life.fw.dao.BaseDao;

import jp.co.axa.life.app.lt.mapper.gen.KihonMapper;
import jp.co.axa.life.app.lt.parameter.gen.KihonCondition;
import jp.co.axa.life.app.lt.result.gen.KihonRecord;

@Repository
public class KihonDao extends BaseDao 
{
	/**
	 * 
	 * @param condition
	 * @return
	 */
	public List<KihonRecord> selectByCondition(KihonCondition condition) {
		return getSqlSession().getMapper(KihonMapper.class).selectByCondition(condition);
	}
	
}
