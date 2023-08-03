package telran.text;

public class JoinStringsOnStandard implements JoinStrings {

	@Override
	public String join(String[] strings, String delimitr) {
		String res = "";
		if(strings != null && strings.length > 0) {
			res = strings[0];
			for(int i = 1; i < strings.length;i++) {
				String.join(strings[i]);
				res = String.join(delimitr, strings);
			}
		}
		return res;
	}

}
