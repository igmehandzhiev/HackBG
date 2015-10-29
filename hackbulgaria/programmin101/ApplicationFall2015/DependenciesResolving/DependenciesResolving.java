package com.hackbulgaria.programmin101.ApplicationFall2015.DependenciesResolving;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.*;

import com.google.gson.JsonParser;

public class DependenciesResolving {
	public static void main(String[] args) throws FileNotFoundException,
			JSONException {
		JsonParser parser = new JsonParser();
		Object objDep = parser.parse(new FileReader(
				"C:\\Users\\IGM\\Documents\\DependencieR\\dependencies.json"));
		Object objAll = parser.parse(new FileReader(
				"C:\\Users\\IGM\\Documents\\DependencieR\\all_packages.json"));

		JSONObject jsonObjectDep = (JSONObject) objDep;
		JSONObject jsonObjectAll = (JSONObject) objAll;

		@SuppressWarnings("unchecked")
		ArrayList<String> jArr = (ArrayList<String>) jsonObjectDep
				.get("dependencies");
		for (int i = 0; i < jArr.size(); i++) {
			moduleInst(jsonObjectAll, jArr.get(i));
			System.out.println("All done");
		}
	}

	@SuppressWarnings("unchecked")
	public static void moduleInst(JSONObject jsonObj, String dep)
			throws JSONException {
		ArrayList<String> mustINstall = new ArrayList<String>();
		mustINstall = (ArrayList<String>) jsonObj.get(dep);
		if (installed(dep)) {
			System.out.println(Character.toUpperCase(dep.charAt(0))
					+ " is alredy installed.");
		} else {
			System.out.println("Instaling " + dep + ".");
			save(dep);
		}

		if (mustINstall.size() != 0) {
			System.out.print("In order to install " + dep + ", we need ");
			for (int i = 0; i < mustINstall.size(); ++i) {
				System.out.println(mustINstall.get(i));
			}
		}
		System.out.print(".");
		System.out.println();

		if (mustINstall.size() != 0) {
			for (int i = 0; i < mustINstall.size(); i++) {
				moduleInst(jsonObj, mustINstall.get(i));
			}

		}
	}

	private static void save(String dep) {
		File file = new File(
				"C:\\Users\\IGM\\Documents\\DependencieR\\installed_modules\\"
						+ dep);
		file.getParentFile().mkdir();
	}

	private static boolean installed(String dep) {
		File folder = new File(
				"C:\\Users\\IGM\\Documents\\DependencieR\\installed_modules");
		File[] files = folder.listFiles();

		for (File file : files) {
			if (file.isFile()) {
				if (file.getName().equals(dep)) {
					return true;
				}
			}
		}

		return false;
	}
}
