package com.yship.mapper;

import com.yship.bean.Student;
import com.yship.bean.StudentExample;
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

public interface StudentMapper {
    @SelectProvider(type=StudentSqlProvider.class, method="countByExample")
    long countByExample(StudentExample example);

    @DeleteProvider(type=StudentSqlProvider.class, method="deleteByExample")
    int deleteByExample(StudentExample example);

    @Delete({
        "delete from hope_edu_student",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into hope_edu_student (id, grade_id, ",
        "specialty_id, class_id, ",
        "code, name, sno, ",
        "sex, native_place, ",
        "nation, phone, email, ",
        "qq, academy, carded, ",
        "admission_date, class_position, ",
        "dormitory, leave_time, ",
        "the_lay_time, emergency_contact, ",
        "emergency_telephone, student_status, ",
        "avatar, close)",
        "values (#{id,jdbcType=INTEGER}, #{gradeId,jdbcType=INTEGER}, ",
        "#{specialtyId,jdbcType=INTEGER}, #{classId,jdbcType=INTEGER}, ",
        "#{code,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{sno,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=VARCHAR}, #{nativePlace,jdbcType=VARCHAR}, ",
        "#{nation,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{qq,jdbcType=VARCHAR}, #{academy,jdbcType=VARCHAR}, #{carded,jdbcType=VARCHAR}, ",
        "#{admissionDate,jdbcType=DATE}, #{classPosition,jdbcType=VARCHAR}, ",
        "#{dormitory,jdbcType=VARCHAR}, #{leaveTime,jdbcType=DATE}, ",
        "#{theLayTime,jdbcType=DATE}, #{emergencyContact,jdbcType=VARCHAR}, ",
        "#{emergencyTelephone,jdbcType=VARCHAR}, #{studentStatus,jdbcType=VARCHAR}, ",
        "#{avatar,jdbcType=VARCHAR}, #{close,jdbcType=INTEGER})"
    })
    int insert(Student record);

    @InsertProvider(type=StudentSqlProvider.class, method="insertSelective")
    int insertSelective(Student record);

    @SelectProvider(type=StudentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="grade_id", property="gradeId", jdbcType=JdbcType.INTEGER),
        @Result(column="specialty_id", property="specialtyId", jdbcType=JdbcType.INTEGER),
        @Result(column="class_id", property="classId", jdbcType=JdbcType.INTEGER),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sno", property="sno", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="native_place", property="nativePlace", jdbcType=JdbcType.VARCHAR),
        @Result(column="nation", property="nation", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="academy", property="academy", jdbcType=JdbcType.VARCHAR),
        @Result(column="carded", property="carded", jdbcType=JdbcType.VARCHAR),
        @Result(column="admission_date", property="admissionDate", jdbcType=JdbcType.DATE),
        @Result(column="class_position", property="classPosition", jdbcType=JdbcType.VARCHAR),
        @Result(column="dormitory", property="dormitory", jdbcType=JdbcType.VARCHAR),
        @Result(column="leave_time", property="leaveTime", jdbcType=JdbcType.DATE),
        @Result(column="the_lay_time", property="theLayTime", jdbcType=JdbcType.DATE),
        @Result(column="emergency_contact", property="emergencyContact", jdbcType=JdbcType.VARCHAR),
        @Result(column="emergency_telephone", property="emergencyTelephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="student_status", property="studentStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="close", property="close", jdbcType=JdbcType.INTEGER)
    })
    List<Student> selectByExample(StudentExample example);

    @Select({
        "select",
        "id, grade_id, specialty_id, class_id, code, name, sno, sex, native_place, nation, ",
        "phone, email, qq, academy, carded, admission_date, class_position, dormitory, ",
        "leave_time, the_lay_time, emergency_contact, emergency_telephone, student_status, ",
        "avatar, close",
        "from hope_edu_student",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="grade_id", property="gradeId", jdbcType=JdbcType.INTEGER),
        @Result(column="specialty_id", property="specialtyId", jdbcType=JdbcType.INTEGER),
        @Result(column="class_id", property="classId", jdbcType=JdbcType.INTEGER),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sno", property="sno", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="native_place", property="nativePlace", jdbcType=JdbcType.VARCHAR),
        @Result(column="nation", property="nation", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="academy", property="academy", jdbcType=JdbcType.VARCHAR),
        @Result(column="carded", property="carded", jdbcType=JdbcType.VARCHAR),
        @Result(column="admission_date", property="admissionDate", jdbcType=JdbcType.DATE),
        @Result(column="class_position", property="classPosition", jdbcType=JdbcType.VARCHAR),
        @Result(column="dormitory", property="dormitory", jdbcType=JdbcType.VARCHAR),
        @Result(column="leave_time", property="leaveTime", jdbcType=JdbcType.DATE),
        @Result(column="the_lay_time", property="theLayTime", jdbcType=JdbcType.DATE),
        @Result(column="emergency_contact", property="emergencyContact", jdbcType=JdbcType.VARCHAR),
        @Result(column="emergency_telephone", property="emergencyTelephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="student_status", property="studentStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="close", property="close", jdbcType=JdbcType.INTEGER)
    })
    Student selectByPrimaryKey(Integer id);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Student record);

    @Update({
        "update hope_edu_student",
        "set grade_id = #{gradeId,jdbcType=INTEGER},",
          "specialty_id = #{specialtyId,jdbcType=INTEGER},",
          "class_id = #{classId,jdbcType=INTEGER},",
          "code = #{code,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "sno = #{sno,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=VARCHAR},",
          "native_place = #{nativePlace,jdbcType=VARCHAR},",
          "nation = #{nation,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "qq = #{qq,jdbcType=VARCHAR},",
          "academy = #{academy,jdbcType=VARCHAR},",
          "carded = #{carded,jdbcType=VARCHAR},",
          "admission_date = #{admissionDate,jdbcType=DATE},",
          "class_position = #{classPosition,jdbcType=VARCHAR},",
          "dormitory = #{dormitory,jdbcType=VARCHAR},",
          "leave_time = #{leaveTime,jdbcType=DATE},",
          "the_lay_time = #{theLayTime,jdbcType=DATE},",
          "emergency_contact = #{emergencyContact,jdbcType=VARCHAR},",
          "emergency_telephone = #{emergencyTelephone,jdbcType=VARCHAR},",
          "student_status = #{studentStatus,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "close = #{close,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Student record);
}