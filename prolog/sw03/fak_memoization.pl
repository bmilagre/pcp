:- dynamic fak_memo/2.

fak_as(N, F) :-
  fak_memo(N, F),
  !,
  write('(Hinweis: Fakultät von '),
  write(N),
  write(' war gespeichert)'), nl.

fak_as(0,1).
fak_as(N, F):-
  N > 0,
  N1 is N -1,
  fak_as(N1, F1),
  F is N * F1,
  asserta(fak_memo(N, F)).

fak_clear :-
    retractall(fak_memo(_, _)),
    write('Hinweis: Alle gespeicherten Werte wurden gelöscht'), nl.