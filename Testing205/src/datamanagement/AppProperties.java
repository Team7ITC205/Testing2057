package datamanagement;
/* Multiple markers at this line
	- 'import' should be separated from previous statement.
	- Wrong lexicographical order for 'java.io.*' import. Should be before 
	 'java.util.*'.
	- 'CLASS_DEF' should be separated from previous statement.
	- Using the '.*' form of import should be avoided - java.util.*.
	- Using the '.*' form of import should be avoided - java.io.*.
*/
import java.util.*;//have incorrect indentation level 0, expected level should be 2.
import java.io.*;//have incorrect indentation level 0, expected level should be 2.
public class AppProperties {
/*- AppProperties [access and modification] - self
  - 'method def modifier' have incorrect indentation level 0, expected level should be 2.*/
  private static AppProperties self = null;
  private Properties properties;
/*	- '{' at column 5 should have line break after.
	- '{' is not followed by whitespace. 
	- 'try' have incorrect indentation level 0, expected level should be 4.
	- '}' at column 62 should be on the same line as the next part of a multi-block statement 
	- '}' is not preceded with whitespace.*/
  public static AppProperties getInstance() {
if (self == null ) { self = new AppProperties(); } return self;}
/*	- 'METHOD_DEF' should be separated from previous statement.
	- 'return' is not preceded with whitespace.
	- '{' is not followed by whitespace.
	- 'method def modifier' have incorrect indentation level 4, expected level should be 2.
	- '{' at column 39 should have line break after.  
*/
private AppProperties() {properties = new Properties();
/*	- '}' is not preceded with whitespace.
	- Line breakpoint:AppProperties [line: 12] - AppProperties()
	- '}' at column 2 should be on a new line.
	- '}' is not followed by whitespace. 
	- '}' at column 1 should be alone on a line.
	*/
try {properties.load(new FileInputStream("Properties.prop"));}
catch (IOException e) {throw new RuntimeException("Could not read property file");}}
    public Properties getProperties() {return properties;}}
