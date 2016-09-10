package datamanagement;
//No comment and Javadoc ( do not have any comments)
import java.util.List;
import org.jdom.*;

public class UnitManager {
	//Avoid using redundant field initializer for 'self'
	private static UnitManager self = null;
	//VariableNamingConventions "UM"
	private UnitMap UM;
	//Avoid using short method names
	//Method names should not start with capital letters
	public static UnitManager UM() {
		//Avoid using if statements without curly braces
		if (self == null)
			self = new UnitManager();
		return self;
	}

	private UnitManager() {
		UM = new UnitMap();
	}
	//Avoid variables with short names like uc
	public IUnit getUnit(String uc) {
		IUnit iu = UM.get(uc);
		return iu != null ? iu : createUnit(uc);

	}

	private IUnit createUnit(String unitCode) {
		//Avoid variables with short names like iu
		IUnit iu;

		for (Element el : (List<Element>) XMLManager.getXML().getDocument()
				.getRootElement().getChild("unitTable").getChildren("unit"))
			if (unitCode.equals(el.getAttributeValue("uid"))) {
				StudentUnitRecordList slist;

				slist = null;
				iu = new Unit(el.getAttributeValue("uid"),
						el.getAttributeValue("name"), Float.valueOf(
								el.getAttributeValue("ps")).floatValue(), Float
								.valueOf(el.getAttributeValue("cr"))
								.floatValue(), Float.valueOf(
								el.getAttributeValue("di")).floatValue(), Float
								.valueOf(el.getAttributeValue("hd"))
								.floatValue(), Float.valueOf(
								el.getAttributeValue("ae")).floatValue(),
						Integer.valueOf(el.getAttributeValue("asg1wgt"))
								.intValue(), Integer.valueOf(
								el.getAttributeValue("asg2wgt")).intValue(),
						Integer.valueOf(el.getAttributeValue("examwgt"))
								.intValue(), StudentUnitRecordManager
								.instance().getRecordsByUnit(unitCode));
				UM.put(iu.getUnitCode(), iu);
				return iu;
			}
		//Avoid throwing raw exception types.
		throw new RuntimeException("DBMD: createUnit : unit not in file");
	}

	public UnitMap getUnits() {

		UnitMap uM;
		IUnit iu;

		uM = new UnitMap();
		//Avoid instantiating new objects inside loops
		for (Element el : (List<Element>) XMLManager.getXML().getDocument()
				.getRootElement().getChild("unitTable").getChildren("unit")) {
			iu = new UnitProxy(el.getAttributeValue("uid"),
					el.getAttributeValue("name"));
			uM.put(iu.getUnitCode(), iu);
		} // unit maps are filled with PROXY units
		return uM;
	}

}
