package datamanagement;

public interface IStudent {

    public Integer getID();//‘getID’ must contain no more than ‘1’ capital letters, incorrect indentation level 4, expected level should be 2

    public String getFirstName();//incorrect indentation level 4, expected level should be 2.
    public void setFirstName(String firstName);//incorrect indentation level 4, expected level should be 2, should be separated from previous statement

    public String getLastName();//incorrect indentation level 4, expected level should be 2.
    public void setLastName(String lastName);//incorrect indentation level 4, expected level should be 2, should be separated from previous statement

    public void addUnitRecord( IStudentUnitRecord record );//incorrect indentation level 4, expected level should be 2.
    public IStudentUnitRecord getUnitRecord( String unitCode );//incorrect indentation level 4, expected level should be 2, should be separated from previous statement

    public StudentUnitRecordList getUnitRecords();//incorrect indentation level 4, expected level should be 2.

}
