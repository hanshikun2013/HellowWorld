package jp.co.axa.life.app.lt.service.gen;

import java.util.List;

import jp.co.axa.life.app.lt.model.gen.CashFlowJsonCondition;
import jp.co.axa.life.app.lt.model.gen.CashFlowJsonRecord;

public interface CashFlowIService {
	/**
	 * 
	 * @param condition
	 * @return
	 */
	public List<CashFlowJsonRecord> selectByCondition(CashFlowJsonCondition condition);
	
}
