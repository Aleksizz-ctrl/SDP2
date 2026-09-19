# Logistics Delivery App — Factory Method + Abstract Factory

Console app in Java that delivers cargo by road or sea, and renders a
matching Windows or macOS UI, using Factory Method and Abstract Factory.

## Packages

- `com.astanait.logistics.transport` — Transport, Truck, Ship
- `com.astanait.logistics` — Logistics, RoadLogistics, SeaLogistics
- `com.astanait.gui` — Button, Checkbox, GUIFactory
- `com.astanait.gui.windows` / `com.astanait.gui.macos` — concrete UI factories
- `com.astanait.app` — DeliveryApplication, Main

## Build and run

```bash
mkdir -p out
find src -name "*.java" > sources.txt
javac -d out @sources.txt
java -cp out com.astanait.app.Main ROAD WINDOWS
```

Or run without arguments and answer the prompts.

## Input values

- Delivery mode: `ROAD` or `SEA`
- UI platform: `WINDOWS` or `MACOS`

## Sample run

```
Delivery mode: ROAD
UI platform: WINDOWS
Rendering Windows button
R
