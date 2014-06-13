package aggregateGIT;

import java.util.ArrayList;
import java.util.HashMap;

public interface RecInterface {
	
	 /**
     * Query for Recommendations. If no recommendations or no recommender
     * server, return null
     * 
     * @param usr
     *            the user name
     * @param grp
     *            the group id
     * @param sid
     *            the session id
     * @param cid
     *            the course id
     * @param domain
     *            the domain (java, sql, etc)
     * @param lastContentId
     *            the content identifier (content_name) of the last content
     *            completed or visited by the user
     * @param lastContentResult
     *            the result of the activity performed (lastContentId). Most of
     *            the cases is "1" or "0" (for exercises solved correctly or
     *            incorrectly), but for other kind of content could take another
     *            values
     * @param lastContentProvider
     *            the provider id of the last content item attempted
     * @param maxRecommendations
     *            the maximum number of recommendation to include in the list
     * @param contentList
     *            each key represent a content item, identified by the
     *            content_name and each value is an String[] with:<br />
     *            0: resource name (id) 1: display name 2: url 3: description 4:
     *            comment 5: provider id ...
     * @return An ordered ArrayList of recommendations. Each recommendation is
     *         an ArrayLst of string containing:<br />
     *         0 : recommendation id<br />
     *         1 : topic id (topic name in aggregate)<br />
     *         2 : resource type id (resource name in aggregate)<br />
     *         3 : recommended content id (content name in aggregate)<br />
     *         4 : recommended score (as a double)<br />
     *         5 : feedback text (text to show in the feedback question)<br />
     *         6 : feedback stored value (if user gave feedback before)<br />
     * 
     */
    public ArrayList<ArrayList<String>> getRecommendations(String usr,
            String grp, String sid, String cid, String domain, String lastContentId,
            String lastContentResult, String lastContentProvider,
            int maxRecommendations, HashMap<String, String[]> contentList);

}
