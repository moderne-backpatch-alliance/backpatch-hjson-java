package org.hjson.test;

import org.hjson.JsonValue;
import org.hjson.ParseException;

class TestFunctions {
	static void Exec() {
		String jsonString = "[\n[\n=\n[[\'\'\'\'\'\'";
		try {
			JsonValue.readHjson(jsonString);
			throw new RuntimeException("Accepted non-terminated array");
		} catch (ParseException e) {
		}
	}
}
