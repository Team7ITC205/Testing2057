package datamanagement;

public interface IUnit {

    public String getUnitCode();//have incorrect indentation level 4, expected level should be 2.
    public String getUnitName();//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.

    public float getPsCutoff();//have incorrect indentation level 4, expected level should be 2.
    public void  setPsCutoff1(float cutoff);//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.

    public float getCrCutoff();//have incorrect indentation level 4, expected level should be 2.
    public void  setCrCutoff(float cutoff);//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.

    public float getDiCuttoff();    //have incorrect indentation level 4, expected level should be 2.
    public void  setDiCutoff(float cutoff);//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.

    public float getHdCutoff();//have incorrect indentation level 4, expected level should be 2.
    public void  setHdCutoff(float cutoff);//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.

    public float getAeCutoff();    //have incorrect indentation level 4, expected level should be 2.
    public void  setAeCutoff(float cutoff);//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.
    
    public int getAsg1Weight();//have incorrect indentation level 4, expected level should be 2.
    public int getAsg2Weight();//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.
    public int getExamWeight();//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.
    public void setAssessmentWeights(int asg1Wgt, int asg2Wgt, int examWgt);//should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.

    public String getGrade(float asg1, float asg2, float exam);//have incorrect indentation level 4, expected level should be 2.

    public void addStudentRecord(IStudentUnitRecord record );//have incorrect indentation level 4, expected level should be 2.
    public IStudentUnitRecord getStudentRecord(int studentID );//‘studentID’ must contain no more than ‘1’ capital letters , should be separated from previous statement, have incorrect indentation level 4, expected level should be 2.
    
    public StudentUnitRecordList listStudentRecords();//have incorrect indentation level 4, expected level should be 2.
}
