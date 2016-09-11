package datamanagement;
/** 
* @author 
* @version. 
*/
public class StudentUnitRecord implements IStudentUnitRecord {
	private Integer sid; /** tab charector is used in this line. */
	private String uc;
	private float a1, a2, ex;
/** Javadoc comment needed. */
	public StudentUnitRecord(Integer id, String code, float asg1, float asg2,/** line is longer than 80 charectors. */
                //* @parram asg1 is needed and it should be final. */
                //* @parram asg2 is needed and it should be final. */
                //* @parram code is needed and it should be final. */
                //* @parram id is needed and it should be final. */
			float exam) {  //* @parram exam is needed and it should be final. */
		this.sid = id;
		this.uc = code;
		this.setAsg1(asg1);
		this.setAsg2(asg2);
		this.setExam(exam);
	}
/** Javadoc comment needed. */
	public Integer getStudentID() { //* @parram for getStudentID is needs to be abstract, final or empty. */
		return sid;
	}
/** Javadoc comment needed. */
	public String getUnitCode() {//* @parram for getUnitCode is needs to be abstract, final or empty. */
		return uc;
	}
/** Javadoc comment needed. */
	public void setAsg1(float a1) { //* Rename needed parameter and the static field have the same name. */
                                        //* @parram for setAsg1 is needs to be abstract, final or empty. */
                                        //* @parram a1 is needed and it should be final. */
		if (a1 < 0 || //* || should be in the next line. */
			a1 > UnitManager.UM().getUnit(uc).getAsg1Weight()) {
			throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");/** line is longer than 80 charectors. */
		}
		this.a1 = a1;
	}
/** Javadoc comment needed. */
	public float getAsg1() { //* Rename needed parameter and the static field have the same name. */
 		return a1;
	}
/** Javadoc comment needed. */
	public void setAsg2(float a2) { //* Rename needed parameter and the static field have the same name. */
		if (a2 < 0 ||     //* || should be in the next line. */
                    a2 > UnitManager.UM().getUnit(uc).getAsg2Weight()) {
			throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight");/** line is longer than 80 charectors. */
		}
		this.a2 = a2;

	}
/** Javadoc comment needed. */
	public float getAsg2() { //* @parram for getAsg1 is needs to be abstract, final or empty. */
		return a2;
	}
/** Javadoc comment needed. */
	public void setExam(float ex) { //* @parram for setExam is needs to be abstract, final or empty. */
		if (ex < 0 ||   //* || should be in the next line. */
				ex > UnitManager.UM().getUnit(uc).getExamWeight()) { /** line is longer than 80 charectors. */
				throw new RuntimeException("Mark cannot be less than zero or greater than assessment weight"); /** line is longer than 80 charectors. */
			}
		this.ex = ex;
	}
/** Javadoc comment needed. */
	public float getExam() { //* @parram for getExam is needs to be abstract, final or empty. */
		return ex;
	}
/** Javadoc comment needed. */
	public float getTotal() { //* @parram for getTotal is needs to be abstract, final or empty. */
		return a1 + a2 + ex;

	}
}
