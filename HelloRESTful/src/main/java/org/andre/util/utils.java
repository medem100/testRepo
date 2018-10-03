package org.andre.util;

import java.util.ArrayList;

import org.json.JSONObject;

public final class utils {
	private static JSONObject message;
	
	
	public static void organisMessage(JSONObject message) {
		message = message;
	}
	
	public static JSONObject getCurrentMessage() {
		return message;
	}

}
