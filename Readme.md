# Pogodynka

## Krótki opis systemu

System powinien realizować zbieranie danych z minimum jednego, a najlepiej dwóch/trzech dowolnych serwisów pogodowych i udostępnić uśrednione (rezultatem powinna być dana wartość pogodowa obliczona jako średnia arytmetyczna z rezultatów zwróconych przez każdy serwis) wartości obliczone na podstawie zwróconych odpowiedzi.

## Główne funkcje systemu

* Pobieranie danych pogodowych z odpowiednich serwisów sieciowych (lub plików znajdujących się na Twoim dysku)
* Pobrane dane powinny być zapisywane do bazy danych
* Aplikacja powinna przyjmować datę i lokalizację miasta w celu pobierania uśrednionych wartości
* Wyniki uśredniania powinny być zapisywane w bazie danych

## Stos technologiczny

* JDK 17
* GSON 2.9.2
* Hibernate 6.0.0.Final
* JUnit5 5.8.2#   W e a t h e r L a d y  
 