package org.example;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class CoapResourceExample extends CoapResource {
    public CoapResourceExample() {
        super("hello");
    }

    @Override
    public void handleGET(CoapExchange exchange) {
        exchange.respond("Hello, CoAP!");
    }
}
