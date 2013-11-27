

package tool.common

import java.util.regex.Pattern

class ComUtility {
	//validation
	public static boolean isIdentifier(String name) {
		if(name==null) return false;
		if("lbsc0009".equals(name)){
			System.out.println ("")
		}
	    String regEx = '^[a-zA-Z](_?[a-zA-Z0-9]+)*';
	    return Pattern.matches(regEx, name.trim());
	}
}
