package com.system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.system.po.event;
import com.system.po.eventExample;

public interface eventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int countByExample(eventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int deleteByExample(eventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int insert(event record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int insertSelective(event record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    List<event> selectByExample(eventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    event selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") event record, @Param("example") eventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int updateByExample(@Param("record") event record, @Param("example") eventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(event record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event_info
     *
     * @mbggenerated Mon Jul 06 15:40:52 GMT+08:00 2020
     */
    int updateByPrimaryKey(event record);
}