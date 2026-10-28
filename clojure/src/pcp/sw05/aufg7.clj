(ns pcp.sw05.aufg7)

;; Aufgabe 7

(defn moneyConverter [chf]
  (* chf 1.0825))

(moneyConverter 20)

(defn celsiusToFahrenheitConverter [celsius]
  (+ 32 (* celsius 1.8)))

(celsiusToFahrenheitConverter 0)


(defn scale [alter-min alter-max neuer-min neuer-max wert]
  (+ neuer-min
     (* (/ (- wert alter-min)
           (- alter-max alter-min))
        (- neuer-max neuer-min))))

(scale 0.0 100.0 32.0 212.0 30.0)
