(ns pcp.sw06.aufg4)

;; 4b
(mapcat
 (fn [x]
   [x x])
 [1 2 3])

;; 4c
(defn my-map [f coll]
  (mapcat
   (fn [x]
     [(f x)])
   coll))

(my-map inc [1 2 3])

;; 4d
(defn my-filter [f coll]
  (mapcat
   (fn [x]
     (if (f x)
       [x]   ;; Bedingung erfüllt: Element behalten
       []))  ;; Bedingung nicht erfüllt: Element überspringen
   coll))

(my-filter even? [1 2 3 4 5 6])