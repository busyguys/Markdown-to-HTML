package util;

public enum TokenType {
	CODE("^([ ]\\'[ ])(.)+?([ ]\\'[ ])"),
	ESCAPE("^\\\\[\\\\'\\*\\_\\{\\}\\[\\]\\(\\)\\#\\.\\!]"),
	STRONG("^(((\\_\\_)(.)+?(\\_\\_))|((\\*\\*)(.)+?(\\*\\*)))"),
	EMP("^((\\_(.)+?\\_)|(\\*(.)+?\\*))"),
	INLINE_IMAGE("^\\!\\[(.)+?\\]\\((.)+?\\)"),
	REF_IMAGE("^\\!\\[(.)+?\\]\\[[\\d\\w\\s]+\\]"),
	INLINE("^\\[(.)+?\\]\\((.)+?\\)"),
	IMPLICIT("^\\[(.)+?\\]\\[\\]"),
	REF("^\\[(.)+?\\]\\[(.)+?\\]"),
	AUTO("^\\<((http)\\:((\\w\\d[\\-\\_])\\/)+\\/?)|(\\w\\d[\\-\\_])\\@(\\w\\d[\\-\\_\\.])\\>"),
	HTML("^\\<(.)+?\\>"),
	COPY("^&copy;"),
	SPECIAL("^[\\&\\<]"),
	NULL("^(\\t|\\r|\\n|\\v|\\f)"),
	PLAIN("^.");
	
	public final String pattern;

    private TokenType(String pattern) {
      this.pattern = pattern;
    }
}
