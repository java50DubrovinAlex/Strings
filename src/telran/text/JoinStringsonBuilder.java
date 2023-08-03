package telran.text;

public class JoinStringsonBuilder implements JoinStrings {

	@Override
	public String join(String[] strings, String delimitr) {
		String res = "";
		if (strings != null && strings.length > 0) {
			StringBuilder builder = new StringBuilder(strings[0]);
			for(int i = 1; i < strings.length; i++) {
				builder.append(delimitr).append(strings[i]);
				
			}
			res = builder.toString();
		}
		return res;
	}
}
