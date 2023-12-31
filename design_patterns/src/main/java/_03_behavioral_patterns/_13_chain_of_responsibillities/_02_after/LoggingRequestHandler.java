package _03_behavioral_patterns._13_chain_of_responsibillities._02_after;


import _03_behavioral_patterns._13_chain_of_responsibillities._01_before.Request;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
