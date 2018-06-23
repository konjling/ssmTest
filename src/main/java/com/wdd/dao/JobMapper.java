package com.wdd.dao;

import com.wdd.bean.Job;
import com.wdd.bean.JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    long countByExample(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    int deleteByExample(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    int deleteByPrimaryKey(Integer jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    int insert(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    int insertSelective(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    List<Job> selectByExample(JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    Job selectByPrimaryKey(Integer jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    int updateByPrimaryKeySelective(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbg.generated Sat Jun 23 19:25:44 CST 2018
     */
    int updateByPrimaryKey(Job record);
}