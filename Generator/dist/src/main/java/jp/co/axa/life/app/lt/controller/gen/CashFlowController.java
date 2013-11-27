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

import jp.co.axa.life.app.lt.model.gen.CashFlowJsonCondition;
import jp.co.axa.life.app.lt.model.gen.CashFlowJsonRecord;
import jp.co.axa.life.app.lt.service.gen.CashFlowIService;

@Controller("cashFlowController")
@Path("/Sync/CashFlow")
@Component
public class CashFlowController extends BaseController 
{
    @Autowired
    private CashFlowIService cashFlowService;
	/**
	 * 
	 * @param condition
	 * @return
	 */
	@POST()
	@Path("/select")
    @Produces("application/json; charset=UTF-8")
	public List<CashFlowJsonRecord> selectByCondition(CashFlowJsonCondition condition) {
		return cashFlowService.selectByCondition(condition);
	}
	
}
