package com.yship.mapper;

import com.yship.bean.Classes;
import com.yship.bean.ClassesExample.Criteria;
import com.yship.bean.ClassesExample.Criterion;
import com.yship.bean.ClassesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ClassesSqlProvider {

    public String countByExample(ClassesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("hope_edu_classes");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ClassesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("hope_edu_classes");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Classes record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hope_edu_classes");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGradeid() != null) {
            sql.VALUES("gradeId", "#{gradeid,jdbcType=INTEGER}");
        }
        
        if (record.getSpecialtyid() != null) {
            sql.VALUES("specialtyId", "#{specialtyid,jdbcType=INTEGER}");
        }
        
        if (record.getClassname() != null) {
            sql.VALUES("className", "#{classname,jdbcType=VARCHAR}");
        }
        
        if (record.getClassadviser() != null) {
            sql.VALUES("classAdviser", "#{classadviser,jdbcType=VARCHAR}");
        }
        
        if (record.getClassteacher() != null) {
            sql.VALUES("classTeacher", "#{classteacher,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=INTEGER}");
        }
        
        if (record.getTraining() != null) {
            sql.VALUES("specialty", "#{specialty,jdbcType=INTEGER}");
        }
        
        if (record.getBacktraining() != null) {
            sql.VALUES("backTraining", "#{backtraining,jdbcType=INTEGER}");
        }
        
        if (record.getQuitschool() != null) {
            sql.VALUES("quitSchool", "#{quitschool,jdbcType=INTEGER}");
        }
        
        if (record.getHavejobs() != null) {
            sql.VALUES("haveJobs", "#{havejobs,jdbcType=INTEGER}");
        }
        
        if (record.getUnemployed() != null) {
            sql.VALUES("unemployed", "#{unemployed,jdbcType=INTEGER}");
        }
        
        if (record.getEmploymentrate() != null) {
            sql.VALUES("employmentRate", "#{employmentrate,jdbcType=REAL}");
        }
        
        if (record.getActivities() != null) {
            sql.VALUES("activities", "#{activities,jdbcType=INTEGER}");
        }
        
        if (record.getExceptions() != null) {
            sql.VALUES("exceptions", "#{exceptions,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedate() != null) {
            sql.VALUES("createDate", "#{createdate,jdbcType=DATE}");
        }
        
        if (record.getClose() != null) {
            sql.VALUES("close", "#{close,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ClassesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("gradeId");
        sql.SELECT("specialtyId");
        sql.SELECT("className");
        sql.SELECT("classAdviser");
        sql.SELECT("classTeacher");
        sql.SELECT("amount");
        sql.SELECT("backTraining");
        sql.SELECT("quitSchool");
        sql.SELECT("haveJobs");
        sql.SELECT("unemployed");
        sql.SELECT("employmentRate");
        sql.SELECT("activities");
        sql.SELECT("exceptions");
        sql.SELECT("createDate");
        sql.SELECT("close");
        sql.FROM("hope_edu_classes");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Classes record = (Classes) parameter.get("record");
        ClassesExample example = (ClassesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("hope_edu_classes");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getGradeid() != null) {
            sql.SET("gradeId = #{record.gradeid,jdbcType=INTEGER}");
        }
        
        if (record.getSpecialtyid() != null) {
            sql.SET("specialtyId = #{record.specialtyid,jdbcType=INTEGER}");
        }
        
        if (record.getClassname() != null) {
            sql.SET("className = #{record.classname,jdbcType=VARCHAR}");
        }
        
        if (record.getClassadviser() != null) {
            sql.SET("classAdviser = #{record.classadviser,jdbcType=VARCHAR}");
        }
        
        if (record.getClassteacher() != null) {
            sql.SET("classTeacher = #{record.classteacher,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{record.amount,jdbcType=INTEGER}");
        }
        
        if (record.getTraining() != null) {
            sql.SET("specialty = #{record.specialty,jdbcType=INTEGER}");
        }
        
        if (record.getBacktraining() != null) {
            sql.SET("backTraining = #{record.backtraining,jdbcType=INTEGER}");
        }
        
        if (record.getQuitschool() != null) {
            sql.SET("quitSchool = #{record.quitschool,jdbcType=INTEGER}");
        }
        
        if (record.getHavejobs() != null) {
            sql.SET("haveJobs = #{record.havejobs,jdbcType=INTEGER}");
        }
        
        if (record.getUnemployed() != null) {
            sql.SET("unemployed = #{record.unemployed,jdbcType=INTEGER}");
        }
        
        if (record.getEmploymentrate() != null) {
            sql.SET("employmentRate = #{record.employmentrate,jdbcType=REAL}");
        }
        
        if (record.getActivities() != null) {
            sql.SET("activities = #{record.activities,jdbcType=INTEGER}");
        }
        
        if (record.getExceptions() != null) {
            sql.SET("exceptions = #{record.exceptions,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createDate = #{record.createdate,jdbcType=DATE}");
        }
        
        if (record.getClose() != null) {
            sql.SET("close = #{record.close,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("hope_edu_classes");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("gradeId = #{record.gradeid,jdbcType=INTEGER}");
        sql.SET("specialtyId = #{record.specialtyid,jdbcType=INTEGER}");
        sql.SET("className = #{record.classname,jdbcType=VARCHAR}");
        sql.SET("classAdviser = #{record.classadviser,jdbcType=VARCHAR}");
        sql.SET("classTeacher = #{record.classteacher,jdbcType=VARCHAR}");
        sql.SET("amount = #{record.amount,jdbcType=INTEGER}");
        sql.SET("specialty = #{record.specialty,jdbcType=INTEGER}");
        sql.SET("backTraining = #{record.backtraining,jdbcType=INTEGER}");
        sql.SET("quitSchool = #{record.quitschool,jdbcType=INTEGER}");
        sql.SET("haveJobs = #{record.havejobs,jdbcType=INTEGER}");
        sql.SET("unemployed = #{record.unemployed,jdbcType=INTEGER}");
        sql.SET("employmentRate = #{record.employmentrate,jdbcType=REAL}");
        sql.SET("activities = #{record.activities,jdbcType=INTEGER}");
        sql.SET("exceptions = #{record.exceptions,jdbcType=INTEGER}");
        sql.SET("createDate = #{record.createdate,jdbcType=DATE}");
        sql.SET("close = #{record.close,jdbcType=BIT}");
        
        ClassesExample example = (ClassesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Classes record) {
        SQL sql = new SQL();
        sql.UPDATE("hope_edu_classes");
        
        if (record.getGradeid() != null) {
            sql.SET("gradeId = #{gradeid,jdbcType=INTEGER}");
        }
        
        if (record.getSpecialtyid() != null) {
            sql.SET("specialtyId = #{specialtyid,jdbcType=INTEGER}");
        }
        
        if (record.getClassname() != null) {
            sql.SET("className = #{classname,jdbcType=VARCHAR}");
        }
        
        if (record.getClassadviser() != null) {
            sql.SET("classAdviser = #{classadviser,jdbcType=VARCHAR}");
        }
        
        if (record.getClassteacher() != null) {
            sql.SET("classTeacher = #{classteacher,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{amount,jdbcType=INTEGER}");
        }
        
        if (record.getTraining() != null) {
            sql.SET("specialty = #{specialty,jdbcType=INTEGER}");
        }
        
        if (record.getBacktraining() != null) {
            sql.SET("backTraining = #{backtraining,jdbcType=INTEGER}");
        }
        
        if (record.getQuitschool() != null) {
            sql.SET("quitSchool = #{quitschool,jdbcType=INTEGER}");
        }
        
        if (record.getHavejobs() != null) {
            sql.SET("haveJobs = #{havejobs,jdbcType=INTEGER}");
        }
        
        if (record.getUnemployed() != null) {
            sql.SET("unemployed = #{unemployed,jdbcType=INTEGER}");
        }
        
        if (record.getEmploymentrate() != null) {
            sql.SET("employmentRate = #{employmentrate,jdbcType=REAL}");
        }
        
        if (record.getActivities() != null) {
            sql.SET("activities = #{activities,jdbcType=INTEGER}");
        }
        
        if (record.getExceptions() != null) {
            sql.SET("exceptions = #{exceptions,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createDate = #{createdate,jdbcType=DATE}");
        }
        
        if (record.getClose() != null) {
            sql.SET("close = #{close,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ClassesExample example, boolean includeExamplePhrase) {
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