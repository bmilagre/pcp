(ns pcp.sw05.aufg5)

;; Aufgabe 5a
(defn discriminant [a b c]
  (- (* b b) (* 4 a c)))

(defn quadraticFormulaSolvable [a b c]
  (if (< (discriminant a b c) 0)
    false
    true))

(quadraticFormulaSolvable 1 6 -12)
(quadraticFormulaSolvable 3 1 1)

;; Aufgabe 5b
(defn numberOfQuadraticSolutions [a b c]
  (let [d (discriminant a b c)]
    (cond
      (> d 0) 2
      (= d 0) 1
      :else   0)))

(numberOfQuadraticSolutions 1 0 -4) ; d = 16  => 2 Lösungen
(numberOfQuadraticSolutions 1 2 1)  ; d = 0   => 1 Lösung
(numberOfQuadraticSolutions 1 0 4)  ; d = -16 => 0 Lösungen

;; Aufgabe 5c
(defn quadraticFormula [a b c]
  (if (not (quadraticFormulaSolvable a b c))
    []
    (let [d (discriminant a b c)]
      (if (= d 0)
        [(/ (- b) (* 2 a))]
        (let [sqrt-d (Math/sqrt d)]
          [(/ (+ (- b) sqrt-d) (* 2 a))
           (/ (- (- b) sqrt-d) (* 2 a))])))))

(quadraticFormula 1 0 4)   ; => []
(quadraticFormula 1 2 1)   ; => [-1]
(quadraticFormula 1 0 -4)  ; => [2.0 -2.0]