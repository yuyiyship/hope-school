package com.yship.mapper;

import com.yship.bean.Student;
import com.yship.bean.StudentExample.Criteria;
import com.yship.bean.StudentExample.Criterion;
import com.yship.bean.StudentExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class StudentSqlProvider {

    public String countByExample(StudentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("hope_edu_student");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(StudentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("hope_edu_student");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Student record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hope_edu_student");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGradeId() != null) {
            sql.VALUES("grade_id", "#{gradeId,jdbcType=INTEGER}");
        }
        
        if (record.getSpecialtyId() != null) {
            sql.VALUES("specialty_id", "#{specialtyId,jdbcType=INTEGER}");
        }
        
        if (record.getClassId() != null) {
            sql.VALUES("class_id", "#{classId,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSno() != null) {
            sql.VALUES("sno", "#{sno,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getNativePlace() != null) {
            sql.VALUES("native_place", "#{nativePlace,jdbcType=VARCHAR}");
        }
        
        if (record.getNation() != null) {
            sql.VALUES("nation", "#{nation,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            sql.VALUES("qq", "#{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getAcademy() != null) {
            sql.VALUES("academy", "#{academy,jdbcType=VARCHAR}");
        }
        
        if (record.getCarded() != null) {
            sql.VALUES("carded", "#{carded,jdbcType=VARCHAR}");
        }
        
        if (record.getAdmissionDate() != null) {
            sql.VALUES("admission_date", "#{admissionDate,jdbcType=DATE}");
        }
        
        if (record.getClassPosition() != null) {
            sql.VALUES("class_position", "#{classPosition,jdbcType=VARCHAR}");
        }
        
        if (record.getDormitory() != null) {
            sql.VALUES("dormitory", "#{dormitory,jdbcType=VARCHAR}");
        }
        
        if (record.getLeaveTime() != null) {
            sql.VALUES("leave_time", "#{leaveTime,jdbcType=DATE}");
        }
        
        if (record.getTheLayTime() != null) {
            sql.VALUES("the_lay_time", "#{theLayTime,jdbcType=DATE}");
        }
        
        if (record.getEmergencyContact() != null) {
            sql.VALUES("emergency_contact", "#{emergencyContact,jdbcType=VARCHAR}");
        }
        
        if (record.getEmergencyTelephone() != null) {
            sql.VALUES("emergency_telephone", "#{emergencyTelephone,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentStatus() != null) {
            sql.VALUES("student_status", "#{studentStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            sql.VALUES("avatar", "#{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getClose() != null) {
            sql.VALUES("close", "#{close,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(StudentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("grade_id");
        sql.SELECT("specialty_id");
        sql.SELECT("class_id");
        sql.SELECT("code");
        sql.SELECT("name");
        sql.SELECT("sno");
        sql.SELECT("sex");
        sql.SELECT("native_place");
        sql.SELECT("nation");
        sql.SELECT("phone");
        sql.SELECT("email");
        sql.SELECT("qq");
        sql.SELECT("academy");
        sql.SELECT("carded");
        sql.SELECT("admission_date");
        sql.SELECT("class_position");
        sql.SELECT("dormitory");
        sql.SELECT("leave_time");
        sql.SELECT("the_lay_time");
        sql.SELECT("emergency_contact");
        sql.SELECT("emergency_telephone");
        sql.SELECT("student_status");
        sql.SELECT("avatar");
        sql.SELECT("close");
        sql.FROM("hope_edu_student");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Student record = (Student) parameter.get("record");
        StudentExample example = (StudentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("hope_edu_student");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getGradeId() != null) {
            sql.SET("grade_id = #{record.gradeId,jdbcType=INTEGER}");
        }
        
        if (record.getSpecialtyId() != null) {
            sql.SET("specialty_id = #{record.specialtyId,jdbcType=INTEGER}");
        }
        
        if (record.getClassId() != null) {
            sql.SET("class_id = #{record.classId,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getSno() != null) {
            sql.SET("sno = #{record.sno,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        }
        
        if (record.getNativePlace() != null) {
            sql.SET("native_place = #{record.nativePlace,jdbcType=VARCHAR}");
        }
        
        if (record.getNation() != null) {
            sql.SET("nation = #{record.nation,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            sql.SET("qq = #{record.qq,jdbcType=VARCHAR}");
        }
        
        if (record.getAcademy() != null) {
            sql.SET("academy = #{record.academy,jdbcType=VARCHAR}");
        }
        
        if (record.getCarded() != null) {
            sql.SET("carded = #{record.carded,jdbcType=VARCHAR}");
        }
        
        if (record.getAdmissionDate() != null) {
            sql.SET("admission_date = #{record.admissionDate,jdbcType=DATE}");
        }
        
        if (record.getClassPosition() != null) {
            sql.SET("class_position = #{record.classPosition,jdbcType=VARCHAR}");
        }
        
        if (record.getDormitory() != null) {
            sql.SET("dormitory = #{record.dormitory,jdbcType=VARCHAR}");
        }
        
        if (record.getLeaveTime() != null) {
            sql.SET("leave_time = #{record.leaveTime,jdbcType=DATE}");
        }
        
        if (record.getTheLayTime() != null) {
            sql.SET("the_lay_time = #{record.theLayTime,jdbcType=DATE}");
        }
        
        if (record.getEmergencyContact() != null) {
            sql.SET("emergency_contact = #{record.emergencyContact,jdbcType=VARCHAR}");
        }
        
        if (record.getEmergencyTelephone() != null) {
            sql.SET("emergency_telephone = #{record.emergencyTelephone,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentStatus() != null) {
            sql.SET("student_status = #{record.studentStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            sql.SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getClose() != null) {
            sql.SET("close = #{record.close,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("hope_edu_student");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("grade_id = #{record.gradeId,jdbcType=INTEGER}");
        sql.SET("specialty_id = #{record.specialtyId,jdbcType=INTEGER}");
        sql.SET("class_id = #{record.classId,jdbcType=INTEGER}");
        sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("sno = #{record.sno,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        sql.SET("native_place = #{record.nativePlace,jdbcType=VARCHAR}");
        sql.SET("nation = #{record.nation,jdbcType=VARCHAR}");
        sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("qq = #{record.qq,jdbcType=VARCHAR}");
        sql.SET("academy = #{record.academy,jdbcType=VARCHAR}");
        sql.SET("carded = #{record.carded,jdbcType=VARCHAR}");
        sql.SET("admission_date = #{record.admissionDate,jdbcType=DATE}");
        sql.SET("class_position = #{record.classPosition,jdbcType=VARCHAR}");
        sql.SET("dormitory = #{record.dormitory,jdbcType=VARCHAR}");
        sql.SET("leave_time = #{record.leaveTime,jdbcType=DATE}");
        sql.SET("the_lay_time = #{record.theLayTime,jdbcType=DATE}");
        sql.SET("emergency_contact = #{record.emergencyContact,jdbcType=VARCHAR}");
        sql.SET("emergency_telephone = #{record.emergencyTelephone,jdbcType=VARCHAR}");
        sql.SET("student_status = #{record.studentStatus,jdbcType=VARCHAR}");
        sql.SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        sql.SET("close = #{record.close,jdbcType=INTEGER}");
        
        StudentExample example = (StudentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Student record) {
        SQL sql = new SQL();
        sql.UPDATE("hope_edu_student");
        
        if (record.getGradeId() != null) {
            sql.SET("grade_id = #{gradeId,jdbcType=INTEGER}");
        }
        
        if (record.getSpecialtyId() != null) {
            sql.SET("specialty_id = #{specialtyId,jdbcType=INTEGER}");
        }
        
        if (record.getClassId() != null) {
            sql.SET("class_id = #{classId,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSno() != null) {
            sql.SET("sno = #{sno,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getNativePlace() != null) {
            sql.SET("native_place = #{nativePlace,jdbcType=VARCHAR}");
        }
        
        if (record.getNation() != null) {
            sql.SET("nation = #{nation,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            sql.SET("qq = #{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getAcademy() != null) {
            sql.SET("academy = #{academy,jdbcType=VARCHAR}");
        }
        
        if (record.getCarded() != null) {
            sql.SET("carded = #{carded,jdbcType=VARCHAR}");
        }
        
        if (record.getAdmissionDate() != null) {
            sql.SET("admission_date = #{admissionDate,jdbcType=DATE}");
        }
        
        if (record.getClassPosition() != null) {
            sql.SET("class_position = #{classPosition,jdbcType=VARCHAR}");
        }
        
        if (record.getDormitory() != null) {
            sql.SET("dormitory = #{dormitory,jdbcType=VARCHAR}");
        }
        
        if (record.getLeaveTime() != null) {
            sql.SET("leave_time = #{leaveTime,jdbcType=DATE}");
        }
        
        if (record.getTheLayTime() != null) {
            sql.SET("the_lay_time = #{theLayTime,jdbcType=DATE}");
        }
        
        if (record.getEmergencyContact() != null) {
            sql.SET("emergency_contact = #{emergencyContact,jdbcType=VARCHAR}");
        }
        
        if (record.getEmergencyTelephone() != null) {
            sql.SET("emergency_telephone = #{emergencyTelephone,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentStatus() != null) {
            sql.SET("student_status = #{studentStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            sql.SET("avatar = #{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getClose() != null) {
            sql.SET("close = #{close,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, StudentExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}