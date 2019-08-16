package behavioral_patterns.chain_of_responsibility;

public class Request {
    private RequestType requestType;
    private double amount;

    Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
