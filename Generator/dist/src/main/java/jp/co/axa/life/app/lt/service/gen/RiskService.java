package jp.co.axa.life.app.lt.service.gen;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.SqlTimestampConverter;

import jp.co.axa.life.app.lt.dao.gen.RiskDao;
import jp.co.axa.life.app.lt.parameter.gen.RiskCondition;
import jp.co.axa.life.app.lt.result.gen.RiskRecord;
import jp.co.axa.life.app.lt.model.gen.RiskJsonCondition;
import jp.co.axa.life.app.lt.model.gen.RiskJsonRecord;


@Service("riskService")
public class RiskService implements RiskIService {
	@Autowired
	private RiskDao riskDao;

	public List<RiskJsonRecord> selectByCondition(RiskJsonCondition jsonCondition) {
		RiskCondition condition=new RiskCondition();
		try {
			BeanUtils.copyProperties(condition,jsonCondition);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
		ConvertUtils.register(new SqlTimestampConverter(null), java.sql.Timestamp.class);
		List<RiskRecord> daoResult=riskDao.selectByCondition(condition);
		List<RiskJsonRecord> result=new ArrayList<RiskJsonRecord>();
		for(RiskRecord record:daoResult){
			RiskJsonRecord jsonRecord=new RiskJsonRecord();
			result.add(jsonRecord);
			try {
				BeanUtils.copyProperties( jsonRecord,record);
			} catch (IllegalAccessException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ConvertUtils.deregister();		
		return result;
	}

}
