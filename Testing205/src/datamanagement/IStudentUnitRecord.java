package datamanagement;

public interface IStudentUnitRecord {

    public Integer getStudentID();//incorrect indentation level 4, expected level should be 2, ‘getstudentID’ must contain no more than ‘1’ capital letters 
    public String getUnitCode();//should be separated from previous statement, incorrect indentation level 4, expected level should be 2.

    public void setAsg1(float mark);//incorrect indentation level 4, expected level should be 2.
    public float getAsg1();//should be separated from previous statement, incorrect indentation level 4, expected level should be 2.

    public void setAsg2(float mark);//incorrect indentation level 4, expected level should be 2.
    public float getAsg2();//should be separated from previous statement, incorrect indentation level 4, expected level should be 2.

    public void setExam(float mark);
    public float getExam();//incorrect indentation level 4, expected level should be 2.

    public float getTotal();//incorrect indentation level 4, expected level should be 2.
}
