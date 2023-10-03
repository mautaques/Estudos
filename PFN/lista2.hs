module Lista2 where

--EXERCÍCIO 1--
pertence n [] = False
pertence n (x:xs) = if n == x then True else pertence n xs
   
--EXERCÍCIO 2--
intercessao [] ys = []
intercessao (x:xs) (y:ys) = if pertence x (y:ys) then x:intercessao xs (y:ys) else intercessao xs (y:ys)

--EXERCÍCIO 3--
inversoLista [] = []
inversoLista (x:xs) = (inversoLista xs) ++ [x]

--EXERCÍCIO 4--
nUltimos n [] = []
nUltimos n (x:xs) = if n >= length (x:xs) then (x:xs) else nUltimos n xs

--EXERCÍCIO 5--
enesimo n [] = -1
enesimo 1 [x] = x
enesimo n (x:xs) = if n-1 == 0 then x else enesimo (n-1) xs

--EXERCÍCIO 6--
repetir 0 _ = []
repetir n m = [m]++repetir (n-1) m

--EXERCÍCIO 7--
intercalacao [] [] = []
intercalacao (x:xs) (y:ys) = ordenarLista ((x:xs)++(y:ys))

--EXERCÍCIO 8--
menor [x] = x
menor (x:xs) = if x < menor xs then x else menor xs

--EXERCÍCIO 9--
removerElem n [] = []
removerElem n (x:xs) = if n == x then xs else x:removerElem n xs

--EXERCÍCIO 10--
ordenarLista [] = []
ordenarLista (x:xs) = menor (x:xs):ordenarLista (removerElem (menor(x:xs))(x:xs))

--EXERCÍCIO 11--
insereElem n [] = [n]
insereElem n (x:xs) = if pertence n (x:xs) then (x:xs) else ordenarLista([n] ++ (x:xs))

--EXERCÍCIO 12--
primeirosDuplas [] = []
primeirosDuplas ((a,b):xs) = a:primeirosDuplas xs

--EXERCÍCIO 13--
somaDuplas [] = []
somaDuplas (x:xs) = [a+b|(a,b) <- (x:xs)]

--EXERCÍCIO 14--
menoresDuplas [] = []
menoresDuplas (x:xs) = [(a,b)|(a,b) <- (x:xs), a < b]

--EXERCÍCIO 15--
separarDuplas n (x:xs) = ([y| y <- (x:xs), y <= n], [w| w <- (x:xs), w > n])

--EXERCÍCIO 16--
mdc (a,b) = if a == b then a else (if a > b then mdc ((a - b), b) else mdc (a,(b - a)))

--EXERCÍCIO 17--
inversoDupla [] = []
inversoDupla (x:xs) = [(b,a)|(a,b) <- (x:xs)]

--EXERCÍCIO 18--
simetrico (x:xs) = [a==b|(a,b) <- (x:xs)]

--EXERCÍCIO 19--
pares 0 = []
pares n = [(x,y)|x <- [1..n], y <- [1..n], y /= x]

--EXERCÍCIO 20--
inverteDNA' 'A' = 'T'
inverteDNA' 'T' = 'A'
inverteDNA' 'C' = 'G'
inverteDNA' 'G' = 'C'

inverteDNA'' [] = []                  
inverteDNA'' (x:xs) = inverteDNA' x:inverteDNA'' xs

inverteDNA xs = inversoLista (inverteDNA'' xs)

--EXERCÍCIO 21--
trocoCafe' 0 _ = []
trocoCafe' c [] = []
trocoCafe' c (x:xs) = if div c x > 0 then (x, div c x):trocoCafe' (rem c x) (x:xs) else trocoCafe' c xs

trocoCafe c p = trocoCafe' (p-c) [50,20,10,5]

--EXERCÍCIO 22--
magica' (x:xs) 1 = [x]
magica' (x:xs) n = repetir n x ++ magica' xs (n-1)

magica xs = magica' xs (length xs) ++ tail(inversoLista (magica' xs (length xs))) 
