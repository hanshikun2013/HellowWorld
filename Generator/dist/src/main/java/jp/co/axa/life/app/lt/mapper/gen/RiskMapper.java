package jp.co.axa.life.app.lt.mapper.gen;

import jp.co.axa.life.app.lt.parameter.gen.RiskCondition;
import jp.co.axa.life.app.lt.result.gen.RiskRecord;
import java.util.List;

public interface RiskMapper
{
    public List<RiskRecord> selectByCondition(RiskCondition condition);

}
