package org.example;

import org.example.ollama.OllamaResponse;
import org.example.ollama.OllamaResponseFetcher;
import org.example.ollama.ResponseListener;

public class AsynchronousQuery {

    static class MyResponseListener implements ResponseListener {

        @Override
        public void onResponseReceived(OllamaResponse response) {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Ollama says: ");
            System.out.println(response.response);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    };

    public static void main(String[] args) {
        String apiURL = "http://127.0.0.1:11434/api/generate/";
        String model = "llama3.2";
        String prompt = "Why did the chicken try to cross the road?";

        OllamaResponseFetcher fetcher = new OllamaResponseFetcher(apiURL);
        fetcher.fetchAsynchronousOllamaResponse(model, prompt, new MyResponseListener());

        // note that fetcher returns immediately, and the answer is printed by MyResponseListener when a response becomes available
        System.out.println("======================================================");
        System.out.print("You asked: ");
        System.out.println(prompt);
        System.out.println("======================================================");
    }
}
