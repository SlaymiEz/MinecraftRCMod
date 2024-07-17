package com.slaymiez.minecraftrcmod;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

public class MinecraftWebSocketServer extends WebSocketServer {
    public MinecraftWebSocketServer(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        System.out.println("New connection from " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        System.out.println("Closed connection from " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        System.out.println("Received message: " + message);
        // Handle incoming messages from the Discord bot here
        if (message.startsWith("ping")) {
            // Handle ping command from Discord bot
            System.out.println("Received ping command from Discord bot");
            // You can execute Minecraft commands or perform actions here
        } else {
            System.out.println("Unknown command: " + message);
        }
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        System.out.println("Error occurred: " + ex.getMessage());
    }

    @Override
    public void onStart() {
        System.out.println("WebSocket server started on port " + getPort());
    }
}