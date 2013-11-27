package jp.co.axa.life.app.lt.service.gen;

import java.util.List;

import jp.co.axa.life.app.lt.model.gen.KihonJsonCondition;
import jp.co.axa.life.app.lt.model.gen.KihonJsonRecord;

public interface KihonIService {
	/**
	 * 
	 * @param condition
	 * @return
	 */
	public List<KihonJsonRecord> selectByCondition(KihonJsonCondition condition);
	
}
