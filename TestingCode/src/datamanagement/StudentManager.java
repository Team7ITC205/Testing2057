package datamanagement;
/** 
* @author 
* @version. 
*/
import org.jdom.*;
import java.util.List;
public class StudentManager { /** StudentManager class should be declared as final */
    private static StudentManager self = null;
    /** Javadoc comment needed. */
    private StudentMap sm; private java.util.HashMap<String, StudentMap> um; /** whitespace error resolved */
public static StudentManager get() {
        if (self == null) 
            
self = new StudentManager(); return self; }
private StudentManager() {
  
            sm = new StudentMap(); /** whitespace error resolved */
        um = new java.util.HashMap<>(); } /** whitespace error resolved */
        public IStudent getStudent(Integer id) {
IStudent is = sm.get(id);
    return is != null ? is : createStudent(id);
    }
        /** Javadoc comment needed. */
        private Element getStudentElement(Integer id) { //* @parram id is needed and it should be final. */
        for (Element el : (List<Element>) XMLManager.getXML().getDocument().getRootElement().getChild("studentTable").getChildren("student"))  /** line is longer than 80charectors. */
            if (id.toString().equals(el.getAttributeValue("sid"))) 
return el;return null;
                }
        /** Javadoc comment needed. */
                private IStudent createStudent(Integer id) { //* @parram id is needed and it should be final. */
                    IStudent is;
        Element el = getStudentElement(id); /** whitespace error resolved */
        if (el != null) {
            StudentUnitRecordList rlist = StudentUnitRecordManager.instance().getRecordsByStudent(id);
    is = new Student(new Integer(el.getAttributeValue("sid")),el.getAttributeValue("fname"),el.getAttributeValue("lname"),rlist); /** line is longer than 80charectors. */
  sm.put(is.getID(), is);
        return is; }
throw new RuntimeException("DBMD: createStudent : student not in file"); } /** whitespace error resolved */
 /** Javadoc comment needed. */
    private IStudent createStudentProxy(Integer id) { //* @parram id is needed and it should be final. */
        Element el = getStudentElement(id);
             if (el != null) return new StudentProxy(id, el.getAttributeValue("fname"), el.getAttributeValue("lname"));  /** line is longer than 80charectors. */
        throw new RuntimeException("DBMD: createStudent : student not in file"); } /** whitespace error resolved */ /** line is longer than 80charectors. */
/** Javadoc comment needed. */
        public StudentMap getStudentsByUnit(String uc) {
        StudentMap s = um.get(uc);
        if (s != null) 
{
/** line had many trailing spaces. */
    return s;
                }

s = new StudentMap();
IStudent is;
    StudentUnitRecordList ur = StudentUnitRecordManager.instance().getRecordsByUnit(uc); /** line is longer than 80charectors. */
        for (IStudentUnitRecord S : ur) {  /** Variable name must define the exact explanation of its content.
variable should start by a lowercase. */

            /** line had many trailing spaces. */
            is = createStudentProxy(new Integer(S.getStudentID()));
    s.put(is.getID(), is); } /** whitespace error resolved */
    um.put(uc, s); /** whitespace error resolved */
        return s;
} /** whitespace error resolved */
} /** whitespace error resolved */