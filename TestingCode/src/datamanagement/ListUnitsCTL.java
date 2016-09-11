package datamanagement;
/** Javadoc comment needed. */
public class ListUnitsCTL {
    /** Javadoc comment needed. */
    private UnitManager um; /** can be private final UnitManager um:. */
/** Javadoc comment needed. */
public ListUnitsCTL() {
        um = UnitManager.UM();
} /** whitespace should be here. */
            public void listUnits( IUnitLister lister ) {/** whitespace should be avoided (IunitLister lister) . */
lister.clearUnits();UnitMap units = um.getUnits(); /** ; should followed by whitespace */
        for (String s : units.keySet() )
            lister.addUnit(units.get(s));}}
