(ns pcp.sw06.aufg5)

(defn step [coll]
  (mapcat
   (fn [n]
     (if (= n 0)
       [6 8] ;; Bei 0 entsteht die Zahlen 6 und 8
       [(dec n)])) ;; Sonst wird  Zahl um 1 reduziert
   coll))

(step [3 4 3 1 2])
;; (2 3 2 0 1)

(step [2 3 2 0 1])
;; (1 2 1 6 8 0)


(def start [3 4 3 1 2])
(loop [i 0 local-coll start]
  (if (= i 256)
    (count local-coll)
    (recur (inc i) (step local-coll))))
  

;; a = 5934 Zahlen; b = Overflow?