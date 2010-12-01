package org.restlet.example.book.restlet.misc;

import org.restlet.Application;
import org.restlet.Server;
import org.restlet.data.Protocol;

public class RangeServer {
    public static void main(String[] args) throws Exception {
        // Instantiating the Application providing the Range Service
        Application app = new Application();

        // Plug the server resource.
        app.setInboundRoot(HelloServerResource.class);

        // Instantiating the HTTP server and listening on port 8182
        new Server(Protocol.HTTP, 8182, app).start();
    }
}
