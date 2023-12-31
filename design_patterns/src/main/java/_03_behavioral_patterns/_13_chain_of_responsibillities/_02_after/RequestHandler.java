package _03_behavioral_patterns._13_chain_of_responsibillities._02_after;

import _03_behavioral_patterns._13_chain_of_responsibillities._01_before.Request;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
