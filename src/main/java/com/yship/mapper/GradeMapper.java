package com.yship.mapper;

import com.yship.bean.Grade;
import com.yship.bean.GradeExample;
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

public interface GradeMapper {
    @SelectProvider(type=GradeSqlProvider.class, method="countByExample")
    long countByExample(GradeExample example);

    @DeleteProvider(type=GradeSqlProvider.class, method="deleteByExample")
    int deleteByExample(GradeExample example);

    @Delete({
        "delete from hope_edu_grade",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into hope_edu_grade (id, grade, ",
        "createDate, students, ",
        "classNumber)",
        "values (#{id,jdbcType=INTEGER}, #{grade,jdbcType=VARCHAR}, ",
        "#{createdate,jdbcType=DATE}, #{students,jdbcType=INTEGER}, ",
        "#{classnumber,jdbcType=INTEGER})"
    })
    int insert(Grade record);

    @InsertProvider(type=GradeSqlProvider.class, method="insertSelective")
    int insertSelective(Grade record);

    @SelectProvider(type=GradeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="grade", property="grade", jdbcType=JdbcType.VARCHAR),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.DATE),
        @Result(column="students", property="students", jdbcType=JdbcType.INTEGER),
        @Result(column="classNumber", property="classnumber", jdbcType=JdbcType.INTEGER)
    })
    List<Grade> selectByExample(GradeExample example);

    @Select({
        "select",
        "id, grade, createDate, students, classNumber",
        "from hope_edu_grade",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="grade", property="grade", jdbcType=JdbcType.VARCHAR),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.DATE),
        @Result(column="students", property="students", jdbcType=JdbcType.INTEGER),
        @Result(column="classNumber", property="classnumber", jdbcType=JdbcType.INTEGER)
    })
    Grade selectByPrimaryKey(Integer id);

    @UpdateProvider(type=GradeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    @UpdateProvider(type=GradeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    @UpdateProvider(type=GradeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Grade record);

    @Update({
        "update hope_edu_grade",
        "set grade = #{grade,jdbcType=VARCHAR},",
          "createDate = #{createdate,jdbcType=DATE},",
          "students = #{students,jdbcType=INTEGER},",
          "classNumber = #{classnumber,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Grade record);
}