package aggregateGIT;

import java.util.ArrayList;
import java.util.HashMap;

public class PAWSRecInterface implements RecInterface {

	@Override
	public ArrayList<ArrayList<String>> getRecommendations(String usr,
			String grp, String sid, String cid, String domain,
			String lastContentId, String lastContentResult,
			String lastContentProvider, int maxRecommendations,
			HashMap<String, String[]> contentList) {
		// A JSON object is created to pass the required parameter to the recommendation service implemented by GetRecommendations.java
		
		return null;
	}

}
