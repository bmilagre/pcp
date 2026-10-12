% 3a) add(X, L, [X | L])
add_tail(X, [], [X]). % Wenn die ursprüngliche Liste leer ist, besteht die neue Liste nur aus X.
add_tail(X, [H | T], [H | R]) :- % „Um X an [H | T] anzuhängen, behalte H vorne und hänge X an T an.“
    add_tail(X, T, R).

% 3b) del(L, X, L1)
del([], _, []). % Wenn Liste leer ist, gibt es nichts zu löschen
del([X | T], X, R) :- % Wenn erstes Element von L X ist, machen wir mit dem Rest T weiter.
    del(T, X, R).
del([H | T], X, [H | R]) :-
    H \= X, % Ist das erste Element H nicht gleich X, wird H behalten
    del(T, X, R). % Die Rekursion läuft mit dem Rest T weiter.

% 3c) mem_d
mem_d(X, L) :- del(L, X, L1), L \= L1. % Prüfen ob Liste dieselbe ist.

% 3d) rev_acc(L,A,R)
rev_acc([], A, A).
rev_acc([H | T], A, R) :-
    rev_acc(T, [H | A], R). % Das erste Element H wird vorne an den Akkumulator A angefügt. Danach wird mit dem Rest T weitergemacht.

% 3e) rev(L, R)
rev(L, R) :-
    rev_acc(L, [], R).
