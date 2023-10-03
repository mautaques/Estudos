ehTriangulo a b c = if a < b + c && b < a + c && c < b + a then True else False

tipoTriangulo a b c = if a==b && b==c && c==a then "equilatero" else
                      if a==b || b==c || c==a then "isoceles" else "escaleno"

triangulo a b c = if ehTriangulo a b c == True then tipoTriangulo a b c 
                  else "nao eh um triangulo"
		  
somaPares 0 = 0 
somaPares n = if even n then n + somaPares(n-1) else somaPares (n-1)

somaPot2m m 0 = m
somaPot2m m n = 2 ^ n * m + somaPot2m m (n-1)

primo 2 = True
primo 3 = True
primo 5 = True
primo n
    | n <= 1 = False
    | n <= 3 = True
    | n `mod` 2 == 0 || n `mod` 3 == 0 || n `mod` 5 == 0 = False
    | otherwise = True
      
seriePI 0 = 0
seriePI n = if mod (round n) 2 == 0 then (-4) / (2 * n - 1) + seriePI (n - 1)
            else 4 / (2 * n - 1) + seriePI (n - 1)


        




                      
