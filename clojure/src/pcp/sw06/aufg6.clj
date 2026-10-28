(ns pcp.sw06.aufg6)

;; aufgabe c & e
(defn run-command [stack command]
  (cond
    (= command "ADD")
    (cons
     (+ (first stack) (first (rest stack))) ;; Addition
     (rest (rest stack)))                   ;; Zwei Zahlen entfernen

    (= command "MUL")
    (cons
     (* (first stack) (first (rest stack))) ;; Multiplikation
     (rest (rest stack)))                   ;; Zwei Zahlen entfernen

    (clojure.string/starts-with? command "LOAD")
    (cons
     (Integer/parseInt
      (second (clojure.string/split command #" ")))
     stack)
    
    (= command "SUB")
    (cons
     (- (first (rest stack)) (first stack))  ;; Zweite Zahl minus erste Zahl
     (rest (rest stack)))                    ;; Beide Zahlen entfernen
    
    (= command "DIV")
    (cons
     (quot (first (rest stack)) (first stack)) ;; Ganzzahlige Division
     (rest (rest stack)))                      ;; Beide Zahlen entfernen
    )) 

(run-command [] "LOAD 1") 
(run-command [1 2] "LOAD 3")
(run-command [1 2 9 9 9] "ADD")
(run-command [2 3 9 9 9] "MUL")
(run-command [4 7 9 9 9] "SUB")
(run-command [2 6 9] "DIV")

;; aufgabe d
(defn run-program [commands]
  (loop [local-commands commands stack []] ;; Noch auszuführende Befehle               
    (if (empty? local-commands) 
      (first stack)               ;; bberstes Element zurückgeben wenn fertig
      (recur (rest local-commands)  (run-command stack (first local-commands))))))

(run-program ["LOAD 2" "LOAD 3" "ADD" "LOAD 4" "MUL"]) ; liefert 20