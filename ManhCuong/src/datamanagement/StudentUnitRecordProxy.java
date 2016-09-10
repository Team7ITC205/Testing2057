//No comment and Javadoc ( do not have any comments)
package datamanagement;
public class StudentUnitRecordProxy implements IStudentUnitRecord {
private Integer studentID;//should be named "studentId"
private String unitCode;
private StudentUnitRecordManager mngr;
public StudentUnitRecordProxy( Integer id, String code )//should be final
{
this.studentID = id;this.unitCode = code;
this.mngr = StudentUnitRecordManager.instance();}
public Integer getStudentID() { return studentID;}
public String getUnitCode() { return unitCode; 
}
public void setAsg1(float mark) {//should be final
mngr.getStudentUnitRecord( studentID, unitCode ).setAsg1(mark);}
public float getAsg1() 
{
return mngr.getStudentUnitRecord( studentID, unitCode ).getAsg1();}
public void setAsg2(float mark) { mngr.getStudentUnitRecord( studentID, unitCode ).setAsg2(mark);}//should be final
public float getAsg2() {return mngr.getStudentUnitRecord( studentID, unitCode ).getAsg2();
}
public void setExam(float mark) {mngr.getStudentUnitRecord( studentID, unitCode ).setExam(mark);//should be final
}
public float getExam() 
{
return mngr.getStudentUnitRecord( studentID, unitCode ).getExam();}
public float getTotal() {return mngr.getStudentUnitRecord( studentID, unitCode ).getTotal();}}
