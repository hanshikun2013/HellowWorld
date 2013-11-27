package jp.co.axa.life.app.lt.mapper.gen;

import jp.co.axa.life.app.lt.parameter.gen.CashFlowCondition;
import jp.co.axa.life.app.lt.result.gen.CashFlowRecord;
import java.util.List;

public interface CashFlowMapper
{
    public List<CashFlowRecord> selectByCondition(CashFlowCondition condition);

}
