package tool.common


class StringUtil  {

	
	public static String getMappingName(String str) {
		String result=Config.namingMap.get(str)
		if(result==null) return str;
		return result;
	}
	public static String getTypeName(String str) {
		if("VARCHAR".equalsIgnoreCase(str)
		||"VARCHAR2".equalsIgnoreCase(str)
		||"Char".equalsIgnoreCase(str)

		){
			return "String";
		}
		if("Number".equalsIgnoreCase(str) ){
			return "java.math.BigDecimal";
		}
		if("Date".equalsIgnoreCase(str) ){
			return "java.sql.Date";
		}
		return "TODO";
	}

	public static boolean isEmpty(String str) {
		return str == null || str.equals("");
	}


	public static boolean isNotEmpty(String str) {
		return str != null && !str.equals("");
	}

	public static String toUpperCase(String str) {
		if (isEmpty(str)) {
			return str;
		} else {
			return str.toUpperCase();
		}
	}

	public static String toUpperCaseInitial(String str) {
		if (isEmpty(str)) {
			return str;
		} else {
			return str.substring(0, 1).toUpperCase().concat(str.substring(1));
		}
	}


	public static String toLowerCaseInitial(String str) {
		if (isEmpty(str)) {
			return str;
		} else {
			return str.substring(0, 1).toLowerCase().concat(str.substring(1));
		}
	}


	public static String toCamelCase(String s){
		String[] parts = s.split("_");
		String camelCaseString = "";
		for (String part : parts){
			camelCaseString = camelCaseString + toProperCase(part);
		}
		return camelCaseString;
	}

	static String toProperCase(String s) {
		if("".equals(s)){
			return "";
		}
		return s.substring(0, 1).toUpperCase() +
		s.substring(1).toLowerCase();
	}
	public static String toPascalCase(String s){
		String[] parts = s.split("_");
		String camelCaseString = "";
		for (String part : parts){
			camelCaseString = camelCaseString + toProperCase(part);
		}
		return toLowerCaseInitial(camelCaseString);
	}


	public static String fixPath(String s){
		return s.replaceAll("\\.", "/");
	}



	public static String toSnakeCase(String str) {
		StringBuilder sb = new StringBuilder();
		char[] buf = toLowerCaseInitial(str).toCharArray();
		sb.append(buf[0]);
		for (int i = 1; i < buf.length; i++) {
			if ('A' <= buf[i] && buf[i] <= 'Z') {
				sb.append('_');
				sb.append((char)(buf[i] + 0x20));
			} else {
				sb.append(buf[i]);
			}
		}
		return sb.toString();
	}

	public static String removeJavaLang(String s){
		if (s==null) return "";
		def result= s.replaceAll("java\\.lang\\.", "")
		return result;
		print "$s -> $result"
	}
	public static String joinParams(List<String> list){
		String result="";
		if(list==null||list.size()==0){
			return result;
		}
		boolean first=true;
		for(String str:list){
			if(first){
				first=false;
				result+=String.format("%s %s", StringUtil.toUpperCaseInitial(str),StringUtil.toLowerCaseInitial(str))
			}else{
				result+=String.format(", %s %s", StringUtil.toUpperCaseInitial(str),StringUtil.toLowerCaseInitial(str))
			}
		}
		return result;
		
	}
	public static String cleanUpString(String str){
		if(str==null) return "";
		String result= str.replaceAll("\\s+","").replaceAll("\r\n|\n\r|\n|\r","")
		return result
	}

}