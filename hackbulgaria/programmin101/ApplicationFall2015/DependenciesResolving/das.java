import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonParser;


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
			installPackages(jsonObjectAll, jArr.get(i));
			System.out.println("All done");
		}
	}

	@SuppressWarnings("unchecked")
	public static void installPackages(JSONObject jsonObj, String dep)
			throws JSONException {
		ArrayList<String> mustBeInstalled = new ArrayList<String>();
		mustBeInstalled = (ArrayList<String>) jsonObj.get(dep);

		if (checkIfInstalled(dep)) {
			System.out.println(Character.toUpperCase(dep.charAt(0))
					+ dep.substring(1) + " is alredy installed.");
		} else {
			System.out.println("Instaling " + dep + ".");
			saveInstalled(dep);
		}

		if (mustBeInstalled.size() != 0) {
			System.out.print("In order to install " + dep + ", we need ");
			for (int i = 0; i < mustBeInstalled.size(); i++) {
				System.out.print(mustBeInstalled.get(i));
				if (i != mustBeInstalled.size() - 1) {
					System.out.print(" and ");
				}
			}
			System.out.print(".");
			System.out.println();
		}

		if (mustBeInstalled.size() != 0) {
			for (int i = 0; i < mustBeInstalled.size(); i++) {
				installPackages(jsonObj, mustBeInstalled.get(i));
			}

		}
	}

	public static boolean checkIfInstalled(String dep) {
		File folder = new File(
				"C:\\Users\\IGM\\Documents\\DependencieR\\installed_modules");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile()) {
				if (file.getName().equals(dep)) {
					return true;
				}
			}
		}

		return false;
	}

	public static void saveInstalled(String dep) {
		File file = new File(
				"C:\\Users\\IGM\\Documents\\DependencieR\\installed_modules\\"
						+ dep);
		file.getParentFile().mkdir();

	}

}
