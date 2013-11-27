package jp.co.axa.life.app.lt.mapper.gen;

import jp.co.axa.life.app.lt.parameter.gen.KihonCondition;
import jp.co.axa.life.app.lt.result.gen.KihonRecord;
import java.util.List;

public interface KihonMapper
{
    public List<KihonRecord> selectByCondition(KihonCondition condition);

}
