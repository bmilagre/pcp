(ns pcp.sw05.aufg89)

;; Aufgabe 8

(defn sum-range [a b]
  (if (> a b)
   0
   (+ a (sum-range (inc a) b))))

(sum-range 1 5)
(sum-range 3 9)

(defn sum-squares [a b]
  (if (> a b)
   0
   (+ (* a a) (sum-squares (inc a) b))))
   
(sum-squares 1 4) 

;; Aufgabe 9

(defn sequenceOfNumbers [n]
  (when (> n 1)
    (println n)
    (if (even? n)
      (sequenceOfNumbers (/ n 2))
      (sequenceOfNumbers (+ (* 3 n) 1)))))

(sequenceOfNumbers 3)
(sequenceOfNumbers 7)