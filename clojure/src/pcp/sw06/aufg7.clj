(ns pcp.sw06.aufg7)

;; Aufgabe 7a (idee mit Unicodes) 
(defn letter-frequencies [text]
  (let [upper-text (clojure.string/upper-case text)] ;; zuerst alles grossbuchstaben machen und als let speichern
    (vec
     (map
      (fn [buchstabe]
        (count
         (filter (fn [c] (= c buchstabe)) upper-text)))
      (map char (range 65 91))))))

(letter-frequencies "aBBcCc")

;; Gehe mir alle Buchstaben von A-Z durch und  führe die anonyme Funktion welche mir zählt wieviel es auftaucht in der liste upper-text

;; Aufgabe 7b
(defn dot-product [a b]
  (reduce + (map * a b)))

(defn vector-length [v]
  (Math/sqrt
   (reduce + (map (fn [x] (* x x)) v))))

(defn cosine-similarity [a b]
  (/ (dot-product a b)
     (* (vector-length a)
        (vector-length b))))

(cosine-similarity [1 2 3 4] [4 3 2 1])
(cosine-similarity [1 2 3 4] [1 2 3 4])
(cosine-similarity [0 1 0 0] [1 0 0 0])

;; Aufgabe 7c

(def de [6.51 1.89 3.06 5.08 17.40 1.66 3.01 4.76 7.55
         0.27 1.21 3.44 2.53 9.78 2.51 0.79 0.02 7.00
         7.27 6.15 4.35 0.67 1.89 0.03 0.04 1.13])
(def en [8.17 1.48 2.78 4.25 12.70 2.23 2.02 6.09 6.97
         0.15 0.77 4.03 2.41 6.75 7.51 1.93 0.10 5.99
         6.33 9.06 2.76 0.98 2.36 0.15 1.97 0.07])
(def fr [7.64 0.90 3.26 3.67 14.00 1.07 0.87 0.74 7.53
         0.55 0.05 5.46 2.97 7.10 5.38 3.02 1.36 6.55
         7.95 7.24 6.31 1.63 0.11 0.39 0.31 0.14])

(defn detect-language [text]
  (let [de-score (cosine-similarity (letter-frequencies text) de) 
        en-score (cosine-similarity (letter-frequencies text) en) 
        fr-score (cosine-similarity (letter-frequencies text) fr)] 
    (cond 
      (and (> de-score en-score) (> de-score fr-score))
      "de" 
      (and (> en-score de-score) (> en-score fr-score))
      "en"
      :else "fr")))

(detect-language "Das ist ein deutscher Text")
(detect-language "La tour Eiffel est le symbole de la ville de Paris")
(detect-language "Lucas goes to school every day of the week")
