package com.yship.mapper;

import com.yship.bean.Specialty;
import com.yship.bean.SpecialtyExample;
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

public interface SpecialtyMapper {
    @SelectProvider(type=SpecialtySqlProvider.class, method="countByExample")
    long countByExample(SpecialtyExample example);

    @DeleteProvider(type=SpecialtySqlProvider.class, method="deleteByExample")
    int deleteByExample(SpecialtyExample example);

    @Delete({
        "delete from hope_edu_specialty",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into hope_edu_specialty (id, gradeId, ",
        "specialtyName)",
        "values (#{id,jdbcType=INTEGER}, #{gradeid,jdbcType=INTEGER}, ",
        "#{specialtyname,jdbcType=VARCHAR})"
    })
    int insert(Specialty record);

    @InsertProvider(type=SpecialtySqlProvider.class, method="insertSelective")
    int insertSelective(Specialty record);

    @SelectProvider(type=SpecialtySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gradeId", property="gradeid", jdbcType=JdbcType.INTEGER),
        @Result(column="specialtyName", property="specialtyname", jdbcType=JdbcType.VARCHAR)
    })
    List<Specialty> selectByExample(SpecialtyExample example);

    @Select({
        "select",
        "id, gradeId, specialtyName",
        "from hope_edu_specialty",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="gradeId", property="gradeid", jdbcType=JdbcType.INTEGER),
        @Result(column="specialtyName", property="specialtyname", jdbcType=JdbcType.VARCHAR)
    })
    Specialty selectByPrimaryKey(Integer id);

    @UpdateProvider(type=SpecialtySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    @UpdateProvider(type=SpecialtySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    @UpdateProvider(type=SpecialtySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Specialty record);

    @Update({
        "update hope_edu_specialty",
        "set gradeId = #{gradeid,jdbcType=INTEGER},",
          "specialtyName = #{specialtyname,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Specialty record);
}