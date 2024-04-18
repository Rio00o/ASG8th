package com.example.general;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GeneralMapper {
    @Select("SELECT * FROM generals")
    List<General> findAll();
}
