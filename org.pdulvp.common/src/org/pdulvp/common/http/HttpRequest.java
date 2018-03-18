package org.pdulvp.common.http;

public class HttpRequest {
  private String uri;
  
  private String value;

  public HttpRequest(String uri, String value) {
    super();
    this.uri = uri;
    this.value = value;
  }

  public String getUri() {
    return uri;
  }

  public String getValue() {
    return value;
  }
  
  public static void make(String uri, String value) {
    HttpRequestsJob.addRequest(new HttpRequest(uri, value));
  }
  
}
