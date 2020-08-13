package com.crsc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crsc.domain.YyRenshi;
import com.crsc.domain.YyRenshiExample;
import com.crsc.mapper.YyRenshiMapper;

@Service
public class YyRenshiService {

	@Resource
	private YyRenshiMapper yyrsmapper;

	public List<YyRenshi> findAllList() {
		YyRenshiExample example = new YyRenshiExample();
		example.createCriteria().andIdEqualTo(29);
		example.setOrderByClause("id desc");
		return yyrsmapper.selectByExample(example);
	};

}
