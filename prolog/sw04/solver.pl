:- use_module(library(http/http_client)).
:- use_module(library(http/http_json)).

:- consult(family_relationship).
:- consult(sudoku_solver).

fetch_json(Question, Id, JSON):-
  format(atom(URL), "http://localhost:16316/problem/~w/~w", [Question, Id]),
  http_get(URL, JSON, []).

post_json(Question, Id, Solution):-
  format(atom(URL), "http://localhost:16316/problem/~w", [Question]),
  http_post(URL, json(json([id=Id, solution=Solution])), _Response, []).

solution(Rel, First, Second, true)  :- call(Rel, First, Second), !.
solution(_, _, _, false).

zero_to_var(0, _) :- !.
zero_to_var(X, X).

solve_question(relationship, JSON, Solution) :-
    JSON = [id=_, firstPerson=FirstP, relationship=Rel, secondPerson=SecondP],
    solution(Rel, FirstP, SecondP, Solution).

solve_question(sudoku, JSON, Solution) :-
    JSON = [id=_, sudoku=RowsToSolve],
    maplist(maplist(zero_to_var), RowsToSolve, Solution),
    sudoku(Solution).

solve(Question, Id) :-
    fetch_json(Question, Id, json(JSON)),
    solve_question(Question, JSON, Solution),
    post_json(Question, Id, Solution).