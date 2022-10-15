package Java;
import java.io.IOException;
import java.net.URI;
import java.io.*;
import java.util.*;

class Handler implements URLHandler {
    String s = "";  // search string
    Vector<String> data = new Vector<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("""
                Suggest URL entry:
                http://localhost:4000/add?s=entry
                http://localhost:4000/search?s=entry
            """);
        }
        else if (url.getPath().equals("/add")){
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                data.add(parameters[1]);    // add to data
                return String.format("Entry %s being added.", parameters[1]);
            }
        }
        else if (url.getPath().equals("/search")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                Vector<String> matches = new Vector<String>();
                for(int i=0; i<data.size(); i++){
                    if(data.get(i).contains(parameters[1])) {
                        matches.add(data.get(i));
                    }
                }
                return matches.toString().replace("[", "").replace("]", "");
            }
        }
        return "404 Not Found";
    }
}

class SearchEngineServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

