package datamanagement;
        public class ListStudentsCTL {//‘ListStudentsCTL’ must contain no more than ‘1’ capital letters , should be separated from previous statement, incorrect indentation level 0, expected level should be 2 
private StudentManager sm;//incorrect indentation level 0, expected level should be 2
public ListStudentsCTL() {sm = StudentManager.get();}//‘}’ at column 75 should be alone on a line, incorrect indentation level 0, expected level should be 2, ‘{’ at column 26 should have line break after, ‘}’ is not preceded with whitespace, ‘{’ is not followed by whitespace, should be separated from previous statement 
            public void listStudents( IStudentLister lister, String unitCode ) {//incorrect indentation level 0, expected level should be 2, lister.should be separated from previous statement 
    lister.clearStudents();
                StudentMap students = sm.getStudentsByUnit( unitCode );
for (Integer id : students.keySet() ) lister.addStudent(students.get(id));}}//‘}’ at column 75 should be alone on a line, incorrect indentation level 0, expected level should be 2, ‘}’ is not preceded with whitespace, ‘}’ at column 76 should be on a new line, ‘{’ is not followed by whitespace
