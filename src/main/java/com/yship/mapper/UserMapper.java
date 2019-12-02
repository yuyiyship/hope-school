package com.yship.mapper;

import com.yship.bean.User;
import com.yship.bean.UserExample;
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

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from hope_edu_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into hope_edu_user (id, account, ",
        "password, realName, ",
        "createDate, loginTime, ",
        "lastLoginDate, close, ",
        "roleId, roleName)",
        "values (#{id,jdbcType=INTEGER}, #{account,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{realname,jdbcType=VARCHAR}, ",
        "#{createdate,jdbcType=DATE}, #{logintime,jdbcType=INTEGER}, ",
        "#{lastlogindate,jdbcType=TIMESTAMP}, #{close,jdbcType=BIT}, ",
        "#{roleid,jdbcType=INTEGER}, #{rolename,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="realName", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.DATE),
        @Result(column="loginTime", property="logintime", jdbcType=JdbcType.INTEGER),
        @Result(column="lastLoginDate", property="lastlogindate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="close", property="close", jdbcType=JdbcType.BIT),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, account, password, realName, createDate, loginTime, lastLoginDate, close, ",
        "roleId, roleName",
        "from hope_edu_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="realName", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.DATE),
        @Result(column="loginTime", property="logintime", jdbcType=JdbcType.INTEGER),
        @Result(column="lastLoginDate", property="lastlogindate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="close", property="close", jdbcType=JdbcType.BIT),
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update hope_edu_user",
        "set account = #{account,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "realName = #{realname,jdbcType=VARCHAR},",
          "createDate = #{createdate,jdbcType=DATE},",
          "loginTime = #{logintime,jdbcType=INTEGER},",
          "lastLoginDate = #{lastlogindate,jdbcType=TIMESTAMP},",
          "close = #{close,jdbcType=BIT},",
          "roleId = #{roleid,jdbcType=INTEGER},",
          "roleName = #{rolename,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}