package com.nikeshhbaskaran.psgitechessentials.studentprofile;

import android.app.Activity;
import android.widget.TextView;

public class Util {
	public static String getTextViewText(Activity a, int id) {
		String returned = (((TextView) a.findViewById(id)).getText())
				.toString();
		return returned;
	}

	public static Integer getTextViewInteger(Activity a, int id) {
		if ((((TextView) a.findViewById(id)).getText()).toString().length() != 0) {
			Integer returned = Integer
					.parseInt((((TextView) a.findViewById(id)).getText())
							.toString());
			return returned;
		}
		return -1;
	}
}
