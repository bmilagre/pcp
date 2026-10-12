% Possible pairs of colors
n(yellow, red). 
n(yellow, green).
n(red, yellow).
n(red, green).
n(green, yellow).
n(green, red).

colors(LU, NW, OW, SZ, UR, ZG) :-
  UR = yellow,
  n(LU, SZ), n(LU, OW), n(LU, NW),
  n(OW, NW), n(OW, UR),
  n(NW, UR),
  n(UR, SZ),
  n(SZ, ZG),
  n(ZG, LU).