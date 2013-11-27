package jp.co.axa.life.app.lt.controller.gen;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import jp.co.axa.life.fw.controller.BaseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import jp.co.axa.life.app.lt.model.gen.RiskJsonCondition;
import jp.co.axa.life.app.lt.model.gen.RiskJsonRecord;
import jp.co.axa.life.app.lt.service.gen.RiskIService;

@Controller("riskController")
@Path("/Sync/Risk")
@Component
public class RiskController extends BaseController 
{
    @Autowired
    private RiskIService riskService;
	/**
	 * 
	 * @param condition
	 * @return
	 */
	@POST()
	@Path("/select")
    @Produces("application/json; charset=UTF-8")
	public List<RiskJsonRecord> selectByCondition(RiskJsonCondition condition) {
		return riskService.selectByCondition(condition);
	}
	
}
