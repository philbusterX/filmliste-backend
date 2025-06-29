# Filmekatalog (CineShelf) - Frontend

Dieses Projekt ist eine im Rahmen des Moduls "Webtechnologien" an der HTW Berlin erstellte Full-Stack-Webanwendung zur Verwaltung einer persönlichen Filmsammlung.

**Live-Anwendung:** [https://filmliste-frontend.onrender.com](https://filmliste-frontend.onrender.com)

**Backend-Repository:** [https://github.com/philbusterX/filmliste-backend](https://github.com/philbusterX/filmliste-backend)

---

## Projektbeschreibung

Der **Filmekatalog** ist eine moderne Webanwendung zur Verwaltung persönlicher Filmsammlungen. Nutzer können Filme mit Details wie Titel, Erscheinungsjahr, Genre, einem persönlichen Rating und einem Link zum Filmposter hinzufügen. Die Anwendung ermöglicht es, den Überblick über gesehene Filme und persönliche Favoriten zu behalten und die Sammlung dynamisch zu filtern.

## Hauptfunktionen (Use-Cases)

* **Filme anzeigen:** Lädt und zeigt alle Filme aus der Datenbank in einem modernen, responsiven Grid-Layout an.
* **Film hinzufügen:** Ein Formular ermöglicht das Hinzufügen neuer Filme zur Sammlung.
* **Film löschen:** Jeder Film kann direkt aus der Liste entfernt werden.
* **Status aktualisieren:** Der "Gesehen"- und "Favorit"-Status kann per Klick direkt auf der Film-Karte umgeschaltet werden.
* **Dynamische Filter:** Die Filmliste kann live nach Genre, "Nur Favoriten" und dem "Gesehen"-Status gefiltert werden. Alle Filter sind kombinierbar.
* **Visuelles Feedback:** Die Anwendung bietet visuelles Feedback durch Lade-Animationen.
* **Validierung:** Die Eingabefelder im Formular haben eine clientseitige Validierung (z.B. für das Rating).

## Verwendete Technologien

**Frontend:**
* **Vue.js 3** (mit Composition API und `<script setup>`)
* **TypeScript**
* **Vite** als Build-Tool
* **CSS** (Flexbox, Grid, Custom Properties)
* **Vitest** für Unit-Tests

**Backend:**
* **Spring Boot 3**
* **Java 21**
* **Spring Data JPA / Hibernate**
* **PostgreSQL** als Datenbank
* **Mockito & JUnit 5** für Unit- und Web-Layer-Tests

**Deployment & CI/CD:**
* **Render.com** für das Hosting von Frontend, Backend und Datenbank
* **Docker** für das Backend-Deployment
* **GitHub Actions** für Continuous Integration (automatisches Testen)

## Lokales Setup

1.  **Repository klonen:** `git clone https://github.com/philbusterX/filmliste-frontend.git`
2.  **Verzeichnis wechseln:** `cd filmliste-frontend`
3.  **Abhängigkeiten installieren:** `npm install`
4.  **Lokalen Entwicklungsserver starten:** `npm run dev`
5.  Die Anwendung ist unter `http://localhost:5173` erreichbar.

---
**Team-Mitglied:** Philipp Kumaigorodskii
