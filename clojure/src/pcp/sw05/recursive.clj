(ns pcp.sw05.recursive)

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
  (if (> n 1)
    (do
      (println(n))
      (if (even? n)
        (sequenceOfNumbers (/ n 2))
        (sequenceOfNumbers (+ 1 (* 3 n)))
        ))))