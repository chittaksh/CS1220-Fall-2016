package com.lab12.classes;

public class RecursiveProbs {

	public boolean recursiveContains(char c, String str) {
		if (str.length() == 0)
			return false;

		if (str.charAt(str.length() - 1) == c)
			return true;
		else
			return recursiveContains(c, str.substring(0, str.length() - 1));
	}

	public boolean recursiveAllCharactersSame(String str) {
		if (str.length() <= 1)
			return true;

		if (str.charAt(str.length() - 1)==str.charAt(0))
			return recursiveAllCharactersSame(str.substring(0, str.length() - 1));
		else
			return false;
	}

	public String recursiveReverse(String str) {
		if ((str == null) || (str.length() <= 1))
			return str;

		return recursiveReverse(str.substring(1)) + str.charAt(0);
	}

	public int recursiveCount(char c, String str) {
		int count = 0;
		if (str.length() <= 1)
			return count;

		if (str.charAt(str.length() - 1) == c) {
			count++;
			return count + recursiveCount(c, str.substring(0, str.length() - 1));
		} else
			return recursiveCount(c, str.substring(0, str.length() - 1));
	}
}
