(ns pcp.sw06.aufg1)

(defn isEven [n]
  (= 0 (mod n 2)))

(defn filterEven [lst]
  (if (empty? lst)
    '()
    (if (isEven (first lst))
      (cons (first lst) (filterEven (rest lst))) ;; first behalten, vorne anhängen und mit rest weitermachen
      (filterEven (rest lst))))) ;; überspringen und mit rest weitermachen


(defn filterOdd [lst]
  (if (empty? lst)
    '()
    (if (isEven (first lst))
      (filterOdd (rest lst)) ;; überspringen und mit rest weitermachen
      (cons (first lst) (filterOdd (rest lst))))))

;; Aufgabe b: Beide machen fast dasselbe, unterschied nur bedingung
(defn filter [f coll]
  (loop [local-coll coll acc []]
    (if (empty? local-coll)
      acc
      (if (f (first local-coll))
        ;; Bedingung erfüllt: Element behalten
        (recur (rest local-coll) (conj acc (first local-coll)))
        ;; Bedingung nicht erfüllt: Element überspringen
        (recur (rest local-coll) acc)))))