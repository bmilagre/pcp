(ns pcp.sw05.evaluation)

;; Aufgabe 6
(def a '(* 3 4))
(def b 'a)
(def c 'b)

(eval (eval (eval c)))
(eval a)

;; Mit eval kann man Listen auswerten zur Laufzeit