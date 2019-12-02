package com.yship.mapper;

import com.yship.bean.Rolemenu;
import com.yship.bean.RolemenuExample;
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

public interface RolemenuMapper {
    @SelectProvider(type=RolemenuSqlProvider.class, method="countByExample")
    long countByExample(RolemenuExample example);

    @DeleteProvider(type=RolemenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(RolemenuExample example);

    @Delete({
        "delete from hope_edu_rolemenu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into hope_edu_rolemenu (id, roleId, ",
        "menuId)",
        "values (#{id,jdbcType=INTEGER}, #{roleid,jdbcType=INTEGER}, ",
        "#{menuid,jdbcType=INTEGER})"
    })
    int insert(Rolemenu record);

    @InsertProvider(type=RolemenuSqlProvider.class, method="insertSelective")
    int insertSelective(Rolemenu record);

    @SelectProvider(type=RolemenuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="menuId", property="menuid", jdbcType=JdbcType.INTEGER)
    })
    List<Rolemenu> selectByExample(RolemenuExample example);

    @Select({
        "select",
        "id, roleId, menuId",
        "from hope_edu_rolemenu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="menuId", property="menuid", jdbcType=JdbcType.INTEGER)
    })
    Rolemenu selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RolemenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    @UpdateProvider(type=RolemenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    @UpdateProvider(type=RolemenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Rolemenu record);

    @Update({
        "update hope_edu_rolemenu",
        "set roleId = #{roleid,jdbcType=INTEGER},",
          "menuId = #{menuid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Rolemenu record);
}