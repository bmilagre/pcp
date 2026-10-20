(ns pcp.sw05.functions)

;; Aufgabe 7

(defn moneyConverter [chf]
  (* chf 1.0825))

(moneyConverter 20)

(defn celsiusToFahrenheitConverter [celsius]
  (+ 32 (* celsius 1.8)))

(celsiusToFahrenheitConverter 14)


(defn scale [x1 x2 y1 y2 x]
  (+ y1 (* (/ (- x x1) (- x2 x1))
           (- y2 y1))))

(scale 0.0 100.0 32.0 212.0 30.0)
