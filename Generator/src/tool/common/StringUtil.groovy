package tool.common

import tool.model.tabledef.TableSheet


class StringUtil  {

	
	public static String getPkText(TableSheet tableSheet) {
		String pk="";
		boolean first=true;
		for(HashMap item:tableSheet.items){
			if(!"".equals(item.get("キー"))){
				if(first){
					first=false;
					pk+=item.get("フィールド名");
				}else{
					pk+=" , "+item.get("フィールド名");
				}
			}
		}
		
		return String.format("primary key (%s) ",pk);
	}
	public static String getCreateColText(Map map) {
		if("".equalsIgnoreCase(map.get("フィールド名"))){
			return "";
		}
		if("VARCHAR2".equalsIgnoreCase(map.get("属性"))){
			return String.format("%s VARCHAR2(%s) %s,",map.get("フィールド名"),map.get("桁数") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		}
		if("DATE".equalsIgnoreCase(map.get("属性"))){
			return String.format("%s DATE %s,",map.get("フィールド名") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		}
		if("TIMESTAMP".equalsIgnoreCase(map.get("属性"))){
			return String.format("%s TIMESTAMP %s,",map.get("フィールド名") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		}
		
		if("NUMBER".equalsIgnoreCase(map.get("属性"))){
			return String.format("%s NUMBER(%s %s) %s,",map.get("フィールド名"),map.get("桁数") ,"".equals(map.get("少数"))?"":map.get("少数") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		}
		
		if("double".equalsIgnoreCase(map.get("属性"))){
			return String.format("%s NUMBER(%s) %s /*double*/,",map.get("フィールド名"),map.get("桁数") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		}
		if("short".equalsIgnoreCase(map.get("属性"))){
			return String.format("%s NUMBER(%s) %s /*short*/,",map.get("フィールド名"),map.get("桁数") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		}
		
		
		if("string".equalsIgnoreCase(map.get("属性"))){
			return String.format("%s VARCHAR2(%s) %s /*string*/,",map.get("フィールド名"),map.get("桁数") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		}
		if("boolean".equalsIgnoreCase(map.get("属性"))){
			return String.format("%s NUMBER(1,0) %s /*boolean */,",map.get("フィールド名") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		}
		
		return String.format("%s TODO %s",map.get("フィールド名") ,"".equals(map.get("Null"))?"":" NOT NULL ");
		return "";
	}
	
	public static String getMappingName(String str) {
		String result=Config.namingMap.get(str.trim())
		if(result==null) return str;
		return result;
	}
	public static String getTypeName(String str) {
		
		if(str==null) return "String";
		String basicType="String";
		
		if("VARCHAR".equalsIgnoreCase(str)
		||"VARCHAR2".equalsIgnoreCase(str)
		||"Char".equalsIgnoreCase(str)
		||"STRING".equalsIgnoreCase(str)
		||"Code".equalsIgnoreCase(str)
		||"DATE".equalsIgnoreCase(str)
		
		){
			basicType= "String";
		}
		if("Number".equalsIgnoreCase(str) ){
			basicType= "java.math.BigDecimal";
		}
		if("INTEGER".equalsIgnoreCase(str) ){
			basicType= "Integer";
		}
		if("BOOLEAN".equalsIgnoreCase(str) ){
			basicType= "Boolean";
		}
		if("Date".equalsIgnoreCase(str) ){
			basicType= "String";
		}
		
		if("VARCHAR[]".equalsIgnoreCase(str)
			||"VARCHAR2[]".equalsIgnoreCase(str)
			||"Char[]".equalsIgnoreCase(str)
			||"STRING[]".equalsIgnoreCase(str)
			||"Code[]".equalsIgnoreCase(str)
			||"DATE[]".equalsIgnoreCase(str)
			
			){
				basicType= "String[]";
			}
			if("Number[]".equalsIgnoreCase(str) ){
				basicType= "java.math.BigDecimal[]";
			}
			if("INTEGER[]".equalsIgnoreCase(str) ){
				basicType= "Integer[]";
			}
			if("BOOLEAN[]".equalsIgnoreCase(str) ){
				basicType= "Boolean[]";
			}
			if("Date[]".equalsIgnoreCase(str) ){
				basicType= "String[]";
			}
			
		
			return basicType;
		
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
			if("L".equalsIgnoreCase(part)){
				
			}else{
				camelCaseString = camelCaseString + toProperCase(part);
			}
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
		s=s.replaceFirst("L_", "");
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
	public static String joinCallParams(List<String> list){
		String result="";
		if(list==null||list.size()==0){
			return result;
		}
		boolean first=true;
		for(String str:list){
			if(first){
				first=false;
				result+=String.format("%s", StringUtil.toLowerCaseInitial(str))
			}else{
				result+=String.format(",  %s", StringUtil.toLowerCaseInitial(str))
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