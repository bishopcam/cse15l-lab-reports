import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one message string on the server: a string that will
    // be manipulated by various requests.
    String serverMessage = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return serverMessage;
        }
        else {
        System.out.println("Path: " + url.getPath());
        if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                serverMessage = serverMessage.concat(parameters[1] + '\n');
                return("String: " + parameters[1] + " added to message!");
            }
        }
            return "404 Not Found!";
        }
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
