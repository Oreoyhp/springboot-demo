package com.crsc.mapper;

import com.crsc.domain.YyRenshiYd;
import com.crsc.domain.YyRenshiYdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyRenshiYdMapper {
    long countByExample(YyRenshiYdExample example);

    int deleteByExample(YyRenshiYdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyRenshiYd record);

    int insertSelective(YyRenshiYd record);

    List<YyRenshiYd> selectByExample(YyRenshiYdExample example);

    YyRenshiYd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyRenshiYd record, @Param("example") YyRenshiYdExample example);

    int updateByExample(@Param("record") YyRenshiYd record, @Param("example") YyRenshiYdExample example);

    int updateByPrimaryKeySelective(YyRenshiYd record);

    int updateByPrimaryKey(YyRenshiYd record);
}