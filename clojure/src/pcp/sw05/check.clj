(ns pcp.sw05.check)

;; Aufgabe 3

;; (2 * 3) + (3 / 4) -> Rationale Zahl
(+ (* 2 3) (/ 3 4))
(type (+ (* 2 3) (/ 3 4)))

;; Nicht gültig, nur Operatoren
(+ - * /)

;; Liste mit Operatoren -> PersistentList
'(+ - * /)
(type '(+ - * /))

;; String concatenation -> String
(str 1.0 2 true)
(type (str 1.0 2 true))

;; String zu Long/Double, 123 + 0.45 --> Double
(+ (parse-long "123") (parse-double "0.45"))
(type (+ (parse-long "123") (parse-double "0.45")))

;; Or Operation, gibt "this" aus -> String
(or "this" "is" "crazy")
(type (or "this" "is" "crazy"))

;; Makro mit variabler Stelligkeit (0 bis n Argumente), alle Werte sind truthy
(and "this" "is" "crazy")
(type (and "this" "is" "crazy"))

;; Not erlaubt nur ein Argument;
(not "this" "is" "crazy")

;; Zuerst 5/2, danach mit anymo Func. Kehrwert berechnet --> Ratio
((fn [x] (/ 1 x)) (/ 5 2))
(type ((fn [x] (/ 1 x)) (/ 5 2)))

;; Prüft mit ? ob Argm ein Integer ist -> boolean
(int? 3000000000)
(type (int? 3000000000))