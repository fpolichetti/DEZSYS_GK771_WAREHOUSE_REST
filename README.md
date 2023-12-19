
# Dokumentation: Entwicklung einer RESTful Spring Boot-Applikation mit Consumer-Interface
author: Francesco Polichetti

date: 2023-12-13

## Einführung

Diese Dokumentation beschreibt die Entwicklung einer RESTful-Applikation mit Spring Boot, die Daten über REST-Endpunkte bereitstellt und ein Consumer-Interface zur Anzeige dieser Daten nutzt. Das Projekt demonstriert den Einsatz von Spring Boot zur Erstellung einer effizienten und modernen Backend-Architektur sowie die Verwendung von AJAX-Anfragen für das Frontend-Rendering.

## Projektstruktur

Das Projekt besteht aus mehreren Schlüsselkomponenten:

- **Model-Klassen (`ProductData`, `WarehouseData`):** Diese Klassen repräsentieren die Datenstruktur der Anwendung.
- **Service-Klassen (`WarehouseService`):** Sie enthalten die Geschäftslogik und interagieren mit den Model-Klassen.
- **Controller-Klassen (`WarehouseController`, `ConsumerController`):** Controller steuern den Datenfluss in der Anwendung und verarbeiten Anfragen.
- **Statische HTML-Seite (`consumer.html`):** Verwendet AJAX, um Daten vom REST-Endpunkt abzurufen und darzustellen.

## Kernfunktionalitäten

### RESTful Backend

Das Backend ist in Spring Boot implementiert und bietet REST-Endpunkte an, die JSON-Daten liefern. `@RestController` wird verwendet, um Klassen zu annotieren, die Daten im JSON-Format über HTTP-Methoden wie GET bereitstellen.

**Beispielcode:** Ein REST-Endpunkt in `WarehouseController`.

```
@GetMapping("/warehouse/{inID}/data")
public WarehouseData getWarehouseData(@PathVariable int inID) {
    // restlicher code
}
```

### Consumer Frontend

Das Frontend ist eine statische HTML-Seite, die AJAX verwendet, um Daten vom Backend abzurufen. Es demonstriert, wie Client-seitiges Rendering in einer modernen Webanwendung implementiert wird.

**Beispielcode:** AJAX-Anfrage in `consumer.html`.

```
javascriptCopy code$.ajax({
    url: '/warehouse/001/data',
    type: 'GET',
    success: function(data) {
    // restlicher Code
    }
});
```

### Datenmodellierung

Das Datenmodell umfasst Klassen wie `ProductData` und `WarehouseData`, die die Struktur der in der Anwendung verwendeten Daten definieren.

## Technologien

- **Spring Boot:** Ein Framework zur Vereinfachung der Konfiguration und des Setups von Spring-Anwendungen.
- **AJAX und jQuery:** Für asynchrone Anfragen und dynamisches Rendering von Webseiten.
- **Java:** Als Hauptprogrammiersprache für die Backend-Entwicklung.

## Herausforderungen und Lösungen

Eine Herausforderung war die korrekte Implementierung des RESTful-Ansatzes und die Integration mit einem clientseitigen Rendering-System. Durch die Trennung von Backend-Logik (Spring Boot) und Frontend-Rendering (AJAX und HTML) wurde eine modulare und leicht wartbare Architektur erreicht.


## Quellen

- [Spring Boot Dokumentation](https://spring.io/projects/spring-boot)
- [AJAX Dokumentation](https://api.jquery.com/jquery.ajax/)
- [Java Dokumentation](https://docs.oracle.com/en/java/)
