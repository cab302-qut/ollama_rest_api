package org.example;

import org.example.ollama.OllamaResponse;
import org.example.ollama.OllamaResponseFetcher;

public class SimplestCompletion {
    public static void main(String[] args) {

        String apiURL = "http://127.0.0.1:11434/api/generate/";
        String model = "llama3.2";
        String prompt = "Tell me in 10 words or less how to pass my software development university tests?";

        OllamaResponseFetcher fetcher = new OllamaResponseFetcher(apiURL);

        OllamaResponse response = fetcher.fetchOllamaResponse(model, prompt);

        System.out.println("======================================================");
        System.out.print("You asked: ");
        System.out.println(prompt);
        System.out.println("======================================================");
        System.out.print("Ollama says: ");
        System.out.println(response.response);
        System.out.println("======================================================");
    }
}