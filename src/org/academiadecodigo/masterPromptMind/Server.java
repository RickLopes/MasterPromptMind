package org.academiadecodigo.masterPromptMind;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private ServerSocket serverSocket;
    Client client;

    private

    public void Server() throws IOException {
        serverSocket = new ServerSocket(8080);
        client = new ConcurrentHashMap<>();


    }

    public static void main(String[] args) {

        Server server = new Server();
        server.start();
    }

    public void start() {

    }
}
