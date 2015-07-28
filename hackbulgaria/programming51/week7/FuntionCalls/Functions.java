package com.hackbulgaria.programming51.week7.FuntionCalls;

public class Functions {
	private String name = null;
	private String arg = null;
	private String[] body = null;

	public Functions(String name, String arg, String[] strings) {
		this.setName(name);
		this.setArg(arg);
		this.setBody(strings);
	}

	public int result(int result) {
		int res = 0;
		String[] member = body[1].toString().split(" ");
		res += calculate(result, 0, member, '+');
		for (int i = 1; i < member.length - 1; ++i) {
			if (member[i].equals("+")) {
				res += calculate(result, i + 1, member, '+');
			}
			if (member[i].equals("-")) {
				res += calculate(result, i + 1, member, '-');
			}
		}
		return res;
	}

	public int calculate(int result, int nMember, String[] member, char ch) {
		int res = 0;
		String memberN = member[nMember];
		if (ch == '+') {
			if (memberN.equals(arg))
				res += result;
			if (memberN.matches("\\d+"))
				res += Integer.parseInt(memberN);
			else if (memberN.matches(".*\\d+.*")) {
				for (int i = 0; i < FunctionCalls.functions.size(); ++i) {
					if (memberN.substring(0, (memberN.length() - 3)).equals(
							FunctionCalls.functions.get(i).name)) {
						res += FunctionCalls.functions.get(i).result(
								Integer.parseInt(memberN.substring(
										(memberN.length() - 2),
										(memberN.length() - 1))));
					}
				}
			}
			for (int i = 0; i < FunctionCalls.functions.size(); ++i) {
				if (memberN.equals((FunctionCalls.functions.get(i).name + "("
						+ arg + ")")))
					res += FunctionCalls.functions.get(i).result(result);
			}
		} else {
			if (memberN.equals(arg))
				res -= result;
			if (memberN.matches("\\d+"))
				res -= Integer.parseInt(memberN);
			else if (memberN.matches(".*\\d+.*")) {
				for (int i = 0; i < FunctionCalls.functions.size(); ++i) {
					if (memberN.substring(0, (memberN.length() - 3)).equals(
							FunctionCalls.functions.get(i).name)) {
						res -= FunctionCalls.functions.get(i).result(
								Integer.parseInt(memberN.substring(
										(memberN.length() - 2),
										(memberN.length() - 1))));
					}
				}
			}
			for (int i = 0; i < FunctionCalls.functions.size(); ++i) {
				if (memberN.equals((FunctionCalls.functions.get(i).name + "("
						+ arg + ")")))
					res -= FunctionCalls.functions.get(i).result(result);
			}
		}
		return res;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		this.arg = arg;
	}

	public String[] getBody() {
		return body;
	}

	public void setBody(String[] strings) {
		this.body = strings;
	}
}
