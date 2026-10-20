(ns pcp.hello)

42
"Hallo"
\A
:hello
+
/
(+ 2 3)

(quot 14 3)
(rem 14 3)
(mod 14 3)
(* 21 2)
(/ 2)
(-5)
(- 5)
-5
(* 1 2 3 4 5)
(* (/ 3 2) (/ 1 3))
(* 21 2.0)

(+ 1 (* 2 8) (* 4 4) (* 8 2) (*1 16))
(type (* (+ 10 (- 11 1)) (/ 35 7)))

(fn [x] (* x x))

((fn [x] (* x x)) 3)
(def sqaure (fn [x] (* x x)))

(square 5)

(defn countdown [n]
  (if (>= n 0)
    (do (println n)
        (countdown(dec n)))))

countdown(10)