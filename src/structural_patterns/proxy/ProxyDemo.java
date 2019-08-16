package structural_patterns.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        MyService service = (MyService) SecurityProxy.newInstance(new MyServiceImpl());
        System.out.println(service.getTimeline("Mr. Pogi"));
    }
}
