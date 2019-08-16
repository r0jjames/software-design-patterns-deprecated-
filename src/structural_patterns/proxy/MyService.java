package structural_patterns.proxy;

public interface MyService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}
