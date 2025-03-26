package org.example;

import org.example.ollama.OllamaResponse;
import org.example.ollama.OllamaResponseFetcher;

public class DescribeImage {
    public static void main(String[] args) {

        String apiURL = "http://127.0.0.1:11434/api/generate/";
        String model = "llava";
        String prompt = "describe the image as accurately as you can, if the image contains text transcribe whatever is intelligible";

//        String image = "./src/main/resources/image1.jpg";
//        String image = "./src/main/resources/image2.jpg";
        String image = "./src/main/resources/image3.jpg";
//        String image = "./src/main/resources/image4.jpg";


        OllamaResponseFetcher fetcher = new OllamaResponseFetcher(apiURL);

        OllamaResponse response = fetcher.fetchOllamaResponse(model, prompt, image);

        System.out.println("======================================================");
        System.out.print("You asked: ");
        System.out.println(prompt);
        System.out.println("======================================================");
        System.out.print("Ollama says: ");
        System.out.println(response.response);
        System.out.println("======================================================");

    }
}
