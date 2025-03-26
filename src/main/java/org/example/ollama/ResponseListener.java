package org.example.ollama;

public interface ResponseListener {
    public void onResponseReceived(OllamaResponse response);
}
