package cn.loveyx815.blog.entity;

public class OneCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_onecategory.id
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_onecategory.c_code_id
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    private Integer cCodeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_onecategory.id
     *
     * @return the value of t_onecategory.id
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_onecategory.id
     *
     * @param id the value for t_onecategory.id
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_onecategory.c_code_id
     *
     * @return the value of t_onecategory.c_code_id
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    public Integer getcCodeId() {
        return cCodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_onecategory.c_code_id
     *
     * @param cCodeId the value for t_onecategory.c_code_id
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    public void setcCodeId(Integer cCodeId) {
        this.cCodeId = cCodeId;
    }
}