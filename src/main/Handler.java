package main;

public class Handler implements SocketServerListener {
    @Override
    public void onDataReceived(String message) {
        System.out.println("Received message: " + message);
    }
}
