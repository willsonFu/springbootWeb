package org.prcode.business.basedomain.userRole.domain;

import java.io.Serializable;
import org.prcode.basedomain.base.BaseDomain;

public class UserRole extends BaseDomain implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_role
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean DEL_FLAG_ON = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_role
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean DEL_FLAG_OFF = true;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_role
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    @Deprecated
    public static final Boolean DEL_FLAG = DEL_FLAG_OFF;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.f_id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.f_user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.f_role_id
     *
     * @mbg.generated
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_role
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.f_id
     *
     * @return the value of t_user_role.f_id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.f_id
     *
     * @param id the value for t_user_role.f_id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.f_user_id
     *
     * @return the value of t_user_role.f_user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.f_user_id
     *
     * @param userId the value for t_user_role.f_user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.f_role_id
     *
     * @return the value of t_user_role.f_role_id
     *
     * @mbg.generated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.f_role_id
     *
     * @param roleId the value for t_user_role.f_role_id
     *
     * @mbg.generated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_user_role
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("f_id"),
        userId("f_user_id"),
        roleId("f_role_id"),
        sysAddTime("f_sys_add_time"),
        sysUpdTime("f_sys_upd_time"),
        sysDelTime("f_sys_del_time"),
        sysAddUser("f_sys_add_user"),
        sysUpdUser("f_sys_upd_user"),
        sysDelUser("f_sys_del_user"),
        sysDelState("f_sys_del_state");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_user_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_user_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_user_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_user_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_user_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_user_role
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}