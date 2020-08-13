package com.crsc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crsc.domain.YyRenshi;
import com.crsc.service.YyRenshiService;

@RestController
public class YyRenshiController {
	
	@Resource
	private YyRenshiService yyrsService;
	
	@RequestMapping("/test")
    public List<YyRenshi> test(){
		List<YyRenshi> allUser = yyrsService.findAllList();
        return allUser;
    }

}
