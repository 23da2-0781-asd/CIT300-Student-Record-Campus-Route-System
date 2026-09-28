public class ServiceRequest {
    String request;

    public ServiceRequest(String request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return request;
    }
}