package com.yship.mapper;

import com.yship.bean.Classes;
import com.yship.bean.ClassesExample;
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

public interface ClassesMapper {
    @SelectProvider(type=ClassesSqlProvider.class, method="countByExample")
    long countByExample(ClassesExample example);

    @DeleteProvider(type=ClassesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClassesExample example);

    @Delete({
        "delete from hope_edu_classes",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into hope_edu_classes (id, gradeId, ",
        "specialtyId, className, ",
        "classAdviser, classTeacher, ",
        "amount, specialty, ",
        "backTraining, quitSchool, ",
        "haveJobs, unemployed, ",
        "employmentRate, activities, ",
        "exceptions, createDate, ",
        "close)",
        "values (#{id,jdbcType=INTEGER}, #{gradeid,jdbcType=INTEGER}, ",
        "#{specialtyid,jdbcType=INTEGER}, #{classname,jdbcType=VARCHAR}, ",
        "#{classadviser,jdbcType=VARCHAR}, #{classteacher,jdbcType=VARCHAR}, ",
        "#{amount,jdbcType=INTEGER}, #{specialty,jdbcType=INTEGER}, ",
        "#{backtraining,jdbcType=INTEGER}, #{quitschool,jdbcType=INTEGER}, ",
        "#{havejobs,jdbcType=INTEGER}, #{unemployed,jdbcType=INTEGER}, ",
        "#{employmentrate,jdbcType=REAL}, #{activities,jdbcType=INTEGER}, ",
        "#{exceptions,jdbcType=INTEGER}, #{createdate,jdbcType=DATE}, ",
        "#{close,jdbcType=BIT})"
    })
    int insert(Classes record);

    @InsertProvider(type=ClassesSqlProvider.class, method="insertSelective")
    int insertSelective(Classes record);

    @SelectProvider(type=ClassesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gradeId", property="gradeid", jdbcType=JdbcType.INTEGER),
        @Result(column="specialtyId", property="specialtyid", jdbcType=JdbcType.INTEGER),
        @Result(column="className", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="classAdviser", property="classadviser", jdbcType=JdbcType.VARCHAR),
        @Result(column="classTeacher", property="classteacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="specialty", property="specialty", jdbcType=JdbcType.INTEGER),
        @Result(column="backTraining", property="backtraining", jdbcType=JdbcType.INTEGER),
        @Result(column="quitSchool", property="quitschool", jdbcType=JdbcType.INTEGER),
        @Result(column="haveJobs", property="havejobs", jdbcType=JdbcType.INTEGER),
        @Result(column="unemployed", property="unemployed", jdbcType=JdbcType.INTEGER),
        @Result(column="employmentRate", property="employmentrate", jdbcType=JdbcType.REAL),
        @Result(column="activities", property="activities", jdbcType=JdbcType.INTEGER),
        @Result(column="exceptions", property="exceptions", jdbcType=JdbcType.INTEGER),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.DATE),
        @Result(column="close", property="close", jdbcType=JdbcType.BIT)
    })
    List<Classes> selectByExample(ClassesExample example);

    @Select({
        "select",
        "id, gradeId, specialtyId, className, classAdviser, classTeacher, amount, specialty, ",
        "backTraining, quitSchool, haveJobs, unemployed, employmentRate, activities, ",
        "exceptions, createDate, close",
        "from hope_edu_classes",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gradeId", property="gradeid", jdbcType=JdbcType.INTEGER),
        @Result(column="specialtyId", property="specialtyid", jdbcType=JdbcType.INTEGER),
        @Result(column="className", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="classAdviser", property="classadviser", jdbcType=JdbcType.VARCHAR),
        @Result(column="classTeacher", property="classteacher", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="specialty", property="specialty", jdbcType=JdbcType.INTEGER),
        @Result(column="backTraining", property="backtraining", jdbcType=JdbcType.INTEGER),
        @Result(column="quitSchool", property="quitschool", jdbcType=JdbcType.INTEGER),
        @Result(column="haveJobs", property="havejobs", jdbcType=JdbcType.INTEGER),
        @Result(column="unemployed", property="unemployed", jdbcType=JdbcType.INTEGER),
        @Result(column="employmentRate", property="employmentrate", jdbcType=JdbcType.REAL),
        @Result(column="activities", property="activities", jdbcType=JdbcType.INTEGER),
        @Result(column="exceptions", property="exceptions", jdbcType=JdbcType.INTEGER),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.DATE),
        @Result(column="close", property="close", jdbcType=JdbcType.BIT)
    })
    Classes selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ClassesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Classes record, @Param("example") ClassesExample example);

    @UpdateProvider(type=ClassesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Classes record, @Param("example") ClassesExample example);

    @UpdateProvider(type=ClassesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Classes record);

    @Update({
        "update hope_edu_classes",
        "set gradeId = #{gradeid,jdbcType=INTEGER},",
          "specialtyId = #{specialtyid,jdbcType=INTEGER},",
          "className = #{classname,jdbcType=VARCHAR},",
          "classAdviser = #{classadviser,jdbcType=VARCHAR},",
          "classTeacher = #{classteacher,jdbcType=VARCHAR},",
          "amount = #{amount,jdbcType=INTEGER},",
          "specialty = #{specialty,jdbcType=INTEGER},",
          "backTraining = #{backtraining,jdbcType=INTEGER},",
          "quitSchool = #{quitschool,jdbcType=INTEGER},",
          "haveJobs = #{havejobs,jdbcType=INTEGER},",
          "unemployed = #{unemployed,jdbcType=INTEGER},",
          "employmentRate = #{employmentrate,jdbcType=REAL},",
          "activities = #{activities,jdbcType=INTEGER},",
          "exceptions = #{exceptions,jdbcType=INTEGER},",
          "createDate = #{createdate,jdbcType=DATE},",
          "close = #{close,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Classes record);
}