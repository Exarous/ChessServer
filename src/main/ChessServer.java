package main;

import java.io.IOException;

public class ChessServer {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SocketServer ss = new SocketServer();
        ss.run();
    }
}
