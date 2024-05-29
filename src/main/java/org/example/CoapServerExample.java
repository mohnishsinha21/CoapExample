package org.example;

import org.eclipse.californium.core.CoapServer;

public class CoapServerExample {
    public static void main(String[] args) {
        // Create a new CoAP server
        CoapServer server = new CoapServer();

        // Add the CoapResourceExample to the server
        server.add(new CoapResourceExample());

        // Start the server
        server.start();
        System.out.println("CoAP server is running...");
    }
}
