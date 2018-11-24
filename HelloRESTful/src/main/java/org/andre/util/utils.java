package org.andre.util;

import java.util.ArrayList;

import org.json.JSONObject;

public final class utils {
	private static JSONObject currentMessage = null;
	
	
	public static void organisMessage(JSONObject message) {
		currentMessage = message;
	}
	
	public static JSONObject getCurrentMessage() {
		return currentMessage;
	}

}
