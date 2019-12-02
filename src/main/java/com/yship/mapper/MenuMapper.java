package com.yship.mapper;

import com.yship.bean.Menu;
import com.yship.bean.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface MenuMapper {
    @SelectProvider(type=MenuSqlProvider.class, method="countByExample")
    long countByExample(MenuExample example);

    @DeleteProvider(type=MenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(MenuExample example);

    @Delete({
        "delete from hope_edu_menu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into hope_edu_menu (id, menuName, ",
        "href, parentId, ",
        "mark, level, sort)",
        "values (#{id,jdbcType=INTEGER}, #{menuname,jdbcType=VARCHAR}, ",
        "#{href,jdbcType=VARCHAR}, #{parentid,jdbcType=INTEGER}, ",
        "#{mark,jdbcType=VARCHAR}, #{level,jdbcType=INTEGER}, #{sort,jdbcType=INTEGER})"
    })
    int insert(Menu record);

    @InsertProvider(type=MenuSqlProvider.class, method="insertSelective")
    int insertSelective(Menu record);

    @SelectProvider(type=MenuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="menuName", property="menuname", jdbcType=JdbcType.VARCHAR),
        @Result(column="href", property="href", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentId", property="parentid", jdbcType=JdbcType.INTEGER),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<Menu> selectByExample(MenuExample example);

    @Select({
        "select",
        "id, menuName, href, parentId, mark, level, sort",
        "from hope_edu_menu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="menuName", property="menuname", jdbcType=JdbcType.VARCHAR),
        @Result(column="href", property="href", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentId", property="parentid", jdbcType=JdbcType.INTEGER),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    Menu selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    @UpdateProvider(type=MenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    @UpdateProvider(type=MenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Menu record);

    @Update({
        "update hope_edu_menu",
        "set menuName = #{menuname,jdbcType=VARCHAR},",
          "href = #{href,jdbcType=VARCHAR},",
          "parentId = #{parentid,jdbcType=INTEGER},",
          "mark = #{mark,jdbcType=VARCHAR},",
          "level = #{level,jdbcType=INTEGER},",
          "sort = #{sort,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Menu record);
}