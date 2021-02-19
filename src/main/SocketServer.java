package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer implements Runnable {

    private Handler handler = new Handler();

    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(8864);
            Socket socket = ss.accept();

            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String inputLine;

            while ((inputLine = reader.readLine()) != null) {
                handler.onDataReceived(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
