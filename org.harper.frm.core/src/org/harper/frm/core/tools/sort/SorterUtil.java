package org.harper.frm.core.tools.sort;

import java.util.List;

public class SorterUtil {

	@SuppressWarnings("unchecked")
	public static void exchange(List array,int i,int j) {
		Object buffer = array.get(i);
		array.set(i, array.get(j));
		array.set(j, buffer);
	}
}
 