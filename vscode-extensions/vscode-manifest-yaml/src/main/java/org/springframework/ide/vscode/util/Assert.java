package org.springframework.ide.vscode.util;

public class Assert {

	public static void isNull(String msg, Object obj) {
		if (obj!=null) {
			throw new IllegalStateException(msg);
		}
	}
	
}
