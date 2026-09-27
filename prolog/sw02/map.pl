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
  n(OW, LU), n(OW, NW), n(OW, UR),
  n(NW, LU), n(NW,OW), n(NW, UR),
  n(UR, NW), n(UR, OW), n(UR, SZ),
  n(SZ, UR), n(SZ, ZG), n(SZ, LU),
  n(ZG, LU), n(ZG, SZ).

% 4 Solutions