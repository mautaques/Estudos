-- Lista 1 Mauricio Martins Taques Filho

-- Ex 1)
ehTriangulo a b c = if a < b + c && b < a + c && c < b + a then True else False

-- Ex 2)
tipoTriangulo a b c = if a==b && b==c && c==a then "equilatero" else
                      if a==b || b==c || c==a then "isoceles" else "escaleno"

-- Ex 3)
triangulo a b c = if ehTriangulo a b c == True then tipoTriangulo a b c 
                  else "nao eh um triangulo"

-- Ex 4)    
somaPares 0 = 0 
somaPares n = if even n then n + somaPares(n-1) else somaPares (n-1)

-- Ex 5)
somaPot2m m 0 = m
somaPot2m m n = 2 ^ n * m + somaPot2m m (n-1)

-- Ex 6)
primo 2 = True
primo 3 = True
primo 5 = True
primo n
    | n <= 1 = False
    | n <= 3 = True
    | n `mod` 2 == 0 || n `mod` 3 == 0 || n `mod` 5 == 0 = False
    | otherwise = True

-- Ex 7)          
seriePI 0 = 0
seriePI n = if mod (round n) 2 == 0 then (-4) / (2 * n - 1) + seriePI (n - 1)
            else 4 / (2 * n - 1) + seriePI (n - 1)





        




                      
