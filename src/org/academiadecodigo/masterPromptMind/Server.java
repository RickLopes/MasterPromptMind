package org.academiadecodigo.masterPromptMind;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public class Server {

    private ServerSocket serverSocket;
    private Player player;
    private ConcurrentHashMap<String, Socket> players;
    private ExecutorService threadPool;

    private

    public void Server() throws IOException {
        serverSocket = new ServerSocket(8080);
        players = new ConcurrentHashMap<>();
        threadPool = Execu



    }

    public static void main(String[] args) {

        Server server = new Server();
        server.start();
    }

    public void start() {

    }
}
