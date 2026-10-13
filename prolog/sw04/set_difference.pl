set_difference([], _, []). % % Empty Set1 gives an empty difference.

set_difference([H | T], Set2, Result) :- % Skip Headvalue on Set1 if in Set2
    member(H, Set2),
    set_difference(T, Set2, Result).

set_difference([H | T], Set2, [H | Result]) :- % % H is not in Set2, so add value to result.
  \+ member(H, Set2),
  set_difference(T, Set2, Result).