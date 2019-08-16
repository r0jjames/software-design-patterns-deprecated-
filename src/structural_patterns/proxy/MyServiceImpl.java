package structural_patterns.proxy;

public class MyServiceImpl implements MyService {

    @Override
    public String getTimeline(String screenName) {
        return "This is my cool timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
