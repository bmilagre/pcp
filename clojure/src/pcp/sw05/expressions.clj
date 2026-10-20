(ns pcp.sw05.expressions)

;; Aufgabe 2a
(def laenge 4)
(def breite 3)

;; Fläche: Länge * Breite
(* laenge breite)

;; Umfang: 2 * (Länge + Breite)
(* 2 (+ laenge breite))

;; Diagonale: Wurzel aus (Länge^2 + Breite'2), https://clojuredocs.org/clojure.math/sqrt
(Math/sqrt (+ (* laenge laenge) (* breite breite)))

;; Aufgabe 2b
(def laenge 4)
(def breite 3)
(def hohe 3)

;; Volumen: a * b * c
(* laenge breite hohe)

;; Öberfläche 2 * (a * b + a * c + b * c)
(* 2 (+ (* laenge breite) (* laenge hohe) (* breite hohe)))

;; Aufgabe 2c
(defn area [a, b] (* a b))
(defn perimeter [a, b] (* 2 (+ a b)))
(defn diagonal [a, b] (Math/sqrt (+ (* a a) (* b b))))
(defn volume [a, b, c] (* a b c))
(defn surface [a, b, c] (* 2 (+ (* a b) (* a c) (* b c))))