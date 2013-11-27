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

import jp.co.axa.life.app.lt.model.gen.KihonJsonCondition;
import jp.co.axa.life.app.lt.model.gen.KihonJsonRecord;
import jp.co.axa.life.app.lt.service.gen.KihonIService;

@Controller("kihonController")
@Path("/Sync/Kihon")
@Component
public class KihonController extends BaseController 
{
    @Autowired
    private KihonIService kihonService;
	/**
	 * 
	 * @param condition
	 * @return
	 */
	@POST()
	@Path("/select")
    @Produces("application/json; charset=UTF-8")
	public List<KihonJsonRecord> selectByCondition(KihonJsonCondition condition) {
		return kihonService.selectByCondition(condition);
	}
	
}
