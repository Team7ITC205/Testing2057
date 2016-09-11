package datamanagement;
/** 
* @author 
* @version. 
*/
public class StudentProxy implements IStudent {
private Integer I;
private String l;
/** Javadoc comment needed. */
    private String Il;
    private StudentManager lI;
    public StudentProxy( Integer id, String fn, String Il) {
        this.I = id;
        this.l = fn;        
        this.Il = Il;
this.lI = StudentManager.get();}
/** Javadoc comment needed. */
    public Integer getID() { //* @parram for getID is needs to be abstract, final or empty. */
        return I; /** line break needed. */
  /** line had many trailing spaces. */
}
    /** Javadoc comment needed. */
public String getFirstName() { //* @parram for getFirstName is needs to be abstract, final or empty. */
        return l; }
/** Javadoc comment needed. */
/** line had many trailing spaces. */
    public String getLastName() { //* @parram for getLastName is needs to be abstract, final or empty. */
return Il; 
}
public void setFirstName(String firstName) { //* @parram for setFirstName is needs to be abstract, final or empty. */
 /** line had many trailing spaces. */
lI.getStudent(I).setFirstName(firstName); } //* @parram Fisrtname is needed and it should be final. */
   public void setLastName(String lastName) { //* @parram for setLastName is needs to be abstract, final or empty. */
        /** line had many trailing spaces. */
        lI.getStudent(I).setLastName(lastName);} //* @parram lastName is needed and it should be final. */

        /** Javadoc comment needed. */
    /** line had many trailing spaces. */
        public void addUnitRecord(IStudentUnitRecord record) {
        lI.getStudent(I).addUnitRecord(record);} //* @parram for getStudent needs to be abstract, final or empty. */
        public IStudentUnitRecord getUnitRecord(String unitCode) { //* @parram for getUnitRecord is needs to be abstract, final or empty. */
 return lI.getStudent(I).getUnitRecord(unitCode);} //* @parram unitCode should be final. */

/** Javadoc comment needed. */
        public StudentUnitRecordList getUnitRecords() { //* @parram for getUnitRecords is needs to be abstract, final or empty. */
            /** line had many trailing spaces. */
            /** line break needed. */
            return lI.getStudent(I).getUnitRecords();}}
