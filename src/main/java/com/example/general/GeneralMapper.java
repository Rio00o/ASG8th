package com.example.general;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface GeneralMapper {
    @Select("SELECT * FROM generals")
    List<General> findAll();

    @Select("SELECT * FROM generals WHERE name LIKE CONCAT(#{prefix}, '%')")
    List<General> findByGeneralStartingWith(String prefix);

    @Select("SELECT *FROM generals WHERE id = #{id}")
    Optional<General> findById(int id);
}
