-- { 2x |x E N}

> [2 * x | x <- [0..50]]

> [0..50]

-- { x | x E N e x é par}

par n = rem n 2 == 0

> [ x | x <- [0..100], par x]

> [ x | x <- [0..100], rem x 2 == 0]

> [ x + y | x <- [1,2,3], y <- [1,2]]

[2,3,3,4,4,5]

inc [] = []
inc (x:xs) = x + 1 : inc xs

inc' xs = [ a + 1 | a <- xs]

-- avaliação preguiçosa

> [0..100]par n = rem n 2 == 0

[0..]

> take 3 [1,2,3,4,5,6,7]

[1,2,3]

> take 15 [ 2 * x | x <- [0..]]

> menores10 [1,5,12,17,2,3]

[1,5,2,3]par n = rem n 2 == 0

menores10 [] = []
menores10 (x:xs) = if x < 10 then x:menores10 xs else menores10 xs

menores10' xs = [ x | x <- xs, x < 10]

uns = 1:uns 

-- 1:1:1:uns

> take 100 uns

-----------------
> [ x * y | x <- [1..10], y <- [1..10]]

[1,2,3,4,5,6,7,8,9,10,2,4]

-- Tuplas -> {Duplas, Triplas, Quadruplas}

-- Ex: (1,alpha), (10,"Funcional") ("Funcional",15,20), etc...

[(1,1,1), (1,2,2), (1,3,3), (2,1,2), (2,2,4), (2,3,6)]

> [(x,y,x * y) | x <- [1..10], y <- [1..10]]







