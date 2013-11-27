package jp.co.axa.life.app.lt.service.gen;

import java.util.List;

import jp.co.axa.life.app.lt.model.gen.RiskJsonCondition;
import jp.co.axa.life.app.lt.model.gen.RiskJsonRecord;

public interface RiskIService {
	/**
	 * 
	 * @param condition
	 * @return
	 */
	public List<RiskJsonRecord> selectByCondition(RiskJsonCondition condition);
	
}
