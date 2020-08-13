package com.crsc.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.crsc.domain.YyRenshi;
import com.crsc.service.YyRenshiService;

@Component
public class SchedulerTask {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Resource
	private YyRenshiService yyrsService;

	private int count = 0;

	@Scheduled(cron = "0/1 * * * * ?")
	private void process() {

		List<YyRenshi> allList = yyrsService.findAllList();

		allList.forEach(act -> {
			System.out.print("查询名称：" + act.getUsername());
		});
		System.out.println("； 执行次数：" + (count++) + "； 现在时间：" + dateFormat.format(new Date()));
	}
}
