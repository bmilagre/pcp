mult(_, 0, 0).

mult(A, B, X) :-
    B > 0,
    B1 is B - 1,
    mult(A, B1, X1),
    X is A + X1.