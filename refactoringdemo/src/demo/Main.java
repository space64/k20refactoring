package demo;

import java.util.Properties;
import java.util.StringTokenizer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties props = new Properties();
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("-D")) {
				String s = args[i].substring(2);
				StringTokenizer st = new StringTokenizer(s, "=");
				if (st.countTokens() == 2) {
					props.setProperty(st.nextToken(), st.nextToken());
				}
			}
		}
		// continue...
	}

}
