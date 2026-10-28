(ns pcp.sw06.aufg2)

;; Aufgabe a
(defn my-map [f coll]
  (loop [local-coll coll acc []] ;; local-coll = coll; acc = []         
    (if (empty? local-coll)
      acc                     ;; ergebnis zurückgeben
      (recur (rest local-coll) (conj acc (f (first local-coll))))))) ;; nochmals loop [local-coll (rest local-coll) acc (conj acc (f (first local-coll)))] aufrufen

(my-map inc [1 2 3])

;; Aufgabe b (reduce(function; startvalue, collection))
(defn reduce
  ;; Ohne Startwert (2 Parameter)
  ([f coll]
   (reduce f (first coll) (rest coll)))

  ;; Mit Startwert (3 Parameter)
  ([f val coll]
   (loop [local-coll coll acc val]
     (if (empty? local-coll)
       acc
       (recur (rest local-coll) (f acc (first local-coll)))))))

(reduce + [1 2 3 4 5])
(reduce * [1 2 3 4 5])
(reduce + 2 [3 4])
(reduce * 2 [3 4])

;; Aufgabe c
(defn map-reduce [f coll]
  (reduce
   (fn [acc i]
     (conj acc (f i)))
   []
   coll))

(defn filter-reduce [f coll]
  (reduce
   (fn [acc i]
     (if (f i)
       (conj acc i)
       acc))
   []
   coll))

;; Aufgabe d
(clojure.core/map vector [1 2 3] [4 5 6])

;; Aufgabe e
(clojure.core/map first [[1 4] [2 5] [3 6]])
(clojure.core/map second [[1 4] [2 5] [3 6]])