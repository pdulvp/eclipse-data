package org.pdulvp.common.helpers;

import java.util.HashMap;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AbstractDataManager {

  public final static Boolean ENABLED = Boolean.TRUE;

  public static Object syncRequest(String path, boolean auth) {
    try {

      HttpClient client = new DefaultHttpClient();
      HttpGet httpost = new HttpGet(path);

      httpost.setHeader("Accept", "application/json");
      httpost.setHeader("Content-Type", "application/json");

      HttpResponse string = client.execute(httpost);

      if (200 == string.getStatusLine().getStatusCode()) {
        String responseString = new BasicResponseHandler().handleResponse(string);
        try {
          return new JSONObject(responseString);
        } catch (JSONException e) {
          return new JSONArray(responseString);
        }

      }
      JSONObject obj = new JSONObject("{\"error\":{\"en-US\":\"" + string.getStatusLine().getReasonPhrase() + "\"}}");
      return obj;

    } catch (Exception e) {
      return getError(path, e);
    }

  }

  public static String syncRequest(String path, String json, boolean auth) throws Exception {
    HttpClient client = new DefaultHttpClient();
    HttpGet httpost = new HttpGet(path);

    HttpResponse result = client.execute(httpost);
    String responseString = new BasicResponseHandler().handleResponse(result);
    return responseString;
  }

  public static Object syncRequestPost(String path, String json, boolean auth) {
    if (!ENABLED) {
    	try {
			return new JSONObject("{\"error\":{\"en-US\":\"" + "POST NOT ENABLED" + "\"}}");
		} catch (JSONException e) {
			e.printStackTrace();
		}
    }
    try {
      HttpClient client = new DefaultHttpClient();
      HttpPost httpost = new HttpPost(path);
      System.out.println(path);
      StringEntity se = new StringEntity(json);
      se.setContentType("application/json");
      httpost.setEntity(se);

      httpost.setHeader("Accept", "application/json");
      httpost.setHeader("Content-Type", "application/json");

      HttpResponse string = client.execute(httpost);

      if (200 == string.getStatusLine().getStatusCode()) {
        String responseString = new BasicResponseHandler().handleResponse(string);
        try {
          return new JSONObject(responseString);
        } catch (JSONException e) {
          try {
            return new JSONArray(responseString);
          } catch (JSONException e2) {
            e.printStackTrace();
            System.err.println(responseString);
            JSONObject obj = new JSONObject("{\"error\":{\"en-US\":\"" + e2.getMessage() + "\"}}");
            return obj;
          }
        }
      }
      JSONObject obj = new JSONObject("{\"error\":{\"en-US\":\"" + string.getStatusLine().getReasonPhrase() + "\"}}");
      return obj;

    } catch (Exception e) {
      e.printStackTrace();
      return getError(path, e);
    }
  }

  
  
  public static Object syncRequestPostString(String path, String json, boolean auth, HashMap<String, String> headers) {
    if (!ENABLED) {
	try {
		return new JSONObject("{\"error\":{\"en-US\":\"" + "POST NOT ENABLED" + "\"}}");
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    try {
      HttpClient client = new DefaultHttpClient();
      HttpPost httpost = new HttpPost(path);
      System.out.println(path);
      
      StringEntity se = new StringEntity("");
     // se.setContentType("application/json");
      httpost.setEntity(se);
      se.getContentLength();
      //httpost.setHeader("Accept", "application/json");
      //httpost.setHeader("Content-Type", "application/json");
      for (String key : headers.keySet()) {
        httpost.setHeader(key, headers.get(key));
      }
      HttpResponse string = client.execute(httpost);
      System.out.println(httpost.toString());

      if (200 == string.getStatusLine().getStatusCode()) {
        String responseString = new BasicResponseHandler().handleResponse(string);
        try {
          return new JSONObject(responseString);
        } catch (JSONException e) {
          try {
            return new JSONArray(responseString);
          } catch (JSONException e2) {
            e.printStackTrace();
            System.err.println(responseString);
            JSONObject obj = new JSONObject("{\"error\":{\"en-US\":\"" + e2.getMessage() + "\"}}");
            return obj;
          }
        }
      }
      JSONObject obj = new JSONObject("{\"error\":{\"en-US\":\"" + string.getStatusLine().getReasonPhrase() + "\"}}");
      return obj;

    } catch (Exception e) {
      e.printStackTrace();
      return getError(path, e);
    }
  }

  public static Object syncHttpRequestPost(String path, String json, boolean auth) {
	    if (!ENABLED) {
		try {
			return new JSONObject("{\"error\":{\"en-US\":\"" + "POST NOT ENABLED" + "\"}}");
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    }
	    try {
	      HttpClient client = new DefaultHttpClient();
	      HttpPost httpost = new HttpPost(path);
	      System.out.println(path);
	      StringEntity se = new StringEntity(json);
	      se.setContentType("application/json");
	      httpost.setEntity(se);

	      httpost.setHeader("Accept", "application/json");
	      httpost.setHeader("Content-Type", "application/json");

	      HttpResponse string = client.execute(httpost);
	      if (200 == string.getStatusLine().getStatusCode()) {
	        String responseString = new BasicResponseHandler().handleResponse(string);
	        System.err.println(path);
	        System.err.println(responseString);
	        return responseString;
	      }
	      JSONObject obj = new JSONObject("{\"error\":{\"en-US\":\"" + string.getStatusLine().getReasonPhrase() + "\"}}");
	      return obj;

	    } catch (Exception e) {
	      e.printStackTrace();
	      return getError(path, e);
	    }
	  }
  
  public static JSONObject getError(String uri, Exception e) {
    try {
      JSONObject obj = new JSONObject("{\"error\":{\"en-US\":" + JSONObject.quote(e.getMessage()) + "}}");
      e.printStackTrace();
      return obj;
    } catch (JSONException e1) {
      e1.printStackTrace();
    }
    return null;
  }

}
