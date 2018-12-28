package org.andre.util;

import java.util.ArrayList;

import org.json.JSONObject;

public final class utils {
	private static JSONObject currentMessage = new JSONObject();
	
	
	
	public static void organisMessage(String message) {
		currentMessage.put("currentMessage", message);
	}
	
	public static JSONObject getCurrentMessage() {
		return currentMessage;
	}

}
