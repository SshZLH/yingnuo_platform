package com.ynkd.api.platform.controller.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * <p>Copyright© 2013-2017 AutoChina International Ltd. All rights reserved.</p>
 */
@RestController
@RequestMapping(value = "/base")
public class HealthController {

    private static final Logger logger= LoggerFactory.getLogger(HealthController.class);

    @RequestMapping(value = "/health" , method = RequestMethod.GET)
    @ResponseBody
    public String heath(){
        logger.info("--------health check-------");
        return "Ok!";
    }

}
