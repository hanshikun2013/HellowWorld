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

import jp.co.axa.life.app.lt.dao.gen.KihonDao;
import jp.co.axa.life.app.lt.parameter.gen.KihonCondition;
import jp.co.axa.life.app.lt.result.gen.KihonRecord;
import jp.co.axa.life.app.lt.model.gen.KihonJsonCondition;
import jp.co.axa.life.app.lt.model.gen.KihonJsonRecord;


@Service("kihonService")
public class KihonService implements KihonIService {
	@Autowired
	private KihonDao kihonDao;

	public List<KihonJsonRecord> selectByCondition(KihonJsonCondition jsonCondition) {
		KihonCondition condition=new KihonCondition();
		try {
			BeanUtils.copyProperties(condition,jsonCondition);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
		ConvertUtils.register(new SqlTimestampConverter(null), java.sql.Timestamp.class);
		List<KihonRecord> daoResult=kihonDao.selectByCondition(condition);
		List<KihonJsonRecord> result=new ArrayList<KihonJsonRecord>();
		for(KihonRecord record:daoResult){
			KihonJsonRecord jsonRecord=new KihonJsonRecord();
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
