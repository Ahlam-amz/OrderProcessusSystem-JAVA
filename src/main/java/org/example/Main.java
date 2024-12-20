package org.example;


public class Main {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Admin\\IdeaProjects\\DevoirLibreJava\\src\\main\\resources\\input.json";
        String outputFilePath = "C:\\Users\\Admin\\IdeaProjects\\DevoirLibreJava\\src\\main\\resources\\output.json";
        String errorFilePath = "C:\\Users\\Admin\\IdeaProjects\\DevoirLibreJava\\src\\main\\resources\\error.json";

        // Créer une instance de OrderProcessor et démarrer le traitement périodique
        OrderProcessor processor = new OrderProcessor();
        processor.startProcessingPeriodically(inputFilePath, outputFilePath, errorFilePath);  // Démarrer le traitement toutes les 3 minutes
    }
}
