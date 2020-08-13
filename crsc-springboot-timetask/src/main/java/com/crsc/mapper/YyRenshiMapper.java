package com.crsc.mapper;

import com.crsc.domain.YyRenshi;
import com.crsc.domain.YyRenshiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyRenshiMapper {
	long countByExample(YyRenshiExample example);

	int deleteByExample(YyRenshiExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(YyRenshi record);

	int insertSelective(YyRenshi record);

	List<YyRenshi> selectByExampleWithBLOBs(YyRenshiExample example);

	List<YyRenshi> selectByExample(YyRenshiExample example);

	YyRenshi selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") YyRenshi record, @Param("example") YyRenshiExample example);

	int updateByExampleWithBLOBs(@Param("record") YyRenshi record, @Param("example") YyRenshiExample example);

	int updateByExample(@Param("record") YyRenshi record, @Param("example") YyRenshiExample example);

	int updateByPrimaryKeySelective(YyRenshi record);

	int updateByPrimaryKeyWithBLOBs(YyRenshi record);

	int updateByPrimaryKey(YyRenshi record);
}