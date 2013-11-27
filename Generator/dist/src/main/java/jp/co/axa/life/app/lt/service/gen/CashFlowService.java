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

import jp.co.axa.life.app.lt.dao.gen.CashFlowDao;
import jp.co.axa.life.app.lt.parameter.gen.CashFlowCondition;
import jp.co.axa.life.app.lt.result.gen.CashFlowRecord;
import jp.co.axa.life.app.lt.model.gen.CashFlowJsonCondition;
import jp.co.axa.life.app.lt.model.gen.CashFlowJsonRecord;


@Service("cashFlowService")
public class CashFlowService implements CashFlowIService {
	@Autowired
	private CashFlowDao cashFlowDao;

	public List<CashFlowJsonRecord> selectByCondition(CashFlowJsonCondition jsonCondition) {
		CashFlowCondition condition=new CashFlowCondition();
		try {
			BeanUtils.copyProperties(condition,jsonCondition);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
		ConvertUtils.register(new SqlTimestampConverter(null), java.sql.Timestamp.class);
		List<CashFlowRecord> daoResult=cashFlowDao.selectByCondition(condition);
		List<CashFlowJsonRecord> result=new ArrayList<CashFlowJsonRecord>();
		for(CashFlowRecord record:daoResult){
			CashFlowJsonRecord jsonRecord=new CashFlowJsonRecord();
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
