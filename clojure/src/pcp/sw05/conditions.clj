(ns pcp.sw05.conditions)

;; Aufgabe 4

(def temperatur 15)

(cond
  (> temperatur 35) "heiss"
  (> temperatur 25) "warm"
  (> temperatur 15) "mittel"
  :else "kalt")

;; Darf nicht verändert werden, da Temperatur mit > absteigend geprüft wird


(def zahl 6)

(cond 
  (zero? (rem zahl 3)) "durch 3 teilbar" 
  (zero? (rem zahl 2)) "durch 2 teilbar"
  :else "weder durch 2 noch durch 3 teilbar")

;; Ja?

;; Aufgabe c
(if (> temperatur 35) "heiss" (if (> temperatur 25) "warm" (if (> temperatur 15) "mittel" "kalt")))

;; Aufgabe d
Ja weil das Makro case im Hintergrund auch cond verwendet und deshalb einfach die "schönere" Variante ist