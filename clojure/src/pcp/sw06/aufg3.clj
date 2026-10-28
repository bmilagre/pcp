(ns pcp.sw06.aufg3)

(defn scale [alter-min alter-max neuer-min neuer-max wert]
  (+ neuer-min
     (* (/ (- wert alter-min)
           (- alter-max alter-min))
        (- neuer-max neuer-min))))

(def celsiusToFahrenheitConverter
  (partial scale 0 100 32 212))

(def moneyConverter
  (partial scale 0 1 0 1.0825))